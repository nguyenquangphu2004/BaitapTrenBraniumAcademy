package Bai11.Bai1;

import java.util.ArrayList;

public class AccountManagerImp implements AccountManager {
    private ArrayList<Account> accounts;

    public AccountManagerImp() {
        accounts = new ArrayList<>();
    }

    public AccountManagerImp(ArrayList<Account> accounts) {
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
        if (!isExist(account)) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean isExist(Account account) {
        for (var ac : accounts) {
            if (ac.getUsername().compareTo(account.getUsername()) == 0) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean login(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i)) &&
                                accounts.get(i) instanceof  Activity ) {
                var acCheck = (Activity)accounts.get(i);
                acCheck.setOnline(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean logout(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i)) &&
                    accounts.get(i) instanceof  Activity ) {
                var acCheck = (Activity)accounts.get(i);
                acCheck.setOnline(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i))) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean restoreAccount(Account account) {
        return false;
    }

    @Override
    public boolean changePassWord(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i))) {
                accounts.get(i).setPassword(account.getPassword());
                return true;
            }
        }
        return false;
    }

    @Override
//    Vis du thay doi thong tin ve ho ten va email
    public boolean changeInfor(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(account.equals(accounts.get(i))) {
                accounts.get(i).setFullName(account.getFullName());
                accounts.get(i).setEmail(account.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "AccountManagerImp[" +
                "user=" + accounts.get(1).getUsername() + ", " +
                "password" + accounts.get(1).getPassword() +
                ']';
    }
}
