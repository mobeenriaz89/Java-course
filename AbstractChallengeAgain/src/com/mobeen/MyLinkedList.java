package com.mobeen;

/**
 * Created by Mobeen on 3/11/2017.
 */
public class MyLinkedList implements NodeList {
    ListItem rootItem = null;

    public MyLinkedList(ListItem rootItem) {
        this.rootItem = rootItem;
    }

    @Override
    public ListItem getRoot() {
        return this.rootItem;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.rootItem == null){
            this.rootItem = newItem;
            return true;
        }
        ListItem currentItem = this.rootItem;
        while(currentItem != null) {
         int comparison = currentItem.compareTo(newItem);
            if (comparison <0) {
            if(currentItem.next() != null ){
                currentItem = currentItem.next();
            }else{
                currentItem.setnext(newItem).setprevious(currentItem);
                return true;
            }
            }else if(comparison>0){
                if(currentItem.previous() != null){
                    currentItem.previous().setnext(newItem).setprevious(currentItem.previous());
                    newItem.setnext(currentItem).setprevious(newItem);

                }else{
                  newItem.setnext(this.rootItem).setprevious(newItem);
                  this.rootItem = newItem;
                }
                return true;
            }else{
                System.out.println("Cant add because " + newItem.getValue() + " already exist in the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToDelete) {
        if(itemToDelete != null){
            System.out.println("Deleting item " + itemToDelete.getValue());
        }

        ListItem currentItem = this.rootItem;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(itemToDelete);
            if (comparison == 0) {
                if (currentItem == this.rootItem) {
                    this.rootItem = currentItem.next();
                } else {
                    currentItem.previous().setnext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setprevious(currentItem.previous());
                    }
                }
                return true;

            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem rootitem) {
    if(rootitem == null){
        System.out.println("List is empty");
    }else{
        while(rootitem != null){
            System.out.println(rootitem.value);
            rootitem = rootitem.next();
        }
    }
    }
}
