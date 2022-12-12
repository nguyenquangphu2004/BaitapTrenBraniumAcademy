package Bai4;

public class Person {
    private String identification;
    private FullName fullName;
    private String address;
    private String birth;
    private String email;
    private String phone;

    public Person() {
        identification = "";
        fullName = new FullName();
        address = "";
        birth  = "";
        email  = "";
        phone = "";
    }
    public Person(String identification,
                  String fullName, String address,
                  String birth, String email, String phone) {
        this.identification = identification;
        this.fullName = new FullName();
        setFullName(fullName);
        this.address = address;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + fullName.first;
    }

    public void setFullName(String fullName) {
            var words = fullName.split(" ");
            this.fullName.first = words[words.length - 1];
            this.fullName.last  = words[0];
            this.fullName.mid = "";
            for(int i = 1; i < words.length - 1; i++) {
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
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public class FullName {
        private String first;
        private String mid;
        private String last;
    }
}
