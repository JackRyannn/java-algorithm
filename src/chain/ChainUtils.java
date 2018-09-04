package chain;

/**
 * Created by RenChao on 18/7/25.
 */
public class ChainUtils {

    //    统计节点个数
    public static int count(Node node) {
        int num = 0;
        while (node != null) {
            num += 1;
            node = node.next;
        }
        return num;
    }

    //单链表翻转
    public static Node reverse(Node node) {
        Node pre_node = null;
        Node next_node = node.next;
        while (node != null) {
            node.next = pre_node;
            pre_node = node;
            node = next_node;
            if (node != null)
                next_node = node.next;
        }
        return pre_node;
    }

    //链表是否有环
    public static boolean isCircle(Node node) {
        Node n1 = node;
        Node n2 = node;
        while (n1 != null && n2 != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2 && n1 != null) {
                return true;
            }
        }
        return false;
    }

}
