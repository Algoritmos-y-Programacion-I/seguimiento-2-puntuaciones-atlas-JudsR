// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar


	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{	
		int rondas, jugadores, jugadorActual;
		
		

		System.out.println("Bienvenidos al torneo de videojuegos.");
		System.out.println("Solo pueden partcipar un maximo de 10 jugadores y maximo 5 rondas cada uno.");
		
		System.out.println("Cuantos jugadores participan?: ");
		jugadores = escaner.nextInt();

		int[] puntajes = new int[jugadores];
		int[] suma = new int[jugadores];
		double[] promedio = new int[jugadores];

		System.out.println("Cuantas rondas van a jugar?: ");
		rondas = escaner.nextInt();
		//solicitar puntaje
		solicitarPuntaje(jugadores, rondas, puntajes);
		System.out.println("");
		System.out.println("Resultados del torneo:");
		calcularSumaTotal(puntajes, suma, rondas);
		calcularPromedio(promedio, rondas);
		for (i = 0; i < jugadores; i++) {
			jugadorActual = i+1;

			System.out.println("Jugador "+jugadorActual+" - Puntaje: "+suma[i]+" - Promedio: "+promedio[i]+".");

		System.out.println("");
		System.out.println("");
		// Declaracion de todas las variables a usar en el programa


		// Notificacion al usuario de la solicitud de dato

		// Capturamos el dato con nuestro Scanner (que se llama, escaner)



		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}

	public int solicitarPuntaje (int jugadores, int rondas, int[] puntajes) {
		int y, rondaActual, jugadorActual;
		rondaActual = 0;
		jugadorActual = 0;

		for (int i = 0; i < rondas; i++) {

			rondaActual = +1;			

			for (y = 0; y < jugadores; y++) {

				jugadorActual = +1;

				System.out.println("Cual fue el puntaje del jugador "+jugadorActual+" en la ronda "+rondaActual+":");
				puntajes[y] = escaner.nextInt();
				escaner.nextLine();
			}	
		}
		return puntajes;
	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */

	public int[] calcularSumaTotal(int[] puntajes, int[] suma, int rondas) {
        int sumaP, cantPuntajes, x;

			
		for(int i = 0; i < puntajes.length; i++){
			for (int x = 0; x < rondas; x++) {
			sumaP += suma[x];
			}
		}
		return suma;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double[] calcularPromedio(double[] promedio, int rondas) {
        double prom = 0;
		
		for (int i = 0; i < suma; i++) {
			prom = suma[i]/rondas;
			prom += promedio[i];
		}
		return promedio;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] promedio) {
        
    }
    


	

	
}