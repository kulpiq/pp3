public class RcetTest {
    public static void main(String[] args){
        Rectangles r1 = new Rectangles();
        Rectangles r2 = new Rectangles();
        r1.a = 3;
        r1.b = 4;
        r2.a = 2;
        r2.b = 7;

        System.out.printf("peirimeter: "+ r1.peirimeter()+"\n");
        System.out.printf("Area: " + r1.area()+"\n");
        System.out.printf("peirimeter: "+ r2.peirimeter()+"\n");
        System.out.printf("Area: " + r2.area()+"\n");
    }
}
