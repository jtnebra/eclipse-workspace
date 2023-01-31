package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];
		double ayuda;
		for(int i =0;i<vector1.length;i++) {
			ayuda =Math.random()*10+1;
			vector1[i]=(int) ayuda;
		}
		for(int i =0;i<vector2.length;i++) {
			ayuda =Math.random()*10+1;
			vector2[i]=(int) ayuda;
		}
		for(int i =0;i<vector3.length;i++) {
			vector3[i]=vector1[i]+vector2[i];
			System.out.println("el valor "+i+" del vector 3 es: "+vector3[i]);
		}
		
	}

}
