package ru.fazziclay.javaneoutil;

import java.io.File;

/**
 * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
 * **/
@Deprecated
public class FileUtil {
    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static File getFile(String path) {
        return com.fazziclay.javaneoutil.FileUtil.getFile(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static String getParentDirOfFile(String path) {
        return com.fazziclay.javaneoutil.FileUtil.getParentDirOfFile(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static File getParentDirOfFile(File file) {
        return com.fazziclay.javaneoutil.FileUtil.getParentDirOfFile(file);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void createDirIfNotExists(String path) {
        com.fazziclay.javaneoutil.FileUtil.createDirIfNotExists(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void createDirIfNotExists(File file) {
        com.fazziclay.javaneoutil.FileUtil.createDirIfNotExists(file);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void createNewIfNotExist(@NonNull String path) {
        com.fazziclay.javaneoutil.FileUtil.createNewIfNotExist(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void createNewIfNotExist(@NonNull File file) {
        com.fazziclay.javaneoutil.FileUtil.createNewIfNotExist(file);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static boolean isExist(@NonNull String path) {
        return com.fazziclay.javaneoutil.FileUtil.isExist(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static boolean isExist(@NonNull File file) {
        return com.fazziclay.javaneoutil.FileUtil.isExist(file);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static File[] getFilesList(@NonNull String dirPath) {
        return com.fazziclay.javaneoutil.FileUtil.getFilesList(dirPath);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static File[] getFilesList(@NonNull File dir) {
        return com.fazziclay.javaneoutil.FileUtil.getFilesList(dir);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void delete(@NonNull String path) {
        com.fazziclay.javaneoutil.FileUtil.delete(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void delete(@NonNull File path) {
        com.fazziclay.javaneoutil.FileUtil.delete(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void writeText(@NonNull String path, boolean append, String text) {
        com.fazziclay.javaneoutil.FileUtil.writeText(path, append, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void writeText(@NonNull File file, boolean append, String text) {
        com.fazziclay.javaneoutil.FileUtil.writeText(file, append, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void setText(@NonNull String path, String text) {
        com.fazziclay.javaneoutil.FileUtil.setText(path, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void setText(@NonNull File file, String text) {
        com.fazziclay.javaneoutil.FileUtil.setText(file, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void addText(@NonNull String path, String text) {
        com.fazziclay.javaneoutil.FileUtil.addText(path, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static void addText(@NonNull File file, String text) {
        com.fazziclay.javaneoutil.FileUtil.addText(file, text);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static String getText(@NonNull String path, String defaultValue) {
        return com.fazziclay.javaneoutil.FileUtil.getText(path, defaultValue);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static String getText(@NonNull File file, String defaultValue) {
        return com.fazziclay.javaneoutil.FileUtil.getText(file, defaultValue);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static String getText(String path) {
        return com.fazziclay.javaneoutil.FileUtil.getText(path);
    }

    /**
     * @deprecated use new FileUtil in {@link com.fazziclay.javaneoutil.FileUtil}
     * **/
    @Deprecated
    public static String getText(File file) {
        return com.fazziclay.javaneoutil.FileUtil.getText(file);
    }


    // == DEPRECATED ==
    @Deprecated
    public static void write(File file, String content) {
        com.fazziclay.javaneoutil.FileUtil.write(file, content);
    }

    @Deprecated
    public static void write(String path, String content) {
        com.fazziclay.javaneoutil.FileUtil.write(path, content);
    }

    @Deprecated
    public static String read(File file, String defaultValue) {
        return com.fazziclay.javaneoutil.FileUtil.read(file, defaultValue);
    }

    @Deprecated
    public static String read(String path) {
        return com.fazziclay.javaneoutil.FileUtil.read(path);
    }

    @Deprecated
    public static String read(String path, String defaultValue) {
        return com.fazziclay.javaneoutil.FileUtil.read(path, defaultValue);
    }

    @Deprecated
    public static void deleteDir(File dir) {
        com.fazziclay.javaneoutil.FileUtil.deleteDir(dir);
    }
}
