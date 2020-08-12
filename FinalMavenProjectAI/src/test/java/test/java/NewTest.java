package test.java;

import org.testng.annotations.Test;

public class NewTest {
 
	@Test(priority=1, invocationCount=2)
  public void A_Test() {
	  System.out.println("This is method A");
	 
  }
	
	@Test
	  public void B_Test() {
		  System.out.println("This is method B");
		 
	  }
	
	@Test
	  public void C_Test() {
		  System.out.println("This is method C");
		 
	  }
	
	@Test(priority=1)
	  public void D_Test() {
		  System.out.println("This is method D");
		 
	  }
	@Test(priority=2)
	  public void E_Test() {
		  System.out.println("This is method E");
		 
	  }
}
