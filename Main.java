import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //recieving user input from the user
    System.out.println("Welcome to Shibil's concert. What is your name? " );
    //Welcoming people to the concert using a print statement
    String name = scan.next(); 
    //saving and reciving name into type string 
    int numPpl = 0;
    int capacity = 15;
    //capacity will be full at 15 people 
    concert(capacity, numPpl);
    //calling concert method back into the main method including parametrs 

  }
  //method called concert
  static boolean concert(int capacity, int numPpl)
  {
    Scanner scan = new Scanner(System.in);
   if (capacity > 0 ){
    capacity = capacity - numPpl;
     //base case where capacity mus be greater than 0 
     System.out.println("More room in concert. How many of you are joining?");
      numPpl = scan.nextInt(); 
     //if it is greater than zero then it will print this statement
     //for every person joining capacity will subject one
     return concert(capacity, numPpl); 
     //only if capacity still has space 
   }else{
     System.out.println("Sorry,the concert is at full capacity! Maybe next time.");
     //will print once capacity hits to 15
     return false; 
     //once capacity hits to 15 it will no longer have space
   }
  }
}