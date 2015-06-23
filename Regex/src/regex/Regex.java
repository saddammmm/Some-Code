/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shussain
 */
public class Regex {

   
public static void main(String [] args) {
Pattern p = Pattern.compile("ab"); // the expression
Matcher m = p.matcher("abaaaba"); // the source
while(m.find()) {
System.out.print(m.start() + " ");
}
}
}