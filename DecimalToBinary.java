////////////////////////////////////////////////////////////
//
//  Zhenia Steger
//  Palomar College
//  Simple program that converts a decimal number to binary.
//  Input: A Decimal Number
//  Output: A Binary String
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int decimal = console.nextInt();
        StringBuilder binary = new StringBuilder();
        do {
            binary.insert(0, dec % 2);
            dec /= 2;
        } while (dec != 0);
        System.out.println(binary.toString());
    }
}
