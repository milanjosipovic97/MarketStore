import discountCard.DiscountCard;
import exception.InvalidValue;
import validation.Validation;


public class Purchase implements Validation {

    private double purchaseValue;

    private DiscountCard discountCard;

    private double discount;

    private double totalValue;

    public Purchase(double purchaseValue, DiscountCard discountCard) throws InvalidValue {
        if (isValid(purchaseValue, discountCard)) {
            setPurchaseValue(purchaseValue);
            setDiscountCard(discountCard);
            setDiscount();
            setTotalValue();
        }
    }

    @Override
    public boolean isValid(double value, Object o) throws InvalidValue {

        if (value < 0)
            throw new InvalidValue("Invalid purchase value.");

        if (o == null)
            throw new NullPointerException("Discount card is null.");

        return true;
    }

    private void setDiscount() {
        this.discount = discountCard.calculateDiscount(purchaseValue);
    }

    private void setTotalValue() {
        this.totalValue = purchaseValue - discount;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public double getDiscount() {
        return discount;
    }

}
