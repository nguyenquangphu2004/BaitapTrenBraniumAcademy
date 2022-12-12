package BaiTapInterFace.Bai5;

public interface AccountManager {
    boolean signup(Account account);
    boolean login(Account account);
    boolean logout(Account account);
    boolean changePassWord(Account account);
    boolean lockAccount(Account account);
    boolean openAcccount(Account account);
}
