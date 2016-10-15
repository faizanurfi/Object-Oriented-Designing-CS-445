package test;
import tableLamp.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class LampTest1 {
	TableLamp tl = new TableLamp();
	
	@Test
	public void test_new_default_lamp_is_off(){
		assertFalse(tl.isOn());
	}
	
	@Test
	public void test_new_lamp_switchOnMethod(){
		tl.switchOff();
		assertTrue(tl.switchOn());
	}
	
	@Test
	public void test_new_lamp_switchOffMethod(){
		tl.switchOn();
		assertFalse(tl.switchOff());
	}
	
	@Test
	public void test_new_lamp_pushButtonMethod(){
		assertTrue(tl.pushButton());
		assertFalse(tl.pushButton());
		assertTrue(tl.pushButton());
		assertFalse(tl.pushButton());
	}
}