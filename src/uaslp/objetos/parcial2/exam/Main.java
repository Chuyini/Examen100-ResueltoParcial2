package uaslp.objetos.parcial2.exam;

import uaslp.objetos.parcial2.exam.exporters.ExporterFactory;
import uaslp.objetos.parcial2.exam.exporters.ExporterType;
import uaslp.objetos.parcial2.exam.messagebuilder.MessageBuilderFactory;
import uaslp.objetos.parcial2.exam.messagebuilder.MessageBuilder;
import uaslp.objetos.parcial2.exam.messagebuilder.MessageType;

public class Main {

    // NO MODIFICAR ESTE ARCHIVO

    public static void main(String[] args) {

        MessageType[] messageTypes = MessageType.values();
        StringBuilder message = new StringBuilder();

        for (MessageType messageType : messageTypes) {
            MessageBuilder messageBuilder = MessageBuilderFactory.getMessageBuilder(messageType);

            message.append(messageBuilder.create());
            message.append(System.lineSeparator());
        }

        System.out.println(message);
/*
        Salida esperada:

        MessageType: Create reservation
        MessageType: Modify reservation
        MessageType: Check in reservation
        MessageType: Check out reservation
*/

        System.out.println(ExporterFactory.getExporter(ExporterType.JSON).export(message.toString()));
        //Se espera la salida { "message":"json format"} tras llamar a JsonExporter
        System.out.println(ExporterFactory.getExporter(ExporterType.XML).export(message.toString()));
        //Se espera la salida <message>XML format</message> tras llamar a XmlExporter
        System.out.println(ExporterFactory.getExporter(ExporterType.HTML).export(message.toString()));
        //0Se espera la salida <html><body>HTML format</body></html> tras llamar a HtmlExporter



    }
}
