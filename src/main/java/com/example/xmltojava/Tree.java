package com.example.xmltojava;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "tree")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class Tree {


    @XmlElement(name="item")
    private List<Item> items;
}
