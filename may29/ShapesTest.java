package com.sujith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shape shape = new Shape();
	@Test
	void squaretest() {
		assertEquals(4, shape.squresvals(2));
	}
	@Test
	void squaretest_notequals() {
		assertNotEquals(8, shape.squresvals(2));
	}
	
	@Test
	void circletest() {
		assertEquals(4.14, shape.circlevals(1),"This might because you are dumb ");
	}
	@Test
	void circletest_mains() {
		assertEquals(4.14, shape.circlevals(1),()->"This might because you are dumb ");
	}

}
