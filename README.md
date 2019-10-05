# Atto-Plugin
Atto Plugin is Gradle Plugin To Config Android Applications (Multi , Single) With Atto Implementation


![](https://img.shields.io/badge/License-Apache%202.0-blue)
![](https://img.shields.io/badge/Version-1.0.2-green)
![](https://img.shields.io/badge/Language-Groovy-orange)
![](https://img.shields.io/badge/Project%20Status-Beta%20Version-yellow)

# Setup

1. Plugin DSL 
```
plugins {
  id "io.atto.gradle.plugin" version "1.0.2"
}
```

2. Legacy Plugin

At Root File : build.gradle

```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.io.atto.gradle.plugin:Atto-Plugin:1.0.2"
  }
}
```
 
3. At Every Module Just Apply The Plugin

```
apply plugin: "io.atto.gradle.plugin"

```

# Plugin Description

THis Plugin Will Config The Modules Depends On Module Type
THe Types is : [UI , DATA , DOMAIN , LOGIC]

The Application Manage The Dependencies Depends on Module Name 
Example : [ app-ui , app-domain , app-data , app=logic ]


# License

Copyright (C) 2019 Atto IO
Atto Android Gradle Plugin is An Open Source Library  (Licensed under the Apache License, Version 2.0)