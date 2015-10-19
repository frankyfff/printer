package detlef;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("loginnew")
public class Login {
	
	@POST
	@Produces("application/xml")
	@Path("scanning")
	public String versuch(){
		return
				"<?xml version='1.0' encoding='utf-8'?>" + 
				"<SerioCommands version='1.0'>" + 
					"<IoScanAndSend>"+
						"<TxProfiles>"+
							"<Cifs>"+
								"<CifsParams>"+
								"<Host>172.16.100.156</Host>"+
								"<StoreDir>Ablage</StoreDir>"+
								"<FileName>ÆÆÆÆÆÆÆÆÆx</FileName>"+
								"<FileNameFixed>true</FileNameFixed>"+
								"<AuthMethod>Auto</AuthMethod>"+
								"<User>Druckertester</User>"+
								"<Password>drucken</Password>"+
								"<KerberosServer></KerberosServer>"+
								"</CifsParams>"+
							"</Cifs>"+
						"</TxProfiles>"+
							"<ScanTray>ADF</ScanTray>"+
							"<ColorMode>Color</ColorMode>"+
							"<Resolution>Normal</Resolution>"+
							"<FileType>PDF</FileType>"+
					"</IoScanAndSend>"+
						"<DisplayInfo>"+ 
							"<Script>"+ 
								"<![CDATA[<?xml version='1.0' encoding='utf-8'?>"+
									"<UiScreen>"+
										"<NullScreen></NullScreen>"+
									"</UiScreen>" +
								"]]>"+ 
							"</Script>"+ 
						"</DisplayInfo>"+ 
				"</SerioCommands>";
	}
	
	@POST
	@Produces("application/xml")
	@Path("menue")
	public String login(){
		return 	
				"<?xml version='1.0' encoding='utf-8'?>"+
					"<SerioCommands version='1.0'>"+
						"<DisplayForm>"+
							"<Script>"+
								"<![CDATA["+
									"<UiScreen>"+
										"<Title>MFC Jobs</Title>"+
											"<LinkScreen>"+
												"<LinkControl>"+
													"<LinkItem  href='http://172.16.100.196:8080/brobsi/brobsi/loginnew/scanning'>"+
														"<Label>Scannen</Label>"+
													"</LinkItem>"+
													"<LinkItem href='./2.xml'>"+
														"<Label>Copy</Label>"+
													"</LinkItem>"+
													"<LinkItem href='./3.xml'>"+
														"<Label>Print</Label>"+
													"</LinkItem>"+
													"<LinkItem href='./4.xml'>"+
														"<Label>Fax</Label>"+
													"</LinkItem>"+
												"</LinkControl>"+
											"</LinkScreen>"+
									"</UiScreen>"+
								"]]>"+
							"</Script>"+
						"</DisplayForm>"+
					"</SerioCommands>";
				
				
				
//				"<?xml version='1.0' encoding='utf-8'?>"+
//				"<SerioCommands version='1.0'>"+
//					"<DisplayForm>"+
//						"<Script>"+
//							"<![CDATA["+
//								"<UiScreen infoLevel='Normal'>"+
//									"<Title>Hello BSI.</Title>"+
//									"<AutoTransition>300</AutoTransition>"+
//										"<Operations>"+
//											"<Op type='Submit'  action='http://172.16.100.196:8080/brobsi/brobsi/scannen'>"+
//												"<Label>Submit</Label>"+
//											"</Op>"+
//											"<Op type='Back'  action='http://172.16.100.196:8080/brobsi/brobsi/loginnew'>"+
//												"<Label>Back</Label>"+
//											"</Op>"+
//										"</Operations>"+
//									"<IoScreen>"+
//										"<IoObject>"+
//											"<Title>Welcome To BSI</Title>"+
//											"<Description>Hello BSI World!</Description>"+
//											"<Message>Press OK or Start to proceed</Message>"+
//										"</IoObject>"+
//									"</IoScreen>"+
//								"</UiScreen>"+
//							"]]>"+
//						"</Script>"+
//					"</DisplayForm>"+
//		"</SerioCommands>";
				
				
				
				
				
				
				
				
//				//resultOfClock
//				"<?xml version='1.0' encoding='utf-8'?>"+ 
//				"<SerioCommands version='1.0'>"+ 
//					"<UpdateDb>"+ 
//						"<DataList>"+ 
//							"<Mib><Key>1.3.6.1.4.1.2435.2.4.3.2435.5.33.7.1.0</Key><Value>1</Value></Mib>"+
//							"<Mib><Key>1.3.6.1.4.1.2435.2.4.3.2435.5.33.7.2.0</Key><Value>2</Value></Mib>"+ 
//						"</DataList>"+ 
//						//"<JobFinAckUrl>./resultofupdatedb.xml</JobFinAckUrl>"+ 
//					"</UpdateDb>"+ 
//				"</SerioCommands>"; 
				
				
				
				
//						//resaultOfUpdateDB
//				"<?xml version='1.0' encoding='utf-8'?>"+
//				"<SerioCommands version='1.0'>"+
//					"<DisplayForm>"+
//						"<Script>"+
//							"<![CDATA["+
//								"<UiScreen>"+
//									"<Title>title</Title>"+
//										"<Operations>"+
//											"<Op type='Submit'>"+
//												"<Label>Submit</Label>"+
//											"</Op>"+
//										"</Operations>"+
//									"<IoScreen>"+
//										"<IoObject>"+
//											"<Title></Title>"+
//											"<Description></Description>"+
//											"<Message>Login Completed</Message>"+
//										"</IoObject>"+
//									"</IoScreen>"+
//								"</UiScreen>"+
//							"]]>"+
//						"</Script>"+
//					"</DisplayForm>"+
//		"</SerioCommands>";
				
				//testLogin
//				"<?xml version='1.0' encoding='utf-8'?>"+ 
//				"<SerioCommands version='100'>"+ 
//					"<ActivateLock>"+ 
//						"<UserId>BSI</UserId>"+ 
//							"<LockInfo>"+ 
//								"<Copy permitted='true' colorEnable='false'></Copy>"+ 
//								"<SendFax permitted='true' colorEnable='true'></SendFax>"+ 
//								"<ScanAndSend permitted='true' colorEnable='true'></ScanAndSend>"+ 
//								"<DirectPrint permitted='true' colorEnable='true'></DirectPrint>"+ 
//								"<PrintFax permitted='true' colorEnable='true'></PrintFax>"+ 
//								"<PcPrint permitted='true' colorEnable='true'></PcPrint>"+ 
//								"<WebConnectUload permitted='true' colorEnable='false'></WebConnectUload>"+ 
//								"<WebConnectDload permitted='true' colorEnable='true'></WebConnectDload>"+ 
//							"</LockInfo>"+ 
//								//"<JobFinAckUrl>./resultoflock.xml</JobFinAckUrl>"+ 
//					"</ActivateLock>"+ 
//		"</SerioCommands>"; 
	}
}
