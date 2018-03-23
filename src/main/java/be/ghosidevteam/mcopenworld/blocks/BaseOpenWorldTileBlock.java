package be.ghosidevteam.mcopenworld.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BaseOpenWorldTileBlock extends BaseOpenWorldBlock implements ITileEntityProvider {
    protected BaseOpenWorldTileBlock(Material materialIn) {
        super(materialIn);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
