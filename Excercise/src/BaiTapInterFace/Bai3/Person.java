package BaiTapInterFace.Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public abstract class Person implements Comparable<Person> {
    private String id;
    private FullName fullName;
    private String address;
    private Date birth;
    private String email;
    private String phoneNumber;

    public Person() {
        fullName = new FullName();
    }

    public Person(String id, String fullName, String address,
                  String birth, String email, String phoneNumber) {
        this.id = id;
        setFullName(fullName);
        this.fullName = new FullName();
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
        return fullName.last + " " +fullName.mid + fullName.first;
    }

    public void setFullName(String fullName) {
        var word = fullName.split(" ");
        this.fullName.last= word[0];
        this.fullName.first = word[word.length - 1];
        this.fullName.mid = "";
        for (int i = 1; i < word.length - 1; i++) {
            this.fullName.mid += word[i] + " ";

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

    @Override
    public int compareTo(Person o) {
        return this.getFullName().compareTo(o.getFullName());
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void doWork();
    protected abstract void speak();
    protected abstract void relax();


    private class FullName {
        private String mid;
        private String last;
        private String first;

        public FullName() {

        }

        public FullName(String mid, String last, String first) {
            this.mid = mid;
            this.last = last;
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

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }
    }
}
