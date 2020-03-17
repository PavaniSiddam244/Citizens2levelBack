// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 17 10:24:36 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:16
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adminlogin")
    }
  
  }

  // @LINE:2
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:7
    def profile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "details")
    }
  
    // @LINE:3
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getUsers")
    }
  
    // @LINE:15
    def editProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editprofile")
    }
  
    // @LINE:6
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:4
  class ReverseComplaintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getComplaints")
    }
  
    // @LINE:27
    def getTopRankedList(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "topRankedList")
    }
  
    // @LINE:23
    def getDeptIconMap(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deptIconMap")
    }
  
    // @LINE:24
    def getTopRankedComplaint(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "toprankedcomplaint")
    }
  
    // @LINE:14
    def getRecentlyClosed(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlyclosed")
    }
  
    // @LINE:10
    def getUserClosedComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userClosedComplaints")
    }
  
    // @LINE:20
    def getAdminIconMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adminIconMap")
    }
  
    // @LINE:12
    def viewAndClose(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "viewandclose")
    }
  
    // @LINE:25
    def getActiveRegions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "activeRegions")
    }
  
    // @LINE:17
    def getStatusPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "statusPendingComplaints")
    }
  
    // @LINE:9
    def getUserPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userPendingComplaints")
    }
  
    // @LINE:21
    def forgotPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "forgotPassword")
    }
  
    // @LINE:13
    def getRecentlyCreated(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlycreated")
    }
  
    // @LINE:4
    def addComplaint(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "complaint")
    }
  
    // @LINE:8
    def getUserComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userAllComplaints")
    }
  
    // @LINE:28
    def getDeptActiveRegions(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deptactiveregions")
    }
  
    // @LINE:29
    def getDeptLocationComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deptlocationcomplaints")
    }
  
    // @LINE:11
    def getUserLeaderboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userleaderboard")
    }
  
    // @LINE:19
    def getDeptComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deptComplaints")
    }
  
    // @LINE:26
    def getLocationComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "locationComplaints")
    }
  
    // @LINE:22
    def getUserIconMap(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userIconMap")
    }
  
  }

  // @LINE:18
  class ReverseWardController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deptlogin")
    }
  
  }


}
