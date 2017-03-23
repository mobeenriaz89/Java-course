package com.mobeen;

/**
 * Created by Mobeen on 3/8/2017.
 */
public abstract class ListItem {
   protected ListItem rightLink;
   protected ListItem leftLink;

   protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem nextItem();
   public abstract ListItem previousItem();
   public abstract ListItem setNextItem(ListItem item);
   public abstract ListItem setPreviousItem(ListItem item);

   public abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
