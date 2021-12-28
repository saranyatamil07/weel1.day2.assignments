package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=34345;
		int temp=0;
		int remainder;
		int inputnum=num;
		
		while(inputnum!=0)
		{
			remainder=inputnum % 10;
			temp=temp*10+remainder;
			inputnum=inputnum/10;
			
		}
		if(num==temp){
			System.out.println("number is palindrome");
		}
		
			else{
				System.out.println("number is not palindrome");
			}
				}
			}
