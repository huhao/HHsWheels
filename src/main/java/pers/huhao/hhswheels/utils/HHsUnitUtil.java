package pers.huhao.hhswheels.utils;


public class HHsUnitUtil {

    private final static String UNIT_MINUTE = "分钟";

    public static String secondConvertMinute(Long second) {
        long minute = second % 3600L / 60L;
        return minute + UNIT_MINUTE;
    }
}
