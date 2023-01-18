package com.cydeo.tests.day8_Properties_Config_Reader;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    public void java_properties_reading_test (){
        //key = value
        //os.name = Windows 11
        //user.name = m_yas
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));


    }
}
