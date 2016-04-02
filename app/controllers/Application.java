package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;


import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result sayHello() {
        ObjectNode result = Json.newObject();
        JsonNode json = request().body().asJson();

        String name = json.findPath("name").textValue();
        if(name == null) {
            return badRequest("missing parameter [name]");
        }
        else {
            result.put("yourname", name);
            result.put("type", "event");
            return ok(result);
        }
    }
    /*
    public Result search() {

    }
    public Result getRange() {

    }
    public Result saveEvent() {

    }
    */
}
