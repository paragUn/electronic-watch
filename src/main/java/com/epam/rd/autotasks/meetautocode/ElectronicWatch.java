package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, seconds);
        SimpleDateFormat df = new SimpleDateFormat("H:mm:ss");
        System.out.println(df.format(calendar.getTime()));
    }
}
