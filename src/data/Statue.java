package data;

import data.Item;

class Statue() extends Item{
    private int weight;
    private String colour;

    // contructor
    public Statue(){}
    public Statue(int value, String creator, int weight, String colour){
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    // methods
    @Override
    pubic void input(){
    
    }
    @Override
    public void output(){
    }
    //setters and getters

}