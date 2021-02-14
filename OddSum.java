import java.util.Scanner;//Import the Scanner Object
public class Main{//Initialize a Public Class
    public static void main(String [] args){//Start of main program. Initialize public static void main
        Scanner input = new Scanner(System.in);//Create a scanner object
        int num1, ans;//Create variables to store user input and then actual answer
        System.out.println("What is the Number? " );//Ask user for a number
        num1 = input.nextInt();//Take in the number and store it in the variable num1
        ans = OddSumCalculator(num1);//Call upon the method OddSumCalculator, calling num1 as its parameter, and store the value of it in ans
        System.out.println(ans);//Print answer
    }//Close the main program -- public static void main
    public static int OddSumCalculator(int num1){//Creation of method with 1 parameter
        int total = 0, count = 1;//Create variable total for calculating the sum and count to use in while loops to check odd numbers
        String sequence = "";//Create a string called sequence to list all the odd values that were added together
        if (num1 > 0){ //If statement for positive user number
            while (count <= num1){ //Count starts at 0 and will continue until it reaches num1 
              if (count % 2 != 0){//If count is an odd number
                    total += count;//Add the value to the total
                    sequence += Integer.toString(count) + " + ";//Add the number as a string to the sequence so we can see the whole equation at the end 
                    count++;//Increment count by 1
                    }//Close if statement
              else{//Start Else Statement
                      count++;//Increase count by 1 (Increment)
                      continue;//Continue as this number would be even
           }//Close Else Statement
        }//Clsoe while loop
}//Close the initial if statement
        else{//Else statement for negative values
             while (count >= num1){//While count is greater than the negative num1 
                   if (count % 2 != 0){//If count is odd
                       total += count;//Add the count to the total
                       sequence += Integer.toString(count) + " + ";//Add the odd number to the sequence so that we can see all the odd values included in the sum at the end 
                       count--;//Decrement count by 1
                    }//Close If statement 
                    else{//Start else statement for even values
                        count--;//Decrement count by 1
                        continue;//Continue the while loop
           } //Close else statement
    }//Close while loop
}//Close the initial else statement
            sequence = sequence.substring(0, sequence.length() - 2);//Take of the unneccessary addition sign at the end of the sequence 
            sequence += "= ";//Add an equals sign to the equation for aesthetic purposes
            System.out.print("The sequence is: " + sequence);//Print out the sequence (have to do it here and not the main program)
            return total;//Return the total value (sum)        
}//Close the method
}//Close the main class initially started as program has finished.
