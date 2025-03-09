// Análisis (completar)
// Descripción del programa: El programa nos permite calcular la suma total de puntajes por jugador y su promedio,
//ademas detenerminar quien obtuvo el mayor puntaje. Pare esto recibe del usuario los puntajes.
// Entradas: Puntajes, cantidad de jugadores, cantidad de rondas.
// Salidas: Suma total del puntaje por jugador, promedio por jugador, jugador con puntaje más alto.
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
		int rondas, jugadores, jugadorActual, cantPuntajes, mayorPl;
		
		

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

		solicitarPuntaje(jugadores, rondas, puntajes, cantPuntajes);
		
		System.out.println("");
		System.out.println("Resultados del torneo:");

		calcularSumaTotal(puntajes, suma, rondas);
		calcularPromedio(promedio, rondas, suma, jugadores);
		mayorPl = encontrarMayor(suma, jugadores);

		for (int i = 0; i < jugadores; i++) {
			jugadorActual = i+1;

			System.out.println("");
			System.out.println("Jugador "+jugadorActual+" - Puntaje: "+suma[i]+" - Promedio: "+promedio[i]+".");
			System.out.println("");
		}

		System.out.println("El jugador con la puntuación más alta es: Jugador "+mayorPl+".");
	}

	/**
	 * Descripción: El método solicitarPuntaje permite pedirle a cada jigador segun la ronda el puntaje que obtuvo,
	 * ademas de validar si el puntaje ingresado es valido entre 0 y 100.
	 * @param int jugadores, int rondas, int[] puntajes, int cantPuntajes
	 * @return Solo retorna el arreglo pero este no hay necesidad pues se actualiza solo
	 */

	public void solicitarPuntaje (int jugadores, int rondas, int[] puntajes, int cantPuntajes) {
		int x, y, rondaActual, jugadorActual, puntaje;
		jugadorActual = 0;
		x = 0;

		for (y = 0; y < jugadores; y++) {
			jugadorActual = y+1;
			for (int i = 0; i < rondas; i++) {
				rondaActual = i+1;
				System.out.println("Cual fue el puntaje del jugador "+jugadorActual+" en la ronda "+rondaActual+":");
				
				while (true) {
					puntaje = escaner.nextInt();
	
					if (puntaje <= 100 && puntaje >= 0) {
						puntajes[x] += puntaje;
						escaner.nextLine();
						break;
					} else {
						System.out.println("");
						System.out.println("Ingrese puntajes validos entre 100 y 0.");
						System.out.println("Ingrese el numero nuevamente: ");
					}
				}
				x += 1;
			}
		}
	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite sumar los puntajes del jugador a travez de sus rondas
	 * @param int[] puntajes, int[] suma, int rondas
	 * @return Solo retorna el arreglo pero este no hay necesidad pues se actualiza solo
	 */

	public void calcularSumaTotal(int[] puntajes, int[] suma, int rondas) {
        int  i, numJugador;
		Arrays.fill(suma, 0);
			
		for (i = 0; i < puntajes.length; i++){
			numJugador = i/rondas;
			suma[numJugador] += puntajes[i];
		}
    }

	/**
	 * Descripción: El método calcularPromedio permite calcular el puntaje promedio por jugador 
	 * @param double[] promedio, int rondas, int[] suma, int jugadores.
	 * @return Solo retorna el arreglo pero este no hay necesidad pues se actualiza solo
	 */
    public void calcularPromedio(double[] promedio, int rondas, int[] suma, int jugadores) {
        double calcProm;
		
		for (int i = 0; i < jugadores; i++) {
			calcProm = suma[i]/rondas;
			promedio[i] += calcProm;
		}
    }

	/**
	 * Descripción: El método encontrarMayor permite determinar cual de los jugadores obtuvo el mayor puntaje
	 * @param int[] suma, int jugadores
	 * @return mayorPl: el numero del jugador que obtuvo el mayor putaje
	 */
    public int encontrarMayor(int[] suma, int jugadores) {
		int mayor = 0, mayorPl = 0;

		for (int i = 0; i < suma.length; i++) {
			if (suma[i]>mayor){
				mayor = suma[i];
				if (mayor == suma[i]){
					mayorPl = i;
				}
			}
		}
		mayorPl += 1;

        return mayorPl;
    }
	
}