package de.eichstaedt.softwarearchitect.projekte;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 */
public class ProjektTest {

  @Test
  void testCreateAProject() {

    Projekt sonar = new Projekt.Builder().withName("Sonar").build();
    Projekt ereignisdb = new Projekt.Builder().withName("Ereignisdatenbank").build();

    assertNotNull(sonar);
    assertNotNull(sonar.getId());
    assertNotNull(sonar.getName());

    assertNotEquals(sonar.getId(),ereignisdb.getId());
  }
}
