# net.cactusthorn.gradle

Gralde Demo project.


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