package com.mobeen;

/**
 * Created by Mobeen on 3/11/2017.
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem rootitem);
}
