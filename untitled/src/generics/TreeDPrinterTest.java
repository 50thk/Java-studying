package generics;

public class TreeDPrinterTest {

    public static void main(String[] args) {

        TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        TreeDPrinter<Plastic> printerPla = new TreeDPrinter<Plastic>();
        printerPla.setMaterial(new Plastic());
        Plastic plastic = printerPla.getMaterial();
        System.out.println(printerPla);

        // TreeDPrinter<Water> printerW = new TreeDPrinter<Water>();

        printerPla.printing();
    }
}
