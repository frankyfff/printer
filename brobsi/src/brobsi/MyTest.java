package brobsi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/monir.xml")
public class MyTest {

	public String gibzu(){
		return "<Test>Hello World <Test>";
	}
	
	
	
	@GET
	@Produces("application/xml;encoding=UTF-8")
	public String ausgabe() {
		
		return 
				
		"<?xml version='1.0' encoding='utf-8'?>"+
		"<SerioCommands version='1.0'>"+
		   "<DisplayForm>"+
		      "<Script>"+
		         "<![CDATA["+
		        " <UiScreen>"+
		            "<Title>Title</Title>"+
		           " <LinkScreen>"+
		              " <LinkControl>"+
		                
		              		" <LinkItem href='./1.xml'>"+
		              			" <Label >option1</Label>"+
		                   	" </LinkItem>"+
		                 
		                   	" <LinkItem href='./2.xml'>"+
		                   		" <Label >option2</Label>"+
		                   	" </LinkItem>"+
		                 
		                   	" <LinkItem href='./3.xml'>"+
		                   		"<Label >option3</Label>"+
		                   	" </LinkItem>"+
		                 
		                   	" <LinkItem href='./4.xml'>"+
		                   		"<Label >option4</Label>"+
		                   	"</LinkItem>"+
		                   		
		              " </LinkControl>"+
		           " </LinkScreen>"+
		        "</UiScreen>"+
		         "]]>"+
		      "</Script>"+
		  "</DisplayForm>"+
		"</SerioCommands>";
				
		/*
		"<SerioCommands version='1.0'>" +
				"<DisplayInfo>" + 
					
					"<Script>" + 
						"<![CDATA[" +
							"<UiScreen infoLevel='Normal'>" +
								"<Title>A</Title>" +
								"<Title>B</Title>" +
								"<Title>C</Title>" +
								"<Title>D</Title>" +
								"<IoScreen>" + 
									"<IoObject>" + 
										"<Title>scan2SMTP</Title>" + 
											"<Description>executing scan2smtp</Description>" +
											"<Message>executing scan2smtp</Message>" + 
									"</IoObject>" + 
								"</IoScreen>" +
							"</UiScreen>" +
						"]]>" +
					"</Script>" + 
				"</DisplayInfo>" +
		"</SerioCommands>";	*/
	}
}
