package com.vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
         data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        /* TODO */
    }

    /*
    * Hàm tăng số phần tử của mảng lên gấp đôi.
    * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
    * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
    * sau đó copy những phần tử của mảng cũ sang mảng mới.
    */
    private void extend() {
        /* TODO */
    }

    /*
    * Hàm thêm một phần tử vào cuối vector.
    * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
    * thì cần phải cấp phát một mảng lớn hơn.
    */
    @Override
    public void append(double value) {
        /* TODO */
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
    }

    /*
    * Hàm xóa một phần tử của vector ở vị trí index.
    */
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

    public double distanceTo(ArrayVector another) {
        /* TODO */
    }

    @Override
    public double[] elements() {
        /* TODO */
    }

    @Override
    public double element(int index) {
        /* TODO */
    }

    public ArrayVector minus(ArrayVector another) {
        /* TODO */
    }

    public ArrayVector plus(ArrayVector another) {
        /* TODO */
    }

    public ArrayVector scale(double factor) {
        /* TODO */
    }

    public double dot(ArrayVector another) {
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
