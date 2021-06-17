package data;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
    }
    
    public void output(){
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
    }
}
