package com.jaquadro.minecraft.storagedrawers.storage;

import com.jaquadro.minecraft.storagedrawers.api.storage.IDrawer;
import com.jaquadro.minecraft.storagedrawers.api.storage.attribute.LockAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface ICentralInventory
{
    ItemStack getStoredItemPrototype (int slot);

    IDrawer setStoredItem (int slot, ItemStack itemPrototype, int amount);

    int getStoredItemCount (int slot);

    void setStoredItemCount (int slot, int amount);

    int getMaxCapacity (int slot);

    int getMaxCapacity (int slot, ItemStack itemPrototype);

    int getRemainingCapacity (int slot);

    int getStoredItemStackSize (int slot);

    int getItemCapacityForInventoryStack (int slot);

    int getConversionRate (int slot);

    int getStoredItemRemainder (int slot);

    boolean isSmallestUnit (int slot);

    boolean isVoidSlot (int slot);

    boolean isShroudedSlot (int slot);

    boolean setIsSlotShrouded (int slot, boolean state);

    boolean isSlotShowingQuantity (int slot);

    boolean setIsSlotShowingQuantity (int slot, boolean state);

    boolean isLocked (int slot, LockAttribute attr);

    void readFromNBT (int slot, NBTTagCompound tag);

    void writeToNBT (int slot, NBTTagCompound tag);
}
