package com.vector;

import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
    }

    public ListVector(List<Double> data) {
        /* TODO */
    }

    @Override
    public void append(double value) {
        /* TODO */
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
    }

    @Override
    public void remove(int index) {
        /* TODO */
    }

    @Override
    public int length() {
        /* TODO */
    }

    @Override
    public double magnitude() {
        /* TODO */
    }

    public double distanceTo(ListVector another) {
        /* TODO */
    }

    @Override
    public double[] elements() {
        /* TODO */
    }

    public double element(int index) {
        /* TODO */
    }

    public ListVector minus(ListVector another) {
        /* TODO */
    }

    public ListVector plus(ListVector another) {
        /* TODO */
    }

    public ListVector scale(double factor) {
        /* TODO */
    }

    public double dot(ListVector another) {
        /* TODO */
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
    }
}
