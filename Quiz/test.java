public class test 
{
    public static void main(String[] args)
    {
        Coordenada f = new Coordenada(3,5);

        Coordenada f2 = new Coordenada(3,5);

        System.out.println("La coordenada en X es: " + f.getX());
        System.out.println("La coordenada en Y es: " + f.getY());
        System.out.println(f);

        System.out.println("La coordenada en X es: " + f2.getX());
        System.out.println("La coordenada en Y es: " + f2.getY());
        System.out.println(f2);

        if (f.equals(f2))
        {
            System.out.println("las coordenas son iguales.");
        }
        else
        {
            System.out.println("Las coordenadas son diferentes");
        }
    }
}
