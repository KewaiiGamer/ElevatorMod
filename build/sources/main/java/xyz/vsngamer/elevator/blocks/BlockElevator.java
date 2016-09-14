package xyz.vsngamer.elevator.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xyz.vsngamer.elevator.ElevatorMod;
import xyz.vsngamer.elevator.ElevatorModTab;
import xyz.vsngamer.elevator.Ref;
import xyz.vsngamer.elevator.init.ModBlocks;
import xyz.vsngamer.elevator.tileentity.TileEntityElevator;

public class BlockElevator extends Block implements ITileEntityProvider{

	public BlockElevator() {
		super(Material.CLOTH);
		setUnlocalizedName(Ref.EBlocks.ELEVATOR.getUnlocalizedName());
		setRegistryName(Ref.EBlocks.ELEVATOR.getRegistryName());
		setHardness(0.8F);
		setSoundType(SoundType.CLOTH);
		setCreativeTab(ElevatorMod.CREATIVE_TAB);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityElevator();
	}
}