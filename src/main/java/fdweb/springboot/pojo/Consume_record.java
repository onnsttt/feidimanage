package fdweb.springboot.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

@Table(name = "consume_record")
public class Consume_record {
    /**
     * 消费记录ID
     */
    @Id
    @Column(name = "consume_id")
    private Integer consumeId;

    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 消费金额
     */
    @Column(name = "consume_money")
    private Float consumeMoney;

    /**
     * 消费时长
     */
    @Column(name = "consume_time")
    private String consumeTime;

    /**
     * 消费发生时间
     */
    @Column(name = "transaction_date")
    private String transactionDate;

    @Column(name = "machine_id")
    private Integer machineId;

    /**
     * 消费清水金额
     */
    @Column(name = "consume_water_money")
    private Float consumeWaterMoney;

    /**
     * 消费泡沫金额
     */
    @Column(name = "consume_pm_money")
    private Float consumePmMoney;

    /**
     * 获取消费记录ID
     *
     * @return consume_id - 消费记录ID
     */
    public Integer getConsumeId() {
        return consumeId;
    }

    /**
     * 设置消费记录ID
     *
     * @param consumeId 消费记录ID
     */
    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    /**
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取消费金额
     *
     * @return consume_money - 消费金额
     */
    public Float getConsumeMoney() {
        return consumeMoney;
    }

    /**
     * 设置消费金额
     *
     * @param consumeMoney 消费金额
     */
    public void setConsumeMoney(Float consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    /**
     * 获取消费时长
     *
     * @return consume_time - 消费时长
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    /**
     * 设置消费时长
     *
     * @param consumeTime 消费时长
     */
    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime == null ? null : consumeTime.trim();
    }

    /**
     * 获取消费发生时间
     *
     * @return transaction_date - 消费发生时间
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * 设置消费发生时间
     *
     * @param transactionDate 消费发生时间
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate == null ? null : transactionDate.trim();
    }

    /**
     * @return machine_id
     */
    public Integer getMachineId() {
        return machineId;
    }

    /**
     * @param machineId
     */
    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    /**
     * 获取消费清水金额
     *
     * @return consume_water_money - 消费清水金额
     */
    public Float getConsumeWaterMoney() {
        return consumeWaterMoney;
    }

    /**
     * 设置消费清水金额
     *
     * @param consumeWaterMoney 消费清水金额
     */
    public void setConsumeWaterMoney(Float consumeWaterMoney) {
        this.consumeWaterMoney = consumeWaterMoney;
    }

    /**
     * 获取消费泡沫金额
     *
     * @return consume_pm_money - 消费泡沫金额
     */
    public Float getConsumePmMoney() {
        return consumePmMoney;
    }

    /**
     * 设置消费泡沫金额
     *
     * @param consumePmMoney 消费泡沫金额
     */
    public void setConsumePmMoney(Float consumePmMoney) {
        this.consumePmMoney = consumePmMoney;
    }

    @Override
    public String toString() {
        return "Consume_record{" +
                "consumeId=" + consumeId +
                ", userPhone='" + userPhone + '\'' +
                ", consumeMoney=" + consumeMoney +
                ", consumeTime='" + consumeTime + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", machineId=" + machineId +
                ", consumeWaterMoney=" + consumeWaterMoney +
                ", consumePmMoney=" + consumePmMoney +
                '}';
    }
}