import java.util.Scanner;


public class Palindrome {
	
	public static String inverse(String word){
		int length = word.length();
		char[] inverseWord = new char[length];
		for(int i=0;i<length;i++){
			inverseWord[i]=word.charAt(length-i-1);
		}
		return(new String(inverseWord));
	}

	public static void main(String[] args) {
		String word;
		System.out.println("Type your word :");
		Scanner scan = new Scanner(System.in);
		word = scan.nextLine();
		String inverseWord = inverse(word);
		System.out.println("The reverse of '"+word+"' is '"+inverseWord+"'");
		if(word.equals(inverseWord)){
			System.out.println(word+" is palindrome");
		}
		else{
			System.out.println(word+" is not a palindrome.");
		}

	}
}
