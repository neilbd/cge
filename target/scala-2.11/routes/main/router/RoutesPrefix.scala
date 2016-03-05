
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neilbd/Documents/CGE/cge/conf/routes
// @DATE:Sat Mar 05 12:44:53 EST 2016


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
