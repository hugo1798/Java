public class Variables{
    public static void main(String[] args){
        // declaracion e inicializacion de la variable de tipo local
        int miNumero = 10;

        System.out.println("Mi numero es: " + miNumero);
        // al realizar la concatenacion, la variable de tipo entero 
        //se convirtio en una variable de tipo string de manera automatica

        // se pueden inicializar variables fuera del metodo main, 
        //pero esto ya seria generar atributos para nuestra clase
        
        int _miVariable = 20;

        // Un atajo para no tener que escribir todo el comando de
        //impresion en consola, es escribiendo sout y presionando 
        //la tecla tab
        System.out.println(_miVariable);

        int $miVariable = 30;

        System.out.println($miVariable);
    }
}