public class intExtension {
	public intExtension(){
		
	}
	 
	public static String intToHex(int n){
		int a = Integer.valueOf(String.valueOf(n), 16);
		String r = a+"";
		return r;
	}
}