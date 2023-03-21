package week3to4assignment;

public class week3to4assign {

	public static void main(String[] args) {
		// 1. create an array
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		// 1.a. Programmatically subtract the value of the first element in the array
		// from the value in the last element of the array (i.e. do not use ages[7] in
		// your code). Print the result to the console.
		ages[ages.length - 1] = ages[ages.length - 1] - ages[0];
		System.out.println(ages[ages.length - 1]);
		// 1.b. Add a new age to your array and repeat the step above to ensure it is
		// dynamic (works for arrays of different lengths).
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 56 };

		ages2[ages2.length - 1] = ages2[ages2.length - 1] - ages2[0];
		System.out.println(ages2[ages2.length - 1]);

		// 1.c c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.

		double ageSum = 0;

		for (int age : ages2) {
			ageSum += age;
		}
		System.out.println("the avarage age is: " + ageSum / ages2.length);

		// 2. Create an array of String called names that contains the following
		// values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// a. Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.

		double charSum = 0;
		for (String name : names) {
			charSum += name.length();
		}
		System.out.println("the avarage letter per name : " + charSum / names.length);

		// b. Use a loop to iterate through the array again and concatenate all the
		// names together, separated by spaces, and print the result to the console.

		String allNames = "";

		for (String name : names) {
			allNames += name + " ";
		}
		System.out.println(allNames);

		// 3. How do you access the last element of any array?

		System.out.println("the last element is " + ages[ages.length - 1]);

		// 4. How do you access the first element of any array?

		System.out.println("the first element is " + ages[0]);

		// 5. Create a new array of int called nameLengths. Write a loop to iterate
		// over the previously created names array and add the length of each name to
		// the nameLengths array.

		int[] nameLengths = new int[6];
		int i = 0;
		for (String name : names) {
			nameLengths[i] = name.length();
			i++;
		}
		for (int name : nameLengths) {
			System.out.println(name);
		}
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int sum = 0;
		for (int name : nameLengths) {
			sum += name;
		}
		System.out.println("the sum of all the elements is : " + sum);
		// 7. Write a method that takes a String, word, and an int, n, as arguments and
		// returns the word concatenated to itself n number of times. (i.e. if I pass in
		// “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(concatWord("hello", 3));
		// 8. Write a method that takes two Strings, firstName and lastName, and
		// returns a full name (the full name should be the first and the last name as a
		// String separated by a space).
		System.out.println(fullName("David", "Atwood"));
		// 9. Write a method that takes an array of int and returns true if the sum of
		// all the ints in the array is greater than 100.
		int[] arrayOne = { 33, 51, 21 };
		int[] arrayTwo = { 3, 43, 12 };
		System.out.println("arrayOne is greater than 100 : " + isArrayMore100(arrayOne));
		System.out.println("arrayTwo is greater than 100 : " + isArrayMore100(arrayTwo));
		// 10. Write a method that takes an array of double and returns the average of
		// all the elements in the array.
		double[] doubleArray = { 5.84, 6.33, 22.5, 33 };
		System.out.println("the avarage of the doubleArray is " + doubleAvg(doubleArray));
		// 11. Write a method that takes two arrays of double and returns true if the
		// average of the elements in the first array is greater than the average of the
		// elements in the second array.
		double[] doubleArray2 = { 222, 4.6, 22.5, };
		System.out.println("doubleArray avarage is greater than doubleArray2 avarage : "
				+ isOneGreater(doubleArray, doubleArray2));
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside,
		// and a double moneyInPocket, and returns true if it is hot outside and if
		// moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 9;
		System.out.println("I will buy a drink = " + willBuyDrink(isHotOutside, moneyInPocket));

	}

	public static String concatWord(String word, int n) {
		String concWord = "";
		for (int i = 0; i < n; i++) {
			concWord += word;
		}
		return concWord;
	}

	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	public static boolean isArrayMore100(int[] intArray) {
		int sum = 0;
		for (int num : intArray) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static double doubleAvg(double[] doubleArray) {
		double sum = 0;
		for (double num : doubleArray) {
			sum += num;
		}
		return sum / doubleArray.length;
	}

	public static boolean isOneGreater(double[] arrayOne, double[] arrayTwo) {
		double sum = 0;
		double sum2 = 0;
		for (double num : arrayOne) {
			sum += num;
		}
		for (double num : arrayTwo) {
			sum2 += num;
		}
		if (sum / arrayOne.length > sum2 / arrayTwo.length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}
	// 13. Create a method of your own that solves a problem. In comments, write
	// what the method does and why you created it.

//This is a method i created for a sub menu, after selecting a spirit type this method	
//		pulls an array of cocktails that can be made with that spirit with the option of
//		going back to the initial selection or selecting one to see the recepie. (I'm a Bartender)
//I created it in a project im doing to practice the skills im learning	
	public static int CocktailSelection(int selection, String[] cocktails) {
		int cocktail = 0;
		while (cocktail == 0) {
			System.out.println("Choose a cocktail.");
			{
				for (int i = 0; i < cocktails.length; i++) {
					System.out.println(i + 1 + ")" + cocktails[i]);

				}
				System.out.println(cocktails.length + 1 + ")Back");
				cocktail = sc.nextInt();
				if (cocktail < 0 && cocktail > cocktails.length + 1) {
					cocktail = 0;
					System.out.println("Please select a valid option.");
					cocktail = sc.nextInt();
				}
			}
		}
		return cocktail;

	}
}
