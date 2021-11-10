
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "976842154";
		stringDigitsToInteger(s,0,Integer.parseInt(s.substring(0,1)));
	}
	
	public static void stringDigitsToInteger(String s, int currentPosition, int number) {
		if(currentPosition == s.length()-1) {
			System.out.println("the number is "+ number);
			return;
		}
		number *= 10;
		currentPosition++;
		stringDigitsToInteger(s, currentPosition, number+Integer.parseInt(s.substring(currentPosition,currentPosition+1)));
	}

}
