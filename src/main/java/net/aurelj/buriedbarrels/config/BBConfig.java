package net.aurelj.buriedbarrels.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.aurelj.buriedbarrels.BuriedBarrelsMain;

@Config(name = BuriedBarrelsMain.MODID)
public class BBConfig implements ConfigData {

    @Comment("""
                        
                      
            [Desert Pyramid Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean desertPyramidBuriedBarrelGenerates = true;
    @Comment("Base distance between Desert Pyramid Buried Barrels (in chunks)")
    public int desertPyramidBuriedBarrelSpacing = 20;

    @Comment("""
                        
                      
            [Jungle Temple Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean jungleTempleBuriedBarrelGenerates = true;
    @Comment("Base distance between Jungle Temple Buried Barrels (in chunks)")
    public int jungleTempleBuriedBarrelSpacing = 20;

    @Comment("""
                        
                      
            [Abandoned Mineshaft Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean abandonedMineshaftBuriedBarrelGenerates = true;
    @Comment("Base distance between Abandoned Mineshaft Buried Barrels (in chunks)")
    public int abandonedMineshaftBuriedBarrelSpacing = 30;

    @Comment("""
                        
                      
            [End City Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean endCityBuriedBarrelGenerates = true;
    @Comment("Base distance between End City Buried Barrels (in chunks)")
    public int endCityBuriedBarrelSpacing = 20;

    @Comment("""
                        
                      
            [Igloo Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean iglooBuriedBarrelGenerates = true;
    @Comment("Base distance between Igloo Buried Barrels (in chunks)")
    public int iglooBuriedBarrelSpacing = 20;

    @Comment("""
                        
                      
            [Pillager Outpost Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean pillagerOutpostBuriedBarrelGenerates = true;
    @Comment("Base distance between Pillager Outpost Buried Barrels (in chunks)")
    public int pillagerOutpostBuriedBarrelSpacing = 30;

    @Comment("""
                        
                      
            [Stronghold Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean strongholdBuriedBarrelGenerates = true;
    @Comment("Base distance between Stronghold Buried Barrels (in chunks)")
    public int strongholdBuriedBarrelSpacing = 40;

    @Comment("""
                        
                      
            [Village Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean villageBuriedBarrelGenerates = true;
    @Comment("Base distance between Village Buried Barrels (in chunks)")
    public int villageBuriedBarrelSpacing = 20;

    @Comment("""
                        
                      
            [Woodland Mansion Buried Barrel Spawning Settings]
            Basic configuration options for this buried barrel""")
    public boolean woodlandMansionBuriedBarrelGenerates = true;
    @Comment("Base distance between Woodland Mansion Buried Barrels (in chunks)")
    public int woodlandMansionBuriedBarrelSpacing = 40;

}