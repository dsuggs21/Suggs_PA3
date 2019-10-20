import java.util.Scanner;
import java.util.Random;

class Main
{
	static double answer;
	static double score, right, wrong;
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		double i, j;
		double option = Menu();
		double level = Difficulty();

		if(option == 1)
		{
		for(i=0;i<5;i++)
		addition();
		}
		else if(option == 2)
		{
		for(i=0;i<5;i++)
		subtraction();
		}
		else if(option == 3)
		{
		for(i=0;i<5;i++)
		multiplication();
		}
		else if(option == 4)
		{
		for(i=0;i<5;i++)
		divide();
		}
		else if(option == 5)
		{
		for(i=0;i<5;i++)
		{
			double op = rand.nextInt(4)+1;
			switch(op)
			{
				case 1: addition();
				break;
				case 2: subtraction();
				break;
				case 3: multiplication();
				break;
				case 4: divide();
				break;
			}
		}
	}
	if(level == 1)
		{
			for(j=0;j<5;j++)
			System.out.println("");
		}
		else if(level == 2)
		{
			for(j=0;j<5;j++)
			System.out.println("");
		}
		else if(level == 3)
		{
			for(j=0;j<5;j++)
			System.out.println("");
		}
		else if(level == 4)
		{
			for(j=0;j<5;j++)
			System.out.println("");
		}

	double percent = right * 10;
	if( percent < 75.0 )
	{
		System.out.println("Please ask your teacher for extra help!");
	}
	else
		System.out.println("Congratulations,you are ready to go to the next level!");
	}

	public static void addition()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		double x = rand.nextInt(9)+1;
		double y = rand.nextInt(9)+1;
		double z = rand.nextInt(4)+1;
		double ans, input;
		
		do
		{
			System.out.println("What is " + x + " plus " + y + " ? ");
			ans = x + y;
			input = scan.nextInt();
			
			if(ans != input)
			{
				switch(z)
				{
					case 1:
					System.out.println("No. Please try again.");
					break;
					case 2:
					System.out.println("Wrong. Try once more.");
					break;
					case 3:
					System.out.println("Don’t give up!");
					break;
					case 4:
					System.out.println("No. Keep trying.");
					break;
				}
				wrong++;
			}
			else
			{
				switch(z)
				{
					case 1:
					System.out.println("Very good!");
					break;
					case 2:
					System.out.println("Excellent!");
					break;
					case 3:
					System.out.println("Nice work!");
					break;
					case 4:
					System.out.println("Keep up the good work!");
					break;
				}
				right++;
			}
		}while(ans != input);
	}

	public static void subtraction()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		double x = rand.nextInt(9)+1;
		double y = rand.nextInt(9)+1;
		double z = rand.nextInt(4)+1;
		double ans, input;

		do
		{
			System.out.println("What is "+ x + " minus " + y + " ? ");
			ans = x - y;
			input = scan.nextInt();
			if(ans != input)
			{
				switch(z)
				{
					case 1:
					System.out.println("No. Please try again.");
					break;
					case 2:
					System.out.println("Wrong. Try once more.");
					break;
					case 3:
					System.out.println("Don’t give up!");
					break;
					case 4:
					System.out.println("No. Keep trying.");
					break;
				}
				wrong++;
			}
			else
			{
				switch(z)
				{
					case 1:
					System.out.println("Very good!");
					break;

					case 2:
					System.out.println("Excellent!");
					break;

					case 3:
					System.out.println("Nice work!");
					break;

					case 4:
					System.out.println("Keep up the good work!");
					break;
				}
				right++;
			}
		}while(ans != input);
	}

	public static void multiplication()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		double x = rand.nextInt(9)+1;
		double y = rand.nextInt(9)+1;
		double z = rand.nextInt(4)+1;
		double ans, input;

		do
		{
			System.out.println("What is " + x + " times " + y + " ? ");
			ans = x * y;
			input = scan.nextInt();
			if(ans != input)
			{
				switch(z)
				{
					case 1:
					System.out.println("No. Please try again.");
					break;
					case 2:
					System.out.println("Wrong. Try once more.");
					break;
					case 3:
					System.out.println("Don’t give up!");
					break;
					case 4:
					System.out.println("No. Keep trying.");
					break;
				}
				wrong++;
			}
			else
			{
				switch(z)
				{
					case 1:
					System.out.println("Very good!");
					break;
					case 2:
					System.out.println("Excellent!");
					break;
					case 3:
					System.out.println("Nice work!");
					break;
					case 4:
					System.out.println("Keep up the good work!");
					break;
				}
				right++;
			}
		}while(ans != input);
	}
		
	public static void divide()
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		double x = rand.nextInt(9)+1;
		double y = rand.nextInt(9)+1;
		double z = rand.nextInt(4)+1;
		double ans, input;

		do
		{
			System.out.println("What is " + x + " divided by " + y + " ? ");
			ans = (double) x / y;
			input = scan.nextDouble();
			if(ans != input)
			{
				switch(z)
				{
					case 1:
					System.out.println("No. Please try again.");
					break;
					case 2:
					System.out.println("Wrong. Try once more.");
					break;
					case 3:
					System.out.println("Don’t give up!");
					break;
					case 4:
					System.out.println("No. Keep trying.");
					break;
				}
				wrong++;
			}
			else
			{
				switch(z)
				{
					case 1:
					System.out.println("Very good!");
					break;
					case 2:
					System.out.println("Excellent!");
					break;
					case 3:
					System.out.println("Nice work!");
					break;
					case 4:
					System.out.println("Keep up the good work!");
					break;
				}
				right++;
			}
		}while(ans != input);
	}

	public static double Menu()
	{
		System.out.println("Type of Arithmetic Problems:");
		System.out.println("1: Addition Problems Only");
		System.out.println("2: Subtraction Problems Only");
		System.out.println("3: Multiplication Problems Only");
		System.out.println("4: Division Problems Only");
		System.out.println("5: Random Mixture of Problems");
		System.out.println("Choose a problem type: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static double Difficulty()
	{
		System.out.println("Difficulty Level:");
		System.out.println("Level 1");
		System.out.println("Level 2");
		System.out.println("Level 3");
		System.out.println("Level 4");
		System.out.println("Choose One: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
}