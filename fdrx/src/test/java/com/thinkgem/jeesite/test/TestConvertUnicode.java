package com.thinkgem.jeesite.test;

/**
 * Created by HuoLiJun on 2017/10/10 0010.
 */
public class TestConvertUnicode {
    public static void main(String[] args) {
       String resullt =  TestConvertUnicode.gbEncoding("方迪融信企业协作管理平台");
        System.out.println("===============================");
        System.out.println("result:"+resullt);
    }
    public static String gbEncoding(final String gbString) {   //gbString = "测试"
        char[] utfBytes = gbString.toCharArray();   //utfBytes = [测, 试]
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            String hexB = Integer.toHexString(utfBytes[byteIndex]);   //转换为16进制整型字符串
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        System.out.println("unicodeBytes is: " + unicodeBytes);
        return unicodeBytes;
    }
}
