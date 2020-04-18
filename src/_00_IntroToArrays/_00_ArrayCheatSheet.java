package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] Ponton=new String[5];
		//2. print the third element in the array
System.out.println(Ponton[2]);
		//3. set the third element to a different value
Ponton[2]="Aryan";
		//4. print the third element again
		System.out.println(Ponton[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < Ponton.length; i++) {
			Ponton[i]="France";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int j = 0; j < Ponton.length; j++) {
			System.out.println(Ponton[j]);
		}
		
		//7. make an array of 50 integers
int[] ponton = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random randy=new Random();

for (int k = 0; k < ponton.length; k++) {
	
	ponton[k]=randy.nextInt(50);
}
		//9. without printing the entire array, print only the smallest number on the array
int small=50;
for (int i = 0; i < ponton.length; i++) {
	if (ponton[i]<small) {
		small=ponton[i];
	}
}
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
