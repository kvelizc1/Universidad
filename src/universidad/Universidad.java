//Keny Veliz, Progra II, 5090-17-17545
/*
El programa, en forma de programacion estructurada sin orientacion a objetos, pide informacion de 4 alumnos y la despliega 
de forma ordenada de mayor a menor luego de pasar por un algoritmo de burbuja
*/
package universidad;
import javax.swing.JOptionPane;

public class Universidad {

    public static void main(String[] args) {
        boolean cambio=false;
        int no1,no2,no3,no4,ca1,ca2,ca3,ca4,aux;
            //Se solicitan los valores al usuario, uno por uno para cada variable individual: 
        ca1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el carne del alumno #1:"));
        no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese nota del alumno #1:"));
        //System.out.println(ca1+" "+no1);
        ca2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el carne del alumno #2:"));
        no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese nota del alumno #2:"));
        //System.out.println(ca2+" "+no2);
        ca3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el carne del alumno #3:"));
        no3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese nota del alumno #3:"));
        //System.out.println(ca3+" "+no3);
        ca4=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el carne del alumno #4:"));
        no4=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese nota del alumno #4:"));
        //System.out.println(ca4+" "+no4);
            //Verifica que cada valor este en posicion correcta de mayor a menor: 
        while(true){
            cambio=true;
            if(no4>no3){
                aux=no3;
                no3=no4;
                no4=aux;
                aux=ca3;
                ca3=ca4;
                ca4=aux;
                cambio=false;
            }else if(no3>no2){
                aux=no2;
                no2=no3;
                no3=aux;
                aux=ca2;
                ca2=ca3;
                ca3=aux;
                cambio=false;
            }else if(no2>no1){
                aux=no1;
                no1=no2;
                no2=aux;
                aux=ca1;
                ca1=ca2;
                ca2=aux;
                cambio=false;
            }
            if (cambio==true)break; //Si ya no se han realizado cambios, el ciclo se rompe 
        }
        //Por ultimo, se muestran los datos en forma ordenada. 
        JOptionPane.showMessageDialog(null, "Las notas ordenadas estan dadas de la siguiente manera:\n1. Carnet: "
                +ca1+", nota:"+no1+"\n2. Carnet: "+ca2+", nota: "+no2+"\n3. Carnet: "+ca3+", nota: "+no3+
                "\n4. Carnet: "+ca4+", nota: "+no4);
    }
    
}
