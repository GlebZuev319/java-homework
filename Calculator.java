package _14_01_2025;

public class Calculator {

    private static boolean isOperation(char currentChar){
        return currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/';
    }

    private static int getOperationsCount(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (isOperation(input.charAt(i))){
                count++;
            }
        }
        return count;
    }

    private static double[] getNumbers(String input, int count){
        double[] numbers = new double[count];
        int start = 0;
        int indexNums = 0;

        for (int i = 0; i < input.length(); i++){
            char x = input.charAt(i);
            if(isOperation(x) || i == input.length()-1){
                if(i == input.length() - 1 && !isOperation(x)){
                    i++;
                }

                String stringNumber = input.substring(start, i);
                numbers[indexNums] = Double.parseDouble(stringNumber);
                indexNums++;
                start = i + 1;
            }
        }
        return numbers;
    }

    private static char[] getOperators(String input, int count){
        char[] operators = new char[count];
        int indexOpers = 0;
        for (int i = 0; i < input.length(); i++){
            char x = input.charAt(i);
            if (isOperation(x)){
                operators[indexOpers] = x;
                indexOpers++;
            }
        }
        return operators;
    }

    private static double calculate(double result, double number, char oper){
        switch (oper){
            case '+' : return result + number;
            case '-' : return result - number;
            case '*' : return result * number;
            case '/' : return result / number;
        }
        return 0;
    }

    private static String getFinalResult(double[] numbers, char[] opers, double result){
        StringBuilder sb = new StringBuilder();
        sb.append(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            sb.append(numbers[i]).append(" ").append(opers[i-1]).append(" ");
        }
        sb.append("=").append(" ");
        return sb.toString();
    }

    public static String getResult(String input){
        int count = getOperationsCount(input);
        double[] numbers = getNumbers(input, count);
        char[] opers = getOperators(input, count);
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = calculate(result, numbers[i], opers[i-1]);
        }
        return getFinalResult(numbers, opers, result) + result;
    }
}
