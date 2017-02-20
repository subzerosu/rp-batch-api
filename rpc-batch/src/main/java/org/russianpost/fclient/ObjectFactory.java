
package org.russianpost.fclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.russianpost.fclient package. 
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

    private final static QName _File_QNAME = new QName("http://fclient.russianpost.org", "File");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.russianpost.fclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fclient.russianpost.org", name = "File")
    public JAXBElement<File> createFile(File value) {
        return new JAXBElement<File>(_File_QNAME, File.class, null, value);
    }

}
