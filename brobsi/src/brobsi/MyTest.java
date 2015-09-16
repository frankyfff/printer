package brobsi;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/monir.xml")
public class MyTest {

	@POST
	@Produces("application/xml")
	public String ausgabe() {


		return
		"<?xml version='1.0' encoding='utf-8'?>" + 
			"<SerioCommands version='v009'>" + 
				"<DisplayForm>" + 
					"<Script>" + 
						"<![CDATA[" +
							"<UiScreen>" + 
								"<Title>Welcome To BSI</Title>" + 
									"<LinkScreen>" + 
										"<LinkControl>" + 
											"<LinkItem href='./4.xml'>"
											+ "<Label>option1</Label>" + 
										"</LinkItem>" + 
									"</LinkControl>" + 
								"</LinkScreen>" + 
							"</UiScreen>" +
						"]]>" + 
					"</Script>" + 
				"</DisplayForm>" + 
			"</SerioCommands>";
	}

}
