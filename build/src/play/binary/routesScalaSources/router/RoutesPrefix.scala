// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 17 10:24:36 IST 2020


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
