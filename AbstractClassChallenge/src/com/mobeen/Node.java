package com.mobeen;

/**
 * Created by Mobeen on 3/8/2017.
 */
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem nextItem() {
        return this.rightLink;
    }

    @Override
    public ListItem previousItem() {
        return this.leftLink;
    }

    @Override
    public ListItem setNextItem(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem setPreviousItem(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem item) {
    if(item != null){
        return ((String) super.getValue()).compareTo((String) item.getValue());
    }else{
        return -1;
    }
    }
}
