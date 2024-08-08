package apresentacao;

import negocio.ExporterToHtml;
import negocio.ExporterToLatex;
import negocio.ExporterToPdf;
import negocio.ExporterToSql;
import negocio.ExporterToXml;

public class App {
    public static void main(String[] args) throws Exception {
        String csv = "src\\apresentacao\\teste.csv";

        ExporterToHtml exporter = new ExporterToHtml();
        exporter.parseDataAndGenerateOutput(csv, "pessoas.html");
        ExporterToSql exporterToSql = new ExporterToSql();
        exporterToSql.parseDataAndGenerateOutput(csv, "pessoas.sql");
        ExporterToPdf exporterToPdf = new ExporterToPdf();
        exporterToPdf.parseDataAndGenerateOutput(csv, "pessoas.pdf");
        ExporterToXml exporterToXml = new ExporterToXml();
        exporterToXml.parseDataAndGenerateOutput(csv, "pessoas.xml");
        ExporterToLatex exporterToLatex = new ExporterToLatex();
        exporterToLatex.parseDataAndGenerateOutput(csv, "pessoas.tex");

    }
}
