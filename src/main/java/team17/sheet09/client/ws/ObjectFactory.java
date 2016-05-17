
package team17.sheet09.client.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the team17.sheet09.client.ws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddResponse_QNAME = new QName("http://server.sheet09.team17/", "AddResponse");
    private final static QName _Lucas_QNAME = new QName("http://server.sheet09.team17/", "Lucas");
    private final static QName _Subtract_QNAME = new QName("http://server.sheet09.team17/", "Subtract");
    private final static QName _LucasResponse_QNAME = new QName("http://server.sheet09.team17/", "LucasResponse");
    private final static QName _Multiply_QNAME = new QName("http://server.sheet09.team17/", "Multiply");
    private final static QName _SubtractResponse_QNAME = new QName("http://server.sheet09.team17/", "SubtractResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://server.sheet09.team17/", "MultiplyResponse");
    private final static QName _Add_QNAME = new QName("http://server.sheet09.team17/", "Add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team17.sheet09.client.ws
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link LucasResponse }
     */
    public LucasResponse createLucasResponse() {
        return new LucasResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link Lucas }
     */
    public Lucas createLucas() {
        return new Lucas();
    }

    /**
     * Create an instance of {@link Subtract }
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link AddResponse }
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "AddResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lucas }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "Lucas")
    public JAXBElement<Lucas> createLucas(Lucas value) {
        return new JAXBElement<Lucas>(_Lucas_QNAME, Lucas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "Subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LucasResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "LucasResponse")
    public JAXBElement<LucasResponse> createLucasResponse(LucasResponse value) {
        return new JAXBElement<LucasResponse>(_LucasResponse_QNAME, LucasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "Multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "SubtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "MultiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     */
    @XmlElementDecl(namespace = "http://server.sheet09.team17/", name = "Add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
