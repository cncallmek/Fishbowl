package cncallmek.fishbowl.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class EvolveEffect extends StatusEffect {
  public EvolveEffect(StatusEffectCategory statusEffectCategory, int color) {
    super(statusEffectCategory, color);
  }

  @Override
  public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
    super.applyUpdateEffect(pLivingEntity, pAmplifier);
  }

  @Override
  public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
    return true;
  }
}
