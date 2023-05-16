import java.util.Scanner;
public class Planostrabajador
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] identificacion = new String [50];
        String[] nombre = new String [50];
        String[] area = new String [50];
        
        double[] semanauno = new double [50];
        double[] semanados = new double [50];
        double[] semanatres = new double [50];
        double[] semanacuatro = new double [50];
        
        int numeroTrabajadores;
        trabajadores[] lostrabajadores = new trabajadores[50];
        String identificacion, nombre, area;
        double semana1, semana2, semana3,semana4;
        double promedio = 0;
        System.out.println("Digite la cantidad de trabajadores: ");
        numeroTrabajadores = sc.nextInt();
        for(int i = 0; i < numeroTrabajadores; i++){
            System.out.println("Digite la identificacion del trabajador: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del trabajador: ");
            nombre = sc.next();
            System.out.println("Digite el area del trabajador: ");
            area = sc.next();
            System.out.println("Digite los planos terminados en la semana 1 del Trabajador: ");
            semana1 = sc.nextDouble();
            System.out.println("Digite los planos terminados en la semana 2 del Trabajador: ");
            semana2 = sc.nextDouble();
            System.out.println("Digite los planos terminados en la semana 3 del Trabajador: ");
            semana3 = sc.nextDouble();
            System.out.println("Digite los planos terminados en la semana 4 del Trabajador: ");
            semana4 = sc.nextDouble();
            trabajadores unTrabajador = new trabajadores();
            unTrabajador.identificacion = identificacion;
            unTrabajador.nombre = nombre;
            unTrabajador.area = area;
            unTrabajador.semanauno = semana1;
            unTrabajador.semanados = semana2;
            unTrabajador.semanatres = semana3;
            unTrabajador.semanacuatro = semana4;
            lostrabajadores[i] = unTrabajador;
        }
        
        for(int i =0;i < numeroTrabajadores;i++){
            double sum = (lostrabajadores[i].semanauno + lostrabajadores[i].semanados + lostrabajadores[i].semanatres +lostrabajadores[i].semanacuatro)/4;
            promedio = promedio + sum / numeroTrabajadores;
        }
        System.out.println("el promedio de planos del area a la  semana es: "+ promedio);
    }    
}}