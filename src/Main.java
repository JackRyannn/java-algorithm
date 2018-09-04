import chain.ChainUtils;
import chain.Node;

/**
 * Created by RenChao on 18/7/17.
 */
public class Main {
    public static void main(String[] args) {

        Node n = new Node();
        n.produce(10);
        n = ChainUtils.reverse(n);
        System.out.println(n.toString());

    }
}
