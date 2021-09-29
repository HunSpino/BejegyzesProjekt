package com.petrik.PontOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Bejegyzes> bejegyzesek=new ArrayList<>();

    public static void main(String[] args) {
        bejegyzesek.add(new Bejegyzes("MÁV","A 18:20-kor induló S60-as személyvonat a mai napon nem közlekedik"));
        bejegyzesek.add(new Bejegyzes("Barack Obama","After the elections,I will go down as a president"));

        System.out.println(bejegyzesek.toString());
    }
}
