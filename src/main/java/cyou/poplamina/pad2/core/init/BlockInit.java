package cyou.poplamina.pad2.core.init;

import cyou.poplamina.pad2.pad2;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(pad2.MODID);

    public static final DeferredBlock<Block> POPLAMINA_BLOCK = registerBlock("poplamina_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.HAY_BLOCK)));

    public static DeferredBlock<Block> registerBlock(
            String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;

    }
}