/*
Create class box and box3d. box3d is extended class of box. The above
two classes going to full fill following requirement
Include constructor.
set value of length, breadth, height Find out area and volume.
Note: Base class and sub classes have respective methods and instance variables.
 */
package p6;
class Box {
  private int length;
  private int breadth;

  public Box ( )
  {
    length =0;
    breadth =0;
  }
  public Box (int x, int y) 
  {
    length = x;
    breadth =y;
  }
  public void setval (int x, int y) {
    length = x;
    breadth = y;
  }
  // calculate the area
    public int area ( )
    {
      return (length * breadth);
    }
  }

// Box class inherited in the child class
  class Box3d extends Box
  {
    private int height;
    // non parameterised constructor
    public Box3d ( )
    {
      // constructor chaining

      super( );
      height  = 0;
    }
    // parameterised constructor
    public Box3d(int x, int y, int z)
    {
      super (x, y);
      height = z;
    }
    public void setval (int x, int y, int z)
    {
    setval(x, y);
      height = z;
    }
    // calculate volume
    public int volume ( )
    {
      return (area ( ) * height );
    }
  }
public class Test3 {
  public static void main(String args [ ])
  {
    Box obj1=new Box();  // parent class object
    obj1.setval (10,20);  // initialize the attributes of the parent class
    Box3d obj2 = new Box3d(30,40,50); // child class object
    System.out.println(obj1.area());
    System.out.println(obj2.volume());
  }
}