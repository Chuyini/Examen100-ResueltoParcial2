package uaslp.objetos.parcial2.exam.messagebuilder;

public class MessageBuilderFactory {


    public static  MessageBuilder getMessageBuilder(MessageType messageType) {

        MessageBuilder mesaje= new MessageBuilder() {
            @Override
            protected String getDescription() {
                return messageType.name();
            }

        };

        return (mesaje);

    }
}
