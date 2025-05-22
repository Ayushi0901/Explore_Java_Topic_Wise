package Method;

public class StaticMethod {
    int stockPrice=10;
    static int price=200;
    public static void main(String[] args) {
        price=220;
//        stockPrice //can't access as it is non static
    }
}
