package main.project.service;

import main.project.model.Account;

import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Sir");

        // TODO on case (Invalid Choose) repeat for 4 times
        System.out.println("Please Enter your choose");
        System.out.println("a.login     b.signup   c.exit");
        char choose = scanner.next().charAt(0);
        switch (choose) {
            case 'a':
                login();
                break;
            case 'b':
                signup();
                break;
            case 'c':
                System.out.println("you are welcome.");
                break;
            default:
                System.out.println("Invalid Choose");
        }
    }

    private void signup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();

        ValidationService validationService = new ValidationServiceImpl();

        // TODO Validation on UserName and Password
        if (!validationService.validateUserName(name)) { // "eslam"
            System.out.println("Invalid UserName");
            return;
        }

        if (!validationService.validatePassword(password)) {
            System.out.println("Invalid Password");
            return;
        }

        // TODO SERVICE OF ACCOUNT TO CREATE ACCOUNT

        AccountService accountService = new AccountServiceImpl();
        Account account = new Account(name, password);
        // TODO   impl createAccount
        boolean isAccountCreated = accountService.createAccount(account);
        if (isAccountCreated) {
            System.out.println("Account Created");
        } else {
            System.out.println("Account not Created Because There exist account with same user name");
        }

    }

    private void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();

        ValidationService validationService = new ValidationServiceImpl();

        // TODO Validation on UserName and Password
        if (!validationService.validateUserName(name)) {
            System.out.println("Invalid UserName");
            return;
        }

        if (!validationService.validatePassword(password)) {
            System.out.println("Invalid Password");
            return;
        }

        AccountService accountService = new AccountServiceImpl();
        // TODO SERVICE OF ACCOUNT TO LOGIN
        if (accountService.loginAccount(new Account(name, password))) {
            System.out.println("Login  Success");
            services();
        } else {
            System.out.println("Account not Exist");
        }

    }

    private void services() {

        System.out.println("1.Deposit   2.Withdraw    3.show details    4.Transfer    5. show balance   6.exit");

        // TODO create switch case such as on run function
    }

    void deposit(Account a, int money){

    }
}
