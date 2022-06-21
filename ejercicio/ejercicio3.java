package ejercicio;
public class ejercicio3 extends Thread{//un programa con estencion en thread
    public void run(){//se crea una funcion llamda run
        for(int i = 10; i > 0; i--){//se crea un buckle
        System.out.println(i);//se imprime el bloque contando de reversa
        }
    }
    public static void main(String[]args){//se crea la funcion main
        System.out.println("My counter program thank you!");//se imprime un titulo
        (new ejercicio3()).start();//se inicia desde el inicio el programa
    }
}