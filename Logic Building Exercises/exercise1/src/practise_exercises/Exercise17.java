package practise_exercises;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(){
		System.err.println("Age should not be less than 18.");
	}
}
public class Exercise17 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if(age<18)
				throw new InvalidAgeException();
			else
				System.out.println("Registered Successfully.");
		}catch(InvalidAgeException e){
			System.err.println(e.getClass());
		}
		sc.close();
	}

}
