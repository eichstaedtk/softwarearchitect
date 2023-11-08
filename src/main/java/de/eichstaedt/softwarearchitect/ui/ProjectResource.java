package de.eichstaedt.softwarearchitect.ui;

import de.eichstaedt.softwarearchitect.projects.Project;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/projects")
public class ProjectResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Project> projects() {
        return List.of(new Project.Builder().withName("Software Engineering Batchelor Course")
            .withDescription("Nice People here").build());
    }
}
