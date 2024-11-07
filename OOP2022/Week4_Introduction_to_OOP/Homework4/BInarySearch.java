public class BInarySearch {
    public static int bSearch(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        System.out.println("[" + iLeft + "," + iRight + "]");
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]) {
            return iMid;
        } else if (key > a[iMid]) {
            return bSearch(a, key, iMid + 1, iRight);
        } else {
            return bSearch(a, key, iLeft, iMid - 1);
        }
    }

    public static int bSearch(int[] a, int key) {
        int n = a.length;
        return bSearch(a, key, 0, n - 1);
    }

    public static void main(String[] args) {
        int iLeft = 1, iRight = 20;
        int key = 10;
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 122, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(bSearch(a, key));
    }
}
