// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 17 10:24:36 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_2: controllers.HomeController,
  // @LINE:2
  UserController_4: controllers.UserController,
  // @LINE:4
  ComplaintController_3: controllers.ComplaintController,
  // @LINE:16
  AdminController_0: controllers.AdminController,
  // @LINE:18
  WardController_1: controllers.WardController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_2: controllers.HomeController,
    // @LINE:2
    UserController_4: controllers.UserController,
    // @LINE:4
    ComplaintController_3: controllers.ComplaintController,
    // @LINE:16
    AdminController_0: controllers.AdminController,
    // @LINE:18
    WardController_1: controllers.WardController
  ) = this(errorHandler, HomeController_2, UserController_4, ComplaintController_3, AdminController_0, WardController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, UserController_4, ComplaintController_3, AdminController_0, WardController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUsers""", """controllers.UserController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complaint""", """controllers.ComplaintController.addComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getComplaints""", """controllers.ComplaintController.getComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """details""", """controllers.UserController.profile"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAllComplaints""", """controllers.ComplaintController.getUserComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPendingComplaints""", """controllers.ComplaintController.getUserPendingComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userClosedComplaints""", """controllers.ComplaintController.getUserClosedComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userleaderboard""", """controllers.ComplaintController.getUserLeaderboard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewandclose""", """controllers.ComplaintController.viewAndClose"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlycreated""", """controllers.ComplaintController.getRecentlyCreated"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlyclosed""", """controllers.ComplaintController.getRecentlyClosed"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile""", """controllers.UserController.editProfile"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminlogin""", """controllers.AdminController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statusPendingComplaints""", """controllers.ComplaintController.getStatusPendingComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deptlogin""", """controllers.WardController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deptComplaints""", """controllers.ComplaintController.getDeptComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminIconMap""", """controllers.ComplaintController.getAdminIconMap"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotPassword""", """controllers.ComplaintController.forgotPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userIconMap""", """controllers.ComplaintController.getUserIconMap"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deptIconMap""", """controllers.ComplaintController.getDeptIconMap"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """toprankedcomplaint""", """controllers.ComplaintController.getTopRankedComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activeRegions""", """controllers.ComplaintController.getActiveRegions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """locationComplaints""", """controllers.ComplaintController.getLocationComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topRankedList""", """controllers.ComplaintController.getTopRankedList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deptactiveregions""", """controllers.ComplaintController.getDeptActiveRegions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deptlocationcomplaints""", """controllers.ComplaintController.getDeptLocationComplaints"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_UserController_addUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_addUser1_invoker = createInvoker(
    UserController_4.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_UserController_getUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUsers")))
  )
  private[this] lazy val controllers_UserController_getUsers2_invoker = createInvoker(
    UserController_4.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """getUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ComplaintController_addComplaint3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complaint")))
  )
  private[this] lazy val controllers_ComplaintController_addComplaint3_invoker = createInvoker(
    ComplaintController_3.addComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "addComplaint",
      Nil,
      "POST",
      this.prefix + """complaint""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ComplaintController_getComplaints4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getComplaints4_invoker = createInvoker(
    ComplaintController_3.getComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getComplaints",
      Nil,
      "GET",
      this.prefix + """getComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_login5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login5_invoker = createInvoker(
    UserController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_profile6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("details")))
  )
  private[this] lazy val controllers_UserController_profile6_invoker = createInvoker(
    UserController_4.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Nil,
      "POST",
      this.prefix + """details""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ComplaintController_getUserComplaints7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAllComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserComplaints7_invoker = createInvoker(
    ComplaintController_3.getUserComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserComplaints",
      Nil,
      "POST",
      this.prefix + """userAllComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints8_invoker = createInvoker(
    ComplaintController_3.getUserPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserPendingComplaints",
      Nil,
      "POST",
      this.prefix + """userPendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userClosedComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints9_invoker = createInvoker(
    ComplaintController_3.getUserClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserClosedComplaints",
      Nil,
      "POST",
      this.prefix + """userClosedComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userleaderboard")))
  )
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard10_invoker = createInvoker(
    ComplaintController_3.getUserLeaderboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserLeaderboard",
      Nil,
      "GET",
      this.prefix + """userleaderboard""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ComplaintController_viewAndClose11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewandclose")))
  )
  private[this] lazy val controllers_ComplaintController_viewAndClose11_invoker = createInvoker(
    ComplaintController_3.viewAndClose,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "viewAndClose",
      Nil,
      "POST",
      this.prefix + """viewandclose""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlycreated")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated12_invoker = createInvoker(
    ComplaintController_3.getRecentlyCreated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyCreated",
      Nil,
      "POST",
      this.prefix + """recentlycreated""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlyclosed")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed13_invoker = createInvoker(
    ComplaintController_3.getRecentlyClosed,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyClosed",
      Nil,
      "POST",
      this.prefix + """recentlyclosed""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_editProfile14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile")))
  )
  private[this] lazy val controllers_UserController_editProfile14_invoker = createInvoker(
    UserController_4.editProfile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editProfile",
      Nil,
      "POST",
      this.prefix + """editprofile""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AdminController_login15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminlogin")))
  )
  private[this] lazy val controllers_AdminController_login15_invoker = createInvoker(
    AdminController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "login",
      Nil,
      "POST",
      this.prefix + """adminlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ComplaintController_getStatusPendingComplaints16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statusPendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getStatusPendingComplaints16_invoker = createInvoker(
    ComplaintController_3.getStatusPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getStatusPendingComplaints",
      Nil,
      "POST",
      this.prefix + """statusPendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_WardController_login17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deptlogin")))
  )
  private[this] lazy val controllers_WardController_login17_invoker = createInvoker(
    WardController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WardController",
      "login",
      Nil,
      "POST",
      this.prefix + """deptlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ComplaintController_getDeptComplaints18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deptComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getDeptComplaints18_invoker = createInvoker(
    ComplaintController_3.getDeptComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getDeptComplaints",
      Nil,
      "POST",
      this.prefix + """deptComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ComplaintController_getAdminIconMap19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminIconMap")))
  )
  private[this] lazy val controllers_ComplaintController_getAdminIconMap19_invoker = createInvoker(
    ComplaintController_3.getAdminIconMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getAdminIconMap",
      Nil,
      "GET",
      this.prefix + """adminIconMap""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ComplaintController_forgotPassword20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotPassword")))
  )
  private[this] lazy val controllers_ComplaintController_forgotPassword20_invoker = createInvoker(
    ComplaintController_3.forgotPassword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "forgotPassword",
      Nil,
      "POST",
      this.prefix + """forgotPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ComplaintController_getUserIconMap21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userIconMap")))
  )
  private[this] lazy val controllers_ComplaintController_getUserIconMap21_invoker = createInvoker(
    ComplaintController_3.getUserIconMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserIconMap",
      Nil,
      "POST",
      this.prefix + """userIconMap""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ComplaintController_getDeptIconMap22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deptIconMap")))
  )
  private[this] lazy val controllers_ComplaintController_getDeptIconMap22_invoker = createInvoker(
    ComplaintController_3.getDeptIconMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getDeptIconMap",
      Nil,
      "POST",
      this.prefix + """deptIconMap""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ComplaintController_getTopRankedComplaint23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("toprankedcomplaint")))
  )
  private[this] lazy val controllers_ComplaintController_getTopRankedComplaint23_invoker = createInvoker(
    ComplaintController_3.getTopRankedComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getTopRankedComplaint",
      Nil,
      "GET",
      this.prefix + """toprankedcomplaint""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ComplaintController_getActiveRegions24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activeRegions")))
  )
  private[this] lazy val controllers_ComplaintController_getActiveRegions24_invoker = createInvoker(
    ComplaintController_3.getActiveRegions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getActiveRegions",
      Nil,
      "GET",
      this.prefix + """activeRegions""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ComplaintController_getLocationComplaints25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("locationComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getLocationComplaints25_invoker = createInvoker(
    ComplaintController_3.getLocationComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getLocationComplaints",
      Nil,
      "POST",
      this.prefix + """locationComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ComplaintController_getTopRankedList26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topRankedList")))
  )
  private[this] lazy val controllers_ComplaintController_getTopRankedList26_invoker = createInvoker(
    ComplaintController_3.getTopRankedList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getTopRankedList",
      Nil,
      "POST",
      this.prefix + """topRankedList""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ComplaintController_getDeptActiveRegions27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deptactiveregions")))
  )
  private[this] lazy val controllers_ComplaintController_getDeptActiveRegions27_invoker = createInvoker(
    ComplaintController_3.getDeptActiveRegions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getDeptActiveRegions",
      Nil,
      "POST",
      this.prefix + """deptactiveregions""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ComplaintController_getDeptLocationComplaints28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deptlocationcomplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getDeptLocationComplaints28_invoker = createInvoker(
    ComplaintController_3.getDeptLocationComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getDeptLocationComplaints",
      Nil,
      "POST",
      this.prefix + """deptlocationcomplaints""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:2
    case controllers_UserController_addUser1_route(params@_) =>
      call { 
        controllers_UserController_addUser1_invoker.call(UserController_4.addUser)
      }
  
    // @LINE:3
    case controllers_UserController_getUsers2_route(params@_) =>
      call { 
        controllers_UserController_getUsers2_invoker.call(UserController_4.getUsers)
      }
  
    // @LINE:4
    case controllers_ComplaintController_addComplaint3_route(params@_) =>
      call { 
        controllers_ComplaintController_addComplaint3_invoker.call(ComplaintController_3.addComplaint)
      }
  
    // @LINE:5
    case controllers_ComplaintController_getComplaints4_route(params@_) =>
      call { 
        controllers_ComplaintController_getComplaints4_invoker.call(ComplaintController_3.getComplaints)
      }
  
    // @LINE:6
    case controllers_UserController_login5_route(params@_) =>
      call { 
        controllers_UserController_login5_invoker.call(UserController_4.login)
      }
  
    // @LINE:7
    case controllers_UserController_profile6_route(params@_) =>
      call { 
        controllers_UserController_profile6_invoker.call(UserController_4.profile)
      }
  
    // @LINE:8
    case controllers_ComplaintController_getUserComplaints7_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserComplaints7_invoker.call(ComplaintController_3.getUserComplaints)
      }
  
    // @LINE:9
    case controllers_ComplaintController_getUserPendingComplaints8_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserPendingComplaints8_invoker.call(ComplaintController_3.getUserPendingComplaints)
      }
  
    // @LINE:10
    case controllers_ComplaintController_getUserClosedComplaints9_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserClosedComplaints9_invoker.call(ComplaintController_3.getUserClosedComplaints)
      }
  
    // @LINE:11
    case controllers_ComplaintController_getUserLeaderboard10_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserLeaderboard10_invoker.call(ComplaintController_3.getUserLeaderboard)
      }
  
    // @LINE:12
    case controllers_ComplaintController_viewAndClose11_route(params@_) =>
      call { 
        controllers_ComplaintController_viewAndClose11_invoker.call(ComplaintController_3.viewAndClose)
      }
  
    // @LINE:13
    case controllers_ComplaintController_getRecentlyCreated12_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyCreated12_invoker.call(ComplaintController_3.getRecentlyCreated)
      }
  
    // @LINE:14
    case controllers_ComplaintController_getRecentlyClosed13_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyClosed13_invoker.call(ComplaintController_3.getRecentlyClosed)
      }
  
    // @LINE:15
    case controllers_UserController_editProfile14_route(params@_) =>
      call { 
        controllers_UserController_editProfile14_invoker.call(UserController_4.editProfile)
      }
  
    // @LINE:16
    case controllers_AdminController_login15_route(params@_) =>
      call { 
        controllers_AdminController_login15_invoker.call(AdminController_0.login)
      }
  
    // @LINE:17
    case controllers_ComplaintController_getStatusPendingComplaints16_route(params@_) =>
      call { 
        controllers_ComplaintController_getStatusPendingComplaints16_invoker.call(ComplaintController_3.getStatusPendingComplaints)
      }
  
    // @LINE:18
    case controllers_WardController_login17_route(params@_) =>
      call { 
        controllers_WardController_login17_invoker.call(WardController_1.login)
      }
  
    // @LINE:19
    case controllers_ComplaintController_getDeptComplaints18_route(params@_) =>
      call { 
        controllers_ComplaintController_getDeptComplaints18_invoker.call(ComplaintController_3.getDeptComplaints)
      }
  
    // @LINE:20
    case controllers_ComplaintController_getAdminIconMap19_route(params@_) =>
      call { 
        controllers_ComplaintController_getAdminIconMap19_invoker.call(ComplaintController_3.getAdminIconMap)
      }
  
    // @LINE:21
    case controllers_ComplaintController_forgotPassword20_route(params@_) =>
      call { 
        controllers_ComplaintController_forgotPassword20_invoker.call(ComplaintController_3.forgotPassword)
      }
  
    // @LINE:22
    case controllers_ComplaintController_getUserIconMap21_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserIconMap21_invoker.call(ComplaintController_3.getUserIconMap)
      }
  
    // @LINE:23
    case controllers_ComplaintController_getDeptIconMap22_route(params@_) =>
      call { 
        controllers_ComplaintController_getDeptIconMap22_invoker.call(ComplaintController_3.getDeptIconMap)
      }
  
    // @LINE:24
    case controllers_ComplaintController_getTopRankedComplaint23_route(params@_) =>
      call { 
        controllers_ComplaintController_getTopRankedComplaint23_invoker.call(ComplaintController_3.getTopRankedComplaint)
      }
  
    // @LINE:25
    case controllers_ComplaintController_getActiveRegions24_route(params@_) =>
      call { 
        controllers_ComplaintController_getActiveRegions24_invoker.call(ComplaintController_3.getActiveRegions)
      }
  
    // @LINE:26
    case controllers_ComplaintController_getLocationComplaints25_route(params@_) =>
      call { 
        controllers_ComplaintController_getLocationComplaints25_invoker.call(ComplaintController_3.getLocationComplaints)
      }
  
    // @LINE:27
    case controllers_ComplaintController_getTopRankedList26_route(params@_) =>
      call { 
        controllers_ComplaintController_getTopRankedList26_invoker.call(ComplaintController_3.getTopRankedList)
      }
  
    // @LINE:28
    case controllers_ComplaintController_getDeptActiveRegions27_route(params@_) =>
      call { 
        controllers_ComplaintController_getDeptActiveRegions27_invoker.call(ComplaintController_3.getDeptActiveRegions)
      }
  
    // @LINE:29
    case controllers_ComplaintController_getDeptLocationComplaints28_route(params@_) =>
      call { 
        controllers_ComplaintController_getDeptLocationComplaints28_invoker.call(ComplaintController_3.getDeptLocationComplaints)
      }
  }
}
