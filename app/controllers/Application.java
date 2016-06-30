package controllers;

import com.avaje.ebean.ExpressionList;
import play.*;
import play.db.ebean.*;
import play.mvc.*;
//import play.db.jpa.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import models.*;

import views.html.*;

import java.util.List;
import java.util.Date;

// For more Query expressions, look at the Expression List
// code at https://ebean-orm.github.io/apidocs/com/avaje/ebean/ExpressionList.html

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }


    @BodyParser.Of(BodyParser.Json.class)
    @Transactional
    public Result sayHello() {
        ObjectNode result = Json.newObject();
        JsonNode json = request().body().asJson();

        String name = json.findPath("name").textValue();
        if (name == null) {
            return badRequest("missing parameter [name]");
        } else {
            result.put("yourname", name);
            result.put("type", "event");
            return ok(result);
        }

    }

    @BodyParser.Of(BodyParser.Json.class)
    @Transactional
    public Result saveEvent() {
        ObjectNode result = Json.newObject();
        JsonNode json = request().body().asJson();

        String name = json.findPath("name").textValue();
        String location = json.findPath("location").textValue();
        String room = json.findPath("room").textValue();
        String description = json.findPath("description").textValue();
        String time = json.findPath("time").textValue();
        String date = json.findPath("date").textValue();
        String color = json.findPath("color").textValue();

        Event event = new Event(name, location, room, description, time, date, color);
        event.save();
        return ok("Data saved");
    }

    @BodyParser.Of(BodyParser.Json.class)
    @Transactional
    public Result search() {
        ObjectNode result = Json.newObject();
        JsonNode json = request().body().asJson();

        String name = json.findPath("name").textValue();
        List<Event> resultList = Event.find.where().ilike("name", "%"+name+"%").findList();
        // Always gets the first result
        return ok(resultList.get(0).getName());
    }

    @BodyParser.Of(BodyParser.Json.class)
    @Transactional
    public Result outputByDate() {
       // ObjectNode result = Json.newObject();
        JsonNode json = request().body().asJson();

        // events greater than current date from most recent date to farthest away
        List<Event> resultList = Event.find.where().ge("Date", new Date()).orderBy("date, date asc").findList();
        JsonNode result = Json.toJson(resultList);
        return ok(result);
    }
     /*
    }
    public Result getRange() {

    }
    public Result saveEvent() {

    }
    */
}
