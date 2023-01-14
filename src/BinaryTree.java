/**
 * Represents Binary Tree data structure
 */
public class BinaryTree extends Tree{


    /**
     * Set the number of children allowed per Node
     * @param parent Node taken into account
     * @return true if parent has less than 2 children
     */
    @Override
    public boolean childrenLimits(Node parent) {
        return parent.getDegree() < 2;
    }
}
