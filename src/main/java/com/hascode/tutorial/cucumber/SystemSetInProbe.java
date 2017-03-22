package com.hascode.tutorial.cucumber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemSetInProbe {
    public static void main(String[] args) {
        ByteArrayInputStream hu = new ByteArrayInputStream("проба записи".getBytes()); // String class method getBytes()
        System.setIn(hu); // System class void setIn reassigns the "standard" input stream.
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        byte[] array = new byte[]{'k', 15, 25, 'n', '8', 'Y'};
        System.setIn(new ByteArrayInputStream(array));
        System.out.println(new Scanner(System.in).nextLine());
        array = "еще проба".getBytes();
        System.setIn(new ByteArrayInputStream(array));
        System.out.println(new Scanner(System.in).nextLine());

        SystemSetInProbe printFile = new SystemSetInProbe();
        ArrayList<String> ee = printFile.print(new File("src\\test\\resources\\Probe4.txt"));
        for (String s : ee) {
            System.out.println(s);
        }
        System.out.println(ee.isEmpty());
    }

    ArrayList<String> scannedFromFile = new ArrayList<>();
    int i = 0;

    public ArrayList print(File file) {
        try (FileInputStream fReader = new FileInputStream(file)) {
            System.setIn(fReader);
            Scanner xerox = new Scanner(System.in);
            while (xerox.hasNextLine()) {
                scannedFromFile.add(i, xerox.nextLine());
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return scannedFromFile;
    }
}