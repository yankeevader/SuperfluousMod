
package net.yankeevader.superfluousmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SuperfluousIngotItem extends Item {
	public SuperfluousIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
