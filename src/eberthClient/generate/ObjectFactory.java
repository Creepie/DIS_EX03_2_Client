
package eberthClient.generate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eberthClient.generate package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _DummyData_QNAME = new QName("http://eberth/", "dummyData");
    private final static QName _GetData_QNAME = new QName("http://eberth/", "getData");
    private final static QName _GetDataResponse_QNAME = new QName("http://eberth/", "getDataResponse");
    private final static QName _SaySomething_QNAME = new QName("http://eberth/", "saySomething");
    private final static QName _SaySomethingResponse_QNAME = new QName("http://eberth/", "saySomethingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eberthClient.generate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DummyData }
     * 
     */
    public DummyData createDummyData() {
        return new DummyData();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link SaySomething }
     * 
     */
    public SaySomething createSaySomething() {
        return new SaySomething();
    }

    /**
     * Create an instance of {@link SaySomethingResponse }
     * 
     */
    public SaySomethingResponse createSaySomethingResponse() {
        return new SaySomethingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DummyData }{@code >}
     */
    @XmlElementDecl(namespace = "http://eberth/", name = "dummyData")
    public JAXBElement<DummyData> createDummyData(DummyData value) {
        return new JAXBElement<DummyData>(_DummyData_QNAME, DummyData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}
     */
    @XmlElementDecl(namespace = "http://eberth/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://eberth/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaySomething }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaySomething }{@code >}
     */
    @XmlElementDecl(namespace = "http://eberth/", name = "saySomething")
    public JAXBElement<SaySomething> createSaySomething(SaySomething value) {
        return new JAXBElement<SaySomething>(_SaySomething_QNAME, SaySomething.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaySomethingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaySomethingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://eberth/", name = "saySomethingResponse")
    public JAXBElement<SaySomethingResponse> createSaySomethingResponse(SaySomethingResponse value) {
        return new JAXBElement<SaySomethingResponse>(_SaySomethingResponse_QNAME, SaySomethingResponse.class, null, value);
    }

}
