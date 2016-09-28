package com.buyi.gradle;

import org.gradle.api.*;

public class BrewinPluginExtension
{
    private String message = "Wake up!";
    
    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}
}
