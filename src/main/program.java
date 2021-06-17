package main;

import data.Item;
import data.Painting;
import data.Statue;
import data.Vase;
import manager.ItemList;
import util.Filter;
import util.Input;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ItemList itemList = new ItemList();
        do {
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.println("input your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Item vase = new Vase();
                    vase.input();
                    itemList.addItem(vase);
                    break;
                case 2:
                    Item statue = new Statue();
                    statue.input();
                    itemList.addItem(statue);
                    break;
                case 3:
                    Item painting = new Painting();
                    painting.input();
                    itemList.addItem(painting);
                    break;
                case 4:
                    itemList.displayAll();
                    break;
                case 5:
                    System.out.println("Enter the name of creator: ");
                    ArrayList<Item> result = (ArrayList<Item>) itemList.findItem(sc.nextLine());
                    for (Item item : result) {
                        System.out.println(item.toString());
                    }
                    break;
                case 6:
                    itemList.updateItem(Input.getValue("Enter The Index of Item: "));
                    break;
                case 7:
                    itemList.remove(Input.getValue("Enter The Index of Item: "));
                    break;
                case 9:
                    Comparator<Item> sorting = (o1, o2) -> Integer.compare(o1.getValue(),o2.getValue());
                    itemList.sortItem(sorting);
                    break;
                case 8:
                    Filter<Item> filterVase = item ->{return item instanceof Vase;};
                    for (Item itemVase : itemList.gruopByType(filterVase)) {
                        System.out.println(itemVase);
                    };
                    break;

            }
        } while (choice <= 9 && choice > 0);
    }
}