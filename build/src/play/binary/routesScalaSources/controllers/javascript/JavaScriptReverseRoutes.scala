// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 17 10:24:36 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:16
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminlogin"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:7
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "details"})
        }
      """
    )
  
    // @LINE:3
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUsers"})
        }
      """
    )
  
    // @LINE:15
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
        }
      """
    )
  
    // @LINE:6
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseComplaintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getComplaints"})
        }
      """
    )
  
    // @LINE:27
    def getTopRankedList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getTopRankedList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "topRankedList"})
        }
      """
    )
  
    // @LINE:23
    def getDeptIconMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getDeptIconMap",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deptIconMap"})
        }
      """
    )
  
    // @LINE:24
    def getTopRankedComplaint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getTopRankedComplaint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toprankedcomplaint"})
        }
      """
    )
  
    // @LINE:14
    def getRecentlyClosed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyClosed",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlyclosed"})
        }
      """
    )
  
    // @LINE:10
    def getUserClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserClosedComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userClosedComplaints"})
        }
      """
    )
  
    // @LINE:20
    def getAdminIconMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getAdminIconMap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminIconMap"})
        }
      """
    )
  
    // @LINE:12
    def viewAndClose: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.viewAndClose",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewandclose"})
        }
      """
    )
  
    // @LINE:25
    def getActiveRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getActiveRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activeRegions"})
        }
      """
    )
  
    // @LINE:17
    def getStatusPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getStatusPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statusPendingComplaints"})
        }
      """
    )
  
    // @LINE:9
    def getUserPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userPendingComplaints"})
        }
      """
    )
  
    // @LINE:21
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.forgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotPassword"})
        }
      """
    )
  
    // @LINE:13
    def getRecentlyCreated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyCreated",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlycreated"})
        }
      """
    )
  
    // @LINE:4
    def addComplaint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.addComplaint",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "complaint"})
        }
      """
    )
  
    // @LINE:8
    def getUserComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userAllComplaints"})
        }
      """
    )
  
    // @LINE:28
    def getDeptActiveRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getDeptActiveRegions",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deptactiveregions"})
        }
      """
    )
  
    // @LINE:29
    def getDeptLocationComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getDeptLocationComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deptlocationcomplaints"})
        }
      """
    )
  
    // @LINE:11
    def getUserLeaderboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserLeaderboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userleaderboard"})
        }
      """
    )
  
    // @LINE:19
    def getDeptComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getDeptComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deptComplaints"})
        }
      """
    )
  
    // @LINE:26
    def getLocationComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getLocationComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "locationComplaints"})
        }
      """
    )
  
    // @LINE:22
    def getUserIconMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserIconMap",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userIconMap"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseWardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WardController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deptlogin"})
        }
      """
    )
  
  }


}
