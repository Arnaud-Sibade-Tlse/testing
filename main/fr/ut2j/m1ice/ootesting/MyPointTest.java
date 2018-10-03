package main.fr.ut2j.m1ice.ootesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MyPointTest {

	private MyPoint pointUnderTest;
	
	@Before
	public void setUp() {
		pointUnderTest = new MyPoint();
		double myVarX = 0.5;
		double myVarY = 1.5;
		pointUnderTest.setX(myVarX);
		pointUnderTest.setY(myVarY);
	}

	@After
	public void tearDown() {
		pointUnderTest = null;
	}
	
	@Test
	public final void testMyPoint() {
		MyPoint contructeur1UnderTest = new MyPoint();
		assertTrue(contructeur1UnderTest.getX() == 0d);
		assertTrue(contructeur1UnderTest.getY() == 0d);
	}

	@Test
	public final void testMyPointDoubleDouble() {
		double myVarX = 0.5;
		double myVarY = 1.5;
		MyPoint contructeur2UnderTest = new MyPoint(myVarX, myVarY);
		assertTrue(contructeur2UnderTest.getX() == myVarX);
		assertTrue(contructeur2UnderTest.getY() == myVarY);	
	}
	
	@Test
	public final void testMyPoint3() {
		double myVarX = 0.5;
		double myVarY = 1.5;
		MyPoint contructeur3UnderTest = new MyPoint(pointUnderTest);
		assertTrue(contructeur3UnderTest.getX() == myVarX);
		assertTrue(contructeur3UnderTest.getY() == myVarY);	
	}

	@Ignore
	@Test
	public final void testMyPointMyPoint() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAccessX() {
		double monX = 1.2;
		this.pointUnderTest.setX(monX);
		assertEquals(monX, pointUnderTest.getX(),0.001);
	}

	@Test
	public final void testAccessY() {
		double monY = 1.2;
		this.pointUnderTest.setY(monY);
		assertEquals(monY, pointUnderTest.getY(),0.001);
	}
	
	@Test
	public final void testAccessXNaN() {
		double monX = pointUnderTest.getX();
		this.pointUnderTest.setX(Double.NaN);
		assertEquals(monX, pointUnderTest.getX(),0.001);
	}

	@Test
	public final void testAccessYNaN() {
		double monY = pointUnderTest.getY();
		this.pointUnderTest.setY(Double.NaN);
		assertEquals(monY, pointUnderTest.getY(),0.001);
	}
	 
	@Test
	public final void testScale() {
		double myVarX = 0.5;
		double myVarY = 1.5;
		MyPoint scalePoint = pointUnderTest.scale(2);
		assertTrue(scalePoint.getX() == myVarX*2);
		assertTrue(scalePoint.getY() == myVarY*2);	
	}
	

	@Ignore
	@Test
	public final void testHorizontalSymmetry() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testComputeAngle() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testRotatePoint() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testCentralSymmetry() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testGetMiddlePoint() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testTranslateDoubleDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testSetPoint() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testTranslateITranslation() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testObject() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testGetClass() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testHashCode() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testEquals() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testClone() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testNotify() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testNotifyAll() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testWaitLong() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testWaitLongInt() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testWait() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testFinalize() {
		fail("Not yet implemented"); // TODO
	}

}
