package negocio;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public abstract class Exporter {
    public void parseDataAndGenerateOutput(String inputFile, String outputFile) {
        List<Pessoa> pessoas = readData(inputFile);
        String processedData = processData(pessoas);
        writeData(processedData, outputFile);
    }
    
    private List<Pessoa> readData(String inputFile){
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            // Ignora a primeira linha (cabeçalho)
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",", -1); // Use -1 para garantir que campos vazios sejam tratados
                                                     // corretamente                                                     
                if (data.length >= 3) { 
                    String nome = data[0].trim(); 
                    int idade = Integer.parseInt(data[1].trim()); 
                    String email = data[2].trim(); 
                    pessoas.add(new Pessoa(nome, idade, email));
                } else {
                    System.out.println("Erro: Linha inválida - " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
            
    protected abstract String processData(List<Pessoa>pessoas);

    private void writeData(String dataProcessed, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(dataProcessed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
