package de.eichstaedt.softwarearchitect.application;

import static java.util.Arrays.asList;

import de.eichstaedt.softwarearchitect.domain.projekte.Auftraggeber;
import de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizze;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/rest/projektskizze")
public class ProjektSkizzeResource {

    private static final List<ProjektSkizze> PROJEKTE_DB = new ArrayList<>(asList(new ProjektSkizze.Builder()
        .withName("Software Engineering Batchelor Course")
        .withDescription("Educate nice People as Software Engineers")
        .forAuftraggeber(new Auftraggeber("Abteilung A"))
        .build()));

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProjektSkizze> projects() {
        return PROJEKTE_DB;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ProjektSkizze create(ProjektSkizze projektSkizze){
        PROJEKTE_DB.add(projektSkizze);
        return projektSkizze;
    }
}
