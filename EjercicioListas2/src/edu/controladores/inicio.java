package edu.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba un número");
		int numeros = sc.nextInt();
	
		List<Integer> nume = new ArrayList<>(numeros);
		
		System.out.println(nume);
		
		boolean val = false;
	 
		
		int aux;
		
		do {
			
		System.out.println("Escriba otro número");
		
		int numerosig = sc.nextInt();
		nume.add(numerosig);
		System.out.println(nume);
		if(numeros >= 0) {
			val = true;
		}
	
		else {
			val = false;
		}
			
		}
	 
while(!val); 
	
		
	
	System.out.println("Número introducido menor o igual a 0");
		
		for(int i = 0; i < nume.size()-1; i++) {
			for (int j = 0; j < nume.size()-i-1; i++) {
				
				if (nume.get(j+1) < nume.get(j)) {
					aux = nume.get(j+1);
					nume.set(j+1, nume.get(j));
					nume.set(j, aux);
				}
			}
		System.out.println(nume);
}	

}
}
