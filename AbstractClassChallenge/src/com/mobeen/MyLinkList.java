package com.mobeen;

/**
 * Created by Mobeen on 3/10/2017.
 */
public class MyLinkList implements NodeList {
    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem NewItem) {
    if(this.root == null)
    {
        this.root = NewItem;
        return true;
    }
    ListItem currentItem = this.root;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
