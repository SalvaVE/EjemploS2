package misegundaaplicacionjavasemana2;

public class InteresSimpleMetodoConParametro {
    public static void main(String[] args) {
        double cantidadprestada, tiempo, tasaDeInteres;
        
        cantidadprestada = 1500.00;
        tiempo =0.75;
        tasaDeInteres = 0.08;
        
        double valorInteresSimple = calcularInteresSimple(cantidadprestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $" + valorInteresSimple);
        
    }
    public static double calcularInteresSimple(double cantidadPrestada, tiempo, tasaDeInteres){
        
    }
}
