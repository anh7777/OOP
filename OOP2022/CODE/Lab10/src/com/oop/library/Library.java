package com.oop.library;

import java.time.Period;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        int max = (int) (rents[0].end.getTime() - rents[0].begin.getTime()) / (1000 * 60 * 60 * 24);
        Rent rent = null;
        for (int i = 1; i < rents.length; i++) {
            if (((int) (rents[i].end.getTime() - rents[i].begin.getTime()) / (1000 * 60 * 60 * 24)) > max) {
                max = (int) (rents[i].end.getTime() - rents[i].begin.getTime()) / (1000 * 60 * 60 * 24);
                rent = rents[i];
            }
        }
        return rent;
    }
}
