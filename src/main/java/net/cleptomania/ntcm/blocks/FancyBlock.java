package net.cleptomania.ntcm.blocks;

import net.cleptomania.ntcm.NTCM;
import net.cleptomania.ntcm.items.NTCMItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FancyBlock extends Block {

    public FancyBlock() {
        super(Material.rock);
        setBlockName(NTCM.MODID + ".fancyblock");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7,
        float par8, float par9) {
        if (player == null) return false;
        if (player.getCurrentEquippedItem() == null) {
            ItemStack item = new ItemStack(NTCMItems.fancyItem, 1);
            player.inventory.addItemStackToInventory(item);
            return true;
        }
        return false;
    }

    @Override
    public String getUnlocalizedName() {
        return NTCM.MODID + ".fancyblock";
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(NTCM.MODID + ":fancyblock");
    }
}
