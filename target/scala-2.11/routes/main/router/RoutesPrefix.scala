
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CGE/cge/conf/routes
// @DATE:Sat Feb 27 17:18:29 EST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
