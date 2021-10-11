
package com.mycompany.vendingmachine.ui;


public class VendingMachineView {
    private UserIO io;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    void displayWelcome(){
        io.print("Welcome to Vending Machine");
    }
    public int displayMenuGetChoice(){
        io.print("");
        io.print("");
        
        return 0;
    }
    
    
    
}
