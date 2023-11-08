package de.eichstaedt.softwarearchitect.projects;

import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 08.11.23.
 */
public class Project {

  private String id;

  private String name;

  private String description;

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

  public static class Builder {
    private String id = UUID.randomUUID().toString();

    private String name;

    private String description;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Project build(){
      return new Project(this);
    }
  }

}
