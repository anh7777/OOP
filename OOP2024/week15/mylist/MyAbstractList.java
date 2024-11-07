package hus.oop.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        MyIterator iterator = this.iterator();

        while (iterator.hasNext()) {
            result.append("[").append(iterator.next()).append("] ");
        }

        // Remove the last space if there's any element in the list
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    /**
     * Phương thức trừu tượng để lấy iterator của danh sách.
     * Các lớp con phải triển khai phương thức này.
     * @return iterator của danh sách.
     */
    public abstract MyIterator iterator();
}
