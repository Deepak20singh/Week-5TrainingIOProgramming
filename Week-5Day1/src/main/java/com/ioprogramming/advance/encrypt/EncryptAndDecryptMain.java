package com.ioprogramming.advance.encrypt;

import static com.ioprogramming.advance.encrypt.EncryptAndDecrypt.*;

public class EncryptAndDecryptMain {
    public static void main(String[] args) {
        String inputCsv = "src/main/java/com/ioprogramming/advance/encrypt/data.csv";         // Original CSV file
        String encryptedCsv = "src/main/java/com/ioprogramming/advance/encrypt/dataencrypt.csv"; // Encrypted CSV file
        String decryptedCsv = "src/main/java/com/ioprogramming/advance/encrypt/datadecrypt.csv"; // Decrypted CSV file

        writeEncodedCSV(inputCsv, encryptedCsv);

        // Read and Decode CSV
        readDecodedCSV(encryptedCsv, decryptedCsv);

    }
}
