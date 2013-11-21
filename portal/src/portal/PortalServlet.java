package portal;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;


public class PortalServlet extends HttpServlet {
//	private static final long serialVersionUID = -608218396206950786L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		resp.setContentType("text/plain");
		
		resp.getWriter().println("Hello World");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		String signedRequest = (String) req.getParameter("signed_request");
		String payload = signedRequest.split("[.]", 2)[1];
		payload = payload.replace("-", "+").replace("_", "/").trim();
		String jsonString = new String(Base64.decodeBase64(payload));
		
		resp.getWriter().println(jsonString);
	}
}
