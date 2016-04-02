package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;


import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result sayHello() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        if(name == null) {
            return badRequest("missing parameter [name]");
        }
        else {
            return ok("Hello "+name);
        }
    }
}
