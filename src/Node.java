import java.util.ArrayList;

/**
 * @author nmention
 * Represents Node data structure
 */
public class Node {

    Object label;
    Node parent;
    ArrayList<Node> children;


    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }




    @Override
    public String toString() {
        String display = "";
        if (parent != null){
            display += " Parent{label=" + this.parent.label + "}, ";
        }
        display += "Node{" +
                "label=" + label.toString() +
                ", children=" + children +
                '}';

        return display;
    }

    /**
     * constructor
     * @param content Object stored by this node
     */
    public Node(Object content) {
        this(content,null);

    }

    /**
     * constructor
     * @param content Object stored by this node
     * @param parent Node parent to this Node
     */
    public Node(Object content, Node parent)
    {
        this.label = content;
        this.parent = parent;
        children = new ArrayList<>();
    }

    /**
     * Add child Node to this now parent Node
     * @param child Node the node to be added to this node
     * @return the child added
     */
    public Node addChild(Node child){
        if (child == null){
            System.out.println("child is null");
            return null;
        }
        this.children.add(child);
        child.addParent(this);
        return child;
    }

    /**
     * Add Node parent to this node
     * @param parent Node parent of this node
     * @return Node parent
     */
    public Node addParent(Node parent){
        this.parent = parent;
        return parent;
    }

    /**
     * Check if this node is root
     * @return true if this node has no parent
     */

    public boolean isRoot(){
        return this.parent == null;
    }

    /**
     * Check if this node is a leaf
     * @return true if this node has no child
     */
    public boolean isLeaf(){
        return this.children.size()==0;
    }


    /**
     * Get external degree of this node aka number of children
     * @return int number of children
     */
    public int getDegree(){
        return this.children.size();
    }
}
