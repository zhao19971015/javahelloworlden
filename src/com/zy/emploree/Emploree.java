package com.zy.emploree;

public class Emploree {
    private  String name;
    private  int ID;
    private int score;
    private boolean sex;

    public Emploree(String name, int ID, int score, boolean sex) {
        this.name = name;
        this.ID = ID;
        this.score = score;
        this.sex = sex;
    }

    public Emploree() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
