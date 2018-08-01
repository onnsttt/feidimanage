package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "agents")
public class Agents {
    @Id
    @Column(name = "agentsID")
    private Integer agentsid;

    private String name;

    private String password;

    private String phone;

    private Integer father;

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
     * @return father
     */
    public Integer getFather() {
        return father;
    }

    /**
     * @param father
     */
    public void setFather(Integer father) {
        this.father = father;
    }
}