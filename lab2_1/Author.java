public class Author{
    private String name;
    private String surename;
    
    Author(String name, String surename){
        this.name = name;
        this.surename = surename;
    }
    
    public String toString(){
        return name + " " + surename;
    }
}