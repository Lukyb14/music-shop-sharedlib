package at.fhv.teame.sharedlib.dto;

public class ShoppingCartItemDTO {

    private final String articleId;
    private final int amount;

    public ShoppingCartItemDTO(String articleId, int amount) {
        this.articleId = articleId;
        this.amount = amount;
    }

    public String getArticleId() {
        return articleId;
    }

    public int getAmount() {
        return amount;
    }
}
