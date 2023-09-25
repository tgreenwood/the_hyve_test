package com.thehyve;

import java.util.Arrays;

final public class ConverterUtil {

    public static final int HEX_BASE = 16;
    public static final String SPACE_DELIMITER = " ";
    public static final String EMPTY_STRING = "";

    private ConverterUtil() {
    }

    public static Integer convertHexToInt(String hex) {
        return Integer.parseInt(hex, HEX_BASE);
    }

    public static char convertByteToChar(byte value) {
        return (char) value;
    }

    public static String convertByteToString(byte value) {
        return Byte.toString(value);
    }

    public static String convertIntByteToChar(int value) {
        return String.valueOf((char) value);
    }

    public static String convertIntByteToHexString(int value) {
        return Integer.toHexString(value);
    }

    public static String convertIntByteToDecimal(int value) {
        return Integer.toString(value);
    }

    public static String convertIntByteToBinaryString(int value) {
        return Integer.toBinaryString(value);
    }

    public static Integer[] convertStringOfHexToInt(String arrayOfHexAsStr) {
        var arrayOfHex = arrayOfHexAsStr.split(SPACE_DELIMITER);
        return convertArrayOfHexToInt(arrayOfHex);
    }

    public static Integer[] convertArrayOfHexToInt(String[] arrayOfHex) {
        return Arrays.stream(arrayOfHex)
                .mapToInt(ConverterUtil::convertHexToInt)
                .boxed()
                .toArray(Integer[]::new);
    }

    public static String[] convertArrayOfDecToHex(Integer[] arrayOfDec) {
        return Arrays.stream(arrayOfDec)
                .map(Integer::toHexString)
                .toArray(String[]::new);
    }

    public static void printArray(Object[] array) {
        var arrayAsString = Arrays.toString(array);
        System.out.println(arrayAsString);
    }

}
