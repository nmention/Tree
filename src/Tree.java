/**
 * represents a Tree data structure. It only possess a root node
 */
public class Tree {

    private Node root;


    /**
     * constructor
     */
    public Tree(){
        this(null);
    }

    /**
     * constructor
     * @param root
     */
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

    /**
     * Addition of a child Node into the Tree
     * @param parent Node parent to future child to be added
     * @param child Node to be added into this Tree
     */
    public void addChild(Node parent, Node child){

        /*if (!this.contains(parent)){
            System.out.println("Parent not contained in this tree");
            return;

        }
        if (this.contains(child)){
            System.out.println("Child is already contained in this tree");
            return;

        }*/
        if (this.childrenLimits(parent)){
            parent.getChildren().add(child);
            child.addParent(parent);
        }



    }

    /**
     *
     * @param node Node to be searched for in the Graph
     * @return true if node is present
     */
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

    /**
     *
     * @param object Object contained by a Node
     * @return true if Node containing said object is present in this Tree
     */
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

    /**
     * Allow to get a Node of this Tree by its label
     * @param label Object contained by the Node
     * @return Node or null if no Nodes of this label has been found
     */
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

    /**
     * Allows to delete a Node of this Tree. Reorganize the Tree if needed
     * @param node Node to be deleted
     */
    public void deleteNode(Node node){
        if (!this.contains(node)){
            return;
        }
        if (node.isLeaf()){
            node.parent.children.remove(node);


        }
        else {
            if (!node.isRoot()){
                node.getParent().getChildren().addAll(node.getChildren());
                node.getParent().getChildren().remove(node);

                for (Node n : node.getChildren()){
                    n.setParent(node.getParent());
                }
            }

        }


    }

    /**
     * Creates a subTree based of a designated Node
     * @param root Node used to construct subTree
     * @return new subTree
     */
    public Tree subTree(Node root){
        if (!this.contains(root)){
            return null;
        }
        return new Tree(root);

    }


    /**
     * Allows the deletion of a Node identified by its label
     * @param object Object contained by a Node of this Tree
     */
    public void deleteNode(Object object){
        if (!this.contains(object)){
            System.out.println("No such node in " + getClass().getSimpleName());
            return;
        }
        Node target = this.getNodeByLabel(object);
        deleteNode(target);

    }

    /**
     * Set the number of children allowed per Node. This is mainly used in subclasses
     * @param parent Node taken into account
     * @return true (always)
     */
    public boolean childrenLimits(Node parent){
        return true;
    }

    public boolean containing(Node node){
        if (this.root == null){
            return false;
        }
        if (this.root == node){
            return true;
        }
        /*if (this.root.children == null)
        {
            return false;
        }*/

        for (Node n : this.root.getChildren()){
            if (subTree(n).containing(node)){
                break;
            }
        }
        return false;

    }
}
