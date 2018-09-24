import java.util.Scanner;
public class Linear_Search {		   
public static void main(String[]args) {
Scanner scan=new Scanner(System.in);
	
	int [] numbers = {2, 4, 7, 10, 11, 32, 45, 87}; 
	int NUMBERS_SIZE = 8;
	int i = 0;
	int key = 0;
	int keyIndex = 0;
		      
	System.out.print("NUMBERS: ");
		   
	for (i = 0; i < NUMBERS_SIZE; ++i) {
		System.out.print(numbers[i] + " ");
		}
	System.out.println();
		      
	System.out.print("Enter a value: ");
		key = scan.nextInt();
		      
	keyIndex = LinearSearch(numbers, NUMBERS_SIZE, key);
		      
	if (keyIndex == -1) {
		System.out.println(key + " was not found.");
		} 
	else {
		System.out.println("Found " + key + " at index " + keyIndex + ".");
		}
	}	

public static int LinearSearch(int [] numbers, int numbersSize, int key) {
	   int i = 0;

	   for (i = 0; i < numbersSize; ++i) {
	      if (numbers[i] == key) {
	         return i;
	      }
	   }
	      
	   return -1; // not found
	}}
