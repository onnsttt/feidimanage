package fdweb.springboot.pojo;

public class userinfo {
    private String phone;

    private String password;

    private float money;

    private boolean state;

    private String recommend_phone;

    private int recommmend_num;

    private int machineinfo;

    private String openid;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getRecommend_phone() {
        return recommend_phone;
    }

    public void setRecommend_phone(String recommend_phone) {
        this.recommend_phone = recommend_phone;
    }

    public int getRecommmend_num() {
        return recommmend_num;
    }

    public void setRecommmend_num(int recommmend_num) {
        this.recommmend_num = recommmend_num;
    }

    public int getMachineinfo() {
        return machineinfo;
    }

    public void setMachineinfo(int machineinfo) {
        this.machineinfo = machineinfo;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
