class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTOperations {
    Node root;

    // Insert
    Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // Search
    boolean search(Node root, int key) {
        if (root == null) return false;

        if (key == root.data) return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Find minimum value node
    Node minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete node
    Node delete(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1 & 2: one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: two children
            Node temp = minValue(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BSTOperations tree = new BSTOperations();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);

        System.out.println("Search 40: " + tree.search(tree.root, 40));

        tree.root = tree.delete(tree.root, 30);

        System.out.println("Inorder after deletion:");
        tree.inorder(tree.root);
    }
}
