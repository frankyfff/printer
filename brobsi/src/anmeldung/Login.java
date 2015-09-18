package anmeldung;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("login")
public class Login {
String link="http://172.16.100.196:8080/brobsi/brobsi/anmeldung";	
	@POST
	@Produces("application/xml")
	public String login(){
		return "<?xml version='1.0' encoding='utf-8'?>" + 
					"<SerioCommands version='1.1'>" + 
						"<DisplayForm>" + 
							"<Script>" + 
								"<![CDATA["+
									"<UiScreen>"+ 
						            	"<Title>Bitte wählen Sie?</Title>"+
						            		"<LinkScreen>"+
						            			"<LinkControl>"+
						            				"<LinkItem href='http://172.16.100.196:8080/brobsi/brobsi/anmeldung'>"+
						            					"<Label>Einloggen</Label>"+
						            					//"<Href>http://172.16.100.196:8080/brobsi/brobsi/anmeldung<Href>"+
						            				"</LinkItem>"+
						            				"<LinkItem href='./2.xml'>"+
						            					"<Label>ID-Karte</Label>"+
						            				"</LinkItem>"+
						            				"<LinkItem href='./3.xml'>"+
						            					"<Label>Gast</Label>"+
						            				"</LinkItem>"+
						            			"</LinkControl>"+
						            		"</LinkScreen>"+
									"</UiScreen>" +
								"]]>" + 
							"</Script>" + 
						"</DisplayForm>" + 
					"</SerioCommands>";
	}
}
