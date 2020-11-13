package sr.unasat.dataflow.app;

import sr.unasat.dataflow.services.atmService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        atmService useService = new atmService();

        System.out.println("Welcome user");
        System.out.println("Enter pin code");

        useService.checkUserAccount();

        System.out.println("Correct pin code");
        System.out.println("Welcome " + useService.user);

        useService.useATM();

        System.out.println("Goodbye");
    }
}

