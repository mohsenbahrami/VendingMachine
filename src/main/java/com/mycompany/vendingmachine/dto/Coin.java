
package com.mycompany.vendingmachine.dto;


public enum Coin {
    NICCKEL(5),DIME(10),QUARTER(25),LOONIE(100),TOONIE(200);
    private int value;

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
