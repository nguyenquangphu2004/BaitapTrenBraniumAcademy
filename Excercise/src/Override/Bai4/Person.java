package Override.Bai4;

public class Person {
    private String idCard;
    private FullName fullName;
    private String address;
    private String email;
    private String phone;

    public Person() {

    }

    public Person(String idCard, String fullName, String address, String email, String phone) {

        this.idCard = idCard;
        this.fullName = new FullName();
        setFullName(fullName);
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public void eat() {
        System.out.println(getFullName() + " đang ăn cơm..");
    }
    public void sleep() {
        System.out.println(getFullName() + " hôm nào cũng đi ngủ vào lúc 23h...");
    }
    public void dowork() {
        System.out.println(getFullName() + "làm việc vào lúc 8h sáng hàng ngày.");
    }
//    ..........................................
//    ==========================================

    public class FullName {
        private String mid;
        private String first;
        private String last;
    }
}
