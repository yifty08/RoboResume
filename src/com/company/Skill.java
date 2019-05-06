package com.company;

public class Skill {

    private String skill1, rating1, skill2, rating2, skill3, rating3;

    public Skill(){

    }

    public Skill(String skill1, String rating1, String skill2, String rating2, String skill3, String rating3) {
        this.skill1 = skill1;
        this.rating1 = rating1;
        this.skill2 = skill2;
        this.rating2 = rating2;
        this.skill3 = skill3;
        this.rating3 = rating3;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getRating1() {
        return rating1;
    }

    public void setRating1(String rating1) {
        this.rating1 = rating1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getRating2() {
        return rating2;
    }

    public void setRating2(String rating2) {
        this.rating2 = rating2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getRating3() {
        return rating3;
    }

    public void setRating3(String rating3) {
        this.rating3 = rating3;
    }

    public String toString() {
        return "\nSkills \n" + getSkill1() + ", " + getRating1()
                + " \n" + getSkill2() + ", " + getRating2()
                + " \n " + getSkill3() + ", " + getRating3();
    }
}
