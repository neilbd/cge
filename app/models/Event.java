package models;

import com.avaje.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import java.util.*;
import com.avaje.ebean.Model;


@Entity
public class Event extends Model{

    @Required
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private Locations location;
    private String room;
    private String date;
    private String time;
    //private Organization org;
    private String description;
    private int attendence;
    //private ArrayList<Tag> tags;
    private String color;

    public static Finder<Integer, Event> find = new Finder<Integer,Event>(Event.class);

    public Event(/*int id,*/ String name, /*Organization org,*/ Locations location, String room, String description, /*ArrayList<Tag> tags,*/
                 String time, String date, String color){
        this.name = name;
        //this.org = org;
        this.location = location;
        this.room = room;
        this.description = description;
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

    public String getDesc() { return this.description; }

    public void setDesc(String description) { this.description = description; }

    public String getTime() { return this.time; }

    public void setTime(String time) { this.time = time; }

    public String getColor() { return this.color; }

    public void setColor(String color) { this.color = color; }

    public static ExpressionList<Event> findName(String name) {
        return find.where().like("name", name);
    }

    //public void setTags(ArrayList<Tag> tags) { this.tags = tags; }

    //public ArrayList<Tag> getTags() { return this.tags; }



}