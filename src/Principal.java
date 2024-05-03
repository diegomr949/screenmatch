import Modelo.Pelicula;
import Modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu () {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                        Bienvenido a Screnmatch
                        1)Registrar nueva Película
                        2)Registrar nueva Serie
                        
                        9)Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos por episodio");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
            }
        }
    }
}
