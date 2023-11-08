package de.eichstaedt.softwarearchitect.projects;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 */
public class ProjectTest {

  @Test
  void testCreateAProject() {

    Project sonar = new Project();

    assertNotNull(sonar);
  }
}
