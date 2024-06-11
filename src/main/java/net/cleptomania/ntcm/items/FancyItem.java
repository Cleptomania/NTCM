package net.cleptomania.ntcm.items;

import net.cleptomania.ntcm.NTCM;
import net.cleptomania.ntcm.blocks.NTCMBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FancyItem extends Item {

    public FancyItem() {
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int par7,
        float par8, float par9, float par10) {
        if (world.getBlock(x, y, z) == NTCMBlocks.fancyBlock) {
            item.stackSize--;
            if (item.stackSize <= 0) {
                player.destroyCurrentEquippedItem();
            }
            return true;
        }
        return false;
    }

    @Override
    public String getUnlocalizedName() {
        return NTCM.MODID + ".fancyitem";
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return NTCM.MODID + ".fancyitem";
    }

    @Override
    public void registerIcons(IIconRegister register) {
        this.itemIcon = register.registerIcon(NTCM.MODID + ":fancyitem");
    }
}
