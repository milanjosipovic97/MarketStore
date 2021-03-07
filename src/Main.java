import discountCard.*;
import exception.InvalidValue;

public class Main {

    public static void main(String[] args) throws InvalidValue {

        DiscountCard bronzeDiscountCard = new BronzeDiscountCard(1, new Customer(), 0.00);
        Purchase purchaseWithBronzeDC = new Purchase(150.00, bronzeDiscountCard);
        System.out.println(printOutput(purchaseWithBronzeDC));

        DiscountCard silverDiscountCard = new SilverDiscountCard(2, new Customer(), 600.00);
        Purchase purchaseWithSilverDC = new Purchase(850.00, silverDiscountCard);
        System.out.println(printOutput(purchaseWithSilverDC));

        DiscountCard goldDiscountCard = new GoldDiscountCard(3, new Customer(), 1500.00);
        Purchase purchaseWithGoldDC = new Purchase(1300.00, goldDiscountCard);
        System.out.println(printOutput(purchaseWithGoldDC));

    }

    public static String printOutput(Purchase purchase) {
        return "Purchase value: $" + purchase.getPurchaseValue() + '\n' +
                "Discount card type: " + purchase.getDiscountCard().getClass().getSimpleName() + '\n' +
                "Previous month turnover: $" + purchase.getDiscountCard().getPreviousMonthTurnover() + '\n' +
                "Discount rate: " + purchase.getDiscountCard().getDiscountRate() + "% \n" +
                "Discount: $" + purchase.getDiscount() + '\n' +
                "Total: $" + purchase.getTotalValue() + "\n-------------------------";
    }

}
