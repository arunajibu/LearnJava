package array;

import java.util.Scanner;

public class Arrayexampleforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,555};
		System.out.println(numbers[4]);
	//	System.out.println(numbers[5]);//will give compilation error
		
		numbers[4]=5;
		System.out.println(numbers[4]);
		//5numbers[5]=5;//exception error
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter peters age :");
		int peterAge=scanner.nextInt();
		System.out.println("Peters age is" + peterAge);



	}

}
