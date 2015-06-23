/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

/**
 *
 * @author shussain
 */
import java.math.BigInteger;
import java.util.*;

 class Solution {

	public static String getPalindromeIfPresent(String s) {

		if (s == null || s.length() < 2 || s.equals("") ) {
		    return null;
		}
		Map<Character, Integer> mapChars = new HashMap<Character, Integer>();

		char[] chars = s.toCharArray();

		
		for (int i = 0; i < chars.length; i++) {
		    if (mapChars.containsKey(chars[i])) {
		        Integer val = mapChars.get(chars[i]);
		        mapChars.put(chars[i], val+1);
		    } else {        
		        mapChars.put(chars[i], 1);    
		    }
		}

		int oneCharCount = 0;
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    if (entry.getValue() % 2 != 0) {
		        oneCharCount++;
		        
		        if (oneCharCount > 1) {
		            return null;
		        }
		    }
		}

		int sLen = s.length();
		int middle = sLen/2;   
		Character midChar = null;
		StringBuilder s1 = new StringBuilder();

		
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    int charCount = entry.getValue();
		    Character c = entry.getKey();
		    
		    if (charCount % 2 != 0) {
		        midChar = c;
		    }
		    
		        int i = charCount / 2;
		        while (i > 0) {
		           s1.append(c);
		           s1.insert(0, c);
		           i--;
		        }                              
		}

		// if middle Char exists from odd count, place it otherwise ignore
		if (midChar != null) {
			s1.insert(middle, midChar);	
		}

		return s1.toString();
    }
	
    public static void main(String[] args) {
    	String test ;
        int t;
		Scanner sc=new Scanner(System.in);
                t=sc.nextInt();
                sc.nextLine();
                for (int i = 0; i<t; i++) {
            test=sc.nextLine();
		
		if(getPalindromeIfPresent(test)!=null)
		{
		   System.out.println("0" );
		}
		else
		{
                    
                    //int n=t.length();
                   
		System.out.println(palindrome(test).length()-test.length());
		}
        }
		
    }
	public static String palindrome(String str) { 
        StringBuilder result = new StringBuilder(str); 
        if (str != null && str.length() > 0) { 
            int l = str.length() - 1; 
            int s = 0; 
            int e = l; 
            while ( e > s) { 
                if (str.charAt(s) == str.charAt(e)) { 
                    ++s; --e; 
                } else { 
                    s -= (l - e - 1); 
                    e = l; 
                } 
            } 
            StringBuilder start = new StringBuilder(str.substring(0, s - (l - e))); 
            result.append(start.reverse()); 
        } 
        return result.toString(); 
    }
}