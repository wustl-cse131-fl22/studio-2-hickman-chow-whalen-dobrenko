package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount:");
		double startAmount = in.nextDouble();


		System.out.println("Enter start amount:");
		double winChance = in.nextDouble();

		System.out.println("Enter start amount:");
		double winLimit= in.nextDouble();



		while ((startAmount<winLimit) && (startAmount>0)) {
			double random = Math.random();

			if(random<winChance)

			{startAmount++;

			System.out.println(" You win: " + startAmount);

			}
			else 
			{
				startAmount--;
				System.out.println("You lose: " + startAmount);
			}
		}
	}

}
