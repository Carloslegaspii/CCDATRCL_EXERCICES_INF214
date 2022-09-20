import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> DataStudents = new LinkedList<>();

        // Enqueue 5 of your classmates in this section
        DataStudents.add("Lawrence Idel Aranilla");
        DataStudents.add("Winna Jane Bablis ");
        DataStudents.add("Moses Christian Bantegui");
        DataStudents.add("Maria Theresa Jesmari Erl Labon ");
        DataStudents.add("Seth Marie Mercado ");
        System.out.println(DataStudents);
      

        // Get the size of the queue
        System.out.println("The Size of Students in line is  " + DataStudents.size());
        

        // Get the front of the queue
        System.out.println("The Student that is in front of the line is  " + DataStudents.peek());

        //Dequeue 5 of your classmate
         DataStudents.remove();
         DataStudents.remove();
         DataStudents.remove();
         DataStudents.remove();
         DataStudents.remove();

        //Enqueue another 5 of you classmates
         
        DataStudents.add("Jap Bolanos");
        DataStudents.add("Ronn Adia");
        DataStudents.add("Alexander John Du");
        DataStudents.add("Brandon Kenneth Cinco");
        DataStudents.add("Kean John Dapitillo");
        
         // Get the size of the queue
         System.out.println("The Size of Students in line is  " + DataStudents.size());

          // Get the front of the queue
          System.out.println("The Student that is in front of the line is  " + DataStudents.peek());
        
        // Display all elements of the queue.
        System.out.println(DataStudents);

        //Create a exercise_4 folder in your CCDATRCL_EXERCISES_INF214 repository
	
        //Upload the App.java file in the exercise_4 folder
    }
}
