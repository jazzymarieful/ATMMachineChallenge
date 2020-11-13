package sr.unasat.dataflow.services;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atmService {

    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    public int userPinCode;
    public String user;
    public double currentAmount;
    public boolean userPinCodeSet = false;

    public void checkUserAccount() {
        userPinCode = input.nextInt();

        while (true) {
            switch (userPinCode) {
                case 3456:
                    user = "Kevin";
                    currentAmount = 4825.40;
                    userPinCodeSet = true;
                    break;
                case 7500:
                    user = "Francine";
                    currentAmount = 5300.50;
                    userPinCodeSet = true;
                    break;
                case 1402:
                    user = "Jazzy";
                    currentAmount = 14560.80;
                    userPinCodeSet = true;
                    break;
                default:
                    System.out.println("Incorrect pin code");
                    System.out.println("Try again");
                    userPinCode = input.nextInt();
            }
          if (userPinCodeSet == true) {
              break;
          }
        }
    }

    public void useATM() {
        while (true) {
            System.out.println("Choose action:");
            System.out.println("Check Balance = 1, Withdrawal = 2, Exit = 3");
            int action = input.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Balance is " + df.format(currentAmount));
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    break;
            }
            if (action == 3) {
                break;
            }
        }
    }

    public void withdrawal() {
        System.out.println("Choose amount to withdraw or Cancel = 0");
        int withdraw = input.nextInt();
        if (withdraw <= currentAmount && withdraw != 0) {
            currentAmount = currentAmount - withdraw;
            System.out.println("New balance is " + df.format(currentAmount));
        }
        else if (withdraw == 0) {
            System.out.println("You have cancelled withdrawal");
        }
        else {
            System.out.print("Cannot withdraw");
            System.out.println(", withdraw amount too high");
        }
    }
}
