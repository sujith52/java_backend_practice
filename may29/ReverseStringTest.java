package com.sujith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString rs = new ReverseString();
	@Test
	void oneScenTest() {
		
		assertEquals("htijuS", rs.reverseString("Sujith"));
	}
	@Test
	void onesencs() {
		
		assertEquals("taerg saw sihTl", rs.reverseString("This was great"));
	}

}
