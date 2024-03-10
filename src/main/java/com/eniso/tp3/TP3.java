/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp3;

/**
 *
 * @author rouas
 */
import java.util.ArrayList;
import java.io.File ;
import java.io.IOException;
import java.util.Scanner ; 
import java.io.BufferedReader; 
import java.io.Reader; 
import java.io.FileNotFoundException;
public class TP3 {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("file.log");
       
        int lineIndexToReverse=1;
        fileHandler.reverseString(lineIndexToReverse);
         
        int lineIndexToRemoveDuplicates=2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);
       
        String pattern ="epoch";
        ArrayList<String> linesWithPattern = fileHandler.findLinesWithPattern(pattern);
       
        String str1="hello";
        String str2="Hello";
        System.out.println("comparaison avec eqauls: "+fileHandler.compareString1(str1, str2));
       
        String str3="hello";
        String str4="HELLO";
        System.out.println("copmaraison avec equalsIgnoreCase : "+fileHandler.compareString3(str3,str4));
       
        String str5="hello";
        String str6="hello";
        System.out.println("copmaraison avec == : "+fileHandler.compareString2(str5,str6));
        System.out.println("copmaraison avec == : "+fileHandler.compareString2(new String("hello"),"hello"));
        System.out.println("copmaraison avec == : "+fileHandler.compareString2(new String("hello"),new String("hello")));
        System.out.println("ligne contenant le motif '"+pattern+"' : "+linesWithPattern.get(0) );
        
        
        
        String Key = "secret" ;
        String plaintext = "Hello , world" ;
        XORCipher xorCipher = new XORCipher(Key) ;
        String encryptedText = xorCipher.encrypt(plaintext) ;
        String decyptedText = xorCipher.decrypt(encryptedText);
        System.out.println("Texte chiffré:" + encryptedText);
        System.out.println("Texte déchiffré:" +decyptedText);
    }
    
}
