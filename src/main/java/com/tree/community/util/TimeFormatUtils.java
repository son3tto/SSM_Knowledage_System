package com.tree.community.util;

import java.text.SimpleDateFormat;

public class TimeFormatUtils {
    public static String GmtformatTime(Long GmtTime){
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat5.format(GmtTime);
    }
}
