package negocio;

import java.util.List;

public class ExporterToLatex extends Exporter{
    @Override
    protected String processData(List<Pessoa> pessoas) {
        StringBuilder latex = new StringBuilder();
        latex.append("\\documentclass{article}\n");
        latex.append("\\begin{document}\n");
        latex.append("\\begin{tabular}{|c|c|c|}\n");
        latex.append("  \\hline\n");
        latex.append("  Nome & Idade & Email \\\\ \\hline\n");
        for (Pessoa pessoa : pessoas) {
            latex.append("  ").append(pessoa.getNome()).append(" & ");
            latex.append(pessoa.getIdade()).append(" & ");
            latex.append(pessoa.getEmail()).append(" \\\\ \\hline\n");
        }
        latex.append("\\end{tabular}\n");
        latex.append("\\end{document}");
        return latex.toString();
    }
    
}
