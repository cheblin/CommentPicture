package com.github.cheblin.commentpicture.services

import com.intellij.openapi.project.Project
import com.github.cheblin.commentpicture.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
