import java.sql.SQLOutput;

public class Test {
    /**
     * Class used to test all other classes
     *
     * @param args
     */


    public static void main(String[] args) {
        Node n1 = new Node(5);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.setRoot(n1);
        binarySearchTree.addChild(n1, new Node(9));
        binarySearchTree.addChild(n1, new Node(3));
        binarySearchTree.addChild(n1, new Node(4));


        Tree tree = new Tree();
        Node n2 = new Node(10);
        Node n3 = new Node(20);
        Node n4 = new Node(30);
        Node n5 = new Node(40);
        Node n6 = new Node(50);
        Node n7 = new Node(60);
        Node n8 = new Node(70);
        Node n9 = new Node(80);
        Node n10 = new Node(90);
        Node n11 = new Node(100);
        Node n12 = new Node(110);
        Node n13 = new Node(120);
        Node n14 = new Node(true);
        Node n15 = new Node("oooohhhh");

        tree.setRoot(n2);

        tree.addChild(n2,n3);
        tree.addChild(n2,n4);
        tree.addChild(n2,n5);

        tree.addChild(n3,n6);
        tree.addChild(n3,n7);

        tree.addChild(n4,n8);
        tree.addChild(n4,n9);
        tree.addChild(n4,n10);

        tree.addChild(n5,n11);

        tree.addChild(n9,n12);
        tree.addChild(n9,n13);

        tree.addChild(n9,n14);
        tree.addChild(n9,n15);


        System.out.println("Test of Tree ::");
        System.out.println(tree);
        System.out.println(tree.containing(n12));

        tree.deleteNode(20);
        System.out.println(tree);
        System.out.println("Test of BST ::");
        System.out.println(binarySearchTree);

        System.out.println(binarySearchTree.getNodeByLabel(4));
        System.out.println(binarySearchTree.getNodeByLabel(9));


    }
}
