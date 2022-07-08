public class ejercicio4 extends Thread {
    int Identificador;
    public ejercicio4(int id){
        Identificador = id;
    }
    
    public void run(){
        if (Identificador == 1){
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
                }catch(InterruptedException e) { }
            }
        }
    }

    public static void main(String[] args){
        ejercicio4 hilo1 = new ejercicio4(1);
        ejercicio4 hilo2 = new ejercicio4(2);
        hilo1.start();
        hilo2.start();
    }
}