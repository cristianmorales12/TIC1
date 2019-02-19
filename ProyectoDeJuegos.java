
package proyectodejuegos;

import java.awt.Menu;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import static proyectodejuegos.ProyectoDeJuegos.Menu;
public class ProyectoDeJuegos {
static int Menu;
	static Scanner miScaner = new Scanner(System.in);
   
public static void main(String[] args) {
    System.out.println("Menu");
    System.out.println("1. Juegos de ahoracado");
    System.out.println("2. Juegos de cartas ");
    System.out.println("3. Juegos de basketball ");
    System.out.println("4. Juegos de Hanoi");
    System.out.println("5. desea salir del programa");
    System.out.println("escriba el codigo del juego que desea jugar");
    Menu = miScaner.nextInt();
    //acá empieza llamando al menú
    if (Menu ==1){
	String palabra = "";
	String letraAdivinar = "";
	int seleccionarUnaLetra;
	int continuar;
        int hasadivinadolapalabra =0;
	int aportunidades;
        int errores;
        int ganar=0;
	InputStreamReader letra = new InputStreamReader(System.in);
	BufferedReader guardar = new BufferedReader(letra);		
	System.out.println("Este juego consiste que un segundo jugador debe de Escribir una palabra y el jugador principal tiene que adivinar la palbara que escribio el segundo jugador");
	System.out.println("Escribe una palababra");
        try{ 
            palabra = guardar.readLine();
        }catch(IOException e){};
         aportunidades = 0;
        do{
            System.out.println("Adivine la palabra o escriba una letra lo que escibio el segundo jugador");
            try{ 
                letraAdivinar = guardar.readLine();
            }catch(IOException e){};
            seleccionarUnaLetra = letraAdivinar.length();
            continuar =  palabra.length();
            errores=0;
            if (seleccionarUnaLetra == 1){
                for(int i =0 ; i < continuar ; i++){
                    if (letraAdivinar.charAt(0) == palabra.charAt(i)){
                        System.out.println(palabra.charAt(i));
                        ganar++;
                        if (ganar == continuar) {
                            System.out.println ("Has adivinado la palabra "  + palabra);
                             hasadivinadolapalabra=1;
                        }
                    }
                    else {
                        errores++;	
                        if (errores==continuar) {
                             aportunidades++;
                        }
                    }
                }
            }
            else {
                if(letraAdivinar.equalsIgnoreCase(palabra) == true){
                System.out.println ("Has adivinado la palabra " + letraAdivinar);
                hasadivinadolapalabra=1;
                }
                else {
                    aportunidades++;
                }
            }
            if(aportunidades == 1){
                DibujarLaViga();	
            } 
            if(aportunidades == 2){
                DibujarLaViga();
                PonerElLazo();
            }
            if(aportunidades == 3){
                DibujarLaViga();
                PonerElLazo();
                DibujarLaCabezaDelHombre();
            }
             if(aportunidades == 4){
                DibujarLaViga();
                PonerElLazo();
                DibujarLaCabezaDelHombre();
                DibujarElGargantaDelHombre();
            }
            if(aportunidades == 5){ 
                DibujarLaViga();
                PonerElLazo();
                DibujarLaCabezaDelHombre();
                DibujarElGargantaDelHombre();
                DibujarLasManosDelHombre();
            }
             if(aportunidades == 6){ 
                DibujarLaViga();
                PonerElLazo();
                DibujarLaCabezaDelHombre();
                DibujarElGargantaDelHombre();
                DibujarLasManosDelHombre();
                DibujarElcuerpoDelHombre();
            }
            if(aportunidades == 7){
            DibujarLaViga();
            PonerElLazo();
            DibujarLaCabezaDelHombre();
            DibujarElGargantaDelHombre();
            DibujarLasManosDelHombre();
            DibujarElcuerpoDelHombre();
                DibujarLosPiesDelHombre(); 
              hasadivinadolapalabra=1;
                System.out.println("Has perdido el juego la palabra adivinar era "  + palabra);
            }
         
        }while(hasadivinadolapalabra==0);
       
        
        
        
       
    }
    else if (Menu ==2){
       int numero = 0;
       int primercarta = 0;
       int segcarta = 0;
       int Apostar =  0;
       int tercarta =0;
       
            
       Scanner num=new Scanner(System.in);
    
       Scanner guardar = new Scanner(System.in);
       System.out.println("Este juego consiste en sacar dos cartas y adivinar una carta o el numero que esta dentro las dos cartas anteriores y el jugador debe ver la posibilidad que hay para lograr sacar ala carta que hay en el rango y asi va apostando el juego se termima hasta que el jugador se queda sin dinero");
       System.out.println("Cuanto Dinero Total desea apostar en este Juego");
       numero = guardar.nextInt();
        do{
       Random aleatoria = new Random();
       Random cartaaleatoria = new Random();
       segcarta = cartaaleatoria.nextInt(13)+1;
       primercarta = aleatoria.nextInt(13)+1;
       
       System.out.println("su primera carta ");
       System.out.println(primercarta);
       //Random ctr = new Random();
       //segcarta = ctr.nextInt(13)+1;
       //System.out.println("su segunda carta");
       if (aleatoria== cartaaleatoria){
        do{
           Random alea = new Random();
        primercarta = alea.nextInt(13)+1;
        System.out.println("su segunda carta ");
        System.out.println(primercarta); 
        }while(aleatoria== cartaaleatoria);
       }
       else{
         System.out.println("su segunda carta ");  
        System.out.println(segcarta);
       
       }
       System.out.println("Cuanto desea Apostar");
       Apostar= guardar.nextInt();
       do{
       tercarta = aleatoria.nextInt(13) +1;
       }while((segcarta == tercarta) && (tercarta == primercarta) || (primercarta == tercarta) || (tercarta == segcarta));
       System.out.println("su tercera carta");
       System.out.println(tercarta);
       
       
       
      if ((segcarta <= tercarta) && (tercarta <= primercarta) || (primercarta <= tercarta) && (tercarta <= segcarta)){
          
          numero = numero + Apostar;
            System.out.println("Ganastes el juego ahora el total de  tu Dinero es de " + numero);
      }else{
      numero = numero - Apostar; 
      System.out.println("perdiste el juego  por lo tanto ahora te quedan " + numero +" de dinero");
      }
    }while (numero!=0);
        }
    }
    public static void DibujarLaViga(){
        System.out.println("  ________ ");
    }
    public static void  PonerElLazo(){
	System.out.println(" |       |   ");
        System.out.println(" |       _  ");
    }
    public static void DibujarLaCabezaDelHombre(){
        System.out.println(" |      (_)");
    }	
     public static void DibujarElGargantaDelHombre(){
	System.out.println(" |       * ");
	}
     public static void DibujarLasManosDelHombre(){
	System.out.println(" |      xlx");
	}
    public static void DibujarElcuerpoDelHombre(){
	System.out.println(" |       l");
	}
    public static void DibujarLosPiesDelHombre(){
     System.out.println(   " |      xlx");
     System.out.println(   " |  ");
	}
 
}
