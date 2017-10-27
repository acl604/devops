package com.ebao.scm.devops.tools;

import java.util.UUID;

public class CommonUtil {
    public static String generateUUID(){
        String uuid = UUID.randomUUID().toString();
//去掉“-”符号
        return uuid.replaceAll("-", "");
    }

}
