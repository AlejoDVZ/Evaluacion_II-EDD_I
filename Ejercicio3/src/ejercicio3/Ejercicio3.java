
package ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    
  
    public static void main(String[] args) {
        
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

    
}