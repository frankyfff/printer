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
}
//"<PassiveMode>true</PassiveMode>"+
//"<PortNum>21</PortNum>"+
