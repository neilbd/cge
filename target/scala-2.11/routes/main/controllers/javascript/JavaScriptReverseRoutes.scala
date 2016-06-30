
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neilbd/Documents/CGE/cge/conf/routes
// @DATE:Mon Jun 27 21:51:00 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def sayHello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sayHello",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sayHello"})
          }
        
        }
      """
    )
  
    // @LINE:20
    def saveEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveEvent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saveEvent"})
        }
      """
    )
  
    // @LINE:24
    def outputByDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.outputByDate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "outputByDate"})
        }
      """
    )
  
    // @LINE:22
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewEvent"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}