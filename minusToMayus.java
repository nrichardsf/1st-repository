package com.minustomayus;
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;


public class Main{
    public static void copyToClipboard (String output){
        StringSelection selection = new StringSelection(output);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Text input: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        String output = input.toUpperCase();
        System.out.println("Your text in uppercase is: " + output);
        copyToClipboard (output);
        System.out.println("Your text has been successfully copied \nto the Clipboard!");
        sc.close();
    }

}
