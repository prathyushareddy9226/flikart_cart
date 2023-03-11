package flipkartv1.main;

import org.streampipes.container.init.DeclarersSingleton;
import org.streampipes.container.standalone.init.StandaloneModelSubmitter;
import flipkartv1.config.Config;
import flipkartv1.pe.example.DataSource;

public class Init extends StandaloneModelSubmitter {

  public static void main(String[] args) throws Exception {
    DeclarersSingleton.getInstance()
            .add(new DataSource());

    new Init().init(Config.INSTANCE);

  }
}
