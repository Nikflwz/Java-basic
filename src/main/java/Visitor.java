public class Visitor {
    private static int totalVisitors = 0;

    public Visitor() {
        totalVisitors++;
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        Visitor v1 = new Visitor();
        System.out.println("После 1-го посетителя: " + Visitor.getTotalVisitors());

        Visitor v2 = new Visitor();
        System.out.println("После 2-го посетителя: " + Visitor.getTotalVisitors());

        Visitor v3 = new Visitor();
        System.out.println("После 3-го посетителя: " + Visitor.getTotalVisitors());

        Visitor v4 = new Visitor();
        System.out.println("После 4-го посетителя: " + Visitor.getTotalVisitors());

        Visitor v5 = new Visitor();
        System.out.println("После 5-го посетителя: " + Visitor.getTotalVisitors());
    }

}
