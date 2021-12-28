package week1.day2.assignment;

public class Convertnegative {
	public static void main(String[] args) {
		int input=-40;
		if(input< 0)
		{
			input=input*-1;
		System.out.println("the converted positive number is"+input);
		}
		else if(input>0)
		{
			System.out.println("the given number is positive");
		}
		else {
			System.out.println("The number is neither positive nor negative");
		}
		}
}
