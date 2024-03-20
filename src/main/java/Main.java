/**
 * A simple program demonstrating different Java exercises
 * 2024-01-24
 * @author Adalyn Smith
 */
public class Main {
  public static void main(String[] args) {
// Exercise 1a
    //Print a string that gives the sum of x and y
    int x = 6;
    int y = 4;
System.out.println("The sum of the two variables is " + (x + y));
// Exercise 1b
    //Prints a sum of 3 variables including a floating point value
    double z = 3.14;
    System.out.println("The sum of the three variables is " + (x + y + z));
// Exercise 1c
    //Prints two values for booleans
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun); 
    System.out.println(isFishTasty);
// Exercise 1d
    //Prints ASCII symbols for each value
    char myVar1 = 65;
    char myVar2 = 66;
    char myVar3 = 67;
    System.out.print(myVar1);
    System.out.print(myVar2);
    System.out.println(myVar3);
// Exercise 1e
    //Uses an if statement to compare two variables
    int high = 7;
    int low = 3;
    if (high > low){
      System.out.println(true);
    }
// Exercise 1f
    //Prints a first name and last name as a string
    String firstName = "Adalyn";
    String lastName = "Smith";
    System.out.println(firstName + " " + lastName);
// Exercise 1g
    //Prints a string despite having two different types
    String u = "60";
    int v = 35;
    String w = u + v;
    System.out.println(w);
// Exercise 1h
    //Prints a string that contains quotation marks
    System.out.println("We are the so-called \"Vikings\" of the north.");
// Exercise 1i
  // Not initializing x or y here since both have been initialized in 1a
  //Compares two variables and prints an output only if x is greater than y
    if (x > y){
      System.out.println("x is greater than y");
    }
  }
}