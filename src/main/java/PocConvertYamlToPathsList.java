import aplication.YamlFileConverter;
import domain.Path;
import java.util.List;
import java.util.Set;

public class PocConvertYamlToPathsList {

  public static void main(String[] args) throws Exception {

    executePOC();

  }

  private static void executePOC() {
    YamlFileConverter yamlFileConverter = new YamlFileConverter();

    List<Path> paths = yamlFileConverter.getPathsList();

    printListInScreen(paths);
  }

  private static void printListInScreen(List<Path> paths) {

    for (Path path: paths) {
      String endpoint = path.getEndpoint();
      Set<String> methods = path.getMethods();
      for (String method:methods) {
        System.out.println(endpoint + "#" + method);
      }
    }
  }



}
