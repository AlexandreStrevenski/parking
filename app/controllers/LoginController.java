package controllers;

import javax.inject.Inject;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import models.Neighbour;

import views.html.login;


public class LoginController extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result index() {
        return ok(login.render(formFactory.form(Neighbour.class)));
    }

    public Result login() {
        return redirect(routes.NeighbourController.index());
    }

}
