package brobsi;

import javax.swing.text.View;
import javax.swing.text.html.ImageView;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("anmeldung")
public class Anmeldung {
	
	
	
	@POST
	@Produces("application/xml")
	public String login(){
		return 		"<?xml version='1.0' encoding='utf-8'?>" + 
			"<SerioCommands version='1.1'>" + 
				"<DisplayForm>" + 
					"<Script>" + 
						"<![CDATA["+
							"<UiScreen>"+ 
					        	
//								"<Operations>"+
//				          			"<Op action='./6.xml' type='Submit'></Op>"+
//				          			"<Op action='./5.xml' type='Back'></Op>"+
//				          		"</Operations>"+
//
//								"<IoScreen>"+
//									"<IoObject>"+ 
//										"<Selection id='1' multiple='false'>"+ 
//
//			"<Item value='one'>"+
//				"<Label imgsrc='./brobsi/WebContent/image/printer.png' imgmethod='GET'></Label>"+
//			"</Item>"+
//			"<Item value='two'>"+
//				"<Label></Label>"+
//			"</Item>"+
//        "<Item value='three'>"+
//           "<Label></Label>"+
//        "</Item>"+
//           
//        "<Item value='four'>"+
//           "<Label></Label>"+
//         "</Item>"+
//										"</Selection>"+ 
//
//									
//									
//									
//									"</IoObject>"+ 
//								"</IoScreen>"+

							
                     "<Title>Select  function</Title>"+
                    "<LinkScreen>"+
                         "<LinkControl>"+
                            
                         	"<LinkItem href='./gotoa.xml'>"+
                                 "<Label imgsrc='./image/brother_bsi.png'></Label>"+
                                "<Details><Detail>DRUCKEN</Detail></Details>"+
                             "</LinkItem>"+
                                
							"<LinkItem href='./gotoa.xml'>"+
								"<Label imgsrc='./brobsi/image/brother_bsi.png'></Label>"+
								"<Details><Detail>KOPIEREN</Detail></Details>"+
							"</LinkItem>"+
                                
  							"<LinkItem href='./gotoa.xml'>"+
  								"<Label imgsrc='./brother_bsi.png'></Label>"+
  								"<Details><Detail>SCANNEN</Detail></Details>"+
  							"</LinkItem>"+
  								
							"<LinkItem href='./gotoa.xml'>"+
								"<Label imgsrc='./brobsi/image/brother_bsi.png'></Label>"+
								"<Details><Detail>FAX</Detail></Details>"+
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
