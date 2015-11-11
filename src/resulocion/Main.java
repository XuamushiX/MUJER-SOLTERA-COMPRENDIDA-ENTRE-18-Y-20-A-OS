/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resulocion;
import java.io.*;
/**
 *
 * @author electrica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader DATO= new InputStreamReader(System.in);
        BufferedReader DATO1= new BufferedReader(DATO);
        String NOM,APE,DIREC,ESCIVIL,GENERO;
        int EDAD,i,NUMPER,GENERO1,ESCIVIL1;
        i=1;

       double NOTA,PROM,SUMA;
       int CONTA1,CONTA2;
       SUMA=0;
       CONTA1=0;
       CONTA2=0;
        try
        {
            System.out.println("REALIZAR UN PROGRAMA PARA INGRESAR EL NOMBRE,APELLIDO");
            System.out.println("EDAD, DIRECCION DE UN GRUPO DE PERSONAS Y VISUALIZAR ");
            System.out.println("EL NOMBRE, LA EDAD Y DIRECCION DE CADA MUJER SOLTERA");
            System.out.println("COMPRENDIDA ENTRE 18 Y 20 AÑOS");
            System.out.println("");
            System.out.println("Ingrese el numero de personas ");
            NUMPER=Integer.parseInt(DATO1.readLine());
            while (i<=NUMPER)
            {
                 System.out.println("Ingrese el nombre de la persona "+i);
                 NOM=DATO1.readLine();
                 System.out.println("Ingrese el apellido de la persona ");
                 APE=DATO1.readLine();
                 System.out.println("Ingrese la edad de la persona ");
                 EDAD=Integer.parseInt(DATO1.readLine());
                 System.out.println("Ingrese la direccion de la persona ");
                 DIREC=DATO1.readLine();
                 System.out.println("Ingrese el estado civil de la persona 1=SOLTERO 2=CASADO");
                 ESCIVIL1=Integer.parseInt(DATO1.readLine());
                 System.out.println("Ingrese el genero de la persona 1=MASCULINO 2=FEMENINO");
                 GENERO1=Integer.parseInt(DATO1.readLine());
                      if(ESCIVIL1==1)
                      {
                          if(GENERO1==2)
                          {
                              if(EDAD>=18)
                               {
                                  if(EDAD<=20)
                                  {
                                   System.out.println(NOM+" "+EDAD+" "+DIREC);
                                  }
                               }
                          }
                      }
                 i=i+1;
              }
             System.out.println("");
             System.out.println("SE DESEA OBTENER EL PROMEDIO DE NOTAS DE UN ESTUDIANTE");
             System.out.println("SABIENDO QUE TIENE 12 APORTES ADEMAS CONOCER CUANTOS");
             System.out.println("TIENE ENTRE 70 Y 90, CUANTOS ENTRE 10 Y 50");
             System.out.println("");
             for(i=1;i<=12;i=i+1)
             {
                 System.out.println("Ingrese el aporte"+i);
                 NOTA=Double.parseDouble(DATO1.readLine());
                 SUMA=SUMA+NOTA;
                    if(NOTA>=70)
                    {
                        if(NOTA<=90)
                        {
                            CONTA1=CONTA1+1;
                        }
                    }
                     if(NOTA>=10)
                    {
                        if(NOTA<=50)
                        {
                            CONTA2=CONTA2+1;
                        }
                    }
             }
             PROM=SUMA/12;
             System.out.println("El promedio general del estudiante es: "+PROM);
             System.out.println("El total de notas entre 70 y 90 es: "+CONTA1);
             System.out.println("El total de notas entre 10 y 50 es: "+CONTA2);
        }
        catch (IOException e)
        {
            System.out.println("ERROR");
        }

    }

}
