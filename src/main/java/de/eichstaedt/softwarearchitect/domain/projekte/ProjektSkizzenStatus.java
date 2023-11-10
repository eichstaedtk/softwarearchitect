package de.eichstaedt.softwarearchitect.domain.projekte;

/**
 * Created by konrad.eichstaedt@gmx.de on 10.11.23.
 */
public enum ProjektSkizzenStatus {
  IN_ERSTELLUNG, ZUR_PRÜFUNG, GENEHMIGT, ABGELEHNT;

  @Override
  public String toString() {
    switch (this) {
      case IN_ERSTELLUNG -> {
        return "Wird erstellt";
      }
      case ZUR_PRÜFUNG -> {
        return "Management prüft";
      }
      case GENEHMIGT -> {
        return "Genehmigt zur Umsetzung";
      }
      case ABGELEHNT -> {
        return "Abgelehnt";
      }
    }
    return "";
  }
}
