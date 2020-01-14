# bnd.bnd

1. By Default (if not present in bnd.bnd)
   1. Bundle-Name = Bundle-SymbolicName
   1. Bundle-SymbolicName = Gradle project.name
   1. Bundle-Version = Gradle project.version
1. The example also shows how to include JAR in the OSGi bundle (-includeresource)
1. Avoid to set Import-Package in the bnd.bnd, in most of cases it will correct generated automatically 