# neilpiper.me Mule Archetype


# Creating the 'Archetype : Archetype'

The initial version of this project was created from the Maven archetype:archetype

```
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVer
sion=1.3
```

# Parameter options
```
[INFO] Parameter: groupId, Value: neilpiper.me.mule
[INFO] Parameter: artifactId, Value: mule-archetype
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: neilpiper.me.mule
[INFO] Parameter: packageInPathFormat, Value: neilpiper/me/mule
[INFO] Parameter: package, Value: neilpiper.me.mule
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: groupId, Value: neilpiper.me.mule
[INFO] Parameter: artifactId, Value: mule-archetype
```

# Building your own Mule archetype using this one

Creates a new Maven project for groupId: `neilpiper.me` and artifactId: `webapi-api`

```
mvn archetype:generate -e -X -DarchetypeGroupId=neilpiper.me -DarchetypeArtifactId=mule-archetype -DarchetypeVersion=1.0.0 -DgroupId
=neilpiper.me -DartifactId=webapi-api
```

# Processing Class 

Need a processing class `org.mule.tools.maven.archetype.ProjectArchetypeMojo' from the jar file mule-example-archetype.jar.

# Archetype models

[archetype-metadata](http://maven.apache.org/xsd/archetype-descriptor-1.0.0.xsd)

# Known Mule references

[Mulesoft esb archetypes](https://github.com/mulesoft/mule-esb-maven-tools/tree/master/archetypes)

[Mulesoft Maven archetypes github](https://github.com/mulesoft/mulesoft-maven-archetypes)

[Mule maven repo - mule-example-archetype 3.6.0-M2](https://mvnrepository.com/artifact/org.mule.tools/mule-example-archetype/3.6.0-M2)

[Mule maven repo - mule-project-archetype 3.9.0](https://repository.mulesoft.org/nexus/content/repositories/releases/org/mule/tools/mule-project-archetype/3.9.0/)

# References

https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html

[Baeldung Maven Archetypes](https://www.baeldung.com/maven-archetype)

[Maven - archetypes](https://maven.apache.org/archetypes/maven-archetype-archetype/)

https://maven.apache.org/guides/introduction/introduction-to-archetypes.html

https://maven.apache.org/guides/mini/guide-creating-archetypes.html

https://rsankarx.wordpress.com/2013/10/24/creating-maven-archetype-using-create-from-project/

# MQ Docker / Docker

[IBM MQ Docker image](https://hub.docker.com/r/ibmcom/mq/)

[Using IBM MQ Docker](https://github.com/ibm-messaging/mq-container/blob/master/docs/usage.md)

# Local Keys / Certs for testing? Docker setup

http://www.mojohaus.org/keytool/keytool-maven-plugin/usage.html

# Velocity syntax guide

http://velocity.apache.org/engine/1.7/user-guide.html#methods
