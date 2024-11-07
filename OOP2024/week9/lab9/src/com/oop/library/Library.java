package com.oop.library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = rents[0];
        for (int i = 1; i < rents.length; i++) {
            Rent current = rents[i];
            long tmp1 = (longestRent.getEnd().getTime() - longestRent.getBegin().getTime());
            long tmp2 = current.getEnd().getTime() - current.getBegin().getTime();
            if (tmp1 < tmp2) {
                longestRent = current;
            }
        }
        return longestRent;
    }

}