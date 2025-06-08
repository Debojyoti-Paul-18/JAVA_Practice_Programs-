class Number {
    int value;
}

public class Call_by_Reference {
    public static void modify(Number num) {
        num.value = num.value + 10;
        System.out.println("Inside method: value = " + num.value);
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.value = 5;
        System.out.println("Before method: value = " + obj.value);
        modify(obj);
        System.out.println("After method: value = " + obj.value);
    }
}
