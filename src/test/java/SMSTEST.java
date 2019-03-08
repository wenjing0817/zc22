package test.java;

import com.zy.util.SMSUtil;

import java.io.IOException;

public class SMSTEST {

    public static void  main(String[] args){
        try {
            String s = SMSUtil.postJson("13463297615","666666");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }









}
