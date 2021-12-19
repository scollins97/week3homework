package week3CodingAssignment;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {//start of main method
	
		
		int[] ages = {3,9,23,64,2,8,28,93}; //declaring array named "ages"
		int n = ages.length; // size of array stored in a variable
		System.out.println("The value of the last array minus the first one is " +
				lastMinusFirst(ages) );
		int newAge = 50; // setting the new age
		ages = addNewAge(n, ages, newAge );//adding the new age 
		//for (int number: ages) {
		//	System.out.println(number);
		//}
		System.out.println("The value of the last array minus the first one is " +
				lastMinusFirst(ages) );
		
		System.out.println("The average age in the this array is " +
		averageOfArray(ages) + " years old.");
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		System.out.println("The average number of letters per name is "+ 
		averageLetters(names));
		printNames(names);
		
		int[] nameLengths = assignNameLengths(names);
		//for(int i = 0; i < nameLengths.length; i++) {
			//System.out.println(nameLengths[i]);        //to test loop
		//}
		System.out.println("The sum of all the name lengths is " +
		arraySum(nameLengths));
		//wordByNumber("hello", 1); //testing for question 7
		
		//String fullName = fullName("Sean","Collins");
		//System.out.println(fullName);    //test for question 8
		
		/*
		int[] test = {50, 1};
		System.out.println(moreThan100(test)); //test to see if method works for question 9
		*/
		/*
		double[] array1 = {40, 50, 70};
		double[] array2 = {70, 70, 70};    //test for question 11
		System.out.println(isAverageBigger(array1, array2));
		*/
		
		
		//System.out.println(willBuyDrink(true, 10.50));//test for question 12
		
		
		
		//using this to demonstrate the method for question 13. it will keep running the method until the
		// user enters in two different numbers 
		Scanner kb = new Scanner(System.in);
		boolean different = false;
		int number1;
		int number2;
		while(different == false){
			System.out.println("Please enter two different numbers.");
			number1 = kb.nextInt();
			number2 = kb.nextInt();
			different = isDifferent(number1, number2);
		}
		
	}// end of main method 

	
	public static int lastMinusFirst(int[]array) {//start of method
		int sum;
		sum = array[array.length -1] - array[0];
		return sum;
	}//end of method
	
	public static int[] addNewAge(int arrayLength, int array[], int newAge) {//start of method
		/*
		 * making a new array to replace the old one with the new age. 
		 * it will be the original size plus one
		 */
		int newArray[] = new int[arrayLength + 1];
		/*
		 * using a for loop to copy the original values into the new array
		 */
		for(int i = 0; i < arrayLength; i ++) {
			newArray[i] = array[i];
		}
		newArray[arrayLength] = newAge;
		/*
		 * since the array length is never an index, i can use the old length as the final index
		 * of the new array. this entire method only works to add one new int to the array
		 */
		return newArray;
		
	}//end of method
	
	public static int averageOfArray(int[] array) {//start of method 
		int sum = 0;
		for(int number : array) {
			sum += number;
		}
		return sum / array.length;
	}//end of method
	
	public static int averageLetters(String[] array) {//start of method
		int sum = 0; 
		for(int i = 0; i < array.length; i ++) {
			sum += array[i].length();
		}
		return sum / array.length;
	}// end of method
	
	public static void printNames(String[] array) {//start of method
		for(String name : array) {
			System.out.print(name + " ");
		}
		System.out.println();
	}//end of method
	
	public static int[] assignNameLengths(String[] array) {//start of method
		int newArray[] = new int[array.length];
		for(int i = 0; i < array.length; i++) {
		newArray[i] = array[i].length();
		}
		return newArray;
	}// end of method
	
	public static int arraySum(int[] array) {//start of method
		int sum = 0;
		for(int number : array) {
			sum += number;
		}
		return sum;
	}// end of method
	
	public static void wordByNumber(String word, int n) {//start of method
		if(n >= 1) {
			for(int i = 0; i < n; i++) {
				System.out.print(word);
			}
			System.out.println();
		}else {
			System.out.println("You need to use a positive number greater than or equal to 1.");
		}
	}//end of method
	
	public static String fullName(String firstName, String lastName) {//start of method
		String fullName = firstName + " " + lastName;
		return fullName; 
	}//end of method
	
	public static boolean moreThan100(int[] array) {//start of method
		boolean over100;
		int sum = 0;
		for(int number : array) {
			sum += number;
		}
		if(sum > 100) {
			over100 = true;
		}else {
			over100 = false;
		}
		return over100;
	}//end of method
	
	public static double averageOfArray2(double[] array) {//start of method 
		double sum = 0;
		for(double number : array) {
			sum += number;
		}
		return sum / array.length;
	}//end of method
	
	public static boolean isAverageBigger(double[]array1, double[] array2) {//start of method
		double sum1 = 0;
		double sum2 = 0;
		boolean isIt;
		for(double number : array1) {
			sum1 += number;
		}
		for(double number : array2) {
			sum2 += number;
		}
		if(sum1 / array1.length > sum2 / array2.length) {
			isIt = true;
		}else {
			isIt = false;
		}
		return isIt;
	}//end of method
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //start of method
		boolean drink;
		if(isHotOutside == true && moneyInPocket >= 10.50) {//i assume if you have 10.50 you can afford the drink
			drink = true;
		}else {
			drink = false;
		}
		return drink; 
	}//end of method
	
	public static boolean isDifferent(int number1, int number2) {//start of method
		boolean pass;
		if(number1 == number2) {
			pass = false;
		}else {
			pass = true;
		}
		return pass;
	}//end of method
	
	
}
