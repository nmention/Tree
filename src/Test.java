public class Test {


    public static void main(String[] args) {
        Node n1 = new Node("s");

        Node n2 = new Node(5);
        Node n3 = new Node(true);


        Tree t1 = new Tree(n1);
        t1.addChild(n1,n2);
        t1.addChild(new Node(98),n3);
        t1.addChild(n1,n2);
        t1.addChild(n1,n3);





        //System.out.println(n1);








        //System.out.println(n1);

        System.out.println(t1);

        t1.deleteNode(n2);
        t1.deleteNode(true);
        System.out.println(t1);

        System.out.println(t1.contains(n3));
        System.out.println(t1.contains(25));


      /*  System.out.println(n2.isRoot());
        System.out.println(n1.isRoot());

        System.out.println(n1.getDegree());
        System.out.println(n2.getDegree());

*/














    }
}
