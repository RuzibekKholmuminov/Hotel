package org.example;

import org.example.controller.AuthController;
import org.example.db.Database;

public class Main {
    public static void main(String[] args) {
        Database.adminInit();
        AuthController authController = new AuthController();
        authController.start();
    }
}