package com.example.xmltojava;

import lombok.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class Item {


    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "desc")
    private String desc;

}
