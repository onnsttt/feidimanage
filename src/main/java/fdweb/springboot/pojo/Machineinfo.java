package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "machineinfo")
public class Machineinfo {
    @Id
    @Column(name = "machineID")
    private Integer machineid;

    @Column(name = "IMEI")
    private String imei;

    private String state;

    private String water;

    private String foam;

    @Column(name = "operatorID")
    private Integer operatorid;

    private Integer handel;

    @Column(name = "Online")
    private String online;

    /**
     * @return machineID
     */
    public Integer getMachineid() {
        return machineid;
    }

    /**
     * @param machineid
     */
    public void setMachineid(Integer machineid) {
        this.machineid = machineid;
    }

    /**
     * @return IMEI
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
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
     * @return water
     */
    public String getWater() {
        return water;
    }

    /**
     * @param water
     */
    public void setWater(String water) {
        this.water = water == null ? null : water.trim();
    }

    /**
     * @return foam
     */
    public String getFoam() {
        return foam;
    }

    /**
     * @param foam
     */
    public void setFoam(String foam) {
        this.foam = foam == null ? null : foam.trim();
    }

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
     * @return handel
     */
    public Integer getHandel() {
        return handel;
    }

    /**
     * @param handel
     */
    public void setHandel(Integer handel) {
        this.handel = handel;
    }

    /**
     * @return Online
     */
    public String getOnline() {
        return online;
    }

    /**
     * @param online
     */
    public void setOnline(String online) {
        this.online = online == null ? null : online.trim();
    }
}