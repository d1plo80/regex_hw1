package ru.study.java.andrey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            Pattern url = Pattern.compile("(\\?|\\&)(([^=]+)\\=([^&]+))");
            Matcher matcher = url.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//            int idx = str.indexOf("?");
//            String strNew = str.substring(idx + 1);
//            String[] temp = strNew.split("&");
//            System.out.println(Arrays.toString(temp));
//            "http://mail.ru?param1=value1&param2=value2"