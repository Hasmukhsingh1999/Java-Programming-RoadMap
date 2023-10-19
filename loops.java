/**
 * There are three types of loops ->
 * for , while , do-while
 **/

public class loops {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        for (int i = start; i <= end; i++) {
            try {
                System.out.println(++i);
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
