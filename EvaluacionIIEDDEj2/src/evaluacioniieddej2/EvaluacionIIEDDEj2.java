

package evaluacioniieddej2;

import java.util.Scanner;

public class EvaluacionIIEDDEj2 {

    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      lista l = new lista();
      int option;
      do{
            System.out.println("1.ingresar nodo");
            System.out.println("2.Desplegar lista");
            System.out.println("3.Sacar un numero aleatorio de la lista");
            System.out.println("4.Cerrar");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Ingresar nodo");
                    int dato=sc.nextInt();
                    l.ingresarnodo(dato);
                    break;
                case 2:
                    System.out.println("");
                    l.mostrar();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Nodo aleatorio");
                    l.random();
                    break;
                case 4:
                    System.out.println("Programa Finalizado");
                    break;
                
                default:System.out.println("Opcion no valida");
                break;
            }
      }while(option !=4);
    }
    
}

class lista{
    nodo prime;
    nodo ult;
    
    public lista(){
     prime= null;
     ult=null;
    }
    
public void random(){
    nodo actual = new nodo();
    actual= ult; 
    int x=0;
   x = (int) Math.random()*100;
    for(int i=0;i==x;i++){
        actual=actual.sig;
        System.out.println(actual.dato);
    }

}
public void ingresarnodo(int x){
    nodo nuevo=new nodo();
    nuevo.dato=x;
    if(prime==null){
        prime= nuevo;
        prime.sig = prime;
        nuevo.ant=ult;
        ult=nuevo;       
    }else{
        ult.sig=nuevo;
        nuevo.sig=prime;
        nuevo.ant=ult;
        ult=nuevo;
        prime.ant=ult;
    
        }
   }
public void mostrar(){

       nodo actual=new nodo();
       actual=prime;
       do{  System.out.println(actual.dato);
            actual=actual.sig;
           
       }while(actual!=prime);
       
    }
}


class nodo{
    int dato;
    nodo sig;
    nodo ant;
}