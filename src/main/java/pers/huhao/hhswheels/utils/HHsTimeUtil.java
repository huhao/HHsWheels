package pers.huhao.hhswheels.utils;

import java.util.Date;

public class HHsTimeUtil {

    public static final String DEFAULT_FORMATTED_DATE = "yyyy-MM-dd HH:mm:ss";

    /**
     * 判断 c 在a和b之间,包含a和b
     */
    public static boolean isDateInBetween(final Date min, final Date max, final Date date) {
        return min.compareTo(date) * max.compareTo(date) <= 0;
    }

    /**
     * 判断 c 不在a和b之间,也不包含a和b
     */
    public static boolean isDateOutside(final Date min, final Date max, final Date date) {
        return date.before(min) || date.after(max);
    }
}
