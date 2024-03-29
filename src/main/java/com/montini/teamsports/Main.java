package com.montini.teamsports;

import java.sql.Date;

public class Main {
    static int numPlayers = 0;
    static int numFreeAgents = 0;
    static final boolean SINGLES = true;
    static final boolean DOUBLES = false;

    public static void main(String[] args) {
        PlayEvent pe1 = new PlayEvent(
                Date.valueOf("2019-07-13"),
                new Location("SEB arena", "Ąžuolyno g. 7, Vilnius", 2),
                DOUBLES);

        pe1.addPlayer(new Player("Mantas"));
        pe1.addPlayer(new Player("Rokas"));
        pe1.addPlayer(new Player("Šaras"));
        pe1.addPlayer(new Player("Rasa"));

        pe1.addPlayer(new Player("Sekmas"));
        pe1.addPlayer(new Player("Tadas"));
        pe1.addPlayer(new Player("Rolis"));
        pe1.addPlayer(new Player("Giedrė"));
        pe1.addPlayer(new Player("Aleksandra"));

        System.out.println(numFreeAgents);
    }

}
