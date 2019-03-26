package danger.orespawn;

import net.minecraft.world.biome.*;
import java.util.*;

public class BiomeGenUtopianPlains extends BiomeGenBase
{
    protected BiomeGenUtopianPlains(final int par1) {
        super(par1);
        if (OreSpawnMain.GazelleEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Gazelle.class, 10, 2, 4));
        }
        if (OreSpawnMain.FireflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Firefly.class, 15, 3, 6));
        }
        if (OreSpawnMain.GirlfriendEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Girlfriend.class, 5, 2, 3));
        }
        if (OreSpawnMain.BoyfriendEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Boyfriend.class, 5, 2, 3));
        }
        if (OreSpawnMain.CowEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)RedCow.class, 10, 4, 8));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldCow.class, 8, 2, 6));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EnchantedCow.class, 5, 2, 4));
        }
        if (OreSpawnMain.ButterflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityButterfly.class, 20, 3, 6));
        }
        if (OreSpawnMain.MothEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityLunaMoth.class, 10, 1, 5));
        }
        if (OreSpawnMain.ChipmunkEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Chipmunk.class, 3, 1, 2));
        }
        if (OreSpawnMain.CockateilEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cockateil.class, 10, 2, 4));
        }
        if (OreSpawnMain.GoldFishEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldFish.class, 1, 1, 1));
        }
        if (OreSpawnMain.WhaleEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Whale.class, 1, 1, 1));
        }
        if (OreSpawnMain.FlounderEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Flounder.class, 2, 2, 4));
        }
        if (OreSpawnMain.CoinEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Coin.class, 2, 1, 1));
        }
        if (OreSpawnMain.CricketEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cricket.class, 5, 4, 6));
        }
        if (OreSpawnMain.FrogEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Frog.class, 5, 4, 6));
        }
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = 4;
        this.theBiomeDecorator.grassPerChunk = 6;
    }
    
    public void setIslandCreatures() {
        this.spawnableCreatureList = null;
        this.spawnableMonsterList = null;
        this.spawnableWaterCreatureList = null;
        this.spawnableCaveCreatureList = null;
        this.spawnableCreatureList = new ArrayList();
        this.spawnableMonsterList = new ArrayList();
        this.spawnableWaterCreatureList = new ArrayList();
        this.spawnableCaveCreatureList = new ArrayList();
        if (OreSpawnMain.ButterflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityButterfly.class, 5, 2, 6));
        }
        if (OreSpawnMain.CockateilEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cockateil.class, 4, 1, 2));
        }
        if (OreSpawnMain.MothEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityLunaMoth.class, 5, 2, 4));
        }
        if (OreSpawnMain.FireflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Firefly.class, 10, 4, 8));
        }
        if (OreSpawnMain.DragonEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Dragon.class, 1, 1, 2));
        }
        if (OreSpawnMain.StinkyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Stinky.class, 2, 1, 2));
        }
        if (OreSpawnMain.CliffRacerEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)CliffRacer.class, 20, 3, 6));
        }
        if (OreSpawnMain.CloudSharkEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)CloudShark.class, 1, 1, 1));
        }
        if (OreSpawnMain.GoldFishEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldFish.class, 5, 2, 4));
        }
        if (OreSpawnMain.CreepingHorrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)CreepingHorror.class, 60, 4, 8));
        }
        if (OreSpawnMain.TerribleTerrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)TerribleTerror.class, 25, 3, 6));
        }
        if (OreSpawnMain.LurkingTerrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)LurkingTerror.class, 1, 1, 1));
        }
        if (OreSpawnMain.PitchBlackEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)PitchBlack.class, 15, 3, 6));
        }
        if (OreSpawnMain.LeafMonsterEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)LeafMonster.class, 35, 2, 4));
        }
        if (OreSpawnMain.EnderReaperEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)EnderReaper.class, 25, 2, 4));
        }
        if (OreSpawnMain.HerculesBeetleEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)HerculesBeetle.class, 5, 1, 2));
        }
    }
    
    public void setCrystalCreatures() {
        this.spawnableCreatureList = null;
        this.spawnableMonsterList = null;
        this.spawnableWaterCreatureList = null;
        this.spawnableCaveCreatureList = null;
        this.spawnableCreatureList = new ArrayList();
        this.spawnableMonsterList = new ArrayList();
        this.spawnableWaterCreatureList = new ArrayList();
        this.spawnableCaveCreatureList = new ArrayList();
        if (OreSpawnMain.CowEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)CrystalCow.class, 1, 1, 4));
        }
        if (OreSpawnMain.FairyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Fairy.class, 10, 4, 8));
        }
        if (OreSpawnMain.PeacockEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Peacock.class, 5, 4, 8));
        }
        if (OreSpawnMain.MantisEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Mantis.class, 1, 1, 1));
        }
        if (OreSpawnMain.RotatorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Rotator.class, 4, 1, 2));
        }
        if (OreSpawnMain.VortexEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Vortex.class, 3, 1, 2));
        }
        if (OreSpawnMain.UrchinEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Urchin.class, 15, 2, 4));
        }
        if (OreSpawnMain.DungeonBeastEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)DungeonBeast.class, 30, 4, 6));
        }
        if (OreSpawnMain.RatEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Rat.class, 40, 4, 6));
        }
        if (OreSpawnMain.ButterflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityButterfly.class, 10, 2, 4));
        }
        if (OreSpawnMain.CockateilEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cockateil.class, 4, 1, 2));
        }
        if (OreSpawnMain.MothEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityLunaMoth.class, 4, 1, 2));
        }
        if (OreSpawnMain.WhaleEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Whale.class, 1, 1, 2));
        }
        if (OreSpawnMain.CrabEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Crab.class, 1, 1, 2));
        }
        if (OreSpawnMain.FlounderEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Flounder.class, 5, 6, 8));
        }
        if (OreSpawnMain.IrukandjiEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Irukandji.class, 4, 2, 3));
        }
        if (OreSpawnMain.SkateEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Skate.class, 2, 3, 6));
        }
        if (OreSpawnMain.FrogEnable != 0) {
            this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Frog.class, 1, 3, 5));
        }
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.grassPerChunk = -999;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.bigMushroomsPerChunk = -999;
        this.theBiomeDecorator.mushroomsPerChunk = -999;
        this.theBiomeDecorator.reedsPerChunk = -999;
    }
    
    public void setVillageCreatures() {
        if (OreSpawnMain.Robot1Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot1.class, 25, 4, 8));
        }
        if (OreSpawnMain.Robot2Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot2.class, 16, 2, 8));
        }
        if (OreSpawnMain.Robot3Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot3.class, 12, 2, 4));
        }
        if (OreSpawnMain.Robot4Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot4.class, 8, 1, 2));
        }
        if (OreSpawnMain.Robot5Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot5.class, 20, 4, 8));
        }
        if (OreSpawnMain.JefferyEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)GiantRobot.class, 8, 1, 2));
        }
        if (OreSpawnMain.SpiderDriverEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)SpiderDriver.class, 20, 3, 5));
        }
        if (OreSpawnMain.GodzillaEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Godzilla.class, 2, 1, 1));
        }
        if (OreSpawnMain.FireflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Firefly.class, 10, 3, 6));
        }
        if (OreSpawnMain.GirlfriendEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Girlfriend.class, 1, 2, 3));
        }
        if (OreSpawnMain.BoyfriendEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Boyfriend.class, 1, 2, 3));
        }
        if (OreSpawnMain.CowEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)RedCow.class, 8, 4, 8));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldCow.class, 6, 2, 6));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EnchantedCow.class, 4, 2, 4));
        }
        if (OreSpawnMain.ButterflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityButterfly.class, 25, 3, 6));
        }
        if (OreSpawnMain.MothEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityLunaMoth.class, 20, 1, 5));
        }
        if (OreSpawnMain.ChipmunkEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Chipmunk.class, 5, 1, 2));
        }
        if (OreSpawnMain.CockateilEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cockateil.class, 15, 2, 4));
        }
        if (OreSpawnMain.TshirtEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Tshirt.class, 2, 1, 1));
        }
        if (OreSpawnMain.CoinEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Coin.class, 2, 1, 1));
        }
        if (OreSpawnMain.CriminalEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)BandP.class, 15, 1, 2));
        }
    }
    
    public void setChaosCreatures() {
        this.spawnableCreatureList = null;
        this.spawnableMonsterList = null;
        this.spawnableWaterCreatureList = null;
        this.spawnableCaveCreatureList = null;
        this.spawnableCreatureList = new ArrayList();
        this.spawnableMonsterList = new ArrayList();
        this.spawnableWaterCreatureList = new ArrayList();
        this.spawnableCaveCreatureList = new ArrayList();
        this.theBiomeDecorator.flowersPerChunk = 2;
        this.theBiomeDecorator.grassPerChunk = 4;
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.bigMushroomsPerChunk = -999;
        this.theBiomeDecorator.mushroomsPerChunk = -999;
        this.theBiomeDecorator.reedsPerChunk = -999;
        if (OreSpawnMain.ButterflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityButterfly.class, 20, 3, 6));
        }
        if (OreSpawnMain.MothEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EntityLunaMoth.class, 10, 1, 5));
        }
        if (OreSpawnMain.CockateilEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cockateil.class, 10, 2, 4));
        }
        if (OreSpawnMain.FireflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Firefly.class, 15, 3, 6));
        }
        if (OreSpawnMain.CliffRacerEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)CliffRacer.class, 30, 3, 6));
        }
        if (OreSpawnMain.CloudSharkEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)CloudShark.class, 2, 1, 1));
        }
        if (OreSpawnMain.GoldFishEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldFish.class, 10, 2, 4));
        }
        if (OreSpawnMain.FairyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Fairy.class, 5, 2, 4));
        }
        if (OreSpawnMain.BaryonyxEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Baryonyx.class, 2, 2, 4));
        }
        if (OreSpawnMain.BeeEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Bee.class, 2, 2, 4));
        }
        if (OreSpawnMain.CassowaryEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Cassowary.class, 2, 2, 4));
        }
        if (OreSpawnMain.DragonflyEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Dragonfly.class, 2, 2, 4));
        }
        if (OreSpawnMain.PeacockEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Peacock.class, 2, 2, 4));
        }
        if (OreSpawnMain.StinkBugEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)StinkBug.class, 3, 2, 4));
        }
        if (OreSpawnMain.OstrichEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Ostrich.class, 1, 1, 2));
        }
        if (OreSpawnMain.ChipmunkEnable != 0) {
            this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Chipmunk.class, 1, 1, 2));
        }
        if (OreSpawnMain.BeaverEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)Beaver.class, 1, 1, 2));
        }
        if (OreSpawnMain.CowEnable != 0) {
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)RedCow.class, 3, 2, 4));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)GoldCow.class, 2, 2, 4));
            this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry((Class)EnchantedCow.class, 1, 2, 4));
        }
        if (OreSpawnMain.VortexEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Vortex.class, 1, 1, 2));
        }
        if (OreSpawnMain.PitchBlackEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)PitchBlack.class, 1, 1, 2));
        }
        if (OreSpawnMain.TerribleTerrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)TerribleTerror.class, 4, 2, 6));
        }
        if (OreSpawnMain.AlosaurusEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Alosaurus.class, 1, 1, 1));
        }
        if (OreSpawnMain.BasiliskEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Basilisk.class, 1, 1, 1));
        }
        if (OreSpawnMain.Robot1Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot1.class, 5, 2, 8));
        }
        if (OreSpawnMain.Robot2Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot2.class, 2, 1, 4));
        }
        if (OreSpawnMain.Robot3Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot3.class, 2, 1, 4));
        }
        if (OreSpawnMain.Robot4Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot4.class, 1, 1, 2));
        }
        if (OreSpawnMain.Robot5Enable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Robot5.class, 2, 3, 5));
        }
        if (OreSpawnMain.CaterKillerEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)CaterKiller.class, 1, 1, 1));
        }
        if (OreSpawnMain.CaveFisherEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)CaveFisher.class, 5, 1, 5));
        }
        if (OreSpawnMain.CreepingHorrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)CreepingHorror.class, 5, 1, 5));
        }
        if (OreSpawnMain.CryolophosaurusEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Cryolophosaurus.class, 5, 1, 5));
        }
        if (OreSpawnMain.UrchinEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Urchin.class, 2, 1, 5));
        }
        if (OreSpawnMain.DungeonBeastEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)DungeonBeast.class, 2, 1, 5));
        }
        if (OreSpawnMain.EmperorScorpionEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)EmperorScorpion.class, 1, 1, 1));
        }
        if (OreSpawnMain.EnderKnightEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)EnderKnight.class, 2, 1, 2));
        }
        if (OreSpawnMain.EnderReaperEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)EnderReaper.class, 1, 1, 1));
        }
        if (OreSpawnMain.HammerheadEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Hammerhead.class, 1, 1, 1));
        }
        if (OreSpawnMain.HerculesBeetleEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)HerculesBeetle.class, 1, 1, 1));
        }
        if (OreSpawnMain.TrooperBugEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)TrooperBug.class, 1, 1, 1));
        }
        if (OreSpawnMain.MolenoidEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Molenoid.class, 1, 1, 1));
        }
        if (OreSpawnMain.MothraEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Mothra.class, 1, 1, 1));
        }
        if (OreSpawnMain.BrutalflyEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Brutalfly.class, 1, 1, 1));
        }
        if (OreSpawnMain.RatEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Rat.class, 10, 1, 10));
        }
        if (OreSpawnMain.RotatorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Rotator.class, 1, 1, 3));
        }
        if (OreSpawnMain.ScorpionEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Scorpion.class, 2, 1, 3));
        }
        if (OreSpawnMain.SpitBugEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)SpitBug.class, 2, 1, 3));
        }
        if (OreSpawnMain.NastysaurusEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Nastysaurus.class, 1, 1, 1));
        }
        if (OreSpawnMain.TRexEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)TRex.class, 1, 1, 1));
        }
        if (OreSpawnMain.LeafMonsterEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)LeafMonster.class, 2, 1, 4));
        }
        if (OreSpawnMain.PointysaurusEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Pointysaurus.class, 2, 1, 4));
        }
        if (OreSpawnMain.LeonEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Leon.class, 1, 1, 1));
        }
        if (OreSpawnMain.MantisEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)Mantis.class, 1, 1, 1));
        }
        if (OreSpawnMain.LurkingTerrorEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)LurkingTerror.class, 1, 1, 1));
        }
        if (OreSpawnMain.GammaMetroidEnable != 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry((Class)GammaMetroid.class, 1, 1, 1));
        }
    }
}
