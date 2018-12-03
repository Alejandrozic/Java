public class MyBinarySearchTree {

    Node root;

    // Nested Class
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    // Constructor
    MyBinarySearchTree(){
        this.root = null;
    }

    void insert(int data){
        if ( root == null )
            this.root = new Node(data);
        else
            insert_node(data, root);
    }

    void insert_node(int data, Node node){
        if ( data <  node.data)
            if (node.left != null)
                insert_node(data, node.left);
            else
                node.left = new Node(data);
        else {
            if (node.right != null)
                insert_node(data, node.right);
            else
                node.right = new Node(data);
        }
    }

    void traverse(String type){
        if (root != null) {
            if (type.equalsIgnoreCase("InOrder"))
                traverse_inorder(root);
            else if (type.equalsIgnoreCase("PostOrder"))
                traverse_postorder(root);
            else if (type.equalsIgnoreCase("PreOrder"))
                traverse_preorder(root);
        }
    }

    void traverse_inorder(Node node){
        // Left, Root, Right
        if (node.left != null)
            traverse_inorder(node.left);
        System.out.println(node.data);
        if (node.right != null)
            traverse_inorder(node.right);
    }

    void traverse_postorder(Node node){
        // Left, Right, Root
        if (node.left != null)
            traverse_postorder(node.left);
        if (node.right != null)
            traverse_postorder(node.right);
        System.out.println(node.data);
    }

    void traverse_preorder(Node node){
        // Root, Left, Right
        System.out.println(node.data);
        if (node.left != null)
            traverse_preorder(node.left);
        if (node.right != null)
            traverse_preorder(node.right);
    }

    void delete(int data){
        if (root != null)
            delete_node(data, root);
    }

    Node delete_node(int data, Node node){
        if (node == null)
            return node;
        if (data < node.data)
            node.left = delete_node(data,node.left);
        else if (data > node.data)
            node.right = delete_node(data, node.right);
        else{
            // Leaf
            if (node.left == null && node.right != null){
                System.out.println("Deleting Leaf Node -> data="+node.data);
                this.root = null;
            }
            // Single Right Child
            if (node.left == null){
                return node.right;
            }
            // Single Left Child
            else if (node.right == null){
                return node.left;
            }
            // Two Children
            System.out.println("Deleting Node w/Two Children -> data="+node.data);
            Node predecessor = get_predecessor(node.left);
            node.data = predecessor.data;
            node.left = delete_node(predecessor.data, node.left);

        }
        return node ;
    }

    Node get_predecessor(Node node){
        if (node.right != null)
            return get_predecessor(node.right);
        return node;

    }
}