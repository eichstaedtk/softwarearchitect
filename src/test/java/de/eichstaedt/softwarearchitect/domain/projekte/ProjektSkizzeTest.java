package de.eichstaedt.softwarearchitect.domain.projekte;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 */
public class ProjektSkizzeTest {

  @Test
  void testCreateAProject() {

    ProjektSkizze sonar = new ProjektSkizze.Builder().withName("Sonar").build();
    ProjektSkizze ereignisdb = new ProjektSkizze.Builder().withName("Ereignisdatenbank").build();

    assertNotNull(sonar);
    assertNotNull(sonar.getId());
    assertNotNull(sonar.getName());

    assertNotEquals(sonar.getId(),ereignisdb.getId());
  }
}
