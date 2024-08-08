package negocio;

import java.util.List;

public class ExporterToPdf extends Exporter{
    @Override
    protected String processData(List<Pessoa> pessoas) {
        StringBuilder pdf = new StringBuilder();
        pdf.append("PDF\n");
        for (Pessoa pessoa : pessoas) {
            pdf.append(pessoa.getNome()).append(", ");
            pdf.append(pessoa.getIdade()).append(", ");
            pdf.append(pessoa.getEmail()).append("\n");
        }
        return pdf.toString();
    }
    
}
