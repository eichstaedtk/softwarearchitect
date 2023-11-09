package de.eichstaedt.softwarearchitect.projects;

import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 *
 * Builder Pattern for seperate the creation of complex objects from other aspects
 */
public class Project {

  private final String id;

  private final String name;

  private final String description;

  public Project(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return description;
  }

  public static class Builder {
    private String id = UUID.randomUUID().toString();

    private String name;

    private String description;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Build the Project object.
     * @return A new Project object.
     */
    public Project build(){

      if (name == null || name.trim().isEmpty()) {
        throw new IllegalStateException("Project name cannot be empty");
      }

      return new Project(this);
    }
  }

}
