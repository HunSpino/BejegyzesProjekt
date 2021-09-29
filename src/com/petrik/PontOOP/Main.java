package com.petrik.PontOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Bejegyzes> bejegyzesek=new ArrayList<>();
    static Scanner scnnr=new Scanner(System.in);

    public static void main(String[] args) {
       bejegyzeles();
       bekeregetes();

    }


    public static void bejegyzeles(){
        bejegyzesek.add(new Bejegyzes("MÁV","A 18:20-kor induló S60-as személyvonat a mai napon nem közlekedik"));
        bejegyzesek.add(new Bejegyzes("Barack Obama","After the elections,I will go down as a president"));

    }
    public static void bekeregetes(){
        System.out.println("Írja meg hány bejegyzést szeretne beküldeni!");
        int db= scnnr.nextInt();
        String[] adatok = new String[2];
        for (int i = 0; i < db; i++) {
            System.out.print("\n Név: ");
            adatok[0] = scnnr.next();
            System.out.print("Tartalom: ");
            adatok[1] = scnnr.next();
            bejegyzesek.add(new Bejegyzes(adatok[0], adatok[1]));


        }

    }
}
