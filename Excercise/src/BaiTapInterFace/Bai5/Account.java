package BaiTapInterFace.Bai5;
import java.util.Objects;

public class Account {
    private String user;
    private String passWord;

    public Account() {

    }

    public Account(String user, String passWord) {
        this.user = user;
        this.passWord = passWord;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            var a = (Account) obj;
            if (user.equals(a.getUser())) {
                return true;
            }

        }
        return false;
    }
}



