package com.jadecross.guestbook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PostTest {
	@Test
	void testSetName(){
		Post post = new Post("TESTER","2024-07-24  15:19:18","happy wedding");
		post.setName("DEVOPS");
		assertEquals("DEVOPS", post.getName());
	}
}
