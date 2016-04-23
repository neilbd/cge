
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CGE/cge/conf/routes
// @DATE:Sat Apr 23 14:04:11 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sayHello""", """controllers.Application.sayHello()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sayHello""", """controllers.Application.sayHello()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveEvent""", """controllers.Application.saveEvent()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewEvent""", """controllers.Application.search()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_Application_index2_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_sayHello3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sayHello")))
  )
  private[this] lazy val controllers_Application_sayHello3_invoker = createInvoker(
    Application_1.sayHello(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sayHello",
      Nil,
      "GET",
      """""",
      this.prefix + """sayHello"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_sayHello4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sayHello")))
  )
  private[this] lazy val controllers_Application_sayHello4_invoker = createInvoker(
    Application_1.sayHello(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sayHello",
      Nil,
      "POST",
      """""",
      this.prefix + """sayHello"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_saveEvent5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveEvent")))
  )
  private[this] lazy val controllers_Application_saveEvent5_invoker = createInvoker(
    Application_1.saveEvent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveEvent",
      Nil,
      "GET",
      """ POST    /saveEvent                  controllers.Application.saveEvent()""",
      this.prefix + """saveEvent"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_search6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewEvent")))
  )
  private[this] lazy val controllers_Application_search6_invoker = createInvoker(
    Application_1.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """viewEvent"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_1.index)
      }
  
    // @LINE:13
    case controllers_Application_sayHello3_route(params) =>
      call { 
        controllers_Application_sayHello3_invoker.call(Application_1.sayHello())
      }
  
    // @LINE:14
    case controllers_Application_sayHello4_route(params) =>
      call { 
        controllers_Application_sayHello4_invoker.call(Application_1.sayHello())
      }
  
    // @LINE:20
    case controllers_Application_saveEvent5_route(params) =>
      call { 
        controllers_Application_saveEvent5_invoker.call(Application_1.saveEvent())
      }
  
    // @LINE:22
    case controllers_Application_search6_route(params) =>
      call { 
        controllers_Application_search6_invoker.call(Application_1.search())
      }
  }
}