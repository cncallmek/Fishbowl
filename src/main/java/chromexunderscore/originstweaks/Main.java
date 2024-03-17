package chromexunderscore.originstweaks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
  public static final Logger LOGGER = LoggerFactory.getLogger("originstweaks");

  public Main() {
  }

  public void onInitialize() {
    LOGGER.info("[OriginsTweaks] Remember to enable flying in the server.properties for the Arachnid's webshot ability!");
  }
}
