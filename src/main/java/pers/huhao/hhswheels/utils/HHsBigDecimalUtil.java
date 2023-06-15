package pers.huhao.hhswheels.utils;

import java.math.BigDecimal;

public class HHsBigDecimalUtil {

    /**
     * 判断 a 是否等于 b
     */
    public static boolean eq(BigDecimal a, BigDecimal b) {
        return a.compareTo(b) == 0;
    }

    /**
     * 判断 a 是否大于 b
     */
    public static boolean gt(BigDecimal a, BigDecimal b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 判断 a 是否大于等于 b
     */
    public static boolean gte(BigDecimal a, BigDecimal b) {
        return gt(a, b) || eq(a, b);
    }

    /**
     * 判断 a 是否小于 b
     */
    public static boolean lt(BigDecimal a, BigDecimal b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 判断 a 是否小于等于 b
     */
    public static boolean lte(BigDecimal a, BigDecimal b) {
        return lt(a, b) || eq(a, b);
    }

}
