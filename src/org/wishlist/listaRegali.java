package org.wishlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class listaRegali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.print("Vuoi inserire un regalo? (y/n): ");
            String choice = scan.nextLine();
            switch (choice.toLowerCase()) {
                case "y":
                    System.out.print("Inserisci il nome del regalo: ");
                    String regalo = scan.nextLine();
                    wishList.add(regalo);
                    System.out.println("Lunghezza della lista: " + wishList.size());
                    break;
                case "n":
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
        if (wishList.isEmpty()) {
            System.out.println("La tua lista dei desideri è vuota.");
        } else {
            Collections.sort(wishList);
            System.out.println("Hai aggiunto " + wishList.size() + " regali alla tua lista:");
            Iterator<String> iterator = wishList.iterator();
            while (iterator.hasNext()) {
                String current = iterator.next();
                System.out.println(current);
            }
        }

        scan.close();
    }
}