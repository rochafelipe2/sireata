package br.edu.utfpr.dv.sireata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class BaseTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	  @Test
	    public void testCase1() throws Exception {
	        assertEquals("Msg DE", "Msg PARA");

	  	}

}
