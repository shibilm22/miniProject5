import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Shibil's concert. What is your name? " );
    String name = scan.next(); 
    int capacity = 15;
    concert(capacity, numPpl);
  
  }

  static boolean concert(int numPpl, int capacity)
  {
   if (capacity > 0 ){
     System.out.println("More room in concert. How many of you are joining?");
     capacity = capacity - numPpl;
     return true;
   }else{
     System.out.println("Sorry,the concert is at full capacity! Maybe next time.");
     return false; 
   }
  }
}