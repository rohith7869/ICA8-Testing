package org.example;

import java.io.*;
import java.util.Scanner;

/**
 * @author Rohith Bellapu
 */
public class urinals {

    public String[] openFile() throws IOException {
        File file = new File("/Users/rohithreddy/Downloads/urinal.dat");
        Scanner sc = new Scanner(file);
        File fileCount = new File("/Users/rohithreddy/Downloads/urinal.dat");
        int lines = 0;
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(fileCount))) {

            while (lnr.readLine() != null) {
            }

            lines = lnr.getLineNumber();

        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        String[] fileElements = new String[lines];
        while (sc.hasNextLine()) {
            fileElements[i] = sc.nextLine();
            i++;
        }
        return fileElements;
    }


    public void getString() throws IOException {
        String[] elements = openFile();
        File f=new File("/Users/rohithreddy/Downloads/rule.txt");
        FileWriter fw=new FileWriter(f);
        for (int i = 0; i < elements.length; i++) {
            int result=countUrinals(elements[i]);
            fw.write(String.valueOf(result));
            System.out.println(result);
            fw.write("\n");
        }
        fw.flush();
        fw.close();
    }

    public int countUrinals(String str) {
        int count = 0;
        if (hasAlternateChars(str)) {
            int length = str.length();
            for (int i = 0; i < length - 1; i++) {
                if (str.charAt(i) == '0') {
                    if (i == 0 && str.charAt(i + 1) == '0') {
                        count++;
                        str = str.substring(0, i) + '1'
                                + str.substring(i + 1);

                    } else if (i > 0) {
                        if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                            count++;
                            str = str.substring(0, i) + '1'
                                    + str.substring(i + 1);

                        }

                    }
                }
            }
            if (str.charAt(length - 1) == '0' && str.charAt(length - 2) == '0') {
                count++;
                str = str.substring(0, length - 1) + '1'
                        + str.substring(length);
            }
        } else {
            count = -1;
        }
        return count;
    }

    public boolean hasAlternateChars(String str) {

        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length - 1; i++) {

                if (i == 0) {
                    if (str.charAt(0) == '1' && str.charAt(1) == '1') {
                        return false;
                    }
                } else {
                    if (str.charAt(i) == '1') {
                        if (str.charAt(i - 1) == '1' || str.charAt(i + 1) == '1') {
                            return false;
                        }

                    }
                }

            }
            return str.charAt(length - 1) != '1' || str.charAt(length - 2) != '1';
        }
        return true;
    }

    public static void main(String[] args) throws NullPointerException, IOException {
        urinals urinal = new urinals();
        urinal.getString();
    }


}