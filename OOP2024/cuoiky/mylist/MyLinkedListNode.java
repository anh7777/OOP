package hus.oop.mylist;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    /**
     * Khởi tạo node với dữ liệu payload và nút tiếp theo là null.
     * @param payload Dữ liệu của node.
     */
    public MyLinkedListNode(Object payload) {
        this.payload = payload;
        this.next = null;
    }

    /**
     * Khởi tạo node với dữ liệu payload và nút tiếp theo được chỉ định.
     * @param payload Dữ liệu của node.
     * @param next Nút tiếp theo.
     */
    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    /**
     * Trả về dữ liệu của node.
     * @return Dữ liệu của node.
     */
    public Object getPayload() {
        return this.payload;
    }

    /**
     * Trả về nút tiếp theo.
     * @return Nút tiếp theo.
     */
    public MyLinkedListNode getNext() {
        return this.next;
    }

    /**
     * Thiết lập nút tiếp theo.
     * @param node Nút tiếp theo cần thiết lập.
     */
    public void setNext(MyLinkedListNode node) {
        this.next = node;
    }
}
