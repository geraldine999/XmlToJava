package com.example.xmltojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.util.List;

@SpringBootApplication
public class XmlToJavaApplication {

    public static void main(String[] args) throws XMLStreamException, JAXBException {
        SpringApplication.run(XmlToJavaApplication.class, args);

        String xml = "<tree>\n" +
                "\t<item name=\"Verdict\" desc=\"01\"/>\n" +
                "\t<item name=\"Result\" desc=\"Fail\"/>\n" +
                "\t<item name=\"Test\"/>\n" +
                "\t<item name=\"Comment\" desc=\"Error en cantidad de cuotas\"/>\n" +
                "\t<item name=\"User1\"/>\n" +
                "\t<item name=\"User2\"/>\n" +
                "</tree>";

        System.out.println(XmlToJava.getResults(xml));

        StringBuilder sb = new StringBuilder();
       List<Item> items = XmlToJava.getResults(xml).getItems();
        for (Item i: items) {
            if(i.getName().equals("Result") || i.getName().equals("Comment")){
               sb.append(i.getName()+": "+i.getDesc()+"\n");
            }
        }
        System.out.println(sb.toString());
    }

}
