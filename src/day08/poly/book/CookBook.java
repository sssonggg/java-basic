package day08.poly.book;

public class CookBook extends Book{

    private boolean coupon;  // 요리학원 쿠폰유무

    public CookBook(boolean coupon) {
    }

    public CookBook(String title, String author, String publicher, boolean coupon) {
        super(title, author, publicher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {   // 불린타입 get에는 is를 붙임
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("# 분류 : 요리책, %s, 쿠폰유무 : %s", super.info(), coupon? "있음": "없음");

    }
}
