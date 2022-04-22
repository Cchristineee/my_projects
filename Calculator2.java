  // Christine Grimadeau
    // Chapter 6 assignment 

import java.util.Scanner;

public class Calculator2
{
   public static void main( String [] args )
   {
     final int SENTINEL = -1;
     int Accountnumber;
     int totalcredit = 0;

     Scanner scan = new Scanner( System.in );

     System.out.println( "Welcome to the addition calculator.\n" );

     // 1. Priming Read
     System.out.print( "Enter the account number"
                        + " or -1 to quit the program > " );
     Accountnumber = scan.nextInt( );

     while ( Accountnumber != SENTINEL ) // 2. Test LCV
     {
        // 3. Body - Accumulate Total amount of credit
        totalcredit += Accountnumber;

     System.out.print( "Enter beginning balance: ");
       double BegBalofMonth = scan.nextDouble ( );

     System.out.print( "Enter items charged: ");
        double ItemsCharged = scan.nextDouble ( );

     System.out.print( "Enter credits applied: ");
        double CreditApplied = scan.nextDouble ( );

     System.out.print( "Enter credit limit: ");
        double AllCreditApplied = scan.nextDouble ( );


        double NewBal = BegBalofMonth + ItemsCharged - CreditApplied;


        if (NewBal > AllCreditApplied)
     System.out.println (" Credit limit exceeded. ");



// 4.Repeat Read
     System.out.print( "Enter the next account number"
                           + " or -1 to quit the program > " );
        Accountnumber = scan.nextInt( );


     }
// Output Accumulator after the loop ends
     System.out.println( "The total credit is " + totalcredit );
   }
}