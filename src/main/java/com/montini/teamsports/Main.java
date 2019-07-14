package com.montini.teamsports;

import java.sql.Date;

public class Main {
    static int numPlayers = 0;
    static int numCourts = 0;
    static int numFreeAgents = 0;
    static final int MAX_COURTS = 4;
    static final boolean SINGLES = true;
    static final boolean DOUBLES = false;

    public static void main(String[] args) {
        // Player p1 = new Player("Mantas");
        // Player p2 = new Player("Rokas");
        //
        // Court c1 = new Court(4, p1, p2);
        //
        // c1.addPlayer(new Player("Šaras"));
        //
        // c1.addPlayer(new Player("Rasa"));
        // c1.addPlayer(new Player("Sekmas"));
        //
        // // Player p3 = new Player("Sekmas");
        // // System.out.println(p3.inATeam);
        // System.out.println(numFreeAgents);



        PlayEvent pe1 = new PlayEvent(
                Date.valueOf("2019-07-13"),
                new Location("SEB arena", "Ąžuolyno g. 7, Vilnius", 4),
                DOUBLES);
        // System.out.println(pe1.date + ": " + pe1.courts.size());
        pe1.addPlayer(new Player("Mantas"));
        pe1.addPlayer(new Player("Rokas"));
        pe1.addPlayer(new Player("Šaras"));
        pe1.addPlayer(new Player("Rasa"));
        pe1.addPlayer(new Player("Sekmas"));

    }

}
