package com.mobeen;

/**
 * Created by Mobeen on 3/11/2017.
 */
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setnext(ListItem item) {
        return this.rightLink = item;
    }

    @Override
    ListItem setprevious(ListItem item) {
        return this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.value);
        }else{
            return -1;
        }
    }
}
