package com.thehyve;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryProcessingUtil.processAndPrint("input.bin", b -> b);
        BinaryProcessingUtil.processAndPrint("out.bin", b -> b);
//        var bytes = BinaryFileUtil.readBytesFromFile("input.bin");
//        BinaryFileUtil.writeBytesToFile("out.bin", bytes);
//        try {
//            var bytes = ByteStreams.toByteArray(System.in);
//            System.out.println("Array size: " + bytes.length);
//            for (byte aByte : bytes) {
//                System.out.print(aByte + " ");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        BinaryInputUtil.printBinaryFromFile("input.bin", BinaryInputUtil.ReadInputNotation.HEX, " ");
//        System.out.println();
//        BinaryInputUtil.printBinaryFromFile("input.bin", BinaryInputUtil.ReadInputNotation.DECIMAL, " ");
    }

}