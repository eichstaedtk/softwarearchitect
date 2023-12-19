package de.eichstaedt.softwarearchitect.domain.projekte;

import java.util.List;

/**
 * Created by konrad.eichstaedt@gmx.de on 19.12.23.
 */
public interface ProjektSkizzenRepository {
    List<ProjektSkizze> findAll();

    void add(ProjektSkizze projektSkizze);
}
