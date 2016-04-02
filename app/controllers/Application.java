package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result sayHello() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").texValue();
        if(name == null) {
            return badRequest("missing parameter [name]");
        }
        else {
            return ok("Hello "+name);
        }
    }
}
