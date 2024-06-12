package net.cleptomania.ntcm.blocks;

import net.cleptomania.ntcm.NTCM;
import net.cleptomania.ntcm.tile.TileEntityFancierBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FancierBlock extends Block implements ITileEntityProvider {

    public FancierBlock() {
        super(Material.rock);
        setBlockName(NTCM.MODID + ".fancierblock");
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.675F, 0.9F);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public String getUnlocalizedName() {
        return NTCM.MODID + ".fancierblock";
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityFancierBlock();
    }
}
