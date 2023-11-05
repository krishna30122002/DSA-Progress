import java.util.*;

class customer {
    private int customerId;

    public customer(int custID) {
        customerId =custID;
    }

    void show() {
        System.out.println("Customer ID: " + customerId);
    }
}

class regular extends customer {
    private int discount;

    regular(int custID,int dis) {
       super(custID);
        discount = dis;
    }

    void show() {
        super.show();
        System.out.println("Discount: " + discount);
    }
}

class privilaged extends customer {
    private String str;

    privilaged(int custID,String s) {
        super(custID);
        str = s;
    }

    void show() {
        super.show();
        System.out.println("Membership Type: " + str);
    }
}

class retail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Type");
        String membership = sc.next();
        customer obj;
                if (membership.equalsIgnoreCase("regular")) {
            obj = new regular(2001,20);
            obj.show();
        } else if(membership.equalsIgnoreCase("privilaged")) {
            obj = new privilaged(1001,"Gold");
            obj.show();
        }
        sc.close();
    }
}