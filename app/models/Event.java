package models;

import play.data.validation.Constraints.*;
import javax.ppersistence.*;
import java.util.*;
import com.avaje.ebean.Model;


@Entity
public class Event extends Model{

    @Required
    private int id;
    private String name;
    private Locations location;
    private String room;
    private String date;
    private String time;
    //private Organization org;
    private String desc;
    private int attendence;
    //private ArrayList<Tag> tags;
    private String color;


    public Event(int id, String name, /*Organization org,*/ Locations location, String room, String desc, /*ArrayList<Tag> tags,*/
                 String time, String date, String color){
        this.name = name;
        //this.org = org;
        this.location = location;
        this.room = room;
        this.desc = desc;
        //this.tags = tags;
        this.time = time;
        this.date = date;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getId() { return this.id; }


    /*public Organization getOrg(){
        return this.org;
    }*/

    public Locations getLocation() { return this.location; }

    public void setLocation(Locations location) { this.location = location; }

    public void setRoom(String room) { this.room = room; }

    public String getRoom() { return this.room; }

    public String getDesc() { return this.desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public String getTime() { return this.time; }

    public void setTime(String time) { this.time = time; }

    public String getColor() { return this.color; }

    public void setColor(String color) { this.color = color; }

    //public void setTags(ArrayList<Tag> tags) { this.tags = tags; }

    //public ArrayList<Tag> getTags() { return this.tags; }



}