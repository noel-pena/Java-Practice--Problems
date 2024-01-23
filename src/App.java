import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

// //write date
// public class App {
//     public static void main(String[] args) throws Exception {
//         //this is how to print out the current time
//         byte age = 29;
//         Date now = new Date();
//         System.out.println(now);
//     }
// }

// //arrays
// public class App {
//     public static void main(String[] args) throws Exception {
//         // int [] numbers = new int[5]; this is a method to write arrays individually 
//         // numbers[0] = 1;
//         // numbers[1] = 2;
//         int [] numbers = { 2, 3, 4, 1}; //this is how you can write an array as a whole
//         Arrays.sort(numbers);
//         System.out.println(Arrays.toString(numbers)); //remember toString to output in console
//     }
// }

// //multidimensional arrays
// public class App {
//     public static void main(String[] args) throws Exception {
//         // int [][] numbers = new int[2][3]; //two rows, three columns
//         // numbers[0][0] = 1;
//         int [][] numbers = {{1,2,3},{4,5,6}}; //this is the same way to write it but in brackets
//         System.out.println(Arrays.deepToString(numbers));
//     }
// }

////constants
// public class App {
//     public static void main(String[] args) throws Exception {
//         final float PI = 3.14F; //use "final" to write a constant
//     }
// }

////converting division to decimals
// public class App {
//     public static void main(String[] args) throws Exception {
//         double result = (double)10 / (double)3; //this is how to divide and include double to result in a decimal
//         System.out.println(result);
//     }
// }

// //Randomizing a number
// public class App {
//     public static void main(String[] args) throws Exception {
//         int result = (int) Math.round(Math.random() * 100);
//         System.out.println(result);
//     }
// }

// //Formatting numbers(getPercent, getCurrency, and others)
// public class App {
//     public static void main(String[] args) throws Exception {
//         NumberFormat currency = NumberFormat.getCurrencyInstance(); 
//         String result = currency.format(123456.891);
//         System.out.println(result);
//     }
// }

// //Record input from the user
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in); //system.in allows user to input from the terminal
//         System.out.print("Age:");
//         byte age = scanner.nextByte();
//         System.out.print("Name:");
//         String name = scanner.next();
//         System.out.println("Your name is " + name + " and you are " + age);
//     }
// }

// // If divisible by 5 = 'fizz'
// // if divisible by 3 = 'buzz'
// // if divisible by both 5 and 3 = 'fizzbuzz'
// // if not divisible by any you get the number
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Input a number: ");
//         int number = scanner.nextInt();

//         if (number % 5 == 0){
//             System.out.println("fizz");
//         } 
//         if (number % 3 == 0){
//             System.out.println("buzz");
//         } 
//         if (number % 3 == 0 && number % 5 == 0){
//             System.out.println("fizzbuzz");
//         } 
//         else {
//             System.out.println(number);
//         }
//     }
// }

// //Using while loop to infinitely ask the user to input anything until they type 'quit'
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         String input = "";
//         while (!input.equals("quit")) {
//             System.out.print("Input: ");
//             input = scanner.next().toLowerCase();
//             if (!input.equals("quit")){ //this statement allows the system to not display the "quit" input
//                 System.out.println(input);
//             }
//         }
//     }
// }

// //for-each loop (primarily for arrays)
// public class App {
//     public static void main(String[] args) throws Exception {
//         String [] fruits = {"apple", "mango", "orange"};

//         // for(int i = 0; i< fruits.length; i++){ //this is the normal for loop method
//         //     System.out.println(fruits[i]);
//         // }

//         for (String fruit : fruits){ //this is foreach, it only works forward not backward
//             System.out.println(fruits);
//         }
//     }
// }

//Mortgage Project
// mortgage pymt calculator as follow: M = P ((r (1 + r) ^n) / (1 + r) ^n - 1))
// public class App {
//     public static void main(String[] args) throws Exception {
//         final byte MONTHS_IN_YEAR = 12;
//         final byte PERCENT = 100;

//         int principal = 0;
//         float annualInterest = 0;
//         float monthlyInterest = 0;
//         byte years = 0;
//         int numberOfPayments = 0;
        
//         Scanner scanner = new Scanner(System.in);
        
//         while(true){
//             System.out.print("Principal ($1k - $1M): ");
//             principal = scanner.nextInt();
//             if(principal >= 1000 && principal <= 1000000 ){
//                 break;
//             } else {
//             System.out.println("Enter a number between 1,000 and 1,000,000.");
//             }
//         }

//         while(true){
//             System.out.print("Annual Interest Rate: ");
//             annualInterest = scanner.nextFloat();
//             monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//             if(annualInterest > 0 && annualInterest <= 30){
//                 break;
//             } else {
//                 System.out.println("Enter a value greater than 0 and less than less or equal to 30.");
//             }
//         }

//         while(true){
//             System.out.print("Period (Years): ");
//             years = scanner.nextByte();
//             numberOfPayments = years * MONTHS_IN_YEAR;
//             if(years >= 1 && years <= 30){
//                 break;
//             } else {
//                 System.out.println("Enter a value between 1 and 30.");
//             }
//         }

//         double mortgage = principal
//                     * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                     / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        
//         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        
//         System.out.print(mortgageFormatted);
//     }
// };


// //basic division calculator with error handling
// public class App {
//     public static void main(String[] args) throws Exception {
//         try{
//             Scanner scanner = new Scanner(System.in);

//             System.out.println("Enter a number to divide: ");
//             int x = scanner.nextInt();

//             System.out.println("Enter a number to divide by: ");
//             int y = scanner.nextInt();

//             int z = x/y;
            
//             System.out.println("Answer: " + z);
//         }
//         catch(InputMismatchException e){
//             System.out.println("Please enter a number.");
//         }
//         catch(ArithmeticException e){
//             System.out.println("You cannot divide by 0.");
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong. Try again.");
//         }
//     }
// }