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

        Event event = new Event(name, null, null, null, null, null, null);
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
     /*
    public Result getRange() {

    }
    public Result saveEvent() {

    }
    */
}
