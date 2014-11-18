package moze_intel.ssr.gameObjs;

import moze_intel.ssr.utils.TierHandler;
import moze_intel.ssr.utils.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SSRCreativeTab extends CreativeTabs {

	public SSRCreativeTab() {
		super("soul_shards_reborn");
	}

	@Override
	public ItemStack getIconItemStack() {
		ItemStack shard = new ItemStack(ObjHandler.SOUL_SHARD);

		Utils.setShardTier(shard, (byte) 5);
		Utils.setShardKillCount(shard, TierHandler.getMaxKills(5));
		Utils.setShardBoundEnt(shard, "NULL");

		return shard;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return null;
	}
}
