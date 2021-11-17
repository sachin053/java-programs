class Employee_data {
    static String n;
    static int y;
    static String add;

    public static void setdata(String Name, int yoj, String address) {
        n = Name;
        y = yoj;
        add = address;
    }

    public static void display() {
        System.out.println("Name : " + n + "\nYear of joining : " + y + "\nAddress : " + add);
    }

    public static void main(String args[]) {
        Employee_data.setdata("sachin", 2021, "banglore");
        Employee_data.display();
        Employee_data.setdata("abhishek", 2001, "delhi");
        Employee_data.display();
        Employee_data.setdata("shubham", 2005, "lucknow");
        Employee_data.display();
    }

}
