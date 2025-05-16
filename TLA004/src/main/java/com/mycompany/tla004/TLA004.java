/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla004;

/**
 *
 * @author Student's Account
 */
import java.util.*;

public class TLA004 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Stack<String> Action = new Stack<>();

        while (true) {
            System.out.print("Enter an action (type 'undo' to undo, 'exit' to stop): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                if (!Action.isEmpty()) {
                    String last = Action.pop();
                    System.out.println("You undid \"" + last + "\"");
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else {
                Action.push(input);
                System.out.println("You " + input);
            }
        }
    }
}