package chain;

/**
 * 节点
 * Created by RenChao on 18/7/25.
 */
public class Node {
    int value = 0;
    Node next;

    public Node() {
    }


    public Node(int value) {
        this.value = value;
    }

    public Node produce(int n) {
        Node indicator = this;
        for (int i = 1; i < n; i++) {
            Node node = new Node(i);
            indicator.next = node;
            indicator = node;
        }
        return this;
    }

    public Node getLastNode() {
        Node node = this;
        Node lastNode = this;
        if (node == null) {
            return null;
        }
        while (node.next != null) {
            lastNode = node.next;
            node = node.next;
        }
        return lastNode;
    }

    public String toString() {
        Node n = this;
        String s = "";
        while (n != null) {
            s += String.valueOf(n.value) + " ";
            n = n.next;
        }
        return s;
    }
}
