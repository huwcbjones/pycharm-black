package com.github.huwcbjones.pycharmblack.services

import com.github.huwcbjones.pycharmblack.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
