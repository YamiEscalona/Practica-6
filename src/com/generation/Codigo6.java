package com.generation;

public class Codigo6 {
	
	// Se agregó el método main
	public static void main(String[] args) {
	  
		// Se agregó new 
		int[] n = new int[20];

		// Le faltaba un + 
		for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      // Se agregó .out
	      System.out.print(n[i] + " ");
	    }
		
		System.out.println();
	    
		// Se le quitó la l
	    System.out.print("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    // Se le agregó un )
	    int opcion = Integer.parseInt(System.console().readLine());

	    // Se le intercambió de lugar (? :)
	    int multiplo = (opcion == 1) ? 5 : 7;
	    
	    // Se cambió el foreach por el for y el char por el int
	    for (int e : n) {
	    	// Se agregó el }
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	        } else {
	        	// Se cambió el in por el out
	        System.out.print(e + " ");
	      }
	    }
	  // Se agregó }
	}
} 