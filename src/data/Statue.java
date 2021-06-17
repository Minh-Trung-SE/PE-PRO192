package data;

import util.Input;



public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    // getter and setter
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    // method
    @Override
    public void input() {
        super.input();
        weight = Input.getValue("Enter weight: ");
        colour = Input.getString("Enter colour: ");
    }
    @Override
    public void output() {
        super.output();
        System.out.println("The height: " + getWeight());
        System.out.println("The material: " + getColour());
    }

    @Override
    public String toString() {
        return "Statue{" +
                "value=" + value +
                ", creator='" + creator + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}