package com.mobeen;

public class Main {

    public static void main(String[] args) {
    Printer printer = new Printer(4,0,false);

    printer.printPage();
        System.out.println("toner level:" + printer.getTonerLevel());
        printer.printPage();
        System.out.println("toner level:" + printer.getTonerLevel());

        printer.printPage();
        System.out.println("toner level:" + printer.getTonerLevel());

        printer.printPage();
        System.out.println("toner level:" + printer.getTonerLevel());

        printer.printPage();
        System.out.println("toner level:" + printer.getTonerLevel());


        System.out.println("Total number of pages printed:" + printer.getNumberOfPages());
    printer.fillUpToner(printer.getNumberOfPages());
        }
}
