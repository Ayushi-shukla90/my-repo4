interface shape{
    void area();
}
class circle1 implements shape{
    public void area(){
        System.out.println(3.14*2*2);
    }
    public static void main(String[] args) {
        circle1 c = new circle1();
        c.area();
    }
}