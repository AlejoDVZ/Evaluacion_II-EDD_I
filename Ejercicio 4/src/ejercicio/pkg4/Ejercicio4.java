
package ejercicio.pkg4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static sun.security.ssl.SSLLogger.info;



public class Ejercicio4 {

   
   public static void main(String[] args) throws IOException {
        
        
        estudiante estu=new estudiante();  // crear Objeto de la clase Estudiante
        estu.Introducir();
        archivo arch;
        arch = new archivo();
        arch.leer2("estudiantes.txt");
        
    }
 
}

class estudiante
{
   String Nombre,Apellido;
   int Cedula,Edad,est;
   float Promedio;
   

    void Introducir() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Numero de estudiante");
        this.est=Integer.parseInt(br.readLine());
        
        for (int i=0;est>i;i++) {
            System.out.print("Nombre: ");
            Nombre=sc.nextLine();
            System.out.print("Apellido: ");
            Apellido=sc.nextLine();
            System.out.print("Cedula: ");
            Cedula=sc.nextInt();
            System.out.print("Promedio: ");
            this.Promedio=Float.parseFloat(br.readLine());
            System.out.print("Edad:  ");
            Edad=sc.nextInt();
            save();
        }
   }
    void save () throws IOException{
    String Info;
            Info=Edad+"/"+Nombre+"/"+Apellido+"/"+Cedula+"/"+Promedio+"/";
            
             archivo arch=new archivo();
            arch.crear("estudiantes.txt", Info);
}
}

class archivo
{
    PrintWriter pf;
    FileReader fr;
    void crear(String pNombre,String pInfo) throws IOException
    {
        
        pf = new PrintWriter(new FileWriter(pNombre,true));
        pf.println(pInfo);
        pf.close();
        System.out.println("Creado con Exito");
    }

   /* void leer(String pnombre) throws IOException
    {   int ce = 0;
        fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea;
        int i = 0;
        while((linea=br.readLine())!=null)
        {
            
            
        }
    }*/
    void leer2(String pnombre) {
        
        File arch;
        FileReader fr;
        BufferedReader br;
        try{
        arch= new File(pnombre);
        fr=new FileReader(arch);
        br= new BufferedReader(fr);
        
        String linea;
        while((linea=br.readLine())!=null){
                System.out.println(linea);
                }
        
        br.close();
        fr.close();
        
        
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e, pnombre, 0);}
    
    }
    void eliminar(String pnombre) throws IOException{
    archivo arch2  = new archivo();
    arch2= arch.crear();
    Scanner sc=new Scanner(System.in);
        FileReader fr;
        BufferedReader br;
        fr=new FileReader(arch);
        br= new BufferedReader(fr);
        
       int ce = 0;
       System.out.println("Cedula a eliminar");
       ce = sc.nextInt();
       String linea;
       
       while((linea=br.readLine())!=null){
              if(br.equals(ce)){
              linea=null;
              File;
              
              }
    
    }
}

}
