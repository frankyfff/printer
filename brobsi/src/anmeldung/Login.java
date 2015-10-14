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
					"<SerioCommands version='1.0'>" + 
						"<DisplayForm>" + 
							"<Script>" + 
								"<![CDATA["+
									"<UiScreen info Level='Normal'>"+ 
						            	"<Title>Hello BSI</Title>"+
						            		"<AutoTransition>300</AutoTransition>"+
						            			"<Operations>"+
						            				"<Op type='Submit' action='./next.xml'>"+
						            					"<Label imgsrc='submit.jpg'>Submit</Label>"+
						            				 "</Op>"+
						            				 "<Op type='Submit' action='./next.xml'>"+
						            					"<Label imgsrc='back.jpg'>Back</Label>"+
						            				 "</Op>"+
												"</Operations>"+
						            		
						            		"<IoScreen>"+
						            			"<IoObject>"+
						            				"<Title>Welcome To BSI<Title>"+
													"<Description>Hello BSI World<Description>"+
													"<Message>Press OK or Start to proceed<Message>"+
						            			"</IoObject>"+
						            		"</IoScreen>"+
									"</UiScreen>" +
								"]]>" + 
							"</Script>" + 
						"</DisplayForm>" + 
					"</SerioCommands>";
	}
}
