package de.eichstaedt.softwarearchitect.projekte;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import de.eichstaedt.softwarearchitect.projekte.Auftraggeber;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 09.11.23.
 */
public class AuftraggeberTest {

  @Test
  void testCreateAuftraggeber() {

    Auftraggeber abteilungA = new Auftraggeber(UUID.randomUUID().toString(),"Abteilung A");

    assertNotNull(abteilungA);
  }
}