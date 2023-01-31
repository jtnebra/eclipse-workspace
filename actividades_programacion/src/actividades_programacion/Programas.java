/**
 * 
 */
package actividades_programacion;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class Programas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean correcto=false;
	       int numero=0;
	       int calculo;
	       while(!correcto){
	           System.out.println("Di un numero del 1 al 10");
	           if(numero>=1&&numero<=10)
	           correcto=true;
	        }
	        System.out.println("Tabla del "+numero);
	        for(int i=0;i<=10;i++){
	            calculo=numero*i;
	            System.out.println(numero+" X "+i+" = "+calculo);
	        }
	}

}
