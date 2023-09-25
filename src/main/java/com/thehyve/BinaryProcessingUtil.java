package com.thehyve;

import java.util.Arrays;
import java.util.function.Function;

public class BinaryProcessingUtil {

    public static void processAndPrint(final String inputFile, Function<Byte, Byte> processor) {
        byte[] inputBytes = BinaryFileUtil.readBytesFromFile(inputFile);
        System.out.println("Before processing: " + Arrays.toString(inputBytes));
        byte[] processedBytes = new byte[inputBytes.length];
        for (int i = 0; i < inputBytes.length; i++) {
            processedBytes[i] = processor.apply(inputBytes[i]);
        }
        System.out.println("After processing: " + Arrays.toString(processedBytes));
    }


}
