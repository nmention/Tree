public class Tree {

    private Node root;



    public Tree(){
        this(null);
    }


    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
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


    public boolean contains(Node node){
        if (this.root == null){
            return false;
        }
        if (this.root == node){
            return true;
        }
        if (this.root.children == null)
        {
            return false;
        }

        if (this.root.children.size() == 0){
            return false;
        }


        for (Node n : this.root.children){
            if (n == node){
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object object){
        if (this.root == null){
            return false;
        }
        if (this.root.label.equals(object)){
            return true;
        }
        if (this.root.children == null)
        {
            return false;
        }

        if (this.root.children.size() == 0){
            return false;
        }


        for (Node n : this.root.children){
            if (n.label.equals(object)){
                return true;
            }
        }
        return false;


    }

    public Node getNodeByLabel(Object label){
        Node result = null;
        if (this.root.getLabel().equals(label)){
            return this.root;
        }
        for (Node n : this.root.getChildren()){
            if (n.getLabel().equals(label)){
                return n;
            }
        }
        return result;
    }


    public Node deleteNode(Node node){
        if (!this.contains(node)){
            return null;
        }
        if (node.isLeaf()){
            node.parent.children.remove(node);
            return node;
        }
        return null;

    }



    public Node deleteNode(Object object){
        if (!this.contains(object)){
            return null;
        }
        Node target = this.getNodeByLabel(object);
        if (target.isLeaf()){
            target.getParent().getChildren().remove(target);
        }
        return null;
    }
}
