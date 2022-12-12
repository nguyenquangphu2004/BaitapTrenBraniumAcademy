package BaiTapInterFace.Bai5;

public class Activity extends Account{
    private boolean online;
    private boolean activate;

    public Activity(String user, String passWord, boolean online, boolean activate) {
        super(user, passWord);
        this.online = online;
        this.activate = activate;
    }

    public Activity() {
        super();
    }


    public Activity(boolean online, boolean activate) {
        this.online = online;
        this.activate = activate;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}

























