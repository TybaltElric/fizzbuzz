package fizzbuzz;

public class JeuFizzBuzz
{
	public static void Fizzbuzz()
	{
		for (int i = 0; i <= 25; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " fizzbizz");
			else if (i % 3 == 0 && i % 5 != 0)
				System.out.println(i + " fizz");
			else if (i % 5 == 0 && i % 3 != 0)
				System.out.println(i + " bizz");
			else
				System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		Fizzbuzz();
	}
}
