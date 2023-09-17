
package model;
public class Element {
    private int decimal;
    private int binary;
    private int hexadecimal;

    public Element() {
    }
   
    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public int getBinary() {
        return binary;
    }

    public void setBinary(int binary) {
        this.binary = binary;
    }

    public int getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(int hexadecimal) {
        this.hexadecimal = hexadecimal;
    }
}
