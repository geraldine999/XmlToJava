package com.example.xmltojava;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamException;
import java.io.StringReader;

public class XmlToJava {
    public static Tree getResults(String testResultXml) throws JAXBException, XMLStreamException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Tree.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(testResultXml);
        Tree tree = (Tree) unmarshaller.unmarshal(reader);
        return tree;
    }
}
