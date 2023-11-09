package de.eichstaedt.softwarearchitect.ui;

import de.eichstaedt.softwarearchitect.projekte.Projekt;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/projects")
public class ProjektResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Projekt> projects() {
        return List.of(new Projekt.Builder().withName("Software Engineering Batchelor Course")
            .withDescription("Nice People here").build());
    }
}
