package com.mycompany.obj;

public class Obj {

    public static void main(String[] args) {
        Item item = new Item(1, "item 1");
        item.setLocation(2);
        item.setDescription("item 2");

        Monster monster = new Monster(3, "monster 1");
        monster.setLocation(4);
        monster.setDescription("monster 2");

        System.out.println("Item Location: " + item.getLocation());
        System.out.println("Item Description: " + item.getDescription());

        System.out.println("Monster Location: " + monster.getLocation());
        System.out.println("Monster Description: " + monster.getDescription());
    }
    }
}
