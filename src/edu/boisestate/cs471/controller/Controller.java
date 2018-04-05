package edu.boisestate.cs471.controller;

import edu.boisestate.cs471.model.Model;

/**
 * The Controller portion of a Model-View-Controller architecture.
 */
public class Controller {
    /** The Model of this model-view-controller. */
    private final Model mModel;

    /**
     * Instantiate a controller for manipulating a given model.
     * @param model The model this controller may manipulate.
     */
    public Controller(final Model model) {
        mModel = model;
    }

    /**
     * Get a reference to the Model.
     * @return The model of the model-view-controller.
     */
    public final Model getModel() {
        return mModel;
    }

}
