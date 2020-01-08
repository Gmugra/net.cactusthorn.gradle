# net.cactusthorn.gradle

Gradle Demo project (based on Gradle 4.10). Demonstrate:
1. Submodules
1. Centralized scripts blocks
1. Centralized dependency names/versions
1. Generated sources
1. Integration tests
1. Wrapper
1. IDE plug-ins
1. Attributes in MANIFEST.MF
1. JaCoCo
   1. https://www.eclemma.org/jacoco/
   1. JaCoCo Plugin: https://docs.gradle.org/current/userguide/jacoco_plugin.html
1. "all" jar
   1. self-sufficient archive which contains both classes and dependencies needed to run an application
1. "sources" jar
   1. jar archive with source files, without unit/integration tests
1. The project local maven repository

## How to
How to skip tests:
```bash
gradlew build -x test
```
How to run only integration tests:
```bash
gradlew build testIntegration -x test
```
How to force to refresh depnedencies
```bash
gradlew build --refresh-dependencies
```
How to generate wrapper with version 4.10
```bash
gradle wrapper --gradle-version 4.10
```

## License
Released under the BSD 2-Clause License
```
Copyright (C) 2020, Alexei Khatskevich
All rights reserved.

Licensed under the BSD 2-clause (Simplified) License (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://opensource.org/licenses/BSD-2-Clause
```