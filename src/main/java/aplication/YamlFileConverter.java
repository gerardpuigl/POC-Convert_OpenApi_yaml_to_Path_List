package aplication;

import adapter.outcome.yaml.YamlSource;
import domain.Path;
import aplication.mapper.PathMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class YamlFileConverter {

  YamlSource yamlSource = new YamlSource();

  public List<Path> getPathsList() {

    File file = yamlSource.getYamlFile();
    PathMapper pathsList = convertYamlFileToPathsList(file);
    return pathsList.getPaths();
  }

  private static PathMapper convertYamlFileToPathsList(File file) {
    ObjectMapper objectMapper = getObjectMapper();

    try {
      return objectMapper.readValue(file, PathMapper.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static ObjectMapper getObjectMapper() {
    return new ObjectMapper(new YAMLFactory())
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
  }
}
