package Strings;

public class DecimalToRoman {

    public static void main(String[] args) {
        String result = convert(3549);
        System.out.println(result);

    }

    private static String convert(int num) {

        int[] numericValues = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romanValues = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int i = numericValues.length-1;
        StringBuilder result = new StringBuilder();
        while(num > 0){
            int div = num / numericValues[i];
            while (div > 0){
                result.append(romanValues[i]);
                div--;
            }
            num = num % numericValues[i--];
        }
        return result.toString();
    }
}
