package dec06;
//1~10000까지 중 8이 몇개 들어가는지 세는 알고리즘
public class Test03 {

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