# neilpiper.me Mule Archetype


# Creating the 'Archetype : Archetype'

The initial version of this project was created from the Maven archetype:archetype

```
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVer
sion=1.3
```


# Building your own Mule archetype using this one

Creates a new Maven project for groupId: `neilpiper.me` and artifactId: `webapi-api`

```
mvn archetype:generate -e -X -DarchetypeGroupId=neilpiper.me -DarchetypeArtifactId=mule-archetype \
 -DarchetypeVersion=1.0.0_30.cfa736c -DgroupId=neilpiper.me -DartifactId=webapi-api
```

## Parameters

During archetype creation the following parameters are requested.

<table>
<tr><th>Parameter</th><th>Example</th><th>Description</th></tr>
<tr><td><code>groupId</code></td><td><code>com.example</code></td><td>Group id of the new maven project to be created</td></tr>
<tr><td><code>artifactId</code></td><td><code>mule-project</code></td><td>Artifact id of the new maven project to be created</td></tr>
<tr><td><code>version</code></td><td><code>1.0.0</code></td><td>Initial Version of the new maven project to be created</td></tr>
<tr><td><code>package</code></td><td><code>com.example.mule</code></td><td>Java package name - root level</td></tr>
<tr><td><code>transports</code></td><td><code>http,jms,vm,file</code></td><td>Comma separated list of <a href="https://mvnrepository.com/artifact/org.mule.transports">Mule transports</a> to add as dependencies.</td></tr>
<tr><td><code>modules</code></td><td><code>db,xml,scripting,json,ws</code></td><td>Comma separated list of <a href="https://mvnrepository.com/artifact/org.mule.modules">Mule modules</a> to add as dependencies.</td></tr>
<tr><td><code>muleVersion</code></td><td><code>3.9.0</code></td><td>The release version of mule to base the project on.</td></tr>
<tr><td><code>EE</code></td><td><code>true</code></td><td>Use mule enterprise edition?</td></tr>
<tr><td><code>description</code></td><td><code>'A mule example project.'</code></td><td>Descripiton for the project to be placed in POM and initial mule sample flows.</td></tr>
</table>

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
