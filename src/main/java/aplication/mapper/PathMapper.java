package aplication.mapper;

import domain.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PathMapper {

  private final List<Path> paths;

  public PathMapper() {
    paths = new ArrayList<Path>();
  }

  public List<Path> getPaths() {
    return paths;
  }

  public void setPaths(Map<String,Map> map) {
    map.forEach((s, m) -> {
      m.keySet().remove("parameters");
      Path path = new Path(s, m.keySet());
      paths.add(path);
    });
  }







}
