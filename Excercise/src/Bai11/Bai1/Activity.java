package Bai11.Bai1;
public class Activity extends Account {
    private boolean active;
    private boolean online;

    public Activity() {

    }

    public Activity(String id, String username, String password,
                    String fullName, String email, String phoneNumber,
                    boolean active, boolean online) {
        super(id, username, password, fullName, email, phoneNumber);
        this.active = active;
        this.online = online;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}