import io.jenkins.plugins.casc.ConfigurationAsCode;
import io.jenkins.plugins.casc.yaml.YamlSource;

//ConfigurationAsCode.get().configure()

  
List<YamlSource>  yaml =ConfigurationAsCode.get().getStandardConfigSources()


String testUrl = "https://raw.githubusercontent.com/klst9498/test/master/test.yaml";
YamlSource<String> yamlSource = YamlSource.of(new URL(testUrl));

yaml.add(yamlSource)


ConfigurationAsCode.get().configureWith(yaml)

ConfigurationAsCode.get().getStandardConfigSources();

