package adapter.outcome.yaml;

import java.io.File;

public class YamlSource {

  public File getYamlFile() {
    // here maybe we get the yaml file from resources but maybe we can get it from an endpoint.
    return new File("src/main/resources/openApi.yaml");
  }
}
