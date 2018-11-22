import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		System.out.println("Please enter your tweet");
		Scanner tweet = new Scanner(System.in);
		String t1 = tweet.nextLine();
		int numAttributino = 0;
		int hashtag = 0;
		int http = 0;

		if (t1.length() <= 140) {
			System.out.println("Length Correct!");

			for (int i = 0; i < t1.length(); i++) {
				if (t1.substring(i, (i + 1)).indexOf('@') != -1 && !t1.substring((i + 1), (i + 2)).equals(" ")) {
					numAttributino = numAttributino + 1;
				}
				if (t1.substring(i, (i + 1)).indexOf('#') != -1 && !t1.substring((i + 1), (i + 2)).equals(" ")) {
					hashtag = hashtag + 1;
				}
				if (t1.substring(i,(i+1)).indexOf("h")!=-1  || t1.substring(i,(i+1)).indexOf("H")!=-1 ) {
					if (t1.startsWith("http://",i)||t1.startsWith("HTTP://",i)) {
						http = http + 1;
					}
				}
			}
			System.out.println("number of Attribution: " + numAttributino +
					"\nnumber of hashtag: " + hashtag +
					"\nnumber of links: " + http);
		}
    	else{
				System.out.println("The number of characters over 140");
			}

	}
}
