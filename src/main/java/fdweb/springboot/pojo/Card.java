package fdweb.springboot.pojo;

import javax.persistence.*;

@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String number;

    private Float money;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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
}