import java.util.ArrayList;

public class Node {
    Object label;
    Node parent;
    ArrayList<Node> children;


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

    public Node(Object contenu) {
        this(contenu,null);

    }
    public Node(Object contenu, Node parent)
    {
        this.label = contenu;
        this.parent = parent;
        children = new ArrayList<>();
    }


    public Node addChild(Node child){
        if (child == null){
            System.out.println("child is null");
            return null;
        }
        this.children.add(child);
        child.addParent(this);
        return child;
    }


    public Node addParent(Node parent){
        this.parent = parent;
        return parent;
    }

    public boolean isRoot(){
        return this.parent == null;
    }

    public int getDegree(){
        return this.children.size();
    }
}
