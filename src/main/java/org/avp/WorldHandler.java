package org.avp;

import org.avp.dimension.acheron.WorldGeneratorAcheron;
import org.avp.dimension.varda.WorldGeneratorVarda;
import org.avp.world.WorldGenerator;
import org.avp.world.WorldGeneratorDerelict;

import com.arisux.amdxlib.lib.game.IInitEvent;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldHandler implements IInitEvent
{
    public static final WorldHandler instance = new WorldHandler();
    private SaveHandler saveHandler;
    private IWorldGenerator worldGeneratorVarda;
    private IWorldGenerator worldGeneratorAcheron;
    private IWorldGenerator worldGeneratorDerelict;

    public WorldHandler()
    {
        this.saveHandler = new SaveHandler();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new WorldGenerator(), 1);
        GameRegistry.registerWorldGenerator(this.worldGeneratorVarda = new WorldGeneratorVarda(), 1);
        GameRegistry.registerWorldGenerator(this.setWorldGeneratorAcheron(new WorldGeneratorAcheron()), 1);
        GameRegistry.registerWorldGenerator(this.worldGeneratorDerelict = new WorldGeneratorDerelict(), 1);
    }

    public WorldGeneratorVarda getWorldGeneratorVarda()
    {
        return (WorldGeneratorVarda) worldGeneratorVarda;
    }

    public WorldGeneratorDerelict getWorldGeneratorDerelict()
    {
        return (WorldGeneratorDerelict) worldGeneratorDerelict;
    }

    public SaveHandler getSaveHandler()
    {
        return saveHandler;
    }

    public IWorldGenerator getWorldGeneratorAcheron()
    {
        return worldGeneratorAcheron;
    }

    public IWorldGenerator setWorldGeneratorAcheron(IWorldGenerator worldGeneratorAcheron)
    {
        this.worldGeneratorAcheron = worldGeneratorAcheron;
        return worldGeneratorAcheron;
    }
}
