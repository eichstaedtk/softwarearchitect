package de.eichstaedt.softwarearchitect.ui;

import static java.util.Arrays.asList;

import de.eichstaedt.softwarearchitect.projekte.Auftraggeber;
import de.eichstaedt.softwarearchitect.projekte.Projekt;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/projekte")
public class ProjektResource {

    private static final List<Projekt> projekteDB = new ArrayList<>(asList(new Projekt.Builder()
        .withName("Software Engineering Batchelor Course")
        .withDescription("Nice People here")
        .forAuftraggeber(new Auftraggeber("Abteilung A"))
        .build()));

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Projekt> projects() {
        return projekteDB;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Projekt create(Projekt projekt){
        projekteDB.add(projekt);
        return projekt;
    }
}
