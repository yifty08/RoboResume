package com.company;

public class Exp {

    private String company, jobTitle, description;
    private int startDate, endDate;

    public Exp() {

    }

    public Exp(String company, String jobTitle, String description, int startDate, int endDate) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }


    public String toString() {
        return "\nExperience \n" + getJobTitle() + " \n" + getCompany()
                + ", " + getStartDate() + " - " + getEndDate()
                + "- " + getDescription();
    }

}
