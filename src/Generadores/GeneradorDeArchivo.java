package Generadores;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivo {
    public void guardarJson (List<String> lista){
        try {
            FileWriter fileWriter = new FileWriter("Consultas_Conversion.txt");
            for (String resultado : lista){
                fileWriter.write(resultado);
                fileWriter.write("\n");
            }
            fileWriter.close();
            System.out.println("su consulta de la conversion de su moneda esta guardado en 'Consultas_Conversion.txt'");

        }catch (IOException e){
            System.out.println("Error al guardar su Consulta de conversion: " + e.getMessage());

        }

    }
}
