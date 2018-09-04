package chain;

/**
 * Created by RenChao on 18/8/12.
 */
public class Main {
    public static void main(String args[]) {
        Node n = new Node();

        n.produce(10);
        Node n2 = n.getLastNode();
        n2.next = n;
        boolean b = ChainUtils.isCircle(n);
        System.out.println(b);

    }
}
