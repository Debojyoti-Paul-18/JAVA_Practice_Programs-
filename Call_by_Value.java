public class Call_by_Value {
    public static void modify(int num) {
        num = num + 10;
        System.out.println("Inside method: num = " + num);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before method: x = " + x);
        modify(x);
        System.out.println("After method: x = " + x);
    }
}
