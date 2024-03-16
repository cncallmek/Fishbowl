package cncallmek.fishbowl.item;

import cncallmek.fishbowl.Fishbowl;
import cncallmek.fishbowl.item.custom.UpgradeOrbItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item ORB = registerItem("upgrade_orb", new UpgradeOrbItem());

  private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
    entries.add(ORB);
  }
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(Fishbowl.MOD_ID, name), item);
  }

  public static void registerModItems() {
    Fishbowl.LOGGER.info("Registering Mod Items for " + Fishbowl.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroup);
  }
}
