package negocio;

import java.util.List;

public class ExporterToXml extends Exporter{
    @Override
    protected String processData(List<Pessoa> pessoas) {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<pessoas>\n");
        for (Pessoa pessoa : pessoas) {
            xml.append("  <pessoa>\n");
            xml.append("    <nome>").append(pessoa.getNome()).append("</nome>\n");
            xml.append("    <idade>").append(pessoa.getIdade()).append("</idade>\n");
            xml.append("    <email>").append(pessoa.getEmail()).append("</email>\n");
            xml.append("  </pessoa>\n");
        }
        xml.append("</pessoas>");
        return xml.toString();
    }

    
}
