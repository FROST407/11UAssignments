/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author Masoa4207
 */
public class A5UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int AmtVowels = 0;
        while (AmtVowels < 1) {


            Scanner input = new Scanner(System.in);
            System.out.println("Please enter text that you would like to be translated into Ubbi Dubbi.");
            String word = input.nextLine();
            String Ex = "EXIT";
            if (word.equals(Ex)) {
                break;
            }
            String translate = "";
            boolean foundVowel = false;

            for (int i = 0; i < word.length(); i++) {

                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundVowel == false) {
                    translate = translate + "ub";

                    translate = translate + word.charAt(i);
                    foundVowel = true;
                } else {
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                            || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundVowel == true) {

                        translate = translate + word.charAt(i);

                    } else {
                        translate = translate + word.charAt(i);
                        foundVowel = false;



                    }

                }
            }
            System.out.println(word + " in Ubbbi Dubbi is " + translate);
        }

    }
}
