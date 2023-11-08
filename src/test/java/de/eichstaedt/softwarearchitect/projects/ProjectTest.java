package de.eichstaedt.softwarearchitect.projects;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 */
public class ProjectTest {

  @Test
  void testCreateAProject() {

    Project sonar = new Project.Builder().withName("Sonar").build();
    Project ereignisdb = new Project.Builder().withName("Ereignisdatenbank").build();

    assertNotNull(sonar);
    assertNotNull(sonar.getId());
    assertNotNull(sonar.getName());

    assertNotEquals(sonar.getId(),ereignisdb.getId());
  }
}
