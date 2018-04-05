package edu.boisestate.cs471.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

import edu.boisestate.cs471.controller.Controller;

public class View {

    private JFrame mFrame;
    private final Controller mController;



    /**
     * Create the application.
     *
     * @param ctrl The Controller of the Model-View-Controller.
     */
    public View(final Controller ctrl) {
        mController = ctrl;
        createComponents();
    }

    /**
     * Make the view visible to the user.
     */
    public final void show() {
        mFrame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void createComponents() {
        mFrame = new JFrame();
        mFrame.setBounds(100, 100, 450, 368);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setMinimumSize(new Dimension(450, 368));
        mFrame.add(new JLabel("Hello World"));
    }
}
