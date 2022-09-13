import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your surname 
        char[] surname = { 'L', 'E', 'G', 'A', 'S','P', 'I' };

        // 2. Display each character of your surname in each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }

        // 3. Display the first character of the surname 
        System.out.println(surname[0]);

        // 4. Display the last character of the surname
        System.out.println(surname[6]);

        // 5. Display the character of your surname  in reverse order
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }

        
        System.out.println ("======================================================");
       
        // Linked List
        // 1.Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> studentNumber = new LinkedList<>();

        studentNumber.add("2");
        studentNumber.add("0");
        studentNumber.add("2");
        studentNumber.add("1");
        studentNumber.add("1");
        studentNumber.add("0");
        studentNumber.add("6");
        studentNumber.add("7");
        studentNumber.add("2");
        studentNumber.add("5");
       
        System.out.println(studentNumber);

        // 2. Add "*" to the head/front of the Linked list
        studentNumber.addFirst("*");

        // System.out.println(studentNumber);

        // 3. Add "*" to the tail/end of the Linked list
        studentNumber.addLast("*");

       // 4. Print the Linked list
        System.out.println(studentNumber);
        
        // 5. Display the last character of the Linked list
        System.out.println(studentNumber.getLast());

        // 6. Replace the last character of the Linked list with "!";
        studentNumber.set(11, "!");

        // 7. Remove the first character of the Linked list
        studentNumber.remove(0);

        // // 8. Display the LinkedList
        System.out.println(studentNumber);

        System.out.println ("======================================================");
        // Stack

        // 1. Create a Stack of characters of your surname

        Stack<String> Stacksurname = new Stack<>();

        
        Stacksurname.push("L");
        Stacksurname.push("E");
        Stacksurname.push("G");
        Stacksurname.push("A");
        Stacksurname.push("S");
        Stacksurname.push("P");
        Stacksurname.push("I");

        // 2. Print the Stack
        System.out.println(Stacksurname);

        // 3. Add a "INF214" to the stack
        Stacksurname.push("I");
        Stacksurname.push("N");
        Stacksurname.push("F");
        Stacksurname.push("2");
        Stacksurname.push("1");
        Stacksurname.push("4");

        // 4. Print the Stack
        System.out.println(Stacksurname);

        // 5. Remove "INF214" and add "CCDATRCL-INF214"
        Stacksurname.pop();
        Stacksurname.pop();
        Stacksurname.pop();
        Stacksurname.pop();
        Stacksurname.pop();
        Stacksurname.pop();

        Stacksurname.push("C");
        Stacksurname.push("C");
        Stacksurname.push("D");
        Stacksurname.push("A");
        Stacksurname.push("T");
        Stacksurname.push("R");
        Stacksurname.push("C");
        Stacksurname.push("L");
        Stacksurname.push("-");
        Stacksurname.push("I");
        Stacksurname.push("N");
        Stacksurname.push("F");
        Stacksurname.push("2");
        Stacksurname.push("1");
        Stacksurname.push("4");
        // 6. Print the Stack
        System.out.println(Stacksurname);
    }
}
