package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class calcy5 {

	
	@Test
	public void sum()
	{
		int a =10;
		int b=20;
		int sum = a+b;
		System.out.println("Sum=" + sum );
		Assert.assertEquals(sum, 30);
	}
	
	@Test
	public void sub()
	{
		int a =10;
		int b=20;
		int sub = b-a;
		System.out.println("sub=" + sub );
		Assert.assertEquals(sub, 10);
	}
	@Test
	public void mult()
	{
		int a =10;
		int b=20;
		int mult = a*b;
		System.out.println("mult=" + mult );
		Assert.assertEquals(mult, 200);
	}
	@Test
	public void div()
	{
		int a =10;
		int b=20;
		int div = a/b;
		System.out.println("div=" + div );
		Assert.assertEquals(div, 0);
	}
	
	
	@Test
	public void editfromGIT()
	{
		
		System.out.println("editfromGIT");
		
	}
	
}
