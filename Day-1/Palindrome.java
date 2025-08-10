public class Palindrome {

	public static void main(String[] args) {
		
		 int number = 121;
	        int original = number;
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }

	        if (original == reversed)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");

	}

}