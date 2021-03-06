package lv.renate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		String inputString = "abc09c3u84_44";
		String regexStrExp = "[a-z]+";
		
		System.out.println(inputString.charAt(0));
		System.out.println(inputString.charAt(1));
		
		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputString);
		
		
		
		while(matcher.find()){
			System.out.println("find() found substring "+matcher.group());
		}
		
		String replaceSymbols = "lv";
		String outputStr = matcher.replaceFirst(replaceSymbols);
		
		System.out.println(outputStr);

	}

}
