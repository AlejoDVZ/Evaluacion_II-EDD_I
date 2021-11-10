
package ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    
  
    public static void main(String[] args, int dato) {
        Scanner sc= new Scanner(System.in);
        
        Listadoble ld = new Listadoble();
        nodo n = new nodo();
        int op=0;
        
        do{
            
        ld.Newnodo(dato);
            System.out.println("Introducir otro dato?");
            System.out.println("1.si");
            System.out.println("2.no");
            op=sc.nextInt();
            
        }while(op!=2);
        
        ld.recorridoMayor();
        ld.recorridomenor();
        ld.valormedio();
    }
    
}

class nodo{
    int dato;
    nodo sig;
    nodo ant;

}

class Listadoble{
    nodo M;
    nodo prime;
    nodo ult;
   
    void Newnodo(int dato){
    nodo nuevo = new nodo();
    nuevo.dato = dato;

    if (prime == null){
        prime = nuevo;
        prime.sig=null;
        prime.ant=null;
        ult=prime;
    } else{
        ult.sig=nuevo;
        nuevo.ant=ult;
        nuevo.sig=null;
        ult=nuevo;
        
    
        }
    }
    
    void recorridoMayor(){
    nodo M = new nodo();
    nodo actual = new nodo();
    actual = prime.sig;
    M = prime;
    int n=0;
    n = M;
    
    do{
        
      actual=actual.sig;  
      
      if(M < actual)
      {
          M=actual;
          
      } while(actual!=null);
        System.out.println(M);

}
}
    
  
    void recorridomenor(){
    nodo m = new nodo();
    nodo actual = new nodo();
    actual = prime.sig;
    m = prime;
    
    do{
        
      actual=actual.sig;  
     
      if(m < actual)
      {
          m=actual;
          
      } while(actual!=null);
        System.out.println(m);

    }
}

    void valormedio(){
    nodo a = new nodo();
    nodo L = new nodo();
    int i=0,medio=0;
     a = L;
       int sum=0;
       while (a.sig != null){
           i++;
           sum+=a.dato;
           a=a.sig;
       }
       
       medio=sum/i;
       System.out.println("Elvalor medio todos los elementos de la lista es: " + medio);
   }
    }
    
