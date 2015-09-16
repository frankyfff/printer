package scannen;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("scannen")
public class Scannen {
	
	@POST
	@Produces("application/xml")
	public String login(){
		return 		
			"<?xml version='1.0' encoding='utf-8'?>" + 
			"<SerioCommands version='v009'>" + 
				"<DisplayForm>" + 
					"<Script>" + 
						"<![CDATA[" +
							"<UiScreen>" + 
								"<Title>Scannen</Title>" + 
									"<LinkScreen>" + 
										
										"<LinkControl>" + 
											
											"<LinkItem href='./1.xml'>"+
												"<Label>scan 2 email</Label>"+ 
											"</LinkItem>" + 
											
											"<LinkItem href='./2.xml'>"+
												"<Label>scan2server</Label>" + 
											"</LinkItem>"+ 
									
											"<LinkItem href='./3.xml'>"+
												"<Label>scan3group</Label>" + 
											"</LinkItem>"+ 
										
											"<LinkItem href='./4.xml'>"+
												"<Label>scan2xxx</Label>"+ 
											"</LinkItem>"+ 
											
									"</LinkControl>" + 
								"</LinkScreen>" + 
							"</UiScreen>" +
						"]]>" + 
					"</Script>" + 
				"</DisplayForm>" + 
			"</SerioCommands>";
	}
	
}
