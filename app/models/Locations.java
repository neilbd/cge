package models;

import play.data.validation.Constraints.*;
import javax.persistence.*;
import com.avaje.ebean.Model;

public class Locations extends Model{

    @Required
    private String name;
    private int id;
    private int longitude;
    private int latitude;

    public Locations(int id, String name, int longitude, int latitude){
        this.name = name;
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getLatitude(){
        return this.latitude;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public int getId() { return this.id; }


}