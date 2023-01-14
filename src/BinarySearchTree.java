public class BinarySearchTree extends BinaryTree{


    /**
     * Allows to add new Node to BST. Each node of this Tree contains an int. New element with label greater than parent label get appended, others are inserted
     * @param parent Node parent to future child to be added
     * @param child Node to be added into this Tree
     */
    @Override
    public void addChild(Node parent, Node child) {
        if (!this.contains(parent)){
            System.out.println("Parent not contained in this tree");
            return;

        }
        if (this.contains(child)){
            System.out.println("Child is already contained in this tree");
            return;

        }
        if (this.childrenLimits(parent)){
            if ((int)child.getLabel() > (int)parent.getLabel())
            {
                parent.getChildren().add(child);
            }
            else {
                parent.getChildren().add(0,child);
            }
            child.addParent(parent);
        }
    }
    @Override
    public Node getNodeByLabel(Object label) {
       if (this.getRoot().isLeaf())
           return null;
       if (this.getRoot().getLabel().equals(label)){
           return this.getRoot();
       }

       if  ((int)this.getRoot().getLabel() < (int)label){
           return(this.subTree(this.getRoot().getChildren().get(1)).getNodeByLabel(label));
       }
       else {
           return(this.subTree(this.getRoot().getChildren().get(0)).getNodeByLabel(label));
       }
    }
}
