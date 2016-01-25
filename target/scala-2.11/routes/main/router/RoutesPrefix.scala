
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/ALL/playws/my-first-app/first/conf/routes
// @DATE:Fri Jan 22 12:21:43 IST 2016


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
