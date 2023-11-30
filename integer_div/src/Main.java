public class Main {

    public static void main(String[] args) {
	// printing integers divided by 3 or 5 excluding 15

            for(int i = 1; i <= 100; i++)
            {
                if (i != 15) {
                    if ( i % 3 == 0 || i % 5 == 0) {

                        System.out.println(i);
                    }
                }
            }

    }
}
