// 6/9/2020. Found out String.replace() exists ... kill me.
package com.OwO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	wordArray.sentenceInitial = input.nextLine();
	wordArray.sentenceLenght = wordArray.sentenceInitial.length();
	disassembleSentence();
	OwOfy();
	assembleSentence();
    }

    public static void disassembleSentence(){
        wordArray.sentenceDisassembled =  wordArray.sentenceInitial.split("");
    }

    public static void OwOfy (){
        for (int i = 0; i < wordArray.sentenceLenght; i++) {
            String letter = wordArray.sentenceDisassembled[i];
            if (letter.equals("l") || letter.equals("r")) {
                wordArray.sentenceDisassembled[i] = "w";
            } else if (letter.equals("L") || letter.equals("R")) {
                wordArray.sentenceDisassembled[i] = "W";
            }
        }
    }

    public static void assembleSentence(){
        for (int i=0; i<wordArray.sentenceLenght; i++){
            System.out.print(wordArray.sentenceDisassembled[i]);
        }
    }
}
class wordArray {
    public static int sentenceLenght;
    public static String sentenceInitial;
    public static String[] sentenceDisassembled = new String[wordArray.sentenceLenght];
}
