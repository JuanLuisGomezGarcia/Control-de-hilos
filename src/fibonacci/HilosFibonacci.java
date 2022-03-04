    
    package fibonacci;
    public class HilosFibonacci extends Thread{

    //Nombramos los atributos de la clase en este caso solo uno
    //que sera el numero de veces que se repite la secuencia de
    //fibonacci
    int numeroRepeticiones;

    //Creamos el constructor de la clase que recivira los atributos
    public HilosFibonacci(int numeroRepeticiones) {
    this.numeroRepeticiones = numeroRepeticiones;  }
    
    //Realizamos la funcion run la cual recivira el numro de repeticiones
    //y generara un resultado
    public void run(){
        
    //variables necesarias para realizar el alculo requerido
    int primerNumero = 0;
    int segundoNumero = 1;
    int numeroResultado = 0;
    // for que repite la secuencia de fibonacci
    for (int i = 1; i < numeroRepeticiones; i++){
    numeroResultado = primerNumero + segundoNumero;
    primerNumero = segundoNumero;
    segundoNumero = numeroResultado;}
    //Enviamos el resultado a traves de un system.out.println
    System.out.println("El numero de la posicion " + numeroRepeticiones +
    " es: " + numeroResultado);    }}



