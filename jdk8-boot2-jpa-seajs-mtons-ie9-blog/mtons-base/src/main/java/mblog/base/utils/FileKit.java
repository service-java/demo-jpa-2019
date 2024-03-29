package mblog.base.utils;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author - langhsu
 * @create - 2018/3/9
 */
public class FileKit {
    // 文件允许格式
    // Array.asList : 将数组转化为list
    private static List<String> allowFiles = Arrays.asList(".gif", ".png", ".jpg", ".jpeg", ".bmp");
    private final static String PREFIX_VIDEO = "video/";
    private final static String PREFIX_IMAGE = "image/";

    /**
     * 文件类型判断
     * 是否在允许范围内
     *
     * @param fileName
     * @return
     */
    public static boolean checkFileType(String fileName) {
        Iterator<String> type = allowFiles.iterator();
        while (type.hasNext()) {
            String ext = type.next();
            if (fileName.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取文件名
     *
     * @param path
     * @return
     */
    public static String getFilename(String path) {
        // File.separator
        // 路径分隔符 Linux Windows不同
        int pos = path.lastIndexOf(File.separator);

        // return path.substring(pos + 1);
        return path.substring(0, pos + 1);
    }

    /**
     * 获取文件类型
     *
     * @param filename
     * @return
     */
    public static String getSuffix(String filename) {
        int pos = filename.lastIndexOf(".");
        return filename.substring(pos + 1);
    }

}
