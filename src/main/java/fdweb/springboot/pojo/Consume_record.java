package fdweb.springboot.pojo;

public class Consume_record {
    private int consume_id;

    private String user_phone;

    private float consume_money;

    private String cousume_time;

    private String transaction_date;

    private int machine_id;

    private float cousume_water_money;

    private float consume_pm_money;

    @Override
    public String toString() {
        return "Consume_record{" +
                "consume_id=" + consume_id +
                ", user_phone='" + user_phone + '\'' +
                ", consume_money=" + consume_money +
                ", cousume_time='" + cousume_time + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                ", machine_id=" + machine_id +
                ", cousume_water_money=" + cousume_water_money +
                ", consume_pm_money=" + consume_pm_money +
                '}';
    }

    public int getConsume_id() {
        return consume_id;
    }

    public void setConsume_id(int consume_id) {
        this.consume_id = consume_id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public float getConsume_money() {
        return consume_money;
    }

    public void setConsume_money(float consume_money) {
        this.consume_money = consume_money;
    }

    public String getCousume_time() {
        return cousume_time;
    }

    public void setCousume_time(String cousume_time) {
        this.cousume_time = cousume_time;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public int getMachine_id() {
        return machine_id;
    }

    public void setMachine_id(int machine_id) {
        this.machine_id = machine_id;
    }

    public float getCousume_water_money() {
        return cousume_water_money;
    }

    public void setCousume_water_money(float cousume_water_money) {
        this.cousume_water_money = cousume_water_money;
    }

    public float getConsume_pm_money() {
        return consume_pm_money;
    }

    public void setConsume_pm_money(float consume_pm_money) {
        this.consume_pm_money = consume_pm_money;
    }
}
