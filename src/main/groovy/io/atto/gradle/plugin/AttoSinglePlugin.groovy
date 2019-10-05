package io.atto.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.DependencyResolutionListener
import org.gradle.api.artifacts.ResolvableDependencies

/**
 * Copyright (C) 2019 Slash IO
 * Licensed under the Apache License, Version 2.0
 *
 * Created By : Yazan Tarifi
 * Date : 9/1/2019
 * Time : 2:00 AM
 */

class AttoSinglePlugin implements Plugin<Project> {

    def compileDeps

    @Override
    void apply(Project project) {
        compileDeps = project.getConfigurations().getByName("implementation").getDependencies()
        project.getGradle().addListener(new DependencyResolutionListener() {
            @Override
            void beforeResolve(ResolvableDependencies resolvableDependencies) {
                compileDeps.add(project.getDependencies().create(AttoDetails.LIVEDATA))
                compileDeps.add(project.getDependencies().create(AttoDetails.LIFECYCLE))
                compileDeps.add(project.getDependencies().create(AttoDetails.RXANDROID))
                compileDeps.add(project.getDependencies().create(AttoDetails.VIEWMODEL))
                compileDeps.add(project.getDependencies().create(AttoDetails.RXJAVA))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_PERMISSIONS))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_DATA))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_CORE))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_PREFS))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_VIEW_MODEL))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_UI))
                compileDeps.add(project.getDependencies().create(AttoDetails.ATTO_EXTRAS))
                compileDeps.add(project.getDependencies().create(AttoDetails.CORIUTINES_ANDROID))
                compileDeps.add(project.getDependencies().create(AttoDetails.CORIUTINES_CORE))
                project.getGradle().removeListener(this)
            }

            @Override
            void afterResolve(ResolvableDependencies resolvableDependencies) {}
        })
    }

}

