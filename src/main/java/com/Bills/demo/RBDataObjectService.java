package com.Bills.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;




//Buffalo Bills RB table

    @Entity
    @Table(name = "billsrb")
    public class RBDataObjectService {

        //table billsrb managed in mysql workbench with Year as Primary Key



        // ***Will need to fix variables so they reflect the correct type***  Stored as String for temporary workaround due to mysql workbench version issue
        @Id
        @Column(name = "Year")
        private Integer retrievingYear;

        @Column(name = "Player")
        private String player;

        @Column(name = "Rushing_Yards_Per_Attempt")
        private String rypa;

        @Column(name = "Yards_Per_Game")
        private String ypg;

        @Column(name = "Fmb")
        private Integer fumbles;

        @Column(name = "Yds")
        private Integer yards;

        @Column(name = "Att")
        private Integer att;

        @Column(name = "TD")
        private Integer touchdowns;

        @Column(name = "Lng")
        private Integer longest;

        public RBDataObjectService() {
        }





        public RBDataObjectService(Integer year, String player, String rypa, String ypg, Integer fumbles,
                                   Integer yards, Integer longest, Integer touchdowns, Integer att) {
            this.retrievingYear = year;
            this.player = player;
            this.rypa = rypa;
            this.yards = yards;
            this.ypg = ypg;
            this.fumbles = fumbles;
            this.longest = longest;
            this.touchdowns = touchdowns;
            this.att = att;
        }






        public Integer getRetrievingYear() {
            return retrievingYear;
        }

        public void setRetrievingYear(Integer retrievingYear) {
            this.retrievingYear = retrievingYear;
        }

        public String getPlayer() {
            return player;
        }

        public void setPlayer(String player) {
            this.player = player;
        }

        public String getRypa() {
            return rypa;
        }

        public void setRypa(String rypa) {
            this.rypa = rypa;
        }

        public String getYpg() {
            return ypg;
        }

        public void setYpg(String ypg) {
            this.ypg = ypg;
        }

        public Integer getFumbles() {
            return fumbles;
        }

        public void setFumbles(Integer fumbles) {
            this.fumbles = fumbles;
        }

        public Integer getYards() {
            return yards;
        }

        public void setYards(Integer yards) {
            this.yards = yards;
        }

        public Integer getAtt() {
            return att;
        }

        public void setAtt(Integer att) {
            this.att = att;
        }

        public Integer getTouchdowns() {
            return touchdowns;
        }

        public void setTouchdowns(Integer touchdowns) {
            this.touchdowns = touchdowns;
        }

        public Integer getLongest() {
            return longest;
        }

        public void setLongest(Integer longest) {
            this.longest = longest;
        }





        }



