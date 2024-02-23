import java.util.ArrayList;
import java.util.List;

public class MnyExchng {
    public static void main(String[] args) {
        System.out.println(moneyExchange("Apples cost 300 HUF in my city.",
                "EUR",
                new String[]{"EUR", "HUF", "GBP", "CAD", "CZK", "PLN"},
                new double[]{1, 360, 0.84, 1.43, 24, 5}));
    }
    public static String moneyExchange(String text, String target, String[] currencies, double[] rates){
        String[] textArr = text.split(" ");
        double value = 0;
        String currentCrnc = "";
        List<String> crnc = new ArrayList<>(List.of("EUR", "HUF", "GBP", "CAD", "CZK", "PLN"));
        for (int i = 0; i < textArr.length; i++) {
            if(crnc.contains(textArr[i])){
                currentCrnc = textArr[i];
                value = Integer.parseInt(textArr[i-1]);
            }
        }

        int index = 0;
        int indexOfTarget = 0;
        for (int i = 0; i < currencies.length; i++) {
            if(currentCrnc.equals(currencies[i])){
                index = i;
            }
            if(target.equals(currencies[i])){
                indexOfTarget = i;
            }
        }
        value = (value / rates[index]) * rates[indexOfTarget];
        for (int i = 0; i < textArr.length; i++) {
            if(crnc.contains(textArr[i])){
                textArr[i] = target;
                textArr[i-1] = String.valueOf(value);
            }
        }
       String result = "";
        for (int i = 0; i < textArr.length; i++) {
            result += textArr[i] + " ";
        }
        return result;
    }
}

