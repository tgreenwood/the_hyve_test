package com.thehyve;

import java.io.*;
import java.util.function.Function;

public class BinaryFileUtil {

    public static void printBinaryFromFile(String inputFile, ReadInputNotation notation, String delimiter) {
        Function<Integer, String> convert = switch (notation) {
            case BINARY -> ConverterUtil::convertIntByteToBinaryString;
            case BIN_CHAR -> ConverterUtil::convertIntByteToChar;
            case DECIMAL -> ConverterUtil::convertIntByteToDecimal;
            case HEX -> ConverterUtil::convertIntByteToHexString;
            default -> throw new IllegalArgumentException("Invalid notation value to convert input to");
        };
        var classLoader = BinaryFileUtil.class.getClassLoader();
        try (InputStream bis = new BufferedInputStream(classLoader.getResourceAsStream(inputFile))) {
            int singleByte;
            String singleChar;

            StringBuilder stringBuilder = new StringBuilder();
            while ((singleByte = bis.read()) != -1) {
                stringBuilder.append(convert.apply(singleByte));
                stringBuilder.append(delimiter);
            }
            System.out.print(stringBuilder);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static byte[] readBytesFromFile(String inputFile) {
        var classLoader = BinaryFileUtil.class.getClassLoader();
        try (InputStream bis = new BufferedInputStream(classLoader.getResourceAsStream(inputFile))) {
            return bis.readAllBytes();
        } catch (IOException ex) {
            throw new IllegalArgumentException();
        }
    }

    public static void writeBytesToFile(final String fileName, final byte[] bytes) {
//        File file = new File(fileName);
//        if (file.exists()) {
//            throw new RuntimeException("Files already exists");
//        }
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static enum ReadInputNotation {
        BIN_CHAR,
        BINARY,
        DECIMAL,
        HEX;
    }


}
