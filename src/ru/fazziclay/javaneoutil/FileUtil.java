package ru.fazziclay.javaneoutil;

/**
MIT License

Copyright (c) 2022 Mironov Stanislav (FazziCLAY)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
**/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Набор утилит для работы с файлами
 * @author FazziCLAY ( https://fazziclay.github.io )
 * **/
public class FileUtil {
    /**
     * Исправить путь Windows-Linux
     **/
    private static String fixPathSeparator(@NonNull String path) {
        return path
                .replace("/", File.separator)
                .replace("\\", File.separator);
    }

    /**
     * Получить файл из пути, путь чинится Windows-Linux
     **/
    public static File getFile(String path) {
        return new File(fixPathSeparator(path));
    }

    /**
     * <h1>Example</h1>
     * <p>Input: "/test/owo/f.json"</p>
     * <p>Output: "/test/owo"</p>
     **/
    public static String getParentDirOfFile(String path) {
        path = fixPathSeparator(path);
        int lastSep = path.lastIndexOf(File.separator);
        if (lastSep > 0) {
            return path.substring(0, lastSep) + File.separator;
        }
        return File.separator;
    }

    /**
     * @see FileUtil#getParentDirOfFile(String)
     **/
    public static File getParentDirOfFile(File file) {
        return new File(getParentDirOfFile(fixPathSeparator(file.getAbsolutePath())));
    }

    /**
     * @see FileUtil#createDirIfNotExists(File)
     **/
    public static void createDirIfNotExists(String path) {
        createDirIfNotExists(getFile(path));
    }

    /**
     * Создать дирректорию если она не существует
     **/
    public static void createDirIfNotExists(File file) {
        if (!file.exists()) {
            //noinspection ResultOfMethodCallIgnored
            file.mkdirs();
        }
    }

    /**
     * @see FileUtil#getParentDirOfFile(File)
     **/
    public static void createNewIfNotExist(@NonNull String path) {
        createNewIfNotExist(getFile(path));
    }

    /**
     * Создать файл, если он существует то ничего не делаем
     **/
    public static void createNewIfNotExist(@NonNull File file) {
        try {
            if (!file.exists()) {
                createDirIfNotExists(getParentDirOfFile(file));

                //noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException("Exception while create new file", e);
        }
    }

    /**
     * @see FileUtil#isExist(File)
     **/
    public static boolean isExist(@NonNull String path) {
        return isExist(getFile(path));
    }

    /**
     * Существует ли файл
     **/
    public static boolean isExist(@NonNull File file) {
        return file.exists();
    }

    /**
     * @see FileUtil#getFilesList(File)
     **/
    public static File[] getFilesList(@NonNull String dirPath) {
        return getFilesList(getFile(dirPath));
    }

    /**
     * Список файлов в дирректории
     **/
    public static File[] getFilesList(@NonNull File dir) {
        if (!isExist(dir) || !dir.isDirectory()) {
            return null;
        }
        return dir.listFiles();
    }

    public static void delete(@NonNull String path) {
        delete(getFile(path));
    }

    /**
     * Если файл, то удаляет
     * Если папка, то удаляет (рекурсивно)
     * #RECURSION
     **/
    public static void delete(@NonNull File path) {
        if (path.isDirectory()) {
            File[] children = getFilesList(path);
            if (children != null) {
                for (File child : children) {
                    delete(child);
                }
            }
            path.delete();

        } else if (path.isFile()) {
            path.delete();
        }
    }

    /**
     * @see FileUtil#writeText(File, boolean, String)
     **/
    public static void writeText(@NonNull String path, boolean append, String text) {
        writeText(getFile(path), append, text);
    }

    /**
     * Записывает текст в файл, если нету то создаст
     **/
    public static void writeText(@NonNull File file, boolean append, String text) {
        createNewIfNotExist(file);
        try {
            final FileWriter fileWriter = new FileWriter(file, append);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception e) {
            throw new RuntimeException("Exception while write text to file", e);
        }
    }

    /**
     * @see FileUtil#setText(File, String)
     **/
    public static void setText(@NonNull String path, String text) {
        setText(getFile(path), text);
    }

    /**
     * Ставит в файл текст
     *
     * @see #writeText(File, boolean, String)
     **/
    public static void setText(@NonNull File file, String text) {
        writeText(file, false, text);
    }

    /**
     * @see #addText(File, String)
     **/
    public static void addText(@NonNull String path, String text) {
        addText(getFile(path), text);
    }

    /**
     * Добавляет в файл текст в конец
     *
     * @see #writeText(File, boolean, String)
     **/
    public static void addText(@NonNull File file, String text) {
        writeText(file, true, text);
    }

    /**
     * @see #getText(File, String)
     **/
    public static String getText(@NonNull String path, String defaultValue) {
        return getText(getFile(path), defaultValue);
    }

    /**
     * Получить текст из файла, если файла нету то возвращаем defaultValue
     * если файла не существует, то и не создаём его!
     *
     * @param defaultValue вывод если файла не существует
     **/
    public static String getText(@NonNull File file, String defaultValue) {
        if (!isExist(file)) {
            return defaultValue;
        }

        try {
            final StringBuilder result = new StringBuilder();
            final FileReader fileReader = new FileReader(file);

            final char[] buff = new char[1024];

            int i;
            while ((i = fileReader.read(buff)) > 0) {
                result.append(new String(buff, 0, i));
            }

            fileReader.close();
            return result.toString();

        } catch (Exception e) {
            throw new RuntimeException("Exception while get file text", e);
        }
    }

    /**
     * @see #getText(File)
     **/
    public static String getText(String path) {
        return getText(getFile(path));
    }

    /**
     * if file not exist: return null
     *
     * @see #getText(String, String)
     **/
    public static String getText(File file) {
        return getText(file, null);
    }


    // == DEPRECATED ==
    @Deprecated
    public static void write(File file, String content) {
        write(file.getAbsolutePath(), content);
    }

    @Deprecated
    public static void write(String path, String content) {
        setText(getFile(path), content);
    }

    @Deprecated
    public static String read(File file, String defaultValue) {
        return read(file.getAbsolutePath(), defaultValue);
    }

    @Deprecated
    public static String read(String path) {
        return read(path, null);
    }

    @Deprecated
    public static String read(String path, String defaultValue) {
        return getText(getFile(path), defaultValue);
    }

    @Deprecated
    public static void deleteDir(File dir) {
        delete(dir);
    }
}
