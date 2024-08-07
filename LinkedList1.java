public class LinkedList1 {
    // create node class of linkedList
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;// by default Assign 0

    // add first in linkedlist

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // add last in linkedlist
    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }

    // print data of linkedlist
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void AddMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("linkedList is Empty");
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchData(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }

        }
        return -1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteFromNthEnd(int n) {
        // calculate size of linkedlist
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iThfind = size - n;
        Node prev = head;
        while (i < iThfind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        // ll.addFirst(1);
        // ll.addFirst(3);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addFirst(7);
        // ll.addLast(32);
        // ll.addLast(10);
        // ll.AddMiddle(2, 2121);
        // ll.removeFirst();
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll.searchData(4));
        // System.out.println(ll.searchData(11));
        // ll.reverse();
        // ll.deleteFromNthEnd(8);
        // ll.print();
        // System.out.println("Size of LinkedList is : " + ll.size);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = head;
        System.out.println(isCycle());
    }
}
