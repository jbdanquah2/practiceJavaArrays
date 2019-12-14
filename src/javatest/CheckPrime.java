package javatest;

	import java.util.Scanner;

	public class CheckPrime {

	    
	    public static void main(String[] args) {
	// TODO code application logic here
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter a number ");
	        int Number = input.nextInt();
	        int result = findPorcupineNumber(Number);
	        System.out.println("The Porcupine number is: " + result);
	    }

	    public static int findPorcupineNumber(int number) {
	        int porcupineNumber = 0;
	        int maxValue = Integer.MAX_VALUE;
	        boolean isPorcupineNumber = false;
	        number++; 
	        while (number <= maxValue) {
	            if (isPorcupineNumber) {
	                if (isPrime(number) == 1) {
	                    if (number % 10 == 9) {
	                        break;
	                    } else {
	                        isPorcupineNumber = false;
	                    }
	                }
	            } else {
	                if (isPrime(number) == 1) {
	                    if (number % 10 == 9) {
	                        isPorcupineNumber = true;
	                        porcupineNumber = number;
	                    }
	                }
	            }
	            number++;
	        }
	        return porcupineNumber;
	    }

	    static int isPrime(int number) {
	        int isPrime = 0;
	        if (number > 1) {
	            isPrime = 1;
	            for (int divider = 2; 2 * divider <= number; divider++) {
	                if (number % divider == 0) {
	                    isPrime = 0;
	                    break;
	                }
	            }
	        }
	        return isPrime;
	    }
	}

