package fdweb.springboot.pojo;

public class operator {
    private int operatorID;

    private String name;

    private String password;

    private String phone;

    private int agentsID;

    private String nickname;

    public int getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(int operatorID) {
        this.operatorID = operatorID;
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

    public int getAgentsID() {
        return agentsID;
    }

    public void setAgentsID(int agentsID) {
        this.agentsID = agentsID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
