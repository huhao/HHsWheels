package pers.huhao.hhswheels.utils;

import com.sun.istack.internal.Nullable;

public class HHsStringUtil {
    static boolean isNullOrEmpty(@Nullable String value) {
        return value == null || value.isEmpty();
    }

    static boolean isNotNullOrEmpty(@Nullable String value) {
        return !isNullOrEmpty(value);
    }
}
