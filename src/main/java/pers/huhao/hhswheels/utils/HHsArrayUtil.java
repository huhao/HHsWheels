package pers.huhao.hhswheels.utils;

import java.lang.reflect.Array;

public class HHsArrayUtil {

    public static boolean isEmpty(Object[] array) {
        return getLength(array) == 0;
    }

    public static int getLength(Object array) {
        return array == null ? 0 : Array.getLength(array);
    }
}
