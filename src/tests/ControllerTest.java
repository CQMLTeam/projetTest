/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Controller;
import testrail.Programm;

/**
 * @author DIENG
 *
 */
public class ControllerTest {

	/**
	 * Test method for {@link application.Controller#resolution(int, int, int)}.
	 */
	
	Controller controller = new Controller();
	/**
	 * Cas ou delta > 0
	 */
	@Test 
	public void testResolution_delta_pos() {
		System.out.println("@Test resolution :  tableauTest = TableauResult");
		double[] tableauResul = {-2.0, -1.0};
		 double[] tableauTest =  controller.resolution(1, 3, 2);
		 boolean result;
		int x1Res= (int)tableauResul[0];
		int x2Res= (int)tableauResul[1];
		int x1Test= (int)tableauTest[0];
		int x2Test= (int)tableauTest[1];
		 assertEquals(x1Res,x1Test);
		assertEquals(x2Res,x2Test);
		  	
	}
		/**
		 * Cas ou delta = 0
		 */
	@Test
	public void testResolution_delta_equal_0()
	{
		double[] tableauResul = {-1.0, -1.0};
		//tableauResul[0] = -1; tableauResul[1] = -1;
		double[] tableauTest = controller.resolution(2,4,2);
		int x1Res= (int)tableauResul[0];
		int x2Res= (int)tableauResul[1];
		int x1Test= (int)tableauTest[0];
		int x2Test= (int)tableauTest[1];
		assertEquals(x1Res,x1Test);
		assertEquals(x2Res,x2Test);
	}
		/**
		 * Cas ou delta < 0
		 */
	@Test
	public void testResolution_delta_neg(){
		double[] tableauResul = null;
		double[] tableauTest = controller.resolution(2, 1, 2);
		assertEquals(tableauResul,tableauTest);
	}
		
		
		
	
}
