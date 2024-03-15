package cncallmek.fishbowl;

import cncallmek.fishbowl.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fishbowl implements ModInitializer {
	public static final String MOD_ID = "fishbowl";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}