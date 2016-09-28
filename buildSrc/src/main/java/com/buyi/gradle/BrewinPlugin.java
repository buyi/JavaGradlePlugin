package com.buyi.gradle;

import org.gradle.api.*;

public class BrewinPlugin implements Plugin<Project>
{
    @Override
    public void apply(Project project)
    {
        project.getExtensions().create("brewin", BrewinPluginExtension.class);
        project.getTasks().create("brew", BrewTask.class);
    }
}