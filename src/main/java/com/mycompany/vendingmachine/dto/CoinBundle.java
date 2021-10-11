package com.mycompany.vendingmachine.dto;

public class CoinBundle {

    public int num5CentsCoins;
    public int num10CentsCoins;
    public int num25CentsCoins;
    public int num50CentsCoins;
    public int num100CentsCoins;
    public int num200CentsCoins;

    public CoinBundle(int... enteredCoins) {
        this.num5CentsCoins = enteredCoins[0];
        this.num5CentsCoins = enteredCoins[1];
        this.num10CentsCoins = enteredCoins[2];
        this.num25CentsCoins = enteredCoins[3];
        this.num50CentsCoins = enteredCoins[4];
        this.num100CentsCoins = enteredCoins[5];
        this.num200CentsCoins = enteredCoins[6];
    }
}
