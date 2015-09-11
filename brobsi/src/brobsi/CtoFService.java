package brobsi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ctofservice.xml")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "Hello World";
//				/*
//				"<ctofservice>" + 
//					"<celsius>" + celsius + "</celsius>" + 
//					"<ctofoutput>" + result + "</ctofoutput>" + 
//				"</ctofservice>";
//				*/
//
//	 // <'?' + "xml" + "version" + '=' + 1.0 "encoding" + '=' + "utf-8" + '?'> + 
//			
//			"<SerioCommands version  = '1.0'>" +
//			"<IoScanAndSend>" +
//			"<TxProfiles>" +
//						"<Smtp>" +
//							"<Destination>schaunach@gmail.com</Destination>"+
//							"<Destination>bigtrain05@brother.de</Destination>"+
//         				"</Smtp>" +
//         			"</TxProfiles>" +
//         				//<!-- <ScanTray>FB</ScanTray -->
//	  					"<ColorMode>Color</ColorMode>" +
//						"<Resolution>Normal</Resolution>" +
//						"<FileType>PDF</FileType>" +
//      					"<DuplexScanEnable>true</DuplexScanEnable>" +
//      					"<ShortEdgeBinding>true</ShortEdgeBinding>" +
//      					"<JobFinAckUrl>../end.xml</JobFinAckUrl>" +
//      			"</IoScanAndSend>" +
//      				"<DisplayInfo>" +
//      					"<Script>" +
//      								"<![CDATA["+
//      					
//      								"<UiScreen infoLevel='Normal'>"+
//      								
//									"<IoScreen>" +
// 									"<IoObject>" +
// 										"<Title>scan2SMTP</Title>"+
// 										"<Description>executing scan2smtp</Description>"+
// 										"<Message>executing scan2smtp</Message>"+
// 									"</IoObject>"+
// 								"</IoScreen>"+
//      								
//									"</UiScreen>"
//      								
//		+ "]]>" +	
// 								 
//         						
//      					"</Script>" + 
//      				"</DisplayInfo>" +
//      	"</SerioCommands>";
	
		
		
		
		
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}
