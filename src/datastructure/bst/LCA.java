package datastructure.bst;

public class LCA extends BST {

    public static void main(String... args) {
        LCA tree = new LCA();

        //tree.createDefaultTree(30, 20, 10, 34, 63, 24, 22, 67, 87);

        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(32);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right.right = new Node(54);
        tree.root.right.left = new Node(31);

        System.out.println("\n InOrder");
        tree.inOrderTraversal(tree.root);

        LCA t = new LCA();
        t.createDefaultTree(20, 8, 32, 4, 12, 10, 14,54,31);

        System.out.println("\n");
        t.inOrderTraversal(t.root);

        System.out.println("\n PreOrder");
        tree.preOrderTraversal(tree.root);

        System.out.println("\n");
        t.preOrderTraversal(t.root);

        System.out.println("\n postOrder");
        tree.postOrderTraversal(tree.root);

        System.out.println("\n");
        t.postOrderTraversal(t.root);

        System.out.print(" \nLCA " + tree.lowestCommonAncestor(tree.root, 10, 14).data);
        System.out.print(" \nLCA " + tree.lowestCommonAncestor(tree.root, 14, 8).data);
        System.out.print(" \nLCA " + tree.lowestCommonAncestor(tree.root, 10, 31).data);
        System.out.print(" \nLCA " + tree.lowestCommonAncestor(tree.root, 54, 31).data);
    }
}
