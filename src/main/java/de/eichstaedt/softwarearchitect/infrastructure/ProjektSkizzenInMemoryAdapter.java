package de.eichstaedt.softwarearchitect.infrastructure;

import de.eichstaedt.softwarearchitect.domain.projekte.Auftraggeber;
import de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizze;
import de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizzenRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by konrad.eichstaedt@gmx.de on 19.12.23.
 */

@ApplicationScoped
public class ProjektSkizzenInMemoryAdapter implements ProjektSkizzenRepository
{

    private List<ProjektSkizze> data = new ArrayList<>(asList(new ProjektSkizze.Builder()
            .withName("Software Engineering Batchelor Course")
            .withDescription("Educate nice People as Software Engineers")
            .forAuftraggeber(new Auftraggeber("Abteilung A"))
            .build()));

    @Override
    public List<ProjektSkizze> findAll() {
        return data;
    }

    @Override
    public void add(ProjektSkizze projektSkizze) {
        data.add(projektSkizze);
    }
}
