import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

public class Field {
    private int field;

    public Field(int value) {
        this.field = value;
    }

    public int getValue() {
        return field;
    }

    public void setValue(int value) {
        this.field = value;
    }
}