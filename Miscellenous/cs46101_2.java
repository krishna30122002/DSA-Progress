class cs46101_2 {
    final void show() {
        System.out.println("Programming is Good for Learning");
    }
}

class demo extends cs46101_2 {
    void show() {
        System.out.println("Playing Outside games is Good for Health");
    }
    //extended method
    // void show1() {
    //     System.out.println("Playing Outside games is Good for Health");
    // }
}

class Test {
    public static void main(String[] args) {
        cs46101_1 obj1 = new cs46101_1();
        demo obj2 = new demo();

obj2.show();
    }
}
//method can be inherited but not extended