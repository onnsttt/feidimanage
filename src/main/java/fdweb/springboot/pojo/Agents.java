package fdweb.springboot.pojo;

public class Agents {

    private int agentsID;

    private String name;

    private String password;

    private String phone;

    private int father;

    @Override
    public String toString() {
        return "Agents{" +
                "agentsID=" + agentsID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", father=" + father +
                '}';
    }

    public int getAgentsID() {
        return agentsID;
    }

    public void setAgentsID(int agentsID) {
        this.agentsID = agentsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }
}
