package com.mobeen;

/**
 * Created by Mobeen on 2/12/2017.
 */
public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPages, boolean duplexPrinter) {
        if(tonerLevel >=0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPages = numberOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillUpToner(int inkAmount){

        if(inkAmount>0 && inkAmount<=100 && tonerLevel <100 && tonerLevel +inkAmount<=100) {
            tonerLevel += inkAmount;
            System.out.println("Toner level filled up to:" + tonerLevel);
        }else{
            System.out.println("unable to fill tonerLevel");
        }
    }

    public void printPage() {
        if (tonerLevel > 0) {
            System.out.println("Page printed");

            if (duplexPrinter) {
                numberOfPages += 2;
                tonerLevel -= 2;

            } else {
                numberOfPages++;
                tonerLevel--;
            }


        } else {
            System.out.println("toner is empty");
        }
    }

}
