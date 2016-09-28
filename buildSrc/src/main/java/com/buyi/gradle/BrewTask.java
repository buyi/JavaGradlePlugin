package com.buyi.gradle;

import org.gradle.api.*;
import org.gradle.api.tasks.*;

public class BrewTask extends DefaultTask
{
    @TaskAction
    public void brew() {
        BrewinPluginExtension extension = getProject().getExtensions().findByType(BrewinPluginExtension.class);
        if(extension == null)
            extension = new BrewinPluginExtension();
        
        System.out.format("%s\n", extension.getMessage());
    }
}