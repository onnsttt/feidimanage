package fdweb.springboot.pojo;

public class transaction_orders {

    private int orderID;

    private String merchant_ordersID;

    private String operator_nickname;

    private String user_phone;

    private String pay_order;

    private String machine_IMEI;

    private String meal_name;

    private String pay_scene;

    private float meal_money;

    private String tansaction_date;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getMerchant_ordersID() {
        return merchant_ordersID;
    }

    public void setMerchant_ordersID(String merchant_ordersID) {
        this.merchant_ordersID = merchant_ordersID;
    }

    public String getOperator_nickname() {
        return operator_nickname;
    }

    public void setOperator_nickname(String operator_nickname) {
        this.operator_nickname = operator_nickname;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getPay_order() {
        return pay_order;
    }

    public void setPay_order(String pay_order) {
        this.pay_order = pay_order;
    }

    public String getMachine_IMEI() {
        return machine_IMEI;
    }

    public void setMachine_IMEI(String machine_IMEI) {
        this.machine_IMEI = machine_IMEI;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public String getPay_scene() {
        return pay_scene;
    }

    public void setPay_scene(String pay_scene) {
        this.pay_scene = pay_scene;
    }

    public float getMeal_money() {
        return meal_money;
    }

    public void setMeal_money(float meal_money) {
        this.meal_money = meal_money;
    }

    public String getTansaction_date() {
        return tansaction_date;
    }

    public void setTansaction_date(String tansaction_date) {
        this.tansaction_date = tansaction_date;
    }
}
