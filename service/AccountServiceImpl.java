package main.project.service;

import main.project.model.Account;
import main.project.model.Ewallet;

public class AccountServiceImpl implements AccountService {

    private  Ewallet ewallet = new Ewallet();

    @Override
    public boolean createAccount(Account account) {
        // TODO get List of Account on Ewallet and make sure that not any account with same user name
        // TODO if not exist any account not has same username add account and return true
        // TODO else return false
        return false;
    }

    @Override
    public boolean loginAccount(Account account) {
        // TODO get List of Account on Ewallet and make sure that exist account with same user name and password
        // TODO if exist any account  has same username and password return true
        // TODO else return false
        return false;
    }
}
