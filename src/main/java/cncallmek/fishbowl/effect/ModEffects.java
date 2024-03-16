package cncallmek.fishbowl.effect;

import cncallmek.fishbowl.Fishbowl;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
  public static StatusEffect EVOLVE;

  public static StatusEffect registerStatusEffect(String name) {
    return Registry.register(Registries.STATUS_EFFECT, new Identifier(Fishbowl.MOD_ID, name),
            new EvolveEffect(StatusEffectCategory.BENEFICIAL, 3124687));
  }

  public static void registerEffects() {
    EVOLVE = registerStatusEffect("evolve");
  }
}
