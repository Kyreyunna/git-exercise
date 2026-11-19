package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome, "+ name +"!"+"\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Goodbye " + name + "!");
    }
}
//You can explain, in one sentence, why the greeting disappeared in Step 5
//It disappeared bc it only exists in its branch. And I was in main, not the branch.
//You can explain, in one or two sentences, how the fix went live without the unfinished goodbye feature
//the fix of changing the enter prompt went live without also making the goodbye feature go live because
// the prompt fix was made on the original branch and the goodbye was made in a branch that splits from the original branch and was added last in a merge when it was ready.