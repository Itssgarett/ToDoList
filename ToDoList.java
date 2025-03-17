import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nTasks: " + tasks);
            System.out.println("1. Add Task | 2: Remove Task | 3: Exit");
        try {
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
               case 1:
                   System.out.print("Enter task: ");
                   tasks.add(sc.nextLine());
                   break;
               case 2:
                   System.out.print("Enter task number: ");
                   int index = sc.nextInt() - 1;
                   if (index >= 0 && index < tasks.size()) tasks.remove(index);
                   break;
               case 3:
                   sc.close();
                   System.out.print("I hope you have a great day! Goodbye!");
                   return;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
        // If user enters a value that isn't an integer it will say invalid input and ask for input again
        } catch (InputMismatchException e) {
              System.out.println("Invalid input. Please try again.");
              sc.nextLine();
        }  
   }
}
}