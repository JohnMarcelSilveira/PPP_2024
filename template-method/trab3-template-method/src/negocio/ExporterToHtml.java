package negocio;

import java.util.List;

public class ExporterToHtml extends Exporter{
    @Override
    protected String processData(List<Pessoa> pessoas) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<head>\n");
        html.append("  <title>Lista de Pessoas</title>\n");
        html.append("</head>\n");
        html.append("<body>\n");
        html.append("  <h1>Lista de Pessoas</h1>\n");
        html.append("  <table>\n");
        html.append("    <tr>\n");
        html.append("      <th>Nome</th>\n");
        html.append("      <th>Idade</th>\n");
        html.append("      <th>Email</th>\n");
        html.append("    </tr>\n");
        for (Pessoa pessoa : pessoas) {
            html.append("    <tr>\n");
            html.append("      <td>").append(pessoa.getNome()).append("</td>\n");
            html.append("      <td>").append(pessoa.getIdade()).append("</td>\n");
            html.append("      <td>").append(pessoa.getEmail()).append("</td>\n");
            html.append("    </tr>\n");
        }
        html.append("  </table>\n");
        html.append("</body>\n");
        html.append("</html>");
        return html.toString();
    }
    
}
