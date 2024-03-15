package cncallmek.fishbowl.item;

import cncallmek.fishbowl.Fishbowl;
import cncallmek.fishbowl.item.custom.UpgradeOrb;
import io.github.apace100.origins.Origins;
import io.github.apace100.origins.content.OrbOfOriginItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	// initializes a new item to be modified and added to the game
	public static final Item ORB1 = new UpgradeOrb();

	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		// entires.add([item variable name]);
		// adds a new item to the creative mode tab
		entries.add(ORB1);
	}

	private static Item registerItem(String name, Item item) {
		// creates a method for making a new item
		return Registry.register(Registries.ITEM, new Identifier(Fishbowl.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Fishbowl.LOGGER.info("Registering Mod Items for " + Fishbowl.MOD_ID);

		// adds our item to a vanilla item group
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
	}
}