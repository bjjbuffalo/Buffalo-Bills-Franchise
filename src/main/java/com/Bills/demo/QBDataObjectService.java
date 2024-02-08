package com.Bills.demo;


import jakarta.persistence.*;

//Buffalo Bills QB table

@Entity
@Table(name = "billsqb")
public class QBDataObjectService {

    //table billsqb managed in mysql workbench with Year as Primary Key



    // ***Will need to fix variables so they reflect the correct type***  Stored as String for temporary workaround due to mysql workbench version issue

    //mapping to attributes and the corresponding mySQL columns
    @Id
    @Column(name = "Year")
    private String retrievingYear;

    @Column(name = "Player")
    private String player;

    @Column(name = "Att")
    private String attempts;

    @Column(name = "Cmp")
    private String completions;

    @Column(name = "Pct")
    private String completionPercentage;

    @Column(name = "Yds")
    private String yards;

    @Column(name = "Interceptions")
    private String interceptions;

    @Column(name = "TD")
    private String touchdowns;

    @Column(name = "Rating")
    private String rating;

    public QBDataObjectService() {
    }

    //constructor for initializing attributes
    public QBDataObjectService(String year, String player, String attempts, String completions, String completionPercentage,
                               String yards, String interceptions, String touchdowns, String rating) {
        this.retrievingYear = year;
        this.player = player;
        this.attempts = attempts;
        this.completions = completions;
        this.completionPercentage = completionPercentage;
        this.yards = yards;
        this.interceptions = interceptions;
        this.touchdowns = touchdowns;
        this.rating = rating;
    }


//getters and setters
    public String getYear() {
        return retrievingYear;
    }

    public void setYear(String year) {
        this.retrievingYear = year;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getAttempts() {
        return attempts;
    }

    public void setAttempts(String attempts) {
        this.attempts = attempts;
    }

    public String getCompletions() {
        return completions;
    }

    public void setCompletions(String completions) {
        this.completions = completions;
    }

    public String getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(String completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public String getYards() {
        return yards;
    }

    public void setYards(String yards) {
        this.yards = yards;
    }

    public String getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(String interceptions) {
        this.interceptions = interceptions;
    }

    public String getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(String touchdowns) {
        this.touchdowns = touchdowns;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
