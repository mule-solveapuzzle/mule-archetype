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

# Known Mule references

https://github.com/mulesoft/mule-esb-maven-tools/tree/master/archetypes

https://github.com/mulesoft/mulesoft-maven-archetypes	

https://mvnrepository.com/artifact/org.mule.tools/mule-example-archetype/3.6.0-M2

# References

https://maven.apache.org/archetypes/maven-archetype-archetype/

https://maven.apache.org/guides/introduction/introduction-to-archetypes.html

https://maven.apache.org/guides/mini/guide-creating-archetypes.html

https://rsankarx.wordpress.com/2013/10/24/creating-maven-archetype-using-create-from-project/


