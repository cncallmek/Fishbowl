package cncallmek.fishbowl.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
  public static final FoodComponent BONE = new FoodComponent.Builder().hunger(0).meat().saturationModifier(0).alwaysEdible().build();
}
