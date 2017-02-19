package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/18/2017.
 */
public class GroceryList {

    private ArrayList<String>  myGroceryList = new ArrayList();

    public void addItem(String itemName){

        myGroceryList.add(itemName);
    }

    public void removeItem(String itemName){

        if(myGroceryList.contains(itemName)) {
            myGroceryList.remove(itemName);
        }else{
            System.out.println("item not found");
        }
    }

    public void editItem(String oldItemName,String NewitemName) {

       int index =  getItem(oldItemName);
        myGroceryList.set(index,NewitemName);

    }

    public int getItem(String itemName){

        return myGroceryList.indexOf(itemName);
    }

    public void printList(){

    for(int i=0; i< myGroceryList.size(); i++)
    {
        System.out.println("Item " + i + ":" + myGroceryList.get(i));
    }
    }

    public ArrayList<String> copyArray(){
        return myGroceryList;

    }






}
