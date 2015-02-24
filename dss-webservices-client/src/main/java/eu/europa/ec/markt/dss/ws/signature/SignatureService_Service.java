package eu.europa.ec.markt.dss.ws.signature;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 */
@WebServiceClient(name = "SignatureService", targetNamespace = "http://impl.ws.dss.markt.ec.europa.eu/",
	  wsdlLocation = "http://localhost:8080/dss-webapp/wservice/signatureService?wsdl")
public class SignatureService_Service extends Service {

	private static final String METHOD_URL = "/signatureService?wsdl";
	private static URL SIGNATURESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(eu.europa.ec.markt.dss.ws.signature.SignatureService_Service.class.getName());

	/*
	static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = eu.europa.ec.markt.dss.ws.signature.SignatureService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/dss-webapp/wservice/signatureService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dss-webapp/wservice/signatureService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SIGNATURESERVICE_WSDL_LOCATION = url;
    }
*/
	public static void setROOT_SERVICE_URL(String ROOT_SERVICE_URL) {

		try {
			SIGNATURESERVICE_WSDL_LOCATION = new URL(ROOT_SERVICE_URL + METHOD_URL);
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: '" + SIGNATURESERVICE_WSDL_LOCATION + "', retrying as a local file");
			logger.warning(e.getMessage());
		}
	}

	public SignatureService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SignatureService_Service() {
		super(SIGNATURESERVICE_WSDL_LOCATION, new QName("http://impl.ws.dss.markt.ec.europa.eu/", "SignatureService"));
	}

	/**
	 * @return returns SignatureService
	 */
	@WebEndpoint(name = "SignatureServiceImplPort")
	public SignatureService getSignatureServiceImplPort() {
		return super.getPort(new QName("http://impl.ws.dss.markt.ec.europa.eu/", "SignatureServiceImplPort"), SignatureService.class);
	}

	/**
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their
	 *                 default values.
	 * @return returns SignatureService
	 */
	@WebEndpoint(name = "SignatureServiceImplPort")
	public SignatureService getSignatureServiceImplPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://impl.ws.dss.markt.ec.europa.eu/", "SignatureServiceImplPort"), SignatureService.class, features);
	}

}