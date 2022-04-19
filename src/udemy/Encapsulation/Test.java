package udemy.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Printer printer = new Printer(100,true);
        System.out.println(printer.addToner(7));
        System.out.println("Initial page count ="+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPagesPrinted());
    }
}
