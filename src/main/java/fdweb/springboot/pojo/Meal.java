package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "meal")
public class Meal {
    @Id
    @Column(name = "mealId")
    private Integer mealid;

    private Float money;

    private Integer time;

    @Column(name = "operatorId")
    private Integer operatorid;

    private String name;

    /**
     * @return mealId
     */
    public Integer getMealid() {
        return mealid;
    }

    /**
     * @param mealid
     */
    public void setMealid(Integer mealid) {
        this.mealid = mealid;
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
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * @return operatorId
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
}