package de.eichstaedt.softwarearchitect.domain.projekte;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import de.eichstaedt.softwarearchitect.domain.projekte.Auftraggeber;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 09.11.23.
 */
public class AuftraggeberTest {

  @Test
  void testCreateAuftraggeber() {

    Auftraggeber abteilungA = new Auftraggeber("Abteilung A");

    assertNotNull(abteilungA);
  }
}