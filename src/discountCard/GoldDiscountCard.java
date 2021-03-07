package discountCard;

import exception.InvalidValue;

public class GoldDiscountCard extends DiscountCard {

    private static final double initialDiscountRate = 2.0;

    public GoldDiscountCard(long uid, Customer customer, double previousMonthTurnover) throws InvalidValue {
        super(uid, customer, previousMonthTurnover);
        calculateDiscountRate();
    }

    @Override
    void calculateDiscountRate() {
        double previousMonthTurnover = super.getPreviousMonthTurnover();
        int growthRate = previousMonthTurnover > 800 ? 8 : (int) previousMonthTurnover / 100;
        super.setDiscountRate(initialDiscountRate + growthRate);
    }


}
