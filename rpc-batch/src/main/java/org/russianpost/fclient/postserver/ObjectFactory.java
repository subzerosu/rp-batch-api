
package org.russianpost.fclient.postserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.russianpost.fclient.postserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TicketRequest_QNAME = new QName("http://fclient.russianpost.org/postserver", "ticketRequest");
    private final static QName _AnswerByTicketRequest_QNAME = new QName("http://fclient.russianpost.org/postserver", "answerByTicketRequest");
    private final static QName _AnswerByTicketResponse_QNAME = new QName("http://fclient.russianpost.org/postserver", "answerByTicketResponse");
    private final static QName _TicketResponse_QNAME = new QName("http://fclient.russianpost.org/postserver", "ticketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.russianpost.fclient.postserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LanguageData }
     * 
     */
    public LanguageData createLanguageData() {
        return new LanguageData();
    }

    /**
     * Create an instance of {@link LanguageData.Language }
     * 
     */
    public LanguageData.Language createLanguageDataLanguage() {
        return new LanguageData.Language();
    }

    /**
     * Create an instance of {@link AnswerByTicketRequest }
     * 
     */
    public AnswerByTicketRequest createAnswerByTicketRequest() {
        return new AnswerByTicketRequest();
    }

    /**
     * Create an instance of {@link AnswerByTicketResponse }
     * 
     */
    public AnswerByTicketResponse createAnswerByTicketResponse() {
        return new AnswerByTicketResponse();
    }

    /**
     * Create an instance of {@link TicketResponse }
     * 
     */
    public TicketResponse createTicketResponse() {
        return new TicketResponse();
    }

    /**
     * Create an instance of {@link TicketRequest }
     * 
     */
    public TicketRequest createTicketRequest() {
        return new TicketRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fclient.russianpost.org/postserver", name = "ticketRequest")
    public JAXBElement<TicketRequest> createTicketRequest(TicketRequest value) {
        return new JAXBElement<TicketRequest>(_TicketRequest_QNAME, TicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerByTicketRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fclient.russianpost.org/postserver", name = "answerByTicketRequest")
    public JAXBElement<AnswerByTicketRequest> createAnswerByTicketRequest(AnswerByTicketRequest value) {
        return new JAXBElement<AnswerByTicketRequest>(_AnswerByTicketRequest_QNAME, AnswerByTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerByTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fclient.russianpost.org/postserver", name = "answerByTicketResponse")
    public JAXBElement<AnswerByTicketResponse> createAnswerByTicketResponse(AnswerByTicketResponse value) {
        return new JAXBElement<AnswerByTicketResponse>(_AnswerByTicketResponse_QNAME, AnswerByTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fclient.russianpost.org/postserver", name = "ticketResponse")
    public JAXBElement<TicketResponse> createTicketResponse(TicketResponse value) {
        return new JAXBElement<TicketResponse>(_TicketResponse_QNAME, TicketResponse.class, null, value);
    }

}
