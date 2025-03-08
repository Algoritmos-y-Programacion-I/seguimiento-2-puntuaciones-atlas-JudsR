// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Arrays;
import java.util.Scanner;

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar


	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{	
		int rondas, jugadores, jugadorActual, cantPuntajes;
		
		

		System.out.println("Bienvenidos al torneo de videojuegos.");
		System.out.println("Solo pueden partcipar un maximo de 10 jugadores y maximo 5 rondas cada uno.");
		
		System.out.println("Cuantos jugadores participan?: ");
		jugadores = escaner.nextInt();
		System.out.println("Cuantas rondas van a jugar?: ");
		rondas = escaner.nextInt();

		cantPuntajes = jugadores*rondas;

		int[] puntajes = new int[cantPuntajes];
		int[] suma = new int[jugadores];
		double[] promedio = new double[jugadores];
		//solicitar puntaje
		solicitarPuntaje(jugadores, rondas, puntajes, cantPuntajes);
		System.out.println("");
		System.out.println("Resultados del torneo:");
		calcularSumaTotal(puntajes, suma, rondas);
		calcularPromedio(promedio, rondas, suma, jugadores);
		for (int i = 0; i < jugadores; i++) {
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
	}

	public void solicitarPuntaje (int jugadores, int rondas, int[] puntajes, int cantPuntajes) {
		int x, y, rondaActual, jugadorActual;
		jugadorActual = 0;
		x = 0;

		for (y = 0; y < jugadores; y++) {
			jugadorActual = y+1;
			for (int i = 0; i < rondas; i++) {
				rondaActual = i+1;
				System.out.println("Cual fue el puntaje del jugador "+jugadorActual+" en la ronda "+rondaActual+":");
				puntajes[x] = escaner.nextInt();
				escaner.nextLine();
				x += 1;
			}
		}
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

	public void calcularSumaTotal(int[] puntajes, int[] suma, int rondas) {
        int  i, numJugador;
		Arrays.fill(suma, 0);
			
		for (i = 0; i < puntajes.length; i++){
			numJugador = i/rondas;
			suma[numJugador] += puntajes[i];
		}
		Arrays.stream(suma).forEach(System.out::println);
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public void calcularPromedio(double[] promedio, int rondas, int[] suma, int jugadores) {
        double calcProm;
		
		for (int i = 0; i < jugadores; i++) {
			calcProm = suma[i]/rondas;
			promedio[i] += calcProm;
		}
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    //public double encontrarMayor(double[] promedio) {
        
    //}
	
}