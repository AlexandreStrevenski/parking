package controllers;


import javax.inject.Inject;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import models.Neighbour;

import views.html.formNeighbour;

public class NeighbourController extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result index() {
        return newForm();
    }

    public Result save() {
        Form<Neighbour> form = formFactory.form(Neighbour.class).bindFromRequest();
        Neighbour neighbour = form.get();
        neighbour.save();

        flash("success", "Cadastrado com sucesso " + neighbour.getUnit());
        return ok(formNeighbour.render(form));
    }

    public Result newForm() {
        Form<Neighbour> form = formFactory.form(Neighbour.class).fill(new Neighbour());
        return ok(formNeighbour.render(form));
    }

}
