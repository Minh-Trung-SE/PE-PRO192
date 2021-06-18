package manager;

import data.Item;
import util.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ItemList {
    private final ArrayList<Item> itemList;

    public ItemList() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (!itemList.contains(item)) {
            itemList.add(item);
        } else {
            System.out.println("Item is exit in list!");
        }
    }

    public boolean remove(int index) {
        index--;
        if (index < 0 || (index > itemList.size() - 1)) {
            System.out.println("The Object not exit to remove!");
            return false;
        } else {
            itemList.get(index).output();
            itemList.remove(itemList.get(index));
            return true;
        }
    }

    public boolean updateItem(int index) {
        index--;
        if (index < 0 || (index > itemList.size() - 1)) {
            System.out.println("The Object not exit to update!");
            return false;
        } else {
            System.out.println("Current value: " + itemList.get(index).toString());
            System.out.println("Enter new value");
            itemList.get(index).input();
            System.out.println("New update: "  + itemList.get(index).toString());
            return true;
        }
    }

    public List<Item> findItem(String creator) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getCreator().equals(creator)) {
                result.add(item);
            }
        }
        return result;
    }

    public void sortItem(Comparator<Item> sorting) {
        itemList.sort(sorting);
    }

    public void displayAll() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
    // DI
    public List<Item> groupByType(Filter<Item> condition){
        ArrayList<Item> result = new ArrayList<>();
        for (Item item: itemList) {
            if (condition.check(item)){
                result.add(item);
            }
        }
        return result;
    }
    // get itemList.
    public List<Item> getList(){
        return itemList;
    }

}