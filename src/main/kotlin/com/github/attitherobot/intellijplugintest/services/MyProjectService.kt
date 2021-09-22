package com.github.attitherobot.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.attitherobot.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
