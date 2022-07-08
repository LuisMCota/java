public class ejercicio4 extends Thread { //un programa que se extiende por thread
    int Identificador; //se declara la variable 
    public ejercicio4(int id){ //se crea una funcion en donde se pide un id y este se le asigna la variable
        Identificador = id;
    }
    
    public void run(){ //se crea una func llamda run
        if (Identificador == 1){// un bucle if en el se generan numeros del uno al 250 al acabar genrera numeros del 250 al 500
            for(int num=1; num<=250; num++){
                System.out.print(" " +  num + " ");
                try{
                    sleep (100);
                }catch(InterruptedException e){ }
            }
        } else{
            for(int num=250; num<=500; num++){
                System.out.print(" " + num + " ");
                try{
                    sleep (100);
                }catch(InterruptedException e) { }/*Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread 
                                                    is interrupted, either before or during the activity. */
            }
        }
    }

    public static void main(String[] args){/*  en esta funcuion se identifican los hios y en la ejecucion del programa pone un hilo y luego el segundo hilo
                                               , osea pone un  numero del empezando desde el uno y luego el siguiente del 250, entercala los hilos */
        ejercicio4 hilo1 = new ejercicio4(1);
        ejercicio4 hilo2 = new ejercicio4(2);
        hilo1.start();
        hilo2.start();
    }
}