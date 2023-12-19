package de.eichstaedt.softwarearchitect.application;

import static java.util.Arrays.asList;

import de.eichstaedt.softwarearchitect.domain.projekte.Auftraggeber;
import de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizze;
import de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizzenRepository;
import jakarta.inject.Inject;
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

    private final ProjektSkizzenRepository repository;

    @Inject
    public ProjektSkizzeResource(ProjektSkizzenRepository repository) {
        this.repository = repository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProjektSkizze> projects() {
        return repository.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ProjektSkizze create(ProjektSkizze projektSkizze){
        repository.add(projektSkizze);
        return projektSkizze;
    }
}
