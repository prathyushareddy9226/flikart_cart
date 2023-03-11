
package flipkartv1.pe.example;

import org.streampipes.model.SpDataStream;
import org.streampipes.model.graph.DataSourceDescription;
import org.streampipes.sdk.builder.DataStreamBuilder;
import org.streampipes.sdk.helpers.EpProperties;
import org.streampipes.sdk.helpers.Formats;
import org.streampipes.sdk.helpers.Protocols;
import org.streampipes.sources.AbstractAdapterIncludedStream;


public class ExampleStream extends AbstractAdapterIncludedStream {

  @Override
  public SpDataStream declareModel(DataSourceDescription sep) {
    return DataStreamBuilder.create("flipkartv1-example", "Example", "")
            .property(EpProperties.timestampProperty("timestamp"))

            // configure your stream here

            .format(Formats.jsonFormat())
            .protocol(Protocols.kafka("localhost", 9092, "TOPIC_SHOULD_BE_CHANGED"))
            .build();
  }

  @Override
  public void executeStream() {

  }
}
