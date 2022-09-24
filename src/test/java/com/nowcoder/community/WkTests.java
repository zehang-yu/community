package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "e:/workspace/wkhtmltopdf/bin/wkhtmltoimage --quality 75 http://www.nowcoder.com e:/workspace/wkdata/wk-images/1.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
