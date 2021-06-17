package data;


import util.Input;

public class Item {
    protected int value;
    protected String creator;

    public Item(){
        value = 0;
        creator = "";
    }

    public Item(int value, String creator){
        this.value = value ;
        this.creator = creator;
    }

// getter and setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

//method
    public void input() {
        value = Input.getValue("Enter value: ");
        creator = Input.getString("Enter Creator: ");
    }

    public void output(){
        System.out.println("The value = " + getValue());
        System.out.println("The creator: " + getCreator());
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", creator='" + creator + '\'' +
                '}';
    }
}
