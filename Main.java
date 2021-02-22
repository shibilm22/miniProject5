import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Shibil's concert. What is your name? " );
    String name = scan.next(); 
    int capacity = 5;
    concert(name, capacity);
  
  }

  static boolean concert(String name, int capacity)
  {
   if (capacity == 5){
     System.out.println("You are allowed in the concert!");
     return true;
   }else{
     System.out.println("The concert is at full capacity! Maybe next time.");
     return false; 
   }
  }
}