public class Test {


    public static void main(String[] args) {
        Node n1 = new Node("s");

        Node n2 = new Node(5);
        Node n3 = new Node(true);


        Tree t1 = new Tree(n1);




        //System.out.println(n1);





        n1.addChild(n2);


        //System.out.println(n1);
        n1.addChild(n3);
        System.out.println(t1);


        System.out.println(n2.isRoot());
        System.out.println(n1.isRoot());

        System.out.println(n1.getDegree());
        System.out.println(n2.getDegree());
















    }
}
