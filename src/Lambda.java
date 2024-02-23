import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts){
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWords = s -> {

        }

    }
}
