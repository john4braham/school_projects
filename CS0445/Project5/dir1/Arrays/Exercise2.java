/*
	Exercise2.java

	This program fills an array of random size with random ints.
	Then repeatedly prompts the user for a number to search the array for.
	The search is simple. start at the beginning and visit eavy cell in the array.
	Compare it to the number (target) if there is a match then quit the loop and
	report that the index position where the number was found.
	If no match then report NOT FOUND or such.

	As soon as the user enters a negative target - quit searching, the game is over.

	JUST FILL IN SEARCH LOOP NEAR BOTTOM
*/


import java.io.*;
import java.util.Random;

public class Exercise2
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader kbd = new BufferedReader( new InputStreamReader(System.in) );

		final int DIM_MAX=25;  // I want dimension in 10..25 inclusive
		final int DIM_MIN=15;  // I want dimension in 10..25 inclusive

		final int MAX_VAL = 100; // all numbers put into array must be in 0..100 inclusive

		Random r = new Random(); // random number generator
		int myArr[] = new int[ r.nextInt(DIM_MAX-DIM_MIN+1) + 10]; // length is now 15..25

		// loop: fill the array with random values between 1 and 100 inclusive

		for (int i=0 ; i < myArr.length ; ++i)
			myArr[i] = r.nextInt( MAX_VAL+1 );  // 0..100 range

		// Echo contents of array

		System.out.print("\nmyArr: ");
		for (int i=0 ; i < myArr.length ; ++i)
			System.out.print( myArr[i] + " ");
		System.out.println();

		// loop: prompt user for an int to look for - neg val means quit searching
		int target;
		int indOfTarget;
		do
		{
			indOfTarget = -1; // init to an impossible index value

			System.out.print("int to search for? ");
			target = Integer.parseInt( kbd.readLine() );

			if (target < 0 ) break; // exit this while loop

			// SEARCH THE ARRAY FOR THE TARGET AND EITHER COME BACK
			// WITH INDEX OF POSTION WHERE FOUND
			// OR -1 WHICH MEANS NOT FOUND		

			// WRITE A SEARCH LOOP HERE

			if (indOfTarget == -1)
				System.out.println( target + " NOT FOUND");
			else
				System.out.println( target + " FOUND" + " at index " + indOfTarget);

		} while (true); // END while

	} // END main

} // EOF
