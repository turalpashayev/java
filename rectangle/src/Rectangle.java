public class Rectangle {
    private int height = 1;
    private int width = 1;

    public Rectangle(int h, int w){
        setWidth(w);
        setHeight(h);
    }

    public void setHeight(int h){
        if (h > 0) {
            height = h;
        }
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth(){
        return width;
    }

    public void printArea(){
        System.out.println(height * width);
    }

    public int area(){
        return height * width;
    }

}
