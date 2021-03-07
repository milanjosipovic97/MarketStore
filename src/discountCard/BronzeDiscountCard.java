package discountCard;

import exception.InvalidValue;

public class BronzeDiscountCard extends DiscountCard {

    private static final double initialDiscountRate = 0.0;

    public BronzeDiscountCard(long uid, Customer customer, double previousMonthTurnover) throws InvalidValue {
        super(uid, customer, previousMonthTurnover);
        calculateDiscountRate();
    }

    @Override
    void calculateDiscountRate() {
        double previousMonthTurnover = super.getPreviousMonthTurnover();
        if (previousMonthTurnover < 100)
            super.setDiscountRate(initialDiscountRate);
        else if (previousMonthTurnover < 300)
            super.setDiscountRate(1.0);
        else
            super.setDiscountRate(2.5);
    }
}
