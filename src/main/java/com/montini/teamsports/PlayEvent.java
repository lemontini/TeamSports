package com.montini.teamsports;

import java.util.ArrayList;
import java.util.Date;

public class PlayEvent {
    Date date;
    Location location;
    int numCourts;
    Boolean playSingles = false;
    ArrayList<Court> courts;

    public PlayEvent(Date date, Location location, Boolean playSingles) {
        this.date = date;
        this.courts = new ArrayList<Court>();
        System.out.println("A " + (playSingles ? "singles" : "doubles") + " play event on " + date + " at " + location.name + " was created.");
        this.courts.add(new Court(playSingles ? 2 : 4));
    }

    public void addPlayer(Player player) {
        if (this.courts.get(numCourts).size == this.courts.get(numCourts).maxPlayers) {
            this.courts.add(new Court(playSingles ? 2 : 4));
            numCourts++;
        }
        this.courts.get(numCourts).addPlayer(player);
    }

}
