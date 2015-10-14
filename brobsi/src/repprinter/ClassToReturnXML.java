package repprinter;

import java.io.File;

import javax.activation.MimetypesFileTypeMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("http://172.16.100.196/start.xml")
public class ClassToReturnXML {
	
	@GET
	@Produces({MediaType.APPLICATION_ATOM_XML})
	public Response methodToReturnXML(@PathParam("XML") String xml){
		
		File f = new File(xml);
		
		if (!f.exists()) {
			throw new WebApplicationException(404);
		}
		
		String mt = new MimetypesFileTypeMap().getContentType(f);
		return Response.ok(f, mt).build();
	
	}
	
	
}
