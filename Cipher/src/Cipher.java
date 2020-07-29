/*Name: Sofia Syed
 *CPSC-50100 Programming FUndamentals
 *Summer 2020
 *PROGRAMMING ASSIGNMENT 1 - Cipher
 */
import java.util.Scanner;
import java.util.Random;
public class Cipher {

	public static void main(String[] args) {
		int sum=0, ones, tens, plainTxtOnes, plainTxtTens; //initialize variables
		int []num=new int[5]; //initialize variable into array of 5 integers
		Random rand = new Random(); //generates random number
		Scanner input = new Scanner(System.in); //scanner instance for input stream
		//programming assignment information below
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Sofia Syed");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();//line break
		System.out.println("Welcome to the Cipher program."); //welcome user
		System.out.println("Please enter 5 numbers between 0 and 19"); //prompt user to enter 5 numbers in range of given numbers
		for(int i=0;i<5;i++){ //initialize variable; for loop runs through each iteration increased by 1 (i++) until <5 is met;
			//if statements for ordinal labels (0-4)
			if (i == 0) 
				System.out.print("1st number: ");
			else if (i == 1)
				System.out.print("2nd number: ");
			else if (i == 2)
				System.out.print("3rd number: ");
			else if (i == 3)
				System.out.print("4th number: ");
			else if (i == 4)
				System.out.print("5th number: ");
			num[i]=input.nextInt();//reads next integer input
			if(num[i]>0 && num[i]<19){ //if integer entered is between 0 and 19, then the sum of all inputs is added to "num"
				sum+=num[i];
				}
				else //else 0 or less than 0 OR 19 or more than 19 is entered, then warning message is sent to user
				{
				System.out.println("Please read directions and try again!");
				System.exit(0); //terminate for loop
			}
			}
		System.out.println(); //line break
		System.out.println("Total = "+sum); //display sum or all inputs to user
		
		int key=rand.nextInt(10); //key set to random integer between 0 and 10
		System.out.println("Your random key is "+key); //display random key to user
	
		plainTxtOnes=sum/10; //stores the ones from 2 digit "Total" in variable as plain text
		plainTxtTens=sum%10; //stores the tens from 2 digit "Total" in variable as plain text
		
		//Caesar Code for encoding ones and tens
		ones=(plainTxtOnes+key)%10;
		tens=(plainTxtOnes=sum%10+key)%10; 
		
		//merges encoded numbers and stores into variable
		int encodedNum=tens*10+ones;
		
		 	if(encodedNum>9) //if the encoded number is GREATER than 9, then it will be printed exactly as is
		 	{
		 		System.out.println("Your encoded number is "+encodedNum);
		 	}
		 	else //else the encoded number is LESS than 9, then it will be printed with a leading 0
		 	{
		 		String encoded = String.format("%02d", encodedNum); //"%02d"=> ZERO added to left of number for a total of two digits (leading zero)
		 		System.out.println("Your encoded number is "+encoded);
         }
	}
}
