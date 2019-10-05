package io.atto.gradle.plugin

import org.gradle.api.Project

/**
 * Copyright (C) 2019 Slash IO
 * Licensed under the Apache License, Version 2.0
 *
 * Created By : Yazan Tarifi
 * Date : 9/1/2019
 * Time : 2:01 AM
 */

interface MultiModuleExecutor {

    void configUiLayer(Project project)

    void configDataLayer(Project project)

    void configDomainLayer(Project project)

    void configLogicLayer(Project project)

    void configDefaultModule(Project project)

}
