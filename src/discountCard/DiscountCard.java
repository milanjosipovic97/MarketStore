package discountCard;

import exception.InvalidValue;
import validation.Validation;

public abstract class DiscountCard implements Validation {

    private long uid;

    private Customer customer;

    private double previousMonthTurnover;

    private double discountRate;

    public DiscountCard(long uid, Customer customer, double previousMonthTurnover) throws InvalidValue {
        if (isValid(previousMonthTurnover, customer)) {
            setUid(uid);
            setCustomer(customer);
            setPreviousMonthTurnover(previousMonthTurnover);
        }
    }

    @Override
    public boolean isValid(double value, Object o) throws InvalidValue {

        if (value < 0)
            throw new InvalidValue("Invalid previous month turnover value.");

        if (o == null)
            throw new NullPointerException("Customer is null.");

        return true;
    }

    public double calculateDiscount(double valueOfPurchase) {
        return valueOfPurchase * (discountRate / 100.00);
    }

    abstract void calculateDiscountRate();

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPreviousMonthTurnover() {
        return previousMonthTurnover;
    }

    public void setPreviousMonthTurnover(double previousMonthTurnover) {
        this.previousMonthTurnover = previousMonthTurnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
