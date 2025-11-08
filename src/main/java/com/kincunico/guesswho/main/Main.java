package com.kincunico.guesswho.main;

import com.kincunico.guesswho.api.GetChar;
import com.kincunico.guesswho.chars.Character;

public class Main {

    public static void main(String[] args) {
        Character char1 = new Character("Luffy", "00001");
        char1.setAffiliation("Yonkou");
        char1.setCategory("pirate");

        String imu = "https://onepiece.fandom.com/api.php?action=query&titles=Imu&prop=revisions&rvprop=content&format=json&formatversion=2";

        GetChar getChar = new GetChar();

        getChar.tryFetch(imu);
    }
}