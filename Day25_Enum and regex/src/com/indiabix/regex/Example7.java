//to find a pattern in the exp
package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) {
Pattern p=Pattern.compile("programming");

Matcher m=p.matcher("Java programming");
while(m.find()) {
	System.out.println("Pattern found from:" +m.start()+" to "+(m.end()-1));
}
	}

}
