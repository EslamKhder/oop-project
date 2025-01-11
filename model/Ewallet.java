package main.project.model;

import java.util.ArrayList;
import java.util.List;

public class Ewallet {


    private String name = "EraaSoft Cash";

    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
