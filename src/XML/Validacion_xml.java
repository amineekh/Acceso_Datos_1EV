package XML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;


public class Validacion_xml {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // Intentar visualizar
        try {
            // Crear una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();

            // Configurar la fáctory para ser validante y consciente de espacios de nombres
            factory.setValidating(true);
            factory.setNamespaceAware(true);

            // Crear un DocumentBuilder a partir de la factory
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Establecer un manejador de errores para el builder
            builder.setErrorHandler(new SimpleErrorHandler());

            // Parsear el documento XML usando el DocumentBuilder
            Document document = builder.parse(new File("C:\\AMINE\\ACCSO DATOS\\XML\\restaurante_DTD.xml"));

            // Imprimir un mensaje indicando que el documento XML es válido con el DTD
            System.out.println("El documento XML es válido con el DTD.");


        }
        catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir durante el proceso de validación
            System.out.println("Error de validación: " + e.getMessage());
        }

    }





}
