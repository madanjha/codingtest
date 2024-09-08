package data.algo.basic.example;

public class Double2Pression {
	public static void main(String[] args) {
		Double d = 7657767888.986466;
        System.out.println(roundval(d));
	}

	private static Double roundval(Double d) {
		

        // Convert to String
        String dString = Double.toString(d);
        
        // Find the decimal point
        int decimalIndex = dString.indexOf('.');

        // If there is a decimal part and it's longer than 2 digits, truncate it
        if (decimalIndex != -1 && dString.length() > decimalIndex + 2) {
            dString = dString.substring(0, decimalIndex + 3); // Keep 2 decimal places
        }

        // Convert back to double if needed
        Double truncatedValue = Double.parseDouble(dString);
        System.out.println("Original value: " + d);
        System.out.println("Truncated value: " + truncatedValue);
       return truncatedValue;
        // Output the result
       
	}
}
