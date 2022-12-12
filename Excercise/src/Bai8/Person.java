package Bai8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private String idCard;
    private FullName fullName;
    private String address;
    private Date dateBirth;
    private String email;
    private String numberPhone;

    public Person() {
        fullName = new FullName();
    }

    public Person(String idCard, String fullName, String address,
                  String dateBirth, String email, String numberPhone) {
        this.idCard = idCard;
        this.fullName = new FullName();
        setFullName(fullName);
        this.address = address;
        setDateBirth(dateBirth);
        this.email = email;
        this.numberPhone = numberPhone;
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

    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length - 1];
        this.fullName.mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            this.fullName.mid += words[i] + " ";
        }
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final String getDateBirth() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        return formatDate.format(dateBirth);
    }

    public final void setDateBirth(String dateBirth) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        try {
            this.dateBirth = formatDate.parse(dateBirth);
        } catch (ParseException e) {
            this.dateBirth = new Date();
//            throw new RuntimeException(e);
        }
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getNumberPhone() {
        return numberPhone;
    }

    public final void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    protected abstract void eat();
    protected abstract  void sleep();
    protected abstract void doWork();
    protected abstract void speak();
    protected abstract void relax();

    @Override
    public String toString() {
        return "Person[" +
                "idCard='" + idCard + '\'' +
                ", fullName=" + getFullName() +
                ", address='" + address + '\'' +
                ", dateBirth='" + getDateBirth() + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ']';
    }

    public class FullName {
        private String mid;
        private String first;
        private String last;

    }
}
