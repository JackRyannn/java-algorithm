package chain;

/**
 * Created by RenChao on 18/7/25.
 */
public class ChainUtils {

    public static int count(Node node) {
        int num = 0;
        while (node != null) {
            num += 1;
            node = node.next;
        }
        return num;
    }

    public static Node reverse(Node node) {
        Node pre_node = null;
        Node next_node = node.next;
        while (node != null) {
            node.next = pre_node;
            pre_node = node;
            node = next_node;
            if(node !=null)
            next_node = node.next;
        }
        return pre_node;
    }

}
