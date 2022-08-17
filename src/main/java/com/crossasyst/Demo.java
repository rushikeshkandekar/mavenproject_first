package com.crossasyst;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("suchit");
        log.info(person.getFirstName());
    }
}
