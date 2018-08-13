import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class ConvertXSQT {

        public void transform(String dest) throws Exception {
            String XSFILE = "Junior003/src/main/java/xml/rules.xsl";
            String INFILE = dest;
            String OUTFILE = "Junior003/src/main/java/xml/xslt.xml";
            StreamSource xslcode = new StreamSource(new File(XSFILE));
            StreamSource input = new StreamSource(new File(INFILE));
            StreamResult output = new StreamResult(new File(OUTFILE));
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer(xslcode);
            trans.transform(input, output);
        }
    }

