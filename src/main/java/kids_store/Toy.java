package kids_store;

/**
 * Игрушка
 */

import java.util.InputMismatchException;

public class Toy {

    private String article;
    private String toy_name;
    private Integer quantity;
    private Integer frequency;

    public Toy(String article, String toy_name, Integer quantity, Integer frequency) {
        this.article = article;
        this.toy_name = toy_name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public String getArticle() {
        return article;
    }

    public String getToy_name() {
        return toy_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getFrequency() {
        return frequency;
    }


    public void setArticle(String article) {
        this.article = article;
    }

    public void setToy_name(String toy_name) {
        this.toy_name = toy_name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @param frequency
     * @throws InputMismatchException
     */

    public void setFrequency(Integer frequency) throws InputMismatchException {

        if (frequency > 0 & frequency < 100) {
            this.frequency = frequency; // от 0 до 100%
        }
        else {
            throw new InputMismatchException("процент выпадения должен быть от 0 до 100%");
        }

    }


}
