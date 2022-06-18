public class Mythread extends Thread{//un programa con extencion en thread
    public void run(){//se crea una funcion llamda run
        System.out.println("Hola Mundo desde un hilo"); //imprime un hola mundo desde un hilo 

    }
    public static void main(String[]args){//se crea la funcion main y se le pasan parametros 
        System.out.println("Hola mundo");//se imprime un hola mundo
        (new Mythread()).start();//se inicia desde el inicio el programa
    }
}