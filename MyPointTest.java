package main.fr.ut2j.m1ice.ootesting;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

public class MyPointTest {

	private MyPoint pointUnderTest;
	
	@Rule
    public ExpectedException thrown= ExpectedException.none();

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
	
	@Test
	public final void testSetPoint() {
		Random bob = Mockito.mock(Random.class);
		Mockito.when(bob.nextInt()).thenReturn(42);
		
		pointUnderTest.setPoint(bob, bob);
		assertEquals(42, pointUnderTest.getX(),0.001);
	}

	@Ignore
	@Test
	public final void testHorizontalSymmetryFail(){
		MyPoint nullpoint = null;
		thrown.expect(IllegalArgumentException.class);
		pointUnderTest.horizontalSymmetry(nullpoint);
	}

	@Test
	public final void testHorizontalSymmetry() {
		double myVarX = 1;
		double myVarY = 1.5;
		MyPoint symPoint = new MyPoint(myVarX, myVarY);
		MyPoint newPoint = pointUnderTest.horizontalSymmetry(symPoint);
		assertEquals(newPoint.getX(),2d * myVarX - pointUnderTest.getX(),0.001);
		assertEquals(newPoint.getY(),pointUnderTest.getY(),0.001);
	}

	@Test
	public final void testComputeAngle() {
		double myVarX = 3;
		double myVarY = 6;
		MyPoint anglPoint = new MyPoint(myVarX, myVarY);
		assertEquals(pointUnderTest.computeAngle(anglPoint),1.063,0.001);
	}


	@Ignore
	@Test
	public final void testComputeAngleFail(){
		MyPoint nullpoint = null;
		thrown.expect(IllegalArgumentException.class);
		pointUnderTest.computeAngle(nullpoint);
	}
	
	@Test
	public final void testRotatePoint() {
		double myVarX = 1;
		double myVarY = 1.5;
		MyPoint anglPoint = new MyPoint(myVarX, myVarY);
		MyPoint newPoint = pointUnderTest.rotatePoint(anglPoint,2.0);
		assertEquals(newPoint.getX(),0.753,0.001);
		assertEquals(newPoint.getY(),0.337,0.001);
	}

	@Ignore
	@Test
	public final void testCentralSymmetryFail(){
		MyPoint nullpoint = null;
		thrown.expect(IllegalArgumentException.class);
		pointUnderTest.centralSymmetry(nullpoint);
	}
	
	@Test
	public final void testCentralSymmetry() {
		double myVarX = 1;
		double myVarY = 1.5;
		MyPoint anglPoint = new MyPoint(myVarX, myVarY);
		MyPoint newPoint = pointUnderTest.centralSymmetry(anglPoint);
		assertEquals(newPoint.getX(),0.5,0.001);
		assertEquals(newPoint.getY(),1.5,0.001);
	}

	@Test
	public final void testGetMiddlePoint() {
		double myVarX = 1.5;
		double myVarY = 1.5;
		MyPoint myPoint = new MyPoint(myVarX, myVarY);
		MyPoint middlePoint = pointUnderTest.getMiddlePoint(myPoint);
		assertEquals(middlePoint.getX(),(myVarX + pointUnderTest.getX())/2,0.001);
		assertEquals(middlePoint.getY(),(myVarY + pointUnderTest.getY())/2,0.001);
	}

	@Ignore
	@Test
	public final void testTranslateDoubleDouble() {
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