package com.kincunico.guesswho.chars;

public class Character {
    private String name;
    private String id;
    private String category;
    private String affiliation;
    private String crew;



    public Character(String aName, String anId) {
        this.name = aName;
        this.id = anId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public String toString() {
        return ("Name: "+ this.name + "\n" + "Id: " + this.id);
    }
}
