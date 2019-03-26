package danger.orespawn;

import net.minecraftforge.common.*;
import net.minecraft.client.*;
import cpw.mods.fml.client.registry.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraftforge.client.*;
import cpw.mods.fml.common.*;

public class ClientProxyOreSpawn extends CommonProxyOreSpawn
{
    @Override
    public void registerRenderThings() {
        MinecraftForge.EVENT_BUS.register((Object)new GirlfriendOverlayGui(Minecraft.getMinecraft()));
        RenderingRegistry.registerEntityRenderingHandler((Class)Girlfriend.class, (Render)new RenderGirlfriend(new ModelBiped(), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Boyfriend.class, (Render)new RenderBoyfriend(new ModelBiped(), 0.55f));
        RenderingRegistry.registerEntityRenderingHandler((Class)RedCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GoldCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EnchantedCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CrystalCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Shoes.class, (Render)new RenderShoe());
        RenderingRegistry.registerEntityRenderingHandler((Class)SunspotUrchin.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)WaterBall.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)InkSack.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)LaserBall.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)IceBall.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)Acid.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)DeadIrukandji.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)BerthaHit.class, (Render)new RenderItemUrchin());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCage.class, (Render)new RenderCage());
        RenderingRegistry.registerEntityRenderingHandler((Class)UltimateFishHook.class, (Render)new RenderFish());
        RenderingRegistry.registerEntityRenderingHandler((Class)UltimateArrow.class, (Render)new RenderArrow());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityThrownRock.class, (Render)new RenderThrownRock());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityButterfly.class, (Render)new RenderButterfly(new ModelButterfly(1.0f), 0.3f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Firefly.class, (Render)new RenderFirefly(new ModelFirefly(2.5f), 0.2f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityLunaMoth.class, (Render)new RenderButterfly(new ModelButterfly(0.75f), 0.4f, 1.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMosquito.class, (Render)new RenderMosquito(new ModelMosquito(), 0.3f, 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Ghost.class, (Render)new RenderGhost(new ModelGhost(), 0.0f, 0.65f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GhostSkelly.class, (Render)new RenderGhostSkelly(new ModelGhostSkelly(), 0.0f, 1.05f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Mothra.class, (Render)new RenderButterfly(new ModelButterfly(0.2f), 0.75f, 10.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1f, 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityRedAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.15f, 0.35f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityRainbowAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1f, 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityUnstableAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1f, 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Alosaurus.class, (Render)new RenderAlosaurus(new ModelAlosaurus(0.22f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)TRex.class, (Render)new RenderTRex(new ModelTRex(0.2f), 1.0f, 1.2f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Tshirt.class, (Render)new RenderTshirt(new ModelTshirt(0.22f), 1.0f, 0.33f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Cryolophosaurus.class, (Render)new RenderCryolophosaurus(new ModelCryolophosaurus(0.75f), 0.75f, 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Basilisk.class, (Render)new RenderBasilisk(new ModelBasilisk(0.3f), 0.5f, 1.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Camarasaurus.class, (Render)new RenderCamarasaurus(new ModelCamarasaurus(0.65f), 0.65f, 0.65f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Hydrolisc.class, (Render)new RenderHydrolisc(new ModelHydrolisc(0.65f), 0.65f, 0.65f));
        RenderingRegistry.registerEntityRenderingHandler((Class)VelocityRaptor.class, (Render)new RenderVelocityRaptor(new ModelVelocityRaptor(1.25f), 0.55f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Dragonfly.class, (Render)new RenderDragonfly(new ModelDragonfly(2.0f), 0.3f, 1.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Bee.class, (Render)new RenderBee(new ModelBee(2.0f), 0.9f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EmperorScorpion.class, (Render)new RenderEmperorScorpion(new ModelEmperorScorpion(0.22f), 0.95f, 1.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Spyro.class, (Render)new RenderSpyro(new ModelSpyro(0.65f), 0.65f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Baryonyx.class, (Render)new RenderBaryonyx(new ModelBaryonyx(0.25f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GammaMetroid.class, (Render)new RenderGammaMetroid(new ModelGammaMetroid(0.45f), 0.75f, 0.9f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Cockateil.class, (Render)new RenderCockateil(new ModelCockateil(1.0f), 0.3f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)RubyBird.class, (Render)new RenderCockateil(new ModelCockateil(1.0f), 0.3f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Kyuubi.class, (Render)new RenderKyuubi(new ModelKyuubi(0.5f), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Scorpion.class, (Render)new RenderScorpion(new ModelScorpion(0.62f), 0.35f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CaveFisher.class, (Render)new RenderCaveFisher(new ModelCaveFisher(0.62f), 0.35f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Alien.class, (Render)new RenderAlien(new ModelAlien(0.22f), 0.35f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)WaterDragon.class, (Render)new RenderWaterDragon(new ModelWaterDragon(0.5f), 0.85f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)AttackSquid.class, (Render)new RenderAttackSquid(new ModelAttackSquid(1.0f), 0.25f, 0.9f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Elevator.class, (Render)new RenderElevator());
        RenderingRegistry.registerEntityRenderingHandler((Class)Robot1.class, (Render)new RenderRobot1(new ModelRobot1(2.0f), 0.3f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Robot2.class, (Render)new RenderRobot2(new ModelRobot2(1.0f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Robot3.class, (Render)new RenderRobot3(new ModelRobot3(1.0f), 1.0f, 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Robot4.class, (Render)new RenderRobot4(new ModelRobot4(1.0f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Robot5.class, (Render)new RenderRobot5(new ModelRobot5(1.0f), 0.5f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Kraken.class, (Render)new RenderKraken(new ModelKraken(1.0f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Lizard.class, (Render)new RenderLizard(new ModelLizard(0.65f), 0.75f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Cephadrome.class, (Render)new RenderCephadrome(new ModelCephadrome(0.55f), 1.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Dragon.class, (Render)new RenderDragon(new ModelDragon(0.65f), 1.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Chipmunk.class, (Render)new RenderChipmunk(new ModelChipmunk(1.0f), 0.15f, 0.9f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Gazelle.class, (Render)new RenderGazelle(new ModelGazelle(0.65f), 0.45f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Ostrich.class, (Render)new RenderOstrich(new ModelOstrich(0.65f), 0.55f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)TrooperBug.class, (Render)new RenderTrooperBug(new ModelTrooperBug(0.22f), 0.95f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)SpitBug.class, (Render)new RenderSpitBug(new ModelSpitBug(0.55f), 0.55f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)StinkBug.class, (Render)new RenderStinkBug(new ModelStinkBug(0.75f), 0.35f, 0.85f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Island.class, (Render)new RenderIsland(new ModelIsland(1.0f), 0.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)IslandToo.class, (Render)new RenderIslandToo(new ModelIsland(1.0f), 0.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CreepingHorror.class, (Render)new RenderCreepingHorror(new ModelCreepingHorror(), 0.45f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)TerribleTerror.class, (Render)new RenderTerribleTerror(new ModelTerribleTerror(), 0.45f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CliffRacer.class, (Render)new RenderCliffRacer(new ModelCliffRacer(1.0f), 0.3f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Triffid.class, (Render)new RenderTriffid(new ModelTriffid(1.0f), 0.3f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)PitchBlack.class, (Render)new RenderPitchBlack(new ModelPitchBlack(0.65f), 1.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)LurkingTerror.class, (Render)new RenderLurkingTerror(new ModelLurkingTerror(), 0.45f, 0.85f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Godzilla.class, (Render)new RenderGodzilla(new ModelGodzilla(0.2f), 1.0f, 2.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GodzillaHead.class, (Render)new RenderGodzillaHead(null, 0.0f, 0.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)KingHead.class, (Render)new RenderKingHead(null, 0.0f, 0.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)QueenHead.class, (Render)new RenderQueenHead(null, 0.0f, 0.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)WormSmall.class, (Render)new RenderWormSmall(new ModelWormSmall(), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)WormMedium.class, (Render)new RenderWormMedium(new ModelWormMedium(), 0.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)WormLarge.class, (Render)new RenderWormLarge(new ModelWormLarge(), 0.9f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Cassowary.class, (Render)new RenderCassowary(new ModelCassowary(0.55f), 0.5f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GoldFish.class, (Render)new RenderGoldFish(new ModelGoldFish(0.7f), 0.2f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CloudShark.class, (Render)new RenderCloudShark(new ModelCloudShark(1.0f), 0.5f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)LeafMonster.class, (Render)new RenderLeafMonster(new ModelLeafMonster(), 0.65f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EnderKnight.class, (Render)new RenderEnderKnight(new ModelEnderKnight(0.21f), 0.3f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EnderReaper.class, (Render)new RenderEnderReaper(new ModelEnderReaper(0.23f), 0.2f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Beaver.class, (Render)new RenderBeaver(new ModelBeaver(0.5f), 0.15f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Termite.class, (Render)new RenderAnt(new ModelAnt(), 0.15f, 0.35f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Fairy.class, (Render)new RenderFairy(new ModelFairy(1.5f), 0.1f, 0.35f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Peacock.class, (Render)new RenderPeacock(new ModelPeacock(0.75f), 0.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Rotator.class, (Render)new RenderRotator(new ModelRotator(0.25f), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Vortex.class, (Render)new RenderVortex(new ModelVortex(0.25f), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)DungeonBeast.class, (Render)new RenderDungeonBeast(new ModelDungeonBeast(0.62f), 0.25f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Rat.class, (Render)new RenderRat(new ModelRat(1.0f), 0.1f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Flounder.class, (Render)new RenderFlounder(new ModelFlounder(), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Whale.class, (Render)new RenderWhale(new ModelWhale(), 0.1f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Irukandji.class, (Render)new RenderIrukandji(new ModelIrukandji(1.0f), 0.1f, 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Skate.class, (Render)new RenderSkate(new ModelSkate(1.0f), 0.1f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Urchin.class, (Render)new RenderUrchin(new ModelUrchin(1.0f), 0.35f, 1.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Mantis.class, (Render)new RenderMantis(new ModelMantis(2.0f), 0.9f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)HerculesBeetle.class, (Render)new RenderHerculesBeetle(new ModelHerculesBeetle(1.0f), 0.99f, 1.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Stinky.class, (Render)new RenderStinky(new ModelStinky(0.65f), 0.75f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Coin.class, (Render)new RenderCoin(new ModelCoin(0.22f), 0.75f, 0.125f));
        RenderingRegistry.registerEntityRenderingHandler((Class)TheKing.class, (Render)new RenderTheKing(new ModelTheKing(0.65f), 1.9f, 2.1f));
        RenderingRegistry.registerEntityRenderingHandler((Class)TheQueen.class, (Render)new RenderTheQueen(new ModelTheQueen(0.65f), 1.9f, 2.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)ThePrince.class, (Render)new RenderThePrince(new ModelThePrince(0.65f), 0.75f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Molenoid.class, (Render)new RenderMolenoid(new ModelMolenoid(0.5f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)SeaMonster.class, (Render)new RenderSeaMonster(new ModelSeaMonster(0.5f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)SeaViper.class, (Render)new RenderSeaViper(new ModelSeaViper(0.5f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EasterBunny.class, (Render)new RenderEasterBunny(new ModelEasterBunny(0.55f), 0.5f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)CaterKiller.class, (Render)new RenderCaterKiller(new ModelCaterKiller(0.22f), 1.0f, 1.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Leon.class, (Render)new RenderLeon(new ModelLeon(0.22f), 1.0f, 1.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Hammerhead.class, (Render)new RenderHammerhead(new ModelHammerhead(0.33f), 1.0f, 2.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)RubberDucky.class, (Render)new RenderRubberDucky(new ModelRubberDucky(1.0f), 0.15f, 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)ThePrinceTeen.class, (Render)new RenderThePrinceTeen(new ModelThePrinceTeen(0.65f), 1.0f, 1.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)BandP.class, (Render)new RenderBandP(new ModelBandP(0.4f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)RockBase.class, (Render)new RenderRockBase(new ModelRockBase(1.0f), 0.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)PurplePower.class, (Render)new RenderPurplePower(new ModelPurplePower(1.0f), 0.3f, 2.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Brutalfly.class, (Render)new RenderBrutalfly(new ModelBrutalfly(0.2f), 0.75f, 9.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Nastysaurus.class, (Render)new RenderNastysaurus(new ModelNastysaurus(0.65f), 1.0f, 1.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Pointysaurus.class, (Render)new RenderPointysaurus(new ModelPointysaurus(1.0f), 1.0f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Cricket.class, (Render)new RenderCricket(new ModelCricket(2.5f), 0.15f, 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)ThePrincess.class, (Render)new RenderThePrincess(new ModelThePrincess(0.65f), 0.7f, 0.7f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Frog.class, (Render)new RenderFrog(new ModelFrog(1.0f), 0.35f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)ThePrinceAdult.class, (Render)new RenderThePrinceAdult(new ModelThePrinceAdult(0.65f), 1.2f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)SpiderRobot.class, (Render)new RenderSpiderRobot(new ModelSpiderRobot(1.0f), 0.99f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)SpiderDriver.class, (Render)new RenderSpiderDriver(new ModelSpider(), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)GiantRobot.class, (Render)new RenderGiantRobot(new ModelGiantRobot(0.25f), 0.99f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)AntRobot.class, (Render)new RenderAntRobot(new ModelAntRobot(1.0f), 0.99f, 1.0f));
        RenderingRegistry.registerEntityRenderingHandler((Class)Crab.class, (Render)new RenderCrab(new ModelCrab(1.0f), 0.99f, 1.0f));
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyBertha, (IItemRenderer)new RenderBertha());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MySlice, (IItemRenderer)new RenderSlice());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyRoyal, (IItemRenderer)new RenderRoyal());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MySquidZooka, (IItemRenderer)new RenderSquidZooka());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyHammy, (IItemRenderer)new RenderHammy());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyBattleAxe, (IItemRenderer)new RenderBattleAxe());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyChainsaw, (IItemRenderer)new RenderChainsaw());
        MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyQueenBattleAxe, (IItemRenderer)new RenderQueenBattleAxe());
    }
    
    @Override
    public void registerSoundThings() {
        MinecraftForge.EVENT_BUS.register((Object)new OreSpawnSounds());
    }
    
    @Override
    public void registerKeyboardInput() {
        final KeyHandler k = new KeyHandler();
        FMLCommonHandler.instance().bus().register((Object)k);
        OreSpawnMain.MyKeyhandler = k;
    }
    
    @Override
    public void registerNetworkStuff() {
        super.registerNetworkStuff();
        FMLCommonHandler.instance().bus().register((Object)new RiderControl(this.getNetwork()));
    }
    
    @Override
    public int setArmorPrefix(final String string) {
        return RenderingRegistry.addNewArmourRendererPrefix(string);
    }
}
