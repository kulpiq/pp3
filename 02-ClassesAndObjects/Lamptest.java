public class Lamptest {
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        l1.switchon();
        l2.switchoff();
        System.out.println("Lamp status: " + l1.iso());
        System.out.println("Lamp status: " + l2.iso());

    }
}
