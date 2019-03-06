package Locations;

import interfaces.Classifiable;

public class Restaurant extends Node implements Classifiable {

    String rank = new String();

    public Restaurant(String name){
        super.setName(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setRank(String rank){
        this.rank=rank;
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getRank(){
        return this.rank;
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }
}
