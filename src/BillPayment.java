

public class BillPayment {
    public static void main(String[] args) {
        double pizza, momo, tea, vat, sub_total, total_vat, grant_total;
        pizza = 200;
        momo = 100;
        tea = 20;
        vat = 0.13;
        sub_total = pizza + momo + tea;
        total_vat = sub_total * vat;
        grant_total = sub_total + total_vat;


        System.out.printf("Your final bill amount is %f", grant_total);
    }
}
