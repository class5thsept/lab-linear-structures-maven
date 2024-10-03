package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   * @throws Exception 
   */
  public static boolean checkMatching(String str) throws Exception {
    Stack<Character> parens = new LinkedStack<Character>();
    char [] charArray = str.toCharArray();
    for(int i = 0; i < str.length(); i++){
      if(charArray[i] == ')' || charArray[i] == ']' && parens.isEmpty()){
        return false;
      }
      if(charArray[i] == '(' ){
        parens.push(charArray[i]);
      }
      if(charArray[i] == '['){
        parens.push(charArray[i]);
      }
      if(charArray[i] == ')'&& parens.peek() == '(' ){
      try {
        parens.pop();
      } catch (Exception e){
        return false;
      }
    
      }
      if(charArray[i] == ']'&& parens.peek()== '[' ){
        try {
          parens.pop();
        } catch (Exception e){
          return false;
        }
      }
      
    }
    if(parens.isEmpty()){
      return true;
    }
    return false;
  } // checkMatching
} // class StringUtils    

