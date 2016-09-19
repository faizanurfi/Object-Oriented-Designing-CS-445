import java.util.*;

public class TestCreature {
	
	public static final int thing_count = 5;
	public static final int creature_count = 2; // The number of creatures and things are initialized
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Welcome to TestCreature!");
		System.out.println("Use the READ ME File to understand what this code is about and how to use it.");
		System.out.println("Now you will start entering the data."+"\n");
		
		Vector vc = new Vector();
		Thing tarr [] = new Thing[thing_count];
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		// The vector vc is declared for populating Creature Objects
		// The array tarr is declared for populating Things Objects
		
		while(count < creature_count) {		
			System.out.println("Entering a Creature.");
			System.out.print("What kind of Creature? Ant, Bat, Fly or Tiger: ");
			s = scan.nextLine();
			
			while(!(s.equals("Ant") || s.equals("Bat") || s.equals("Fly") || s.equals("Tiger"))){
				System.out.print("Wrong input. It has to be one of 'Ant', 'Bat', 'Fly' or 'Tiger': ");
				s = scan.nextLine();
			}
			
			if(s.equals("Ant")){
				System.out.print("Enter the name of the "+s+": ");
				s = scan.nextLine();
				Creature c = new Ant(s);
				vc.add(c);
				tarr[count] = c;
			}
			else if(s.equals("Bat")){
				System.out.print("Enter the name of the "+s+": ");
				s = scan.nextLine();
				Creature c = new Bat(s);
				vc.add(c);
				tarr[count] = c;
			}
			else if(s.equals("Fly")){
				System.out.print("Enter the name of the "+s+": ");
				s = scan.nextLine();
				Creature c = new Fly(s);
				vc.add(c);
				tarr[count] = c;
			}
			else if(s.equals("Tiger")){
				System.out.print("Enter the name of the "+s+": ");
				s = scan.nextLine();
				Creature c = new Tiger(s);
				vc.add(c);
				tarr[count] = c;
			}
			System.out.println("");
			count++;
 		}

		// In the above while loop, the user is prompted to enter a data for a creature and it populates the array and vector.
		
		//It is important here to note that all Creatures are Things but not all Things are Creatures. So, all the Creatures will also be part of the Things array. This is why the total number of things/creatures taken is the same as the total number of things.
		
		while(count < thing_count){
			System.out.println("\n"+"Entering a Thing.");
			
			System.out.print("Enter the name of the Thing: ");
			s = scan.nextLine();
			Thing t = new Thing(s);
			tarr[count] = t;
			count++;
		}
		
		System.out.println("\n"+"THINGS:"+"\n");
		for(int i = 0; i<thing_count; i++){
			System.out.println(tarr[i].toString());
		} // This outputs the total things.
		
		System.out.println("");
		System.out.println("CREATURES:"+"\n");
		
		// The for loop below Prompts the user and ask what needs to be done with the Creatures entered previously. The users are given options and the Creatures act 		accordingly.
		
		for(int j=0; j<creature_count; j++){
			String xt = "Yes";			
			Creature cc = (Creature)vc.get(j);
			System.out.println("The current Creature is: "+cc.toString());
			while(xt.equals("Yes") || xt.equals("yes")) {
				System.out.print("What do you want it to do? Eat something (Enter 1), Tell what it has eaten (Enter 2) or Move (Enter 3): ");
				s = scan.nextLine();
				int ss = Integer.parseInt(s);
				while(ss < 1 || ss > 3){
					System.out.print("What do you want it to do? Eat something (Enter 1), Tell what it has eaten (Enter 2) or Move (Enter 3): ");
					s = scan.nextLine();
					ss = Integer.parseInt(s);
				}
				
				if(ss == 1){
					s = scan.nextLine();
					System.out.print("Do you want to eat a thing or a creature? Enter T or C for things or creatures respectively: ");
					s = scan.nextLine();
					if(s.equals("T")){
						System.out.print("What do you want it to Eat? ");
						cc.eat(new Thing(s));
					}
					else if (s.equals("C")) {
						System.out.print("Enter the type of Creature: A for Ant, B for Bat, F for Fly or T for Tiger: ");
						s = scan.nextLine();
						if(s.equals("A")){
							System.out.print("What is the name of the Ant? ");
							s = scan.nextLine();
							cc.eat(new Ant(s));
						}
						else if(s.equals("B")){
							System.out.print("What is the name of the Bat? ");
							s = scan.nextLine();
							cc.eat(new Bat(s));
						}
						else if(s.equals("F")){
							System.out.print("What is the name of the Fly? ");
							s = scan.nextLine();
							cc.eat(new Fly(s));
						}
						else if(s.equals("T")){
							System.out.print("What is the name of the Tiger? ");
							s = scan.nextLine();
							cc.eat(new Bat(s));
						}	
						else {
							System.out.println("Wrong input");
						}					
					}
				}
				else if (ss == 2) {
					cc.whatDidYouEat();
				}
				else if (ss == 3) {
					cc.move();
				}
				System.out.print("\n"+"Do you want to do something else with the Creature "+cc+"? ");
				xt = scan.nextLine();
			}
			System.out.println("");
		}
	}
}