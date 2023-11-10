package de.eichstaedt.softwarearchitect.domain.projekte;

import static de.eichstaedt.softwarearchitect.domain.projekte.ProjektSkizzenStatus.*;

import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 *
 * Builder Pattern for seperate the creation of complex objects from other aspects
 */
public class ProjektSkizze {

  private final String id;

  private String name;

  private String description;

  private Auftraggeber auftraggeber;

  private ProjektSkizzenStatus status;

  public ProjektSkizze() {
    this.id = UUID.randomUUID().toString();
    this.status = IN_ERSTELLUNG;
  }

  public ProjektSkizze(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.auftraggeber = builder.auftraggeber;
    this.status = IN_ERSTELLUNG;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Auftraggeber getAuftraggeber() {
    return auftraggeber;
  }

  public ProjektSkizzenStatus getStatus() {
    return status;
  }

  public String getDescription() {
    return description;
  }

  public static class Builder {
    private String id = UUID.randomUUID().toString();

    private String name;

    private String description;

    public Auftraggeber auftraggeber;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder forAuftraggeber(Auftraggeber auftraggeber) {
      this.auftraggeber = auftraggeber;
      return this;
    }

    /**
     * Build the Project object.
     * @return A new Project object.
     */
    public ProjektSkizze build(){

      if (name == null || name.trim().isEmpty()) {
        throw new IllegalStateException("Project name cannot be empty");
      }

      return new ProjektSkizze(this);
    }
  }

}
