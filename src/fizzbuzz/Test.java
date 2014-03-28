package fizzbuzz;

import static org.junit.Assert.*;
import junit.framework.*;

public class Test extends TestCase
{
	public void testVariable() throws Exception
	{
		int i = 0;
		int j = -1;
		int fizz = 0;
		int bizz = 0;
		int fizzbizz = 0;
		
		if (i != 0)
			fail("La variable i n'est pas égale à 0 !");
		
		if (j != -1)
			fail("La variable j n'est pas égale à -1 !");
		
		if (fizz != 0)
			fail("La variable fizz n'est pas égale à 0 !");
		
		if (bizz != 0)
			fail("La variable bizz n'est pas égale à 0 !");
		
		if (fizzbizz != 0)
			fail("La variable fizzbizz n'est pas égale à 0 !");
		
		for (i = 0; i <= 25; i++)
		{
			if (j + 1 != i)
				fail("j + 1 == i !");
			j++;
			if (i % 3 == 0 && i % 5 == 0)
				fizzbizz++;
			else if (i % 3 == 0 && i % 5 != 0)
				fizz++;
			else if (i % 5 == 0 && i % 3 != 0)
				bizz++;
			else
				System.out.println(i);
		}
		
		if (i != 26)
			fail("i != 26 !");
		
		if (j != 25)
			fail("j != 25 !");

		if (fizz != 7)
			fail("j != 25 !");
		
		if (bizz != 4)
			fail("j != 25 !");
		
		if (fizzbizz != 2)
			fail("j != 25 !");
	}
}
