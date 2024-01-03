package pers.huhao.hhswheels.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HHsTimeUtilTest {

    @Test
    public void isDateInBetweenTest() throws ParseException {

        SimpleDateFormat sdt = new SimpleDateFormat(HHsTimeUtil.DEFAULT_FORMATTED_DATE);

        Date min = sdt.parse("2024-01-03 13:22:22");
        Date max = sdt.parse("2024-01-03 13:24:25");

        Date date = sdt.parse("2024-01-03 13:24:23");

        assertTrue(HHsTimeUtil.isDateInBetween(min, max, date));
    }

    @Test
    public void isDateOutsideTest() throws ParseException {

        SimpleDateFormat sdt = new SimpleDateFormat(HHsTimeUtil.DEFAULT_FORMATTED_DATE);

        Date min = sdt.parse("2024-01-03 13:22:22");
        Date max = sdt.parse("2024-01-03 13:24:25");

        Date date = sdt.parse("2024-01-03 13:22:21");

        assertTrue(HHsTimeUtil.isDateOutside(min, max, date));
    }
}
