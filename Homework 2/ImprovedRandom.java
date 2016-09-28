import java.util.Random;

public class ImprovedRandom extends Random {
	public ImprovedRandom(){
		super();
	}
	
	public ImprovedRandom(int x) {
		super(x);
	}
	
	Random rand = new Random();
	
	public int randomInRange(int a, int b){
		int n = rand.nextInt(b) + a;
		return n;
	}
}