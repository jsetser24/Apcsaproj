/**
 * @(#)APCSAProj.java
 *
 * APCSAProj application
 *
 * @author
 * @version 1.00 2023/9/14
 */

import java.util.Scanner;

public class APCSAProj {

    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
		System.out.println("What currnecy would you like to convert from:\nA) USD\nB) GBP\nC) JPY\nD) EUR");
		char selection1 = keyboard.next().charAt(0);
		System.out.println("What currnecy would you like to convert to:\nA) USD\nB) GBP\nC) JPY\nD) EUR");
		char selection2 = keyboard.next().charAt(0);
    	System.out.println(CurrencyConversions.toUSD("JPY", 80));
    	System.out.println(selection1.getType());
    }
}
