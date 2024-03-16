package cncallmek.fishbowl.item.custom;

import cncallmek.fishbowl.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class UpgradeOrbItem extends Item {
  public UpgradeOrbItem(){
    super(new Item.Settings().rarity(Rarity.RARE));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack stack = user.getStackInHand(hand);
    if(!world.isClient()) {
      StatusEffectInstance evolve = new StatusEffectInstance(ModEffects.EVOLVE, 10, 0);
      user.addStatusEffect(evolve);
    }
    if(!user.isCreative()) {
      stack.decrement(1);
    }
    return TypedActionResult.consume(stack);
  }
}
