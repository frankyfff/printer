package anmeldung;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("login")
public class Login {
	
	@POST
	@Produces("application/xml")
	public String login(){
		return "<?xml version='1.0' encoding='utf-8'?>" + 
					"<SerioCommands version='1.1'>" + 
						"<DisplayForm>" + 
							"<Script>" + 
								"<![CDATA["+
									"<UiScreen>"+ 
											"<Operations>"+
												"<Op type='Submit' action='./6.xml'></Op>"+
												"<Op type='Back' action='./5.xml'></Op>"+
											"</Operations>"+
	
											"<IoScreen>"+
												"<IoObject>"+
													"<Selection id='1' multiple='false'>"+
														"<Item value='one'>"+
															"<Label>Einloggen</Label>"+
														"</Item>"+
														"<Item value='two'>"+
															"<Label>ID-Karte</Label>"+
														"</Item>"+
														"<Item value='three'>"+
															"<Label>Gast-Zugang</Label>"+
														"</Item>"+
													"</Selection>"+ 
												"</IoObject>"+ 
											"</IoScreen>"+
									"</UiScreen>" +
								"]]>" + 
							"</Script>" + 
						"</DisplayForm>" + 
					"</SerioCommands>";
	}
}
