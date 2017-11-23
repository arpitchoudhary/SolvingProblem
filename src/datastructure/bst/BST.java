package datastructure.bst;

public class BST {

    Node root;

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }


    /**
     * method to create the BST with default values.
     *
     * @param values
     */
    void createDefaultTree(int... values) {

        if (values.length < 0) {
            throw new IllegalArgumentException("can't be neg value");
        }

        root = new Node(values[0]);

        for (int i = 1; i < values.length; i++) {
            createTreeNode(root, values[i]);
        }

    }

    private void createTreeNode(Node root, int value) {

        Node temp = root;

        if (temp.data > value) {

            if (temp.left != null) {
                createTreeNode(temp.left, value);
            } else {
                temp.left = new Node(value);
            }
        } else {

            if (temp.right != null) {
                createTreeNode(temp.right, value);
            } else {
                temp.right = new Node(value);
            }

        }

    }

    /**
     * considering that data is node is present in the tree.
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    Node lowestCommonAncestor(Node root, int p, int q) {

        if (root.data > Math.max(p, q)) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.data < Math.min(p, q)) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    /**
     * in order Traversal
     * @param root
     */
    void inOrderTraversal(Node root) {

        if (root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(" -- " + root.data);
        inOrderTraversal(root.right);

    }

    /**
     * in order Traversal
     * @param root
     */
    void preOrderTraversal(Node root) {

        if (root == null){
            return;
        }

        System.out.print(" -- " + root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    /**
     * in order Traversal
     * @param root
     */
    void postOrderTraversal(Node root) {

        if (root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" -- " + root.data);

    }

}
