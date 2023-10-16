package pers.huhao.hhswheels.utils;


import java.util.concurrent.TimeUnit;

public class HHsUnitUtil {

    public static Long secondsConvertMinute(Long second) {
        return TimeUnit.SECONDS.toMinutes(second);
    }

    public static Long millisecondsConvertMinute(Long milliseconds) {
        return TimeUnit.MILLISECONDS.toMinutes(milliseconds);
    }
}
