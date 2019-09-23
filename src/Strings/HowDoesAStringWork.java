package Strings;

public class HowDoesAStringWork {
    public static void main(String[] args) {
        int three = 3;
        String four = "4";
        System.out.println(1+2+three+four);

        System.out.println("- - - - - - ");

        String s = "1";
        s += "2";
        System.out.println(s);
        s += 3;
        System.out.println(s);

        System.out.println("- - - - - - ");

        String s1 = "1";
        s1.concat("2");
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        System.out.println("- - - - - - ");

        String name = "Lihle Kula";
        String surname = new String("Lihle KULA");
        System.out.println(name + " " + "is not the same as" + " " + surname);



    }
}
