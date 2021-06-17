package data;

import util.Input;

public class Vase extends Item{
    private int height;
    private String material;

    public Vase(){

    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //getter and setter

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

//method
    @Override
    public void input(){
        super.input();
        height = Input.getValue("Enter height: ");
        material = Input.getString("Enter material: ");
    }
    @Override
    public void output(){
        super.output();
        System.out.println("The height: "+ getHeight());
        System.out.println("The material: "+ getMaterial());
    }

    @Override
    public String toString() {
        return "Vase{" +
                "value=" + value +
                ", creator='" + creator + '\'' +
                ", height=" + height +
                ", material='" + material + '\'' +
                '}';
    }
}
