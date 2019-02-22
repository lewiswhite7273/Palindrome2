/*
 * Lewis White
 * February 20, 2019
 * This program's purpose will be to check if a given sentence is a palindrome
 */

package palindrome2;

import javax.swing.JOptionPane;

/**
 *
 * @author lewhi7273
 */
public class Palindrome2 {

    /**
     * This method will check if the given sentence is a palindrome
     */
    public static void main(String[] palindrome) {
        String word,word2, backwardsWord, palindromes = "";
        int pos, spacepos, a = 0;
        

        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a word:");
                word += " ";
        //while the sentence has words in it
        while(word.length()>0){
             //find the first word and delete it from the sentence
            spacepos = word.indexOf(" ");
            word2 = word.substring(0,spacepos);
            word = word.substring(spacepos + 1, word.length());
        
             //Reverse the word
        backwardsWord = "";
        for (pos = word2.length() - 1; pos >= 0; pos--) {
            backwardsWord += word2.charAt(pos);
        
        }
        //Compare the words
        if (word2.equalsIgnoreCase(backwardsWord)) {
            a++;
            palindromes += word2 + ", ";
       
            }
        }
        JOptionPane.showMessageDialog(null, "There are " + a +" palindromes in this sentence");
        if(a>0){
            JOptionPane.showMessageDialog(null,"The Palindromes are: \n"
                    + palindromes.substring(0,palindromes.length() - 2));
        }
        
      
       
                       }
              
           }
       
    
    

