/*หลีกเลี่ยงปัญหา Liskov Substitution Principle (LSP)
โดยในที่นี้สรุปว่าสี่เหลี่ยมจัตุรัสไม่ใช่สี่เหลี่ยมผืนผ้า*/

public class Main {

    private static final int width = 4;
    private static final int height = 5;
    //กำหนดขนาดของด้านของสี่เหลี่ยมจัตุรัส
    private static final int side = 17;
    
    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        //เน้นเลขที่กรอกที่ side
        Rectangle reg2 = new Square(side);
        reg2.setWidth(width);
        reg2.setHeight(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + reg2.getWidth());
        System.out.println("Height = " + reg2.getHeight());
        System.out.println("Area = " + reg2.getArea());
    }
    
}