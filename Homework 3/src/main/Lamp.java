package main;
import tableLamp.*;

public class Lamp {
	
	public static void main(String[] args) {
		
		TableLamp tl = new TableLamp();
		tl.switchOn();
		System.out.println("");
		tl.switchOff();
		
		System.out.println("");
		
		System.out.println("Part 4: Push Button");
		
		tl.pushButton();
		tl.pushButton();
		tl.pushButton();
	}
}
