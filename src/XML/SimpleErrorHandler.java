package XML;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SimpleErrorHandler implements ErrorHandler {


    // Método llamado en caso de advertencia durante la validación
    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.out.println("Error de validación (advertencia): " + e.getMessage());
    }

    // Método llamado en caso de error durante la validación
    @Override
    public void error(SAXParseException e) throws SAXException {
        System.out.println("Error de validación: " + e.getMessage());
    }

    // Método llamado en caso de error fatal durante la validación
    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.out.println("Error de validación fatal: " + e.getMessage());
    }
}
