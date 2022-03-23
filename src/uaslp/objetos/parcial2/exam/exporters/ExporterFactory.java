package uaslp.objetos.parcial2.exam.exporters;

public class  ExporterFactory {


    public static Exporter getExporter(ExporterType json) {

        JsonExporter j=new JsonExporter();
        HtmlExporter H=new HtmlExporter();
        XmlExporter X=new XmlExporter();

        if("JSON"== json.name())
        {
            Exporter expo = new Exporter() {
                @Override
                public String export(String me) {
                    return j.export(me);
                }
            };


        }else if ("HTML"== json.name())
        {
            Exporter expo = new Exporter() {
                @Override
                public String export(String me) {
                    return H.export(me);
                }
            };
            return H;
        }else if ("XML"== json.name())
        {
            Exporter expo = new Exporter() {
                @Override
                public String export(String me) {
                    return X.export(me);
                }
            };
            return X;
        }
        return j;
    }
}
