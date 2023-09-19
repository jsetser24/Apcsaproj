/**
 * @(#)CurrencyConversions.java
 *
 *
 * @author
 * @version 1.00 2023/9/15
 */

/*
 converter will support 4 currency types
 USD
 EUR
 JPY
 GBP
 */

public class CurrencyConversions {

    public static double toUSD(String currencyType, double value) {
    	double conv = 0;
    	switch (currencyType) {
    		case "EUR":
    			conv = value * 1.07;
    			return conv;

    		case "JPY":
    			conv = value * 0.0068;
    			return conv;

    		case "GBP":
    			conv = value * 1.24;
    			return conv;
    	}
    	return conv;
    }

	public static double toEUR(String currencyType, double value) {
    	double conv = 0;
    	switch (currencyType) {
    		case "USD":
    			conv = value * 0.94;
    			return conv;

    		case "JPY":
    			conv = value * 0.0063;
    			return conv;

    		case "GBP":
    			conv = value * 1.16;
    			return conv;
    	}
    	return conv;
    }

    public static double toJPY(String currencyType, double value) {
    	double conv = 0;
    	switch (currencyType) {
    		case "USD":
    			conv = value * 147.67;
    			return conv;

    		case "EUR":
    			conv = value * 157.85;
    			return conv;

    		case "GBP":
    			conv = value * 183.05;
    			return conv;
    	}
    	return conv;
    }

     public static double toGBP(String currencyType, double value) {
    	double conv = 0;
    	switch (currencyType) {
    		case "USD":
    			conv = value * 0.81;
    			return conv;

    		case "EUR":
    			conv = value * 0.86;
    			return conv;

    		case "JPY":
    			conv = value * 0.0055;
    			return conv;
    	}
    	return conv;
    }

}