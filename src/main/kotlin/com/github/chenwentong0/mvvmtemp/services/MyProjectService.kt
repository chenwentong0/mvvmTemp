package com.github.chenwentong0.mvvmtemp.services

import com.intellij.openapi.project.Project
import com.github.chenwentong0.mvvmtemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
