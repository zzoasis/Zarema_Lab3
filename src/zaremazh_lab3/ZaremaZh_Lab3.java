package zaremazh_lab3;

import java.util.Scanner;

public class ZaremaZh_Lab3 {

    public static void main(String[] args) {
       Band band = new Band("The Beatles");
        
        band.addMember("John Lennon", "Violin", false);
        band.addMember("Paul McCartney", "Guitar", true);
        band.addMember("Josh Harrison", "BassGuitar", true);
        band.addMember("Ringo Starr", "Drums", true);
       
        
        System.out.println(band);
        
        band.setCan("Paul McCartney","Drums",false);
        System.out.println(band);

    
    }
    
}
