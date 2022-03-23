package uaslp.objetos.parcial2.exam.exporters;

public class XmlExporter implements  Exporter{
    @Override
    public String export(String message) {
        return "<message>XML format</message>";
    }
}
