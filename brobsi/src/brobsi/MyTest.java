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
		"<?xml version='1.0' encoding='utf-8'?>"+
		"<SerioCommands version='1.0' >"+
		   "<DisplayForm>"+
		      "<Script>"+
		         "<![CDATA["+
		         "<UiScreen>"+
		         	"<Operations>"+
		               "<Op type='Submit' action='./5.xml'> </Op>"+
		               "<Op type='Back' action='./3.xml'> </Op> "+
		            "</Operations>"+
		            
		            "<IoScreen>"+
		               "<IoObject>"+
		                  "<Title>String Input</Title>"+
		                  "<Description>xml TextArea Description</Description>"+
		                  "<TextArea id='textarea_id' cpos='Tail'>"+
		                     "<InitValue>Monir</InitValue>"+
		                     "<MinLength>1</MinLength>"+
		                     "<MaxLength>128</MaxLength>"+
		                     "<Mask>false</Mask>"+
		                     "<LetterTypes>"+
		                        "<LetterType>UpperCase</LetterType>"+
		                        "<LetterType>LowerCase</LetterType>"+
		                        "<LetterType>Glyph</LetterType>"+
		                        "<LetterType>EnvDependent</LetterType>"+
		                     "</LetterTypes>"+
		                     "<NumericalArea id='numericalarea_id' cpos='Head'>"+
		                        "<InitValue>20</InitValue>"+
		                        "<MinValue>0</MinValue>"+
		                        "<MaxValue>10000</MaxValue>"+
		                        "<Mask>false</Mask>"+
		                     "</NumericalArea>"+

		                  "</TextArea>"+
		               "</IoObject>"+
		            "</IoScreen>"+
		         
		          "</UiScreen>"+
		         "]]>"+
		      "</Script>"+
		   "</DisplayForm>"+
		"</SerioCommands>";

/*				
				"<?xml version='1.0' encoding='utf-8'?>" + 
				"<SerioCommands version='1.0'>" + 
					"<DisplayForm>"+ 
						"<Script>"+ 
							"<![CDATA["+
								"<UiScreen>"+ 
					            	"<Title>Hello BSI</Title>"+
//					            			"<Operations>"+
//					            				"<Op type='Submit' action='./next.xml'>"+
//					            					"<Label imgsrc='submit.jpg'>Submit</Label>"+
//					            				 "</Op>"+
//					            				 "<Op type='Submit' action='./next.xml'>"+
//					            					"<Label imgsrc='back.jpg'>Back</Label>"+
//					            				 "</Op>"+
//											"</Operations>"+
											"<IoScreen>"+
					            				"<IoObject>"+
					            					"<Title>Welcome To BSI<Title>"+
					            					"<Description>Hello BSI World<Description>"+
					            					"<Message>Press OK or Start to proceed<Message>"+
					            				"</IoObject>"+
					            			"</IoScreen>"+
								"</UiScreen>" +
							"]]>"+ 
						"</Script>"+ 
					"</DisplayForm>"+ 
				"</SerioCommands>";
*/				
				
				
//		"<?xml version='1.0' encoding='utf-8'?>" + 
//			"<SerioCommands version='v009'>" + 
//				"<DisplayForm>" + 
//					"<Script>" + 
//						"<![CDATA[" +
//							"<UiScreen>" + 
//								"<Title>Welcome To BSI</Title>" + 
//									"<LinkScreen>" + 
//										"<LinkControl>" + 
//											"<LinkItem href='./4.xml'>"
//											+ "<Label>option1</Label>" + 
//										"</LinkItem>" + 
//									"</LinkControl>" + 
//								"</LinkScreen>" + 
//							"</UiScreen>" +
//						"]]>" + 
//					"</Script>" + 
//				"</DisplayForm>" + 
//			"</SerioCommands>";
	}

}
