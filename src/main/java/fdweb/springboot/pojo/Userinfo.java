package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "userinfo")
public class Userinfo {
    @Id
    private String phone;

    private String password;

    private Float money;

    private String state;

    @Column(name = "recommend_phone")
    private String recommendPhone;

    @Column(name = "recommend_num")
    private Integer recommendNum;

    private Integer machineinfo;

    private String openid;

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return money
     */
    public Float getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return recommend_phone
     */
    public String getRecommendPhone() {
        return recommendPhone;
    }

    /**
     * @param recommendPhone
     */
    public void setRecommendPhone(String recommendPhone) {
        this.recommendPhone = recommendPhone == null ? null : recommendPhone.trim();
    }

    /**
     * @return recommend_num
     */
    public Integer getRecommendNum() {
        return recommendNum;
    }

    /**
     * @param recommendNum
     */
    public void setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
    }

    /**
     * @return machineinfo
     */
    public Integer getMachineinfo() {
        return machineinfo;
    }

    /**
     * @param machineinfo
     */
    public void setMachineinfo(Integer machineinfo) {
        this.machineinfo = machineinfo;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}