package helper;

public class BinarTree {

    public static void main(String[] args) {
        BinarTree bt = new BinarTree();
        Node root = null;
        root = bt.addNode(root, 88);
//        bt.addNode(root, 75);
        bt.addNode(root, 93);
        bt.addNode(root, 24);
        bt.addNode(root, 12);
        bt.addNode(root, 6);
        bt.addNode(root, 8);
        bt.addNode(root, 3);
        bt.addNode(root, 15);
        bt.addNode(root, 13);
        System.out.println(bt.leftTree(root, false));
        System.out.println(bt.leftTree(root, true));
        System.out.println(bt.findSmallestValue(root));
//        System.out.println(bt.containValue(root, 12));
        bt.delete(root, 12);
//        System.out.println(bt.containValue(root, 12));
        System.out.println(bt.leftTree(root, false));
        System.out.println(bt.leftTree(root, true));

    }

    public void delete(Node root, int value) {
        root = deleteRecursive(root, value);
    }

    public Node deleteRecursive(Node root, int value) {
        if (root == null)
            return root;
        if (value < root.value)
            root.left = deleteRecursive(root.left, value);
        else if (value > root.value)
            root.right = deleteRecursive(root.right, value);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.value = findSmallestValue(root.right);
            root.right = deleteRecursive(root.right, root.value);
        }
        return root;
    }

    public boolean containValue(Node current, int value) {
        if (current == null)
            return false;
        if (current.value > value)
            return containValue(current.left, value);
        if (current.value < value)
            return containValue(current.right, value);
        return true;
    }

    public int findSmallestValue(Node root) {
        return root.left != null ? findSmallestValue(root.left) : root.value;
    }

    public Node getNode(Node current, int value) {
        if (current == null)
            return null;
        if (current.value > value)
            return getNode(current.left, value);
        if (current.value < value)
            return getNode(current.right, value);
        return current;
    }

    public Node addNode(Node current, int value) {
        if (current == null)
            return new Node(value);
        if (current.value > value)
            current.left = addNode(current.left, value);
        if (current.value < value)
            current.right = addNode(current.right, value);
        return current;
    }

    public String leftTree(Node root, boolean left) {
        StringBuilder st = new StringBuilder();
        st.append("Pint of ").append(left ? " left " : " right ").append(" part").append("\n");
        Node current = root;
        while (current != null) {
            st.append(current.value).append(", ");
            current = left ? current.left : current.right;
        }
        st.delete(st.length() - 2, st.length());
        return st.toString();
    }
}
