import java.util.Scanner;

 class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
        //    String userInput = "1 + 2";
            String AllAround = userInput.replaceAll("\\s+", "");
            String[] operands = AllAround.split("[+\\-*/]");
            if (operands.length >2) {
                throw new Exception("Калькулятор работает только с 2-мя целыми числами 1 до 10 и операндами +-*/");
            }
            if (operands.length < 2) {throw new Exception("Строка не является математической операцией");}
            int number1 = 0;
            int number2 = 0;
            int result = 0;
            char symbol = ' ';

      try {      number1 = Integer.parseInt(operands[0]);
                 number2 = Integer.parseInt(operands[1]); } catch (NumberFormatException e) { throw new Exception("Попробуйте заменить " + operands[0] + " или " + operands[1] + " на числа от 1 до 10");
      }


            if (number1 < 1 || number2 < 1 || number1 > 10 || number2 > 10)
                throw new Exception("Калькулятор принимает числа от 1 до 10");

            for (int i = 0; i < AllAround.length(); i++) {
                char operator = AllAround.charAt(i);
                if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
                    symbol = operator;
                }
            }
            switch (symbol){
                case '+': result = number1 + number2;
                break;
                case '-': result = number1 - number2;
                break;
                case '/': result = number1 / number2;
                break;
                case '*': result = number1 * number2;
                break;

                default:
                    throw new IllegalStateException("Unexpected value: " + symbol);
            }
            System.out.println(result);
        }
    }


