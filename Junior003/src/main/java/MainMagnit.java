

import javax.xml.bind.JAXBContext;

import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainMagnit {
    public static void main(String[] args) throws Exception {
        System.out.println("Please entre n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int n = Integer.parseInt(x);
        StoreSQl storeSQl = new StoreSQl();
        UserXml xmlUsage = new UserXml();
        List<Field> field = new ArrayList<Field>();


        storeSQl.open();
        if (storeSQl.isEmpty()) {
            storeSQl.newSql();
        } else storeSQl.cleanDB();
        storeSQl.insert(n);
        int[] res = storeSQl.output(n);
        for(int i = 0; i < n; i++) {
           field.add(new Field(res[i]));
        }
        xmlUsage.setValues(field);
        File file = new File("C:/projects/Sergey-White/Junior003/src/main/java/xml/jaxb.xml");
        JAXBContext context = JAXBContext.newInstance(UserXml.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(xmlUsage, file);
        storeSQl.close();
        ConvertXSQT convertXSQT = new ConvertXSQT();
        convertXSQT.transform(file.getAbsolutePath());
    }
}
