public class Main {

    public static void main(String[] args) {
	// write your code here
        foo(2);
        System.out.println(bar());

    }
    public static void foo(int a){
        if (a < 3){
            return;
        }
        System.out.println(a);
    }
    public static int bar(){
        return 50;
    }
}
