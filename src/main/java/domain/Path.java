package domain;

import java.util.Set;

public class Path {

  private String uri;
  private Set<String> methods;

  public Path(String uri, Set<String> methods) {
    this.uri = uri;
    this.methods = methods;
  }

  public String getEndpoint() {
    return uri;
  }

  public void setEndpoint(String endpoint) {
    this.uri = endpoint;
  }

  public Set<String> getMethods() {
    return methods;
  }

  public void setMethods(Set<String> methods) {
    this.methods = methods;
  }
}
