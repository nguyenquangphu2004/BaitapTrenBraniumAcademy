package BaiTapInterFace.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private String id;
    private FullName fullName;
    private String address;
    private Date birth;
    private String email;
    private String phoneNumber;

    public Person() {

    }

    public Person(String id, String fullName, String address,
                  String birth, String email, String phoneNumber) {
        this.id = id;
        this.fullName = new FullName();
        setFullName(fullName);
        this.address = address;
        setBirth(birth);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + fullName.first;
    }

    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length - 1];
        this.fullName.mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            this.fullName.mid += words[i] + " ";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(this.birth);
    }

    public void setBirth(String birth) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            this.birth = dateFormat.parse(birth);
        } catch (ParseException e) {
            this.birth = new Date();
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

    private class FullName {
        private String mid;
        private String last;
        private String first;

    }


    public void eat() {

    }
    public void sleep() {}
    protected abstract void doWork();
    public void speak() {

    }
    public void relax() {

    }

    @Override
    public String toString() {
        return id + ";" + getFullName() + ";" + address
                + ";" + getBirth() + ";" + email + ";" + phoneNumber;
    }
}
