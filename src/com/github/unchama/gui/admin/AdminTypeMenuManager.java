package com.github.unchama.gui.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.unchama.gui.GuiMenu.ManagerType;
import com.github.unchama.gui.moduler.AdminMenuManager;

/**
 * @author tar0ss
 *
 */
public class AdminTypeMenuManager extends AdminMenuManager {
	// 各ボタンのスロット番号
	private final int gachaSlot = 0;
	private final int repairSlot = 3;
	private final int customHeadSlot = 4;
	private final int buildSlot = 2;

	// ツール修理
	ItemStack repairButton;

	public AdminTypeMenuManager(){
		repairButton = new ItemStack(Material.ANVIL);
	}

	@Override
	protected void setIDMap(HashMap<Integer, String> idmap) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean invoke(Player player, String identifier) {
		return false;
	}

	@Override
	protected void setOpenMenuMap(HashMap<Integer, ManagerType> openmap) {
		openmap.put(gachaSlot, ManagerType.ADMINGACHATYPEMENU);
		openmap.put(customHeadSlot, ManagerType.ADMINCUSTOMHEADMAINMENU);
		openmap.put(repairSlot, ManagerType.ADMINTOOLREPAIRMENU);
		openmap.put(buildSlot, ManagerType.ADMINBUILDMENU);
	}

	@Override
	public int getInventorySize() {
		return 5;
	}

	@Override
	public String getInventoryName(Player player) {
		return "" + ChatColor.RED + ChatColor.BOLD + "管理メニュー";
	}

	@Override
	protected InventoryType getInventoryType() {
		return InventoryType.HOPPER;
	}

	@Override
	protected ItemMeta getItemMeta(Player player, int slot, ItemStack itemstack) {
		ItemMeta itemmeta = itemstack.getItemMeta();
		List<String> lore = new ArrayList<String>();
		switch (slot) {
		case gachaSlot:
			itemmeta.setDisplayName(ChatColor.DARK_AQUA + "ガチャシステム");
			itemmeta.setLore(lore);
			break;
		case customHeadSlot:
			itemmeta.setDisplayName(ChatColor.DARK_AQUA + "カスタムヘッド");
			itemmeta.setLore(lore);
			break;
		case repairSlot:
			itemmeta.setDisplayName(ChatColor.DARK_AQUA + "ツール耐久値操作");
			itemmeta.setLore(lore);
			break;
        case buildSlot:
            itemmeta.setDisplayName(ChatColor.DARK_AQUA + "建築系システム操作");
		default:
			break;
		}
		itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
		return itemmeta;
	}

	@Override
	protected ItemStack getItemStack(Player player, int slot) {
		ItemStack itemstack = null;
		switch (slot) {
		case gachaSlot:
			itemstack = head.getMobHead("red_present");
			break;
		case customHeadSlot:
			itemstack = head.getMobHead("Zombie");
			break;
		case repairSlot:
			itemstack = repairButton;
			break;
        case buildSlot:
            itemstack = new ItemStack(Material.STONE);
		default:
			break;
		}
		return itemstack;
	}

}
