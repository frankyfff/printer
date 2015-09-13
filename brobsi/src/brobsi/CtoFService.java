package brobsi;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.net.URI;

@Path("/ctofservice")
public class CtoFService {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response convertCtoF() {

        Double celsius = 36.8;
        Double fahrenheit = ((celsius * 9) / 5) + 32;

        // Liefert einen XML String mit der Berechnung von C zu F
        final String xmlString = convertCtoFfromInput(fahrenheit);

        // Macht aus dem XML String einen XML Document (Java Object!!!)
        Document document = parseToXmlDocument(xmlString);

        // In der Antwort muss die Adresse von deinem Server enthalten sein.
        URI uri = URI.create("http://localhost:8080/");

        Response response = Response.created(uri)
                .header("Content-Type", MediaType.APPLICATION_XML) // Setzt den Header: Content-Type = application/xml
                .header("Test-Header", "Irgend ein Wert!") // Irgend ein beliebiger Header, kannst du dir aussuchen
                .entity(document).build(); // Response wird erzeugt

        return response; // Liefert den Response zuruck an dem Client
    }

    @Path("{c}")
    @GET
    @Produces("application/xml")
    public String convertCtoFfromInput(@PathParam("c") Double c) {
        Double fahrenheit;
        Double celsius = c;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: C to F Converter Output: " + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }


    private Document parseToXmlDocument(String xmlString) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(new InputSource(new StringReader(xmlString)));
        } catch (Exception e) {
            System.out.println("Fehler beim parsen zu xml ... " + e.getMessage());
            e.printStackTrace();
        }
        return document;
    }

}
