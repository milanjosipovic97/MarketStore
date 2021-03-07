package discountCard;

import exception.InvalidValue;

public class SilverDiscountCard extends DiscountCard {

    private static final double initialDiscountRate = 2.0;

    public SilverDiscountCard(long uid, Customer customer, double previousMonthTurnover) throws InvalidValue {
        super(uid, customer, previousMonthTurnover);
        calculateDiscountRate();
    }

    @Override
    void calculateDiscountRate() {
        double previousMonthTurnover = super.getPreviousMonthTurnover();
        if (previousMonthTurnover > 300)
            super.setDiscountRate(3.5);
        else
            super.setDiscountRate(initialDiscountRate);
    }

}
