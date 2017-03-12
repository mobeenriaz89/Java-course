package com.mobeen;

/**
 * Created by Mobeen on 3/11/2017.
 */
public abstract class ListItem {


    ListItem rightLink;
    ListItem leftLink;

    Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setnext(ListItem item);
    abstract ListItem setprevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
