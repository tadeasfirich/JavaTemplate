package main.java.cz.ucl.exam2.controller;

public class MainController {
    ProjectController projectController;

    public MainController() {
        projectController = new ProjectController();
        projectController.init();
    }

    public static void main(String [] args) {
        new MainController();
    }
}
