package org.mule.tools.maven.archetype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.maven.archetype.Archetype;
import org.apache.maven.archetype.ArchetypeDescriptorException;
import org.apache.maven.archetype.ArchetypeNotFoundException;
import org.apache.maven.archetype.ArchetypeTemplateProcessingException;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;

public class ProjectArchetypeMojo extends AbstractMojo {
    private Archetype archetype;
    private ArtifactRepository localRepository;
    private String archetypeGroupId;
    private String archetypeArtifactId;
    private String archetypeVersion;
    private String muleVersion;
    private String groupId;
    private String artifactId;
    private String version;
    private String packageName;
    private List remoteRepositories;

    public void execute() throws MojoExecutionException {
        String basedir = System.getProperty("user.dir");
        if (this.packageName == null) {
            this.getLog().info((CharSequence) ("Defaulting package to group ID: " + this.groupId));
            this.packageName = this.groupId;
        }
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("basedir", basedir);
        map.put("package", this.packageName);
        map.put("packageName", this.packageName);
        map.put("groupId", this.groupId);
        map.put("artifactId", this.artifactId);
        map.put("version", this.version);
        map.put("muleVersion", this.muleVersion);
        try {
            this.archetype.createArchetype(this.archetypeGroupId, this.archetypeArtifactId, this.archetypeVersion,
                    this.localRepository, this.remoteRepositories, map);
        } catch (ArchetypeNotFoundException e) {
            throw new MojoExecutionException("Error creating from archetype", (Exception) e);
        } catch (ArchetypeDescriptorException e) {
            throw new MojoExecutionException("Error creating from archetype", (Exception) e);
        } catch (ArchetypeTemplateProcessingException e) {
            throw new MojoExecutionException("Error creating from archetype", (Exception) e);
        }
    }
}