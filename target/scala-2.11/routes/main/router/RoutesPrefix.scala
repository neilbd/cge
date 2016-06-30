
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neilbd/Documents/CGE/cge/conf/routes
// @DATE:Mon Jun 27 21:51:00 EDT 2016


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
