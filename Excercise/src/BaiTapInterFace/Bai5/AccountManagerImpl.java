package BaiTapInterFace.Bai5;

import java.util.ArrayList;

public class AccountManagerImpl implements AccountManager{
    private ArrayList<Account> accounts;

    public AccountManagerImpl() {
        accounts = new ArrayList<>();
    }

    public AccountManagerImpl(ArrayList<Account> accounts) {
        this.accounts = new ArrayList<>();
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean signup(Account account) {
        if(!check(account)) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean check(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Account account) {
        for(int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i)) && accounts.get(i) instanceof Activity &&
                        account.getPassWord().equals(accounts.get(i).getPassWord())) {
                var acc = (Activity)accounts.get(i);
                acc.setOnline(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean logout(Account account) {
        for(int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i)) && accounts.get(i) instanceof Activity
            &&  account.getPassWord().equals(accounts.get(i).getPassWord())) {

                var acc = (Activity)accounts.get(i);
                acc.setOnline(false);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean changePassWord(Account account) {
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).equals(account)) {
                accounts.get(i).setPassWord(account.getPassWord());
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean lockAccount(Account account) {
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).equals(account) && accounts.get(i) instanceof Activity &&
                    account.getPassWord().equals(accounts.get(i).getPassWord())) {
                var acc = (Activity)accounts.get(i);
                acc.setActivate(false);
                return true;

            }
        }
        return false;
    }

    @Override
    public boolean openAcccount(Account account) {
        for(int i =0 ; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i)) && accounts.get(i) instanceof Activity) {
                var acc = (Activity)accounts.get(i);
                acc.setActivate(true);
                return true;
            }
        }
        return false;
    }


}
