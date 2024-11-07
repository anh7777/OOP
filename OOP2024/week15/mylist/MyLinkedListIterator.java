package hus.oop.mylist;

import java.util.NoSuchElementException;

public class MyLinkedListIterator implements MyIterator {
    private MyLinkedListNode currentNode;

    /**
     * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
     * @param node Node hiện tại trong MyLinkedList.
     */
    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    /**
     * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return true nếu còn phần tử tiếp theo, ngược lại false.
     */
    @Override
    public boolean hasNext() {
        return currentNode != null && currentNode.getNext() != null;
    }

    /**
     * Iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại.
     * @return Payload của phần tử hiện tại.
     */
    @Override
    public Object next() {
        if (currentNode == null) {
            throw new NoSuchElementException("No more elements in the list.");
        }
        Object data = currentNode.getNext();
        currentNode = currentNode.getNext();
        return data;
    }
}
