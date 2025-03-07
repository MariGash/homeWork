package model.human.comparators;

import java.util.Comparator;

import model.tree.TreeItem;

public class HumanComparatorByName<T extends TreeItem> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
