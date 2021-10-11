package com.mycompany.vendingmachine.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO {

    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String message) {
        print(message);
        return Double.parseDouble(sc.nextLine());
    }

    @Override
    public double readDouble(String message, double max, double min) {
        double num;
        do {
            print(message);
            num = Double.parseDouble(sc.nextLine());
        } while (num > max || num < min);
        return num;
    }

    @Override
    public float readFloat(String message) {
        print(message);
        return Float.parseFloat(sc.nextLine());
    }

    @Override
    public float readFloat(String message, float max, float min) {
        float num;
        do {
            print(message);
            num = Float.parseFloat(sc.nextLine());
        } while (max < num || min > num);
        return num;
    }

    @Override
    public int readInt(String message) {
        print(message);
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public int readInt(String message, int max, int min) {
        int num;
        do {
            print(message);
            num = Integer.parseInt(sc.nextLine());
        } while (max < num || num < min);
        return num;
    }

    @Override
    public long readLong(String message) {
        print(message);
        return Long.parseLong(sc.nextLine());
    }

    @Override
    public long readLong(String message, long max, long min) {
        long num;
        do {
            print(message);
            num = Long.parseLong(sc.nextLine());
        } while (num > max || num < min);
        return num;
    }

    @Override
    public String redaString(String message) {
        print(message);
        return sc.nextLine();
    }

}
