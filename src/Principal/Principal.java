package Principal;

import Calculos.Calculo;
import Generadores.GeneradorDeArchivo;
import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        ConsultaDeConversion consulta = new ConsultaDeConversion();

        Calculo calculo = new Calculo(consulta);
        GeneradorDeArchivo generador = new GeneradorDeArchivo();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                1) Nuevo Sol (Peru) ==>> Dólar Estadounidense
                2) Nuevo Sol (Peru) ==>> Euro
                3) Nuevo Sol (Peru) ==>> Franco Suizo
                4) Dólar Estadounidense ==>> Nuevo Sol (Peru)
                5) Euro ==>> Nuevo Sol (Peru)
                6) Franco Suizo ==>> Nuevo Sol (Peru)
                
                7) Otra opción de conversión
                
                8) Salir
                ***************************************************
                """;
        while (opcion != 8) {
            try {
                System.out.println(menu);
                opcion = Integer.parseInt(lectura.nextLine());

                LocalDateTime tdate = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formatFecha = tdate.format(formato);

                switch (opcion) {
                    case 1:
                        calculo.guardaValores("PEN","USD");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 2:
                        calculo.guardaValores("PEN","EUR");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 3:
                        calculo.guardaValores("PEN","CHF");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 4:
                        calculo.guardaValores("USD","PEN");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 5:
                        calculo.guardaValores("EUR","PEN");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 6:
                        calculo.guardaValores("CHF","PEN");
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 7:
                        calculo.guardarValorPersonalizado();
                        respuestas.add(formatFecha +" - "+ calculo.obtenerRespuesta());
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Ingrese una opcion validad...");
                }
            }catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error...Ingrese solo códigos de moneda válidos.");
            }catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error...Ingrese un valor numérico válido.");
            }
        }
        generador.guardarJson(respuestas);
        System.out.println("Programana Finalizado...");
    }
}
