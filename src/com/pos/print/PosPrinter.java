package com.pos.print;

/**
 * Created by alexandrenguyen on 04/12/14.
 */
public class PosPrinter {

    private String toPrint;

    public void PosPrinter(String _toPrint) {

        this.toPrint = _toPrint;
    }

    public String getToPrint() {
        return toPrint;
    }

    public void setToPrint(String toPrint) {
        this.toPrint = toPrint;
    }

}
