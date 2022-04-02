package misegundaaplicacionjavasemana2;

public class CrearMetodosConParametros {
    public static void main(String[] args) {
        System.out.println("Metodo void");
        metodoConParametrosVoid(1, 24.34, "Lucas");
        System.out.println("----------------");
        System.out.println("Metodo int");
        metodoConParametrosInt(1);
        System.out.println("----------------");
        System.out.println("Metodo double");
        metodoConParametrosDouble((int) 24.34);
        System.out.println("----------------");
        System.out.println("Metodo String");
        metodoConParametrosString("Lucas");
    }
    
    public static void metodoConParametrosVoid(int valorInt, double valorDouble, String valorString){
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor String: " + valorString);
       
    }
    
    public static void metodoConParametrosInt(int valorInt){
        System.out.println("El valor int es : " + valorInt);
    
    }
    
    public static void metodoConParametrosDouble(int valorDouble){
        System.out.println("El valor int es : " + valorDouble);
    
    }
    public static void metodoConParametrosString(int valorString){
    System.out.println("El valor int es : " + valorString);
    
    
 }
    }
    
    
