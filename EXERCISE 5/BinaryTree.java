// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Starbucks Partners
        
        // Create Store manager 
        Node Carlos = new Node("Carlos SM");
        // Create Assistant Store Manager
        Node Glende = new Node("Glende ASM");
        // Create Shift Supervisor
        Node Fred = new Node("Fred SS");
        // Create Barista
        Node Leo = new Node("Leo Barista");
        // Create Barista
        Node Adrian = new Node("Adrian Barista");
        // Create Barista 
        Node Erika = new Node("Erika Barista");
        // Create Barista
        Node Shai = new Node("Shai Barista");

        // Set left and right as Managers
        Carlos.left = Glende;
        Carlos.right = Fred;

        // ASM Barista Trainees
        Glende.left = Leo;
        Glende.right = Adrian;

       // SS barista Trainees
        Fred.left = Erika;
       Fred.right = Shai;

       System.out.print("\nIn order Traversal: ");
       traverseInOrder(Carlos);

       System.out.print("\nPre order Traversal: ");
       traversePreOrder(Carlos);

       System.out.print("\nPost order Traversal: ");
       traversePostOrder(Carlos);
   
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }


   
   
}
