import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
    public  class UserXml {
        private List<Field> entry;

        public UserXml(List<Field> values) {
            this.entry = values;
        }

    public UserXml() {
    }

    public List<Field> getValues() {
            return entry;
        }

        public void setValues(List<Field> values) {
            this.entry = values;
        }
    }
