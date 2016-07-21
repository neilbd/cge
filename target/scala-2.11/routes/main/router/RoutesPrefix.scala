
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neilbd/Documents/CGE/cge/conf/routes
// @DATE:Thu Jul 21 09:24:58 EDT 2016


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
