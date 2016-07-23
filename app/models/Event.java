package models;

import com.avaje.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.avaje.ebean.Model;


@Entity
public class Event extends Model{

    @Required
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String organization_name;
    private String location;
    private String room;
    private Date tmp_date;
    private String time;
    //private Organization org;
    private String description;
    private int attendence;
    //private ArrayList<Tag> tags;
    private String tag;
    private int hour;
    private int minute;
    private String date_to_use;
    private Calendar date;
    private String phone_number;
    private String email;


    public static Finder<Integer, Event> find = new Finder<Integer,Event>(Event.class);
    ///*Organization org,*/
    public Event(/*int id,*/ String organization_name, String location, String room, String description, /*ArrayList<Tag> tags,*/
                 String time, String date, String phone_number, String email, String tag){
        this.organization_name = organization_name;
        //this.org = org;
        this.location = location;
        this.room = room;
        this.description = description;
        //this.tags = tags;
        this.time = time;
        this.tag = tag;
        this.date_to_use = date;
        this.email = email;
        this.phone_number = phone_number;
        System.out.println(date + " " + this.time);
        if(time != null && date != null){
            String new_date = date.concat(" ").concat(time);
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm");

            try{
                this.tmp_date = formatter.parse(new_date);
                System.out.println("WORKS");
            } catch (ParseException e){
                e.printStackTrace();
            }

            this.date = new GregorianCalendar();
            System.out.println(this.tmp_date);
            this.date.setTime(this.tmp_date);

            String[] times = time.split(":");
            this.hour = Integer.parseInt(times[0]);
            this.minute = Integer.parseInt(times[1]);
            
        }

    }

    public void setName(String organization_name){
        this.organization_name = organization_name;
    }

    public String getName(){
        return this.organization_name;
    }

    public int getId() { return this.id; }


    /*public Organization getOrg(){
        return this.org;
    }*/

    public String getLocation() { return this.location; }

    public void setLocation(String location) { this.location = location; }

    public void setRoom(String room) { this.room = room; }

    public String getRoom() { return this.room; }

    public String getDesc() { return this.description; }

    public void setDesc(String description) { this.description = description; }

    public String getTime() { 
        return this.time; 
    }

    public void setTime(String time) { 

        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        this.date.set(Calendar.HOUR, hour);
        this.date.set(Calendar.MINUTE, minute);

    }

    public String getDate() { 
        return this.date_to_use; 
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone(){
        return this.phone_number;
    }

    public void setDate(String date) { 

        this.date_to_use = date;
        String[] dates = date.split("/");
        int month = Integer.parseInt(dates[0]);
        int day = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);

        this.date.set(Calendar.MONTH, month);
        this.date.set(Calendar.DAY_OF_MONTH, day);
        this.date.set(Calendar.YEAR, year);

    }

    public String getColor() { return this.tag; }

    public void setColor(String tag) { this.tag = tag; }

    public static ExpressionList<Event> findName(String organization_name) {
        return find.where().like("organization_name", organization_name);
    }

    //public void setTags(ArrayList<Tag> tags) { this.tags = tags; }

    //public ArrayList<Tag> getTags() { return this.tags; }

}




