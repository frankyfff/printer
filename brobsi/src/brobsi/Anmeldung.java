package brobsi;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("anmeldung")
public class Anmeldung {
	
	@POST
	@Produces("application/xml")
	public String login(){
		return 		"<?xml version='1.0' encoding='utf-8'?>" + 
			"<SerioCommands version='v009'>" + 
				"<DisplayForm>" + 
					"<Script>" + 
						"<![CDATA[" +
							"<UiScreen>" + 
//								"<Title>Welcome To BSI</Title>" + 
//									"<LinkScreen>" + 
//										
//										"<LinkControl>" + 
//											
//											"<LinkItem href='./1.xml'>"+
//												"<Label>Drucken</Label>"+ 
//											"</LinkItem>" + 
//											
//											"<LinkItem href='http://www.172.16.100.196:8080/brobsi/brobsi/scannen'>"+
//												"<Label>Scannen</Label>" + 
//											"</LinkItem>"+ 
//									
//											"<LinkItem href='./3.xml'>"+
//												"<Label>Faxen</Label>" + 
//											"</LinkItem>"+ 
//										
//											"<LinkItem href='./4.xml'>"+
//												"<Label>Copy</Label>"+ 
//											"</LinkItem>"+ 
//											
//									"</LinkControl>" + 
//								"</LinkScreen>" + 

								"<IoScreen>"+
									"<IoObject>"+
											"<IdScanner>1"+
												"<Label>"+
													
												"<Label>"+
											"<IdScanner>"+
									"<IoObject>"+
								"<IoScreen>"+
							"</UiScreen>" +
						"]]>" + 
					"</Script>" + 
				"</DisplayForm>" + 
			"</SerioCommands>";
	}
}
