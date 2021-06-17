package data;

import util.Input;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFreamed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFreamed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isFreamed = isFreamed;
        this.isWatercolour = isWatercolour;
    }
//method
    @Override
    public void input(){
       super.input();
       height = Input.getValue("Enter height: ");
       width = Input.getValue("Enter width: ");
       isFreamed = Input.getBoolean("Enter isFreamed or not [true/false]: ");
       isWatercolour= Input.getBoolean("Enter isWaterColour or not [true/false]: ");
    }
    @Override
    public void output() {
        System.out.println("Value: " + value +
                "\nCreator: " + creator +
                "\nHeight: " + height +
                "\nWidth: " + width +
                "\nWatercolour: " + isWatercolour +
                "\nFreamed: " + isFreamed);
    }

    @Override
    public String toString() {
        return "Painting{" +
                "value=" + value +
                ", creator='" + creator + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", isWatercolour=" + isWatercolour +
                ", isFreamed=" + isFreamed +
                '}';
    }
}
