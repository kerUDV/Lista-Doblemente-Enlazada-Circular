public class DoubleLinkedList {
    private Node head;
    private Node current;

    public DoubleLinkedList() {
        this.head = null;
        this.current = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            current = head;
        } else {
            Node last = head.prev;
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = last;
            last.next = newNode;
        }
    }

    public void next() {
        if (current != null) {
            current = current.next;
        }
    }

    public void previous() {
        if (current != null) {
            current = current.prev;
        }
    }

    public void printCurrent() {
        if (current != null) {
            System.out.println("Valor actual: " + current.data);
        } else {
            System.out.println("Lista vacía");
        }
    }
}
