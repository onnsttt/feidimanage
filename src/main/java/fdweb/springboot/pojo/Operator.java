package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "operator")
public class Operator {
    @Id
    @Column(name = "operatorID")
    private Integer operatorid;

    private String name;

    private String password;

    private String phone;

    @Column(name = "agentsID")
    private Integer agentsid;

    private String nickname;

    /**
     * @return operatorID
     */
    public Integer getOperatorid() {
        return operatorid;
    }

    /**
     * @param operatorid
     */
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @return agentsID
     */
    public Integer getAgentsid() {
        return agentsid;
    }

    /**
     * @param agentsid
     */
    public void setAgentsid(Integer agentsid) {
        this.agentsid = agentsid;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}