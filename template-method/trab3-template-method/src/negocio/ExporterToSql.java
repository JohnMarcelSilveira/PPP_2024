package negocio;

import java.util.List;

public class ExporterToSql extends Exporter{
    @Override
    protected String processData(List<Pessoa> pessoas) {
        StringBuilder sql = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            sql.append("INSERT INTO pessoas (nome, idade, email) VALUES (");
            sql.append("'").append(pessoa.getNome()).append("', ");
            sql.append(pessoa.getIdade()).append(", ");
            sql.append("'").append(pessoa.getEmail()).append("');\n");
        }
        return sql.toString();
    }
    
}
