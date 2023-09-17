package controller;

public class Convert {

   public int decimalToBinaryInteger(int n) {
    int binary = 0;
    int base = 1; // Initialize the base with 1 (2^0)

    while (n > 0) {
        int remainder = n % 2; // Get the remainder when dividing by 2
        binary += remainder * base; // Add the remainder to the binary representation
        n /= 2; // Divide the decimal number by 2
        base *= 10; // Increase the base by a factor of 10 (to shift left in binary)
    }

    return binary;
}


    public String decimalToHeximalInteger(int n) {
        String hexDigits = "0123456789ABCDEF";
        StringBuilder hexNumber = new StringBuilder();
        while (n > 0) {
            int digit = n % 16;
            hexNumber.append(hexDigits.charAt(digit));
            n /= 16;
        }
        return hexNumber.reverse().toString();
    }

    public int binaryToDecimalInteger(int binary) {
    int output = 0;
    int base = 1; // Initialize the base value for binary place value calculation
    
    while (binary > 0) {
        int digit = binary % 10;
        output += digit * base;
        binary /= 10;
        base *= 2; // Update the base value for the next place value
    }
    
    return output;
}


    public  String binaryToHex(String binaryStr) {
        try {
            int binaryLength = binaryStr.length();
            
            // Ensure that the binary string's length is a multiple of 4 by adding leading zeros if needed
            while (binaryLength % 4 != 0) {
                binaryStr = "0" + binaryStr;
                binaryLength++;
            }
            
            StringBuilder hexBuilder = new StringBuilder();
            
            for (int i = 0; i < binaryLength; i += 4) {
                String nibble = binaryStr.substring(i, i + 4); // Get a 4-bit chunk
                int decimalValue = Integer.parseInt(nibble, 2); // Convert it to decimal
                String hexDigit = Integer.toHexString(decimalValue); // Convert to hex
                hexBuilder.append(hexDigit.toUpperCase());
            }
            
            return hexBuilder.toString();
        } catch (NumberFormatException e) {
            return "Invalid input: Not a valid binary string";
        }
    }




    public int hexToDecimal(String hexString) {
    int decimalValue = 0;
    int power = hexString.length() - 1;

    for (int i = 0; i < hexString.length(); i++) {
        char hexDigit = hexString.charAt(i);
        int digitValue;

        if (hexDigit >= '0' && hexDigit <= '9') {
            digitValue = hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            digitValue = hexDigit - 'A' + 10;
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexDigit);
        }

        decimalValue += digitValue * Math.pow(16, power);
        power--;
    }

    return decimalValue;
}

  public int hexToBinaryInteger(String hexString) {
    StringBuilder binaryString = new StringBuilder();
    for (int i = 0; i < hexString.length(); i++) {
        char hexDigit = Character.toUpperCase(hexString.charAt(i));
        int digitValue;
        if (hexDigit >= '0' && hexDigit <= '9') {
            digitValue = hexDigit - '0';  // Treat '0' to '9' as hexadecimal digits
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            digitValue = hexDigit - 'A' + 10;  // Treat 'A' to 'F' as hexadecimal digits
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexDigit);
        }

        // Ensure that the binary representation has 4 bits (pad with leading zeros if needed)
        String binaryDigit = String.format("%4s", Integer.toBinaryString(digitValue)).replace(' ', '0');
        binaryString.append(binaryDigit);
    }

    return Integer.parseInt(binaryString.toString());
}



}
