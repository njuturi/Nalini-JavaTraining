package com.github.njuturi.programs;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberAnagramsTest {
	
	NumberAnagrams obj;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj = new NumberAnagrams();
		List<String> actual = obj.generateAnagrams("", "12");
		List<String> expected = Arrays.asList("12","21");
		boolean value = actual.retainAll(expected);
		assertEquals(true, value);
	}
	
	@Test
	public void testAnagrams1() {
		obj = new NumberAnagrams();
		List<String> actual = obj.generateAnagrams("", "123");
		List<String> expected = Arrays.asList("123","132","213","231","312","321");
		boolean value = actual.retainAll(expected);
		assertEquals(true, value);
	}
	
	@Test
	public void testAnagramsForBig() {
		obj = new NumberAnagrams();
		List<String> actual = Arrays.asList("123","132","213","231","312","321");
		List<String> sortedList = obj.biggestAndSmallestOfAnagram(actual);
		assertEquals("321",obj.bigger(sortedList));
	}
	
	@Test
	public void testAnagramsForSmall() {
		obj = new NumberAnagrams();
		List<String> actual = Arrays.asList("123","132","213","231","312","321");
		List<String> sortedList = obj.biggestAndSmallestOfAnagram(actual);
		assertEquals("123",obj.small(sortedList));
	}

}
