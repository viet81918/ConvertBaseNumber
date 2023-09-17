package view;

import controller.Convert;
import java.util.Scanner;
import model.Element;

public class Caculate extends Menu<String> {

    public static Scanner sc = new Scanner(System.in);
    static String[] mc = {"Binary", "Heximal", "Decimal", "Exit"};
    protected Convert convert;

    public Caculate() {
        super("CONVERT", mc);
        convert = new Convert();
    }

    @Override
    public void execute(String n) {
        switch (n) {
            case "1" ->
                convertBIN();
            case "2" ->
                convertHEX();
            case "3" ->
                convertDEC();
            case "4" ->
                System.exit(0);
        }
    }

    public void convertBIN() {
        final String[] mcOutPut = {"Heximal", "Deximal", "Exit"};
        class ConvertMenu extends Menu<String> {

            public ConvertMenu() {
                super("Output Option", mcOutPut);
            }

            @Override
            public synchronized void execute(String n) {

                switch (n) {
                    case "1":
                        System.out.println("Nhap so muon chuyen doi :");
                        String i = sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" + convert.binaryToHex(i));
                        break;
                    case "2":
                        System.out.println("Nhap so muon chuyen doi :");
                        int j = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" + convert.binaryToDecimalInteger(j));
                        break;
                    case "3":
                        break;

                }
            }
        }
        ConvertMenu sm = new ConvertMenu();
        sm.run();
    }
    public void convertHEX() {
        final String[] mcOutPut = {"Binary", "Deximal", "Exit"};
        class ConvertMenu extends Menu<String> {

            public ConvertMenu() {
                super("Output Option", mcOutPut);
            }

            @Override
            public synchronized void execute(String n) {
                switch (n) {
                    case "1":
                        System.out.println("Nhap so muon chuyen doi :");
                        String i = sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" +   convert.hexToBinaryInteger(i));
                        break;
                    case "2":
                        System.out.println("Nhap so muon chuyen doi :");
                        i = sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" + convert.hexToDecimal(i));
                        break;
                    case "3":
                        break;

                }
            }
        }
        ConvertMenu sm = new ConvertMenu();
        sm.run();
    }
    public void convertDEC() {
        final String[] mcOutPut = {"Binary", "Heximal", "Exit"};
        class ConvertMenu extends Menu<String> {

            public ConvertMenu() {
                super("Output Option", mcOutPut);
            }

            @Override
            public synchronized void execute(String n) {
                switch (n) {
                    case "1":
                        System.out.println("Nhap so muon chuyen doi :");
                        int i = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" + convert.decimalToBinaryInteger(i));
                        break;
                    case "2":
                        System.out.println("Nhap so muon chuyen doi :");
                        i = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Sau khi chuyen doi :" + convert.decimalToHeximalInteger(i));
                        break;
                    case "3":
                        break;

                }
            }
        }
        ConvertMenu sm = new ConvertMenu();
        sm.run();
    }

}
