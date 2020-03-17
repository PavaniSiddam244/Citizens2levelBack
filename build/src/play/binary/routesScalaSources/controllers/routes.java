// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 17 10:24:36 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAdminController AdminController = new controllers.ReverseAdminController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseComplaintController ComplaintController = new controllers.ReverseComplaintController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWardController WardController = new controllers.ReverseWardController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAdminController AdminController = new controllers.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseComplaintController ComplaintController = new controllers.javascript.ReverseComplaintController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWardController WardController = new controllers.javascript.ReverseWardController(RoutesPrefix.byNamePrefix());
  }

}
