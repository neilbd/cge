
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CGE/cge/conf/routes
// @DATE:Sat Apr 09 15:13:36 EDT 2016


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
