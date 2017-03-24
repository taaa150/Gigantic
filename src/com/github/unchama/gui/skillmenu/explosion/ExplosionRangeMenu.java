package com.github.unchama.gui.skillmenu.explosion;



import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.unchama.gui.moduler.GuiMenuManager;

public class ExplosionRangeMenu extends GuiMenuManager{

	@Override
	protected void setOpenMenuMap(HashMap<Integer, Class<? extends GuiMenuManager>> openmap) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	protected void setMethodMap(HashMap<Integer, String> methodmap) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	protected void setKeyItem() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public String getClickType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int getInventorySize() {
		return 9;
	}

	@Override
	public String getInventoryName(Player player) {
		return ChatColor.LIGHT_PURPLE + "範囲設定";
	}

	@Override
	protected InventoryType getInventoryType() {
		return InventoryType.DISPENSER;
	}

	@Override
	protected ItemMeta getItemMeta(Player player, int slot, ItemStack itemstack) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected ItemStack getItemStack(Player player, int slot) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Sound getSoundName() {
		return Sound.BLOCK_ANVIL_PLACE;
	}

	@Override
	public float getVolume() {
		return (float)0.8;
	}

	@Override
	public float getPitch() {
		return (float)0.6;
	}

}
