public class Sheep
{
    static int count; //don't set as private for internal reasons

    public Sheep() {
        count++;
    }

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep();

        System.out.println("Numeros de ovejas: " + count);
    }

    //code the constructor so that every time a Sheep is instantiated, it adds 1 to the count
    /* Add 1 to the Sheep count everytime one is created. */
}