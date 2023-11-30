public class Door {
    boolean isOpen = false;
    String name;

    void open(){
        isOpen = true;
    }

    void close(){
        isOpen = false;
    }

    void printStatus(){
        if (isOpen){
            System.out.print(name + " side is open\n");
        }
        else {
            System.out.print(name + " side is closed\n");
        }
    }
}
