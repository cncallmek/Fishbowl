package cncallmek.fishbowl.item;

import cncallmek.fishbowl.Fishbowl;
import cncallmek.fishbowl.item.custom.UpgradeOrbItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item ORB = registerItem("upgrade_orb", new UpgradeOrbItem());
  public static final Item BONE = overrideVanillaItem("minecraft:bone", 921, new Item(new Item.Settings().food(ModFoodComponents.BONE)));

  private static void addItemsToToolsGroup(FabricItemGroupEntries entries) {
    entries.add(ORB);
  }
  private static void addItemsToIngredientsGroup(FabricItemGroupEntries entries) {
    entries.add(BONE);
  }
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(Fishbowl.MOD_ID, name), item);
  }
  private static Item overrideVanillaItem(String id, int toOverride, Item item) {
    return Registry.register(Registries.ITEM, toOverride, id, item);
  }

  public static void registerModItems() {
    Fishbowl.LOGGER.info("Registering Mod Items for " + Fishbowl.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
  }
}
