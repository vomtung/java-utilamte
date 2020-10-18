package com.vomtung.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringRepeatMax {

	public static void main(String[] args) {
		String input = "abcabccde";
		String resultString = null;
		int resultcount = 0;
		for (int i = 0 ; i <= input.length()/2; i ++)
		{
			for (int lenght = 2; lenght <= input.length()/2; lenght++) 
			{
				//System.out.println(i + "," + lenght + "," + input);
				String subString = input.substring(i, i +lenght);
				int count = countMatch(input, subString);
				System.out.println(subString + "," + count);
				if (count > resultcount)
				{
					resultcount = count;
					resultString = subString;
				}
			}
		}
		System.out.println("final result: " + resultString + " ,count: " + resultcount);
	}

	static int countMatch(String string, String subString)
	{
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while (matcher.find())
            count++;

        return count;
	}
}
