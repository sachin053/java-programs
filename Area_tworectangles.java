class Rectangle {
    int len;
    int breadth;

    Rectangle(int l, int b) {
        len = l;
        breadth = b;
    }

    public int area() {
        return len * breadth;
    }
}

public class Area_tworectangles {
    public static void main(String args[]) {
        Rectangle obj1 = new Rectangle(4, 5);
        Rectangle obj2 = new Rectangle(5, 8);
        System.out.println(obj1.area());
        System.out.println(obj2.area());
    }

}
