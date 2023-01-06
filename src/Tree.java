public class Tree {

    private Node root;


    public Tree(Node root) {
        this.root = root;
    }




    public int length(){
        int cpt = 0;
        if (this.root.children == null){
            return cpt;
        }
        return cpt;
    }

    @Override
    public String toString() {
       return this.root.toString();
    }
}
