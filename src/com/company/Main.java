package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kalimat,kata, replace;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan kalimat");
        kalimat=input.nextLine();

        System.out.println("masukkan kata yang ingin di ganti");
        kata=input.nextLine();

        System.out.println("masukkan kata penggantinya");
        replace=input.nextLine();

        String pola = "\\b"+kata+"\\b";
        String hasil = kalimat.replaceAll(pola,replace);

        System.out.println(hasil);
    }
}
