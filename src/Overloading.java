public class Overloading {

    public String color;


    public static void main(String[] args) {
        Overloading b = new Overloading("blue");
        Overloading o = new Overloading();
        o.test(6.5);

        Overloading r = new Overloading("red");
    }
    public Overloading(){
        System.out.println("Default contructor. Overloading with no parameters");
    }

    public Overloading(String color){
        this.color = color;
        System.out.println("constructor");
        System.out.println("Charecter color is " + color);
    }

    public void test(){

    }
    public void test(int x){
        System.out.println("number is " + x);
    }
    public void test (double x){
        System.out.println("number is " +x);
    }
    public void test (double x, double potato){
        double meal = x + potato;
        System.out.println(x + " + " + potato + " = " + meal);
    }
}
