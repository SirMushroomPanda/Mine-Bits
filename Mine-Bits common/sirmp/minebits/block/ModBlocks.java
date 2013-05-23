package sirmp.minebits.block;

import sirmp.minebits.block.BlockGysahlGreens;
import sirmp.minebits.lib.BlockIds;
import sirmp.minebits.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    
    /* Mod block instances */
    public static Block gysahlGreensCrop;
    
    public static void init() {
        
        gysahlGreensCrop = new BlockGysahlGreens(BlockIds.GYSAHL_GREENS_CROP);
        
        GameRegistry.registerBlock(gysahlGreensCrop, Strings.GYSAHL_GREENS_CROP_NAME);
        
    }

}
