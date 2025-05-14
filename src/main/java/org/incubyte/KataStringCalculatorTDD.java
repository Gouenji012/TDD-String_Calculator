package org.incubyte;

public class KataStringCalculatorTDD {

    public int addString(String numbers) throws IllegalAccessException {
        if(numbers.length()<2)
        {
            if(numbers.isEmpty()) return 0;
            else return Integer.parseInt(numbers);
        }
        else {
            String del = ",";
            if(numbers.matches("//(.*)\n(.*)")){
                del = Character.toString(numbers.charAt(2));
                numbers=numbers.substring(4);
            }

            String[] numberList = splitNumbers(numbers,del+"|\n");
            return addition(numberList);
        }

    }

    private String[] splitNumbers(String num, String div)
    {
        return num.split(div);
    }

    private int addition(String[] num) throws IllegalAccessException {
        var addition = 0;
        StringBuilder neg = new StringBuilder();

        for (String str : num) {
            if (Integer.parseInt(str) < 0) {
                if (neg.toString().equals(""))
                    neg = new StringBuilder(str);
                else
                    neg.append(",").append(str);
            }
            if (Integer.parseInt(str) < 1000) {
                addition += Integer.parseInt(str);
            }
            if (!neg.toString().equals("")) {
                throw new IllegalAccessException("negative numbers are not allowed " + neg);
            }

        }
        return addition;
    }
}
