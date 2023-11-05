public class strings {
    void concatenate(String n, String r) {
        System.out.println(n.concat(" ").concat(r));
    }

    void displayChar(String n) {
        System.out.println("The fifth character of your name is: " + n.charAt(4));
        System.out.println("The fifteenth character of your name is: " + n.charAt(14));
    }

    void displayLength(String n) {
        int i = n.length();
        System.out.println("The length of your name is: " + i);
    }

    void displaySeperate(String n, String r) {
        int i = n.indexOf(" ");
        String str = n.substring(i + 1, n.length());
        System.out.print(str + " ");
        System.out.println(r);
    }

    boolean checkCapital(String n) {
        if (n.contains("KRISHNAKANT")) {
            return true;
        }
        return false;
    }

    String displayDOB(String dob) {
        String str=dob.join("/","30","12","2002");
        return str;
    }

    void concatenateAll(String n, String r, String d) {
        String str = n.concat(" ").concat(r).concat(" ").concat(d);
        System.out.println(str);
    }

    void printWithoutSpace(String n, String r, String d) {
        n = n.trim();
        String str1 = n.concat(r);
        String str2 = r.concat(d);
        System.out.println(str1.trim());
        System.out.println(str2.trim());
    }

    public static void main(String[] args) {
        String name = "Krishnakant Verma";
        int roll_No = 2102033;
        String roll=String.valueOf(roll_No);
        String dob="30122002";
        strings obj = new strings();
        obj.concatenate(name, roll);
        obj.displayChar(name);
        obj.displayLength(name);
        obj.displaySeperate(name, roll);
        System.out.println(obj.checkCapital(name));
        String s = obj.displayDOB(dob);
        System.out.println(s);
        obj.concatenateAll(name, roll, s);
        obj.printWithoutSpace(name, roll, s);
    }
}