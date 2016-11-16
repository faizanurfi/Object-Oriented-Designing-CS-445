package test;
import classes.*;


import static org.junit.Assert.*;

import org.junit.Test;
//import org.junit.Before;

public class ThingTest1 {
	Thing th1 = new Thing("Pen");
	Thing th2 = new Thing("sugar");
	Creature a1 = new Ant("Fire Ant");
	Creature b1 = new Bat("Batman");
	Creature f1 = new Fly("Fly1");
	Creature t1 = new Tiger("Bagheera");

	@Test
	public void test_Thing_getName() {
		String s1 = th1.getName();
		String s2 = th2.getName();
		
		assertEquals(s1, new String("Pen"));
		assertEquals(s2, new String("sugar"));
	}	
	
	@Test
	public void test_toString_Thing() {
		String s1 = th1.toString();
		String s2 = th2.toString();
		
		assertEquals(s1, new String("Pen"));
		assertEquals(s2, new String("sugar"));
	}
	
	@Test
	public void test_Ant_Eating() {
		String s1 = a1.whatDidYouEat();
		assertEquals(s1, new String("Fire Ant Ant has had nothing to eat."));
		String s2 = a1.eat(th2);
		assertEquals(s2, new String("Fire Ant is eating a sugar"));
		String s3 = a1.whatDidYouEat();
		assertEquals(s3, new String("Fire Ant Ant has eaten a sugar"));
	}	
	
	@Test
	public void test_Ant_toString() {
		String s1 = a1.toString();
		assertEquals(s1, new String("Fire Ant Ant"));
	}
	
	@Test
	public void test_Ant_Move() {
		String s1 = a1.move();
		assertEquals(s1, new String("Fire Ant Ant is crawling around."));
	}
	
	@Test
	public void test_Tiger_Eating() {
		String s1 = t1.whatDidYouEat();
		assertEquals(s1, new String("Bagheera Tiger has had nothing to eat."));
		String s2 = t1.eat(new Thing("meat"));
		assertEquals(s2, new String("Bagheera is eating a meat"));
		String s3 = t1.whatDidYouEat();
		assertEquals(s3, new String("Bagheera Tiger has eaten a meat"));
	}
	
	@Test
	public void test_Tiger_toString() {
		String s1 = t1.toString();
		assertEquals(s1, new String("Bagheera Tiger"));
	}	
	
	@Test
	public void test_Tiger_Move() {
		String s1 = t1.move();
		assertEquals(s1, new String("Bagheera Tiger has just pounced."));
	}
	
	@Test
	public void test_Bat_Eating() {
		String s1 = b1.whatDidYouEat();
		assertEquals(s1, new String("Batman Bat has had nothing to eat."));
		String s2 = b1.eat(a1);
		assertEquals(s2, new String("Batman is eating a "+a1.getName()));
		String s3 = b1.whatDidYouEat();
		assertEquals(s3, new String("Batman Bat has eaten a "+a1.getName()));
		String s4 = b1.eat(new Thing("joker"));
		assertEquals(s4, new String("Batman Bat won't eat a joker"));
		String s5 = b1.whatDidYouEat();
		assertEquals(s5, new String("Batman Bat has eaten a "+a1.getName()));
	}
	
	@Test
	public void test_Bat_toString() {
		String s1 = b1.toString();
		assertEquals(s1, new String("Batman Bat"));
	}
	
	@Test
	public void test_Bat_Move() {
		String s1 = b1.move();
		assertEquals(s1, new String("Batman Bat is swooping through the class."));
	}
	
	@Test
	public void test_Fly_Eating() {
		String s1 = f1.whatDidYouEat();
		assertEquals(s1, new String("Fly1 Fly has had nothing to eat."));
		String s2 = f1.eat(a1);
		assertEquals(s2, new String("Fly1 is eating a "+a1.getName()));
		String s3 = f1.whatDidYouEat();
		assertEquals(s3, new String("Fly1 Fly has eaten a "+a1.getName()));
		String s4 = f1.eat(new Thing("joker"));
		assertEquals(s4, new String("Fly1 Fly won't eat a joker"));
		String s5 = f1.whatDidYouEat();
		assertEquals(s5, new String("Fly1 Fly has eaten a "+a1.getName()));
	}
	
	@Test
	public void test_Fly_toString() {
		String s1 = f1.toString();
		assertEquals(s1, new String("Fly1 Fly"));
	}
	
	@Test
	public void test_Fly_Move() {
		String s1 = f1.move();
		assertEquals(s1, new String("Fly1 Fly is buzzing around in flight."));
	}
}