package fdweb.springboot.pojo;

public class Card {

    private String number;

    private float money;

    private int id;

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", money=" + money +
                ", id=" + id +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
