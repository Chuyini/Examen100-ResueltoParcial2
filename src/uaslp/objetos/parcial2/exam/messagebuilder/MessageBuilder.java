package uaslp.objetos.parcial2.exam.messagebuilder;

public abstract class MessageBuilder {

    // NO MODIFICAR ESTE ARCHIVO

    public String create() {
        return "MessageType:" + getDescription();
    }

    protected abstract String getDescription();
}
