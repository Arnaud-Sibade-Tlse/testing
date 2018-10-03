package main.fr.ut2j.m1ice.ootesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyPointTest {

	@Test
	public final void testMyPoint() {
		MyPoint contructeurUnderTest = new MyPoint();
		assertTrue(contructeurUnderTest.getX() == 0d);
		assertTrue(contructeurUnderTest.getY() == 0d);
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
	public final void testMyPointMyPoint() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetX() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetY() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetX() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetY() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testScale() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHorizontalSymmetry() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testComputeAngle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testRotatePoint() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCentralSymmetry() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetMiddlePoint() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testTranslateDoubleDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetPoint() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testTranslateITranslation() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testObject() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetClass() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHashCode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testEquals() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testClone() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testNotify() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testNotifyAll() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testWaitLong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testWaitLongInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testWait() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFinalize() {
		fail("Not yet implemented"); // TODO
	}

}
