package XML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document; import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;


public class Validacion_xml {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // Intentar visualizar
        try {

                DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
                factory.setValidating(true);
                factory.setNamespaceAware(true);


                DocumentBuilder builder = factory.newDocumentBuilder();

                builder.setErrorHandler(new SimpleErrorHandler());

                Document document = builder.parse(new File("C:\\AMINE\\ACCSO DATOS\\XML\\restaurante_DTD.xml"));




             System.out.println("El documento XML es válido con el DTD.");



        }
        catch (Exception e) {
            System.out.println("Error de validación: " + e.getMessage());
        }

    }





}
