public class Main {
    public static void main(String[] args)
    {
        //Llamo al constructor (objeto tipo resta = varResta)
        Resta varResta  = new Resta();

        //Llamo a la funcion y compruebo que funciona
        int prueba1 = varResta.restaEnteros(2, 4);
        System.out.println(prueba1);
        double prueba2 = varResta.restaReales(3.5, 1);
        System.out.println(prueba2);
        double prueba3 = varResta.restaAcumulado(5);
        System.out.println(prueba3);
        prueba3 = varResta.restaAcumulado(2);
        System.out.println(prueba3);
        prueba3 = varResta.restaAcumulado(7);
        System.out.println(prueba3);
        prueba3 = varResta.restaAcumulado(1.5);
        System.out.println(prueba3);
    }

}