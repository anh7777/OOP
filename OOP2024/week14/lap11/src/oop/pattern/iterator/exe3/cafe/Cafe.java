package oop.pattern.iterator.exe3.cafe;

import java.util.List;

public class Cafe {
    public static void main(String[] args) {
        System.out.println("\nMENU\n----\nBREAKFAST");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (String menuItem : breakfastItems) {
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        DinerMenu dinerMenu = new DinerMenu();
        String[] lunchItems = dinerMenu.getMenuItems();
        for (String menuItem : lunchItems) {
            if (menuItem != null) {
                System.out.println(menuItem);
            }
        }
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
