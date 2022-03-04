
        package fibonacci;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        public class NumeroFibonacci {

        public static void main(String[] args) throws InterruptedException {

        // Generamos las variables de las distintas posicions que vamos a pedir
        int valorUno, valorDos, valorTres, valorCuatro;
        
        //Pedimos las posiciones a trabes de un funcion prviamente realizada y 
        //introducimoslos resultados en las variables creadas anteriormente
        System.out.println("Introduce el primer valor");
        valorUno = pedirInt();
        System.out.println("Introduce el segundo valor");
        valorDos = pedirInt();
        System.out.println("Introduce el tercer valor");
        valorTres = pedirInt();        
        System.out.println("Introduce el cuarto valor");
        valorCuatro = pedirInt();
        
        //Generamos los hilos con el valor de las posiciones
        HilosFibonacci hiloUno = new HilosFibonacci(valorUno);
        HilosFibonacci hiloDos = new HilosFibonacci(valorDos);
        HilosFibonacci hiloTres = new HilosFibonacci(valorTres);
        HilosFibonacci hiloCuatro= new HilosFibonacci(valorCuatro);
        
        //Ejecutamos dichos hilos
        hiloUno.start(); 
        hiloDos.start();
        hiloTres.start();
        hiloCuatro.start();
        //Controlamos el orden de los join
        hiloUno.join(); 
        hiloDos.join(); 
        hiloTres.join(); 
        hiloCuatro.join();  }
    
        //Funcion para pedir un numero entero
        public static int pedirInt(){
        int numeroRetornar=0;
        int clave_pedirInt;
        do{ clave_pedirInt=0;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brm = br.readLine();
        numeroRetornar = Integer.parseInt(brm);
        if(numeroRetornar<0){
            System.out.println("Introdusca un valor positivo por favor");
            clave_pedirInt=-1;}
        }catch(Exception e){ 
        clave_pedirInt=-1;System.out.println("Introdusca un numero por favor");}
        }while(!(clave_pedirInt==0));
        return numeroRetornar;}}
