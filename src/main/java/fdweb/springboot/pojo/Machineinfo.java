package fdweb.springboot.pojo;

public class Machineinfo {

    private int machineID;

    private String IMEI;

    private String state;

    private String water;//机器剩余水量

    private String foam; //机器剩余泡沫

    private int operatorID;;

    private int handel;

    private String Online;

    @Override
    public String toString() {
        return "Machineinfo{" +
                "machineID=" + machineID +
                ", IMEI='" + IMEI + '\'' +
                ", state='" + state + '\'' +
                ", water='" + water + '\'' +
                ", foam='" + foam + '\'' +
                ", operatorID=" + operatorID +
                ", handel=" + handel +
                ", Online='" + Online + '\'' +
                '}';
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFoam() {
        return foam;
    }

    public void setFoam(String foam) {
        this.foam = foam;
    }

    public int getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(int operatorID) {
        this.operatorID = operatorID;
    }

    public int getHandel() {
        return handel;
    }

    public void setHandel(int handel) {
        this.handel = handel;
    }

    public String getOnline() {
        return Online;
    }

    public void setOnline(String online) {
        Online = online;
    }
}
