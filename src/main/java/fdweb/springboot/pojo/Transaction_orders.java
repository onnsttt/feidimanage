package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "transaction_orders")
public class Transaction_orders {
    @Id
    @Column(name = "orderID")
    private Integer orderid;

    @Column(name = "merchant_ordersID")
    private String merchantOrdersid;

    @Column(name = "operator_nickname")
    private String operatorNickname;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "pay_order")
    private String payOrder;

    @Column(name = "machine_IMEI")
    private String machineImei;

    @Column(name = "meal_name")
    private String mealName;

    @Column(name = "pay_scene")
    private String payScene;

    @Column(name = "meal_money")
    private Float mealMoney;

    @Column(name = "transaction_date")
    private String transactionDate;

    /**
     * @return orderID
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * @return merchant_ordersID
     */
    public String getMerchantOrdersid() {
        return merchantOrdersid;
    }

    /**
     * @param merchantOrdersid
     */
    public void setMerchantOrdersid(String merchantOrdersid) {
        this.merchantOrdersid = merchantOrdersid == null ? null : merchantOrdersid.trim();
    }

    /**
     * @return operator_nickname
     */
    public String getOperatorNickname() {
        return operatorNickname;
    }

    /**
     * @param operatorNickname
     */
    public void setOperatorNickname(String operatorNickname) {
        this.operatorNickname = operatorNickname == null ? null : operatorNickname.trim();
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
     * @return pay_order
     */
    public String getPayOrder() {
        return payOrder;
    }

    /**
     * @param payOrder
     */
    public void setPayOrder(String payOrder) {
        this.payOrder = payOrder == null ? null : payOrder.trim();
    }

    /**
     * @return machine_IMEI
     */
    public String getMachineImei() {
        return machineImei;
    }

    /**
     * @param machineImei
     */
    public void setMachineImei(String machineImei) {
        this.machineImei = machineImei == null ? null : machineImei.trim();
    }

    /**
     * @return meal_name
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * @param mealName
     */
    public void setMealName(String mealName) {
        this.mealName = mealName == null ? null : mealName.trim();
    }

    /**
     * @return pay_scene
     */
    public String getPayScene() {
        return payScene;
    }

    /**
     * @param payScene
     */
    public void setPayScene(String payScene) {
        this.payScene = payScene == null ? null : payScene.trim();
    }

    /**
     * @return meal_money
     */
    public Float getMealMoney() {
        return mealMoney;
    }

    /**
     * @param mealMoney
     */
    public void setMealMoney(Float mealMoney) {
        this.mealMoney = mealMoney;
    }

    /**
     * @return transaction_date
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate == null ? null : transactionDate.trim();
    }
}