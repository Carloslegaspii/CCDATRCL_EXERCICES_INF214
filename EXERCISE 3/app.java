// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Cards_stack = new Stack(5);
  
      // Insert new elements into the stack
      Cards_stack.push("Ace Card");
      Cards_stack.push("Jack Card");
      Cards_stack.push("Queen Card");
      Cards_stack.push("King Card");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Cards_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Cards_stack.peek());
  
      // Remove top element in the stack
      Cards_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Cards_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Cards_stack.peek());
    }
  }
