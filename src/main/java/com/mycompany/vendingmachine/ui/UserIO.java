package com.mycompany.vendingmachine.ui;

public interface UserIO {

    void print(String message);

    double readDouble(String message);

    double readDouble(String message, double max, double min);

    float readFloat(String message);

    float readFloat(String meassge, float max, float min);

    int readInt(String message);

    int readInt(String message, int max, int min);

    long readLong(String message);

    long readLong(String message, long max, long min);

    String redaString(String meassage);

}
