
package evaluacion.pkg2.edd;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static sun.security.ssl.SSLLogger.info;


public class Evaluacion2EDD {


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
    void leer(String pnombre) throws IOException
    {
        fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea;
        int i = 0;
        while((linea=br.readLine())!=null)
        {
            i++;
            String[] info=new String[5];
            info=linea.split("/");
            System.out.println(" Estudiante #"+i);
            System.out.println(" Nombre: "+info[0]);
            System.out.println(" Apellido: "+info[1]);
            System.out.println(" Cedula: "+info[2]);
            System.out.println(" Promedio: "+info[3]);
            System.out.println(" Edad: "+info[4]);
            
        }
    }
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
}
