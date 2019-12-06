package com.company.kegiatan2;

public class Driver2 {
    public static void main(String[] args) {
        String kalimat1="HATIKU senang sekali";
        String kalimat2="Pukulan yang sangat keras";
        String kalimat3="kalau berjalan hati - hati";

        String kataKunci="hati";

        String pola = "^.*(?i)"+kataKunci+".*$";
        System.out.println(kalimat1.matches(pola));
        System.out.println(kalimat2.matches(pola));
        System.out.println(kalimat3.matches(pola));
    }
}
