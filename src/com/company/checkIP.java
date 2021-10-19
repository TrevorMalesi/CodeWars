package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String ipAddress = scanner.nextLine();
            checkIP ip = new checkIP();
            System.out.println(ip.isvalidIp(ipAddress));
        }catch (InputMismatchException e){
            System.out.println("Error");
        }
    }

    public boolean isvalidIp(String ipAddress) {
        //Regex for digits from 0 to 255
        String regexString = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regexPattern = regexString + "\\." + regexString + "\\." + regexString + "\\." + regexString;
        Pattern p = Pattern.compile(regexPattern);
        if (ipAddress == null) {
            return false;
        }
        Matcher m = p.matcher(ipAddress);
        return m.matches();
    }
}


