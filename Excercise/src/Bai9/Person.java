package Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public abstract  class Person {
    private String idCard;
    private FullName fullName;
    private String address;
    private Date birth;
    private String email;
    private String phoneNumber;

    public Person() {

    }


    public Person(String idCard, String fullName, String address,
                  String birth, String email, String phoneNumber) {
        this.idCard = idCard;
        this.fullName = new FullName();
        setFullName(fullName);
        this.address = address;
        setBirth(birth);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final String getFullName() {
        return fullName.last + " " + fullName.mid + fullName.first;
    }

    public final void setFullName(String fullName) {
        var item = fullName.split(" ");
        this.fullName.first = item[item.length - 1];
        this.fullName.last = item[0];
        this.fullName.mid = "";
        for(int i = 1; i < item.length - 1; i++) {
            this.fullName.mid += item[i] + " ";
        }
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final String getBirth() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        return formatDate.format(birth);
    }

    public final void setBirth(String birth) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        try {
            this.birth = formatDate.parse(birth);
        } catch (ParseException e) {
            this.birth = new Date();
//            throw new RuntimeException(e);
        }

    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person[" +
                "idCard='" + idCard + '\'' +
                ", fullName=" + getFullName() +
                ", address='" + address + '\'' +
                ", birth='" + getBirth() + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ']';
    }

    protected abstract void dowork();




    public class FullName {
        private String mid;
        private String last;
        private String first;
    }
}
