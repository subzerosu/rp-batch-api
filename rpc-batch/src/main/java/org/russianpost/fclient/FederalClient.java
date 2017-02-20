
package org.russianpost.fclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import org.russianpost.fclient.postserver.AnswerByTicketRequest;
import org.russianpost.fclient.postserver.AnswerByTicketResponse;
import org.russianpost.fclient.postserver.TicketRequest;
import org.russianpost.fclient.postserver.TicketResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FederalClient", targetNamespace = "http://fclient.russianpost.org")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.russianpost.fclient.postserver.ObjectFactory.class,
    org.russianpost.fclient.ObjectFactory.class
})
public interface FederalClient {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.russianpost.fclient.postserver.TicketResponse
     */
    @WebMethod
    @WebResult(name = "ticketResponse", targetNamespace = "http://fclient.russianpost.org/postserver", partName = "parameters")
    @Action(input = "http://fclient.russianpost.org/FederalClient/getTicketRequest", output = "http://fclient.russianpost.org/FederalClient/getTicketResponse")
    public TicketResponse getTicket(
        @WebParam(name = "ticketRequest", targetNamespace = "http://fclient.russianpost.org/postserver", partName = "parameters")
        TicketRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns org.russianpost.fclient.postserver.AnswerByTicketResponse
     */
    @WebMethod
    @WebResult(name = "answerByTicketResponse", targetNamespace = "http://fclient.russianpost.org/postserver", partName = "parameters")
    @Action(input = "http://fclient.russianpost.org/FederalClient/getResponseByTicketRequest", output = "http://fclient.russianpost.org/FederalClient/getResponseByTicketResponse")
    public AnswerByTicketResponse getResponseByTicket(
        @WebParam(name = "answerByTicketRequest", targetNamespace = "http://fclient.russianpost.org/postserver", partName = "parameters")
        AnswerByTicketRequest parameters);

}
