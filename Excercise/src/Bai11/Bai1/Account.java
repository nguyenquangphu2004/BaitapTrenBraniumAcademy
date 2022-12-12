package Bai11.Bai1;

import java.util.Arrays;
import java.util.Objects;

public class Account {
//    thông tin tài khoản gồm: mã tài khoản,mật khẩu,username,họ,đệm,tên,email,điện thoại
    private String id;
    private String username;
    private String password;
    private FullName fullName;
    private String email;
    private String phoneNumber;

    public Account() {

    }

    public Account(String username,String password) {
        this.username = username;
        this.password = password;
    }
    public Account(String id, String username, String password
            , String fullName, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = new FullName();
        setFullName(fullName);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + fullName.first;
    }

    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length - 1];
        this.fullName.mid = "";
        for(int i = 1; i < words.length - 1; i++)  {
            this.fullName.mid += words[i] + " ";
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Account) {
            Account a = (Account) o;
            if(a.getPassword().equals(password) == true && a.getUsername().equals(username) ==true) {
                return true;
            }
        }
        return false;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Account account = (Account) o;
//        return Objects.equals(username, account.username) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    private class FullName {
        private String first;
        private String mid;
        private String last;

        public FullName() {}

        public FullName(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }
}
