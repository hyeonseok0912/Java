package dec05;

public class Google {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 10000; i++) {
            String number = String.valueOf(i);

            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '8') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

