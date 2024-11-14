import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase EJ5 usando el constructor vacío
        EJ5 golpeo = new EJ5();

        // Usar Scanner para ingresar los valores de los atributos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia a la portería (en metros): ");
        double distancia = scanner.nextDouble();
        golpeo.setDistancia(distancia);

        System.out.print("Ingrese el ángulo de lanzamiento (en grados): ");
        double angulo = scanner.nextDouble();
        golpeo.setAngulo(angulo);

        System.out.print("Ingrese el tiempo para que el balón llegue (en segundos): ");
        double tiempo = scanner.nextDouble();
        golpeo.setTiempo(tiempo);

        // Calcular la velocidad necesaria
        double velocidadRequerida = golpeo.calcularVelocidad();

        // Mostrar resultado con 2 decimales usando printf
        System.out.printf("La velocidad necesaria para que el balón entre en la portería es: %.2f m/s%n", velocidadRequerida);

        scanner.close();
    }
}
