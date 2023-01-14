public class Test {
    /**
     * Class used to test all other classes
     * @param args
     */


    public static void main(String[] args) {
      Node n1 = new Node(5);
      BinarySearchTree binarySearchTree = new BinarySearchTree();
      binarySearchTree.setRoot(n1);
      binarySearchTree.addChild(n1,new Node(9));
      binarySearchTree.addChild(n1,new Node(3));
      binarySearchTree.addChild(n1,new Node(4));

      System.out.println(binarySearchTree);

      System.out.println(binarySearchTree.getNodeByLabel(4));
      System.out.println(binarySearchTree.getNodeByLabel(9));















    }
}
