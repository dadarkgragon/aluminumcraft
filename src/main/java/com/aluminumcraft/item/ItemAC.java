package com.aluminumcraft.item;

import net.minecraft.item.Item;

public class ItemAC extends Item {
	public ItemAC(String unlocalizedName){
		super();
		this.setUnlocalizedName(unlocalizedName);
	}
	
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return this.getUnlocalizedName().substring(5);
	}
}
