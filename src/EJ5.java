//Definir la clase
public class EJ5 {
    //Definir los atributos
    private double distancia;           //distancia en metros
    private double angulo;              //angulo en grados
    private double tiempo;              //tiempo en segundos

    // Constructor vacío
    public EJ5() {
    }

    // Constructor con parámetros
    public EJ5(double distancia, double angulo, double tiempo) {
        this.distancia = distancia;
        this.angulo = angulo;
        this.tiempo = tiempo;
    }

    // Getters y Setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    //Método personalizado para calcular la velocidad inicial requerida
    public double calcularVelocidad() {
        final double g = 9.81;    // Gravedad en m/s^2, con valor constante 9,81
        double anguloEnRadianes = Math.toRadians(angulo);    //Transformar el ángulo a radianes

        //Calcular la velocidad inicial usando la fórmula V0 = sqrt((R * g) / sin(2 * θ))
        double velocidad = Math.sqrt((distancia * g) / Math.sin(2 * anguloEnRadianes));

        return velocidad;
    }
}
