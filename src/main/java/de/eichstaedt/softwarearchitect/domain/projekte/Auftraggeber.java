package de.eichstaedt.softwarearchitect.domain.projekte;

import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 09.11.23.
 */
public record Auftraggeber(String id, String name) {

  public Auftraggeber(String name) {
    this(UUID.randomUUID().toString(), name);
  }
}
