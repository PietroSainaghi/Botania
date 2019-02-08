/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jan 14, 2014, 5:17:55 PM (GMT)]
 */
package vazkii.botania.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.ILexiconable;
import vazkii.botania.api.recipe.RecipeManaInfusion;
import vazkii.botania.api.subtile.SubTileEntity;
import vazkii.botania.common.block.corporea.BlockCorporeaCrystalCube;
import vazkii.botania.common.block.corporea.BlockCorporeaFunnel;
import vazkii.botania.common.block.corporea.BlockCorporeaIndex;
import vazkii.botania.common.block.corporea.BlockCorporeaInterceptor;
import vazkii.botania.common.block.corporea.BlockCorporeaRetainer;
import vazkii.botania.common.block.decor.*;
import vazkii.botania.common.block.dispenser.BehaviourFelPumpkin;
import vazkii.botania.common.block.dispenser.BehaviourPoolMinecart;
import vazkii.botania.common.block.dispenser.BehaviourWand;
import vazkii.botania.common.block.dispenser.SeedBehaviours;
import vazkii.botania.common.block.mana.BlockAlchemyCatalyst;
import vazkii.botania.common.block.mana.BlockBellows;
import vazkii.botania.common.block.mana.BlockBrewery;
import vazkii.botania.common.block.mana.BlockConjurationCatalyst;
import vazkii.botania.common.block.mana.BlockDistributor;
import vazkii.botania.common.block.mana.BlockEnchanter;
import vazkii.botania.common.block.mana.BlockForestDrum;
import vazkii.botania.common.block.mana.BlockManaVoid;
import vazkii.botania.common.block.mana.BlockPool;
import vazkii.botania.common.block.mana.BlockPrism;
import vazkii.botania.common.block.mana.BlockPump;
import vazkii.botania.common.block.mana.BlockRFGenerator;
import vazkii.botania.common.block.mana.BlockRuneAltar;
import vazkii.botania.common.block.mana.BlockSpawnerClaw;
import vazkii.botania.common.block.mana.BlockSpreader;
import vazkii.botania.common.block.mana.BlockTerraPlate;
import vazkii.botania.common.block.mana.BlockTurntable;
import vazkii.botania.common.block.string.BlockRedStringComparator;
import vazkii.botania.common.block.string.BlockRedStringContainer;
import vazkii.botania.common.block.string.BlockRedStringDispenser;
import vazkii.botania.common.block.string.BlockRedStringFertilizer;
import vazkii.botania.common.block.string.BlockRedStringInterceptor;
import vazkii.botania.common.block.string.BlockRedStringRelay;
import vazkii.botania.common.block.subtile.SubTileManastar;
import vazkii.botania.common.block.subtile.SubTilePureDaisy;
import vazkii.botania.common.block.subtile.functional.*;
import vazkii.botania.common.block.subtile.generating.SubTileArcaneRose;
import vazkii.botania.common.block.subtile.generating.SubTileDandelifeon;
import vazkii.botania.common.block.subtile.generating.SubTileEndoflame;
import vazkii.botania.common.block.subtile.generating.SubTileEntropinnyum;
import vazkii.botania.common.block.subtile.generating.SubTileGourmaryllis;
import vazkii.botania.common.block.subtile.generating.SubTileHydroangeas;
import vazkii.botania.common.block.subtile.generating.SubTileKekimurus;
import vazkii.botania.common.block.subtile.generating.SubTileMunchdew;
import vazkii.botania.common.block.subtile.generating.SubTileNarslimmus;
import vazkii.botania.common.block.subtile.generating.SubTileRafflowsia;
import vazkii.botania.common.block.subtile.generating.SubTileShulkMeNot;
import vazkii.botania.common.block.subtile.generating.SubTileSpectrolus;
import vazkii.botania.common.block.subtile.generating.SubTileThermalily;
import vazkii.botania.common.block.tile.*;
import vazkii.botania.common.block.tile.corporea.TileCorporeaCrystalCube;
import vazkii.botania.common.block.tile.corporea.TileCorporeaFunnel;
import vazkii.botania.common.block.tile.corporea.TileCorporeaIndex;
import vazkii.botania.common.block.tile.corporea.TileCorporeaInterceptor;
import vazkii.botania.common.block.tile.corporea.TileCorporeaRetainer;
import vazkii.botania.common.block.tile.mana.TileBellows;
import vazkii.botania.common.block.tile.mana.TileDistributor;
import vazkii.botania.common.block.tile.mana.TileManaDetector;
import vazkii.botania.common.block.tile.mana.TileManaVoid;
import vazkii.botania.common.block.tile.mana.TilePool;
import vazkii.botania.common.block.tile.mana.TilePrism;
import vazkii.botania.common.block.tile.mana.TilePump;
import vazkii.botania.common.block.tile.mana.TileRFGenerator;
import vazkii.botania.common.block.tile.mana.TileSpreader;
import vazkii.botania.common.block.tile.mana.TileTurntable;
import vazkii.botania.common.block.tile.string.TileRedStringComparator;
import vazkii.botania.common.block.tile.string.TileRedStringContainer;
import vazkii.botania.common.block.tile.string.TileRedStringDispenser;
import vazkii.botania.common.block.tile.string.TileRedStringFertilizer;
import vazkii.botania.common.block.tile.string.TileRedStringInterceptor;
import vazkii.botania.common.block.tile.string.TileRedStringRelay;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockDreamwood;
import vazkii.botania.common.item.block.ItemBlockElven;
import vazkii.botania.common.item.block.ItemBlockFloatingSpecialFlower;
import vazkii.botania.common.item.block.ItemBlockMod;
import vazkii.botania.common.item.block.ItemBlockPool;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.item.block.ItemBlockTinyPotato;
import vazkii.botania.common.item.block.ItemBlockWithMetadataAndName;
import vazkii.botania.common.lexicon.LexiconData;
import vazkii.botania.common.lib.LibBlockNames;
import vazkii.botania.common.lib.LibMisc;
import vazkii.botania.common.lib.LibOreDict;

import java.util.Locale;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LibMisc.MOD_ID)
public final class ModBlocks {
	@ObjectHolder("white" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block whiteFlower;
	@ObjectHolder("orange" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block orangeFlower;
	@ObjectHolder("magenta" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block magentaFlower;
	@ObjectHolder("light_blue" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block lightBlueFlower;
	@ObjectHolder("yellow" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block yellowFlower;
	@ObjectHolder("lime" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block limeFlower;
	@ObjectHolder("pink" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block pinkFlower;
	@ObjectHolder("gray" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block grayFlower;
	@ObjectHolder("light_gray" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block lightGrayFlower;
	@ObjectHolder("cyan" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block cyanFlower;
	@ObjectHolder("purple" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block purpleFlower;
	@ObjectHolder("blue" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block blueFlower;
	@ObjectHolder("brown" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block brownFlower;
	@ObjectHolder("green" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block greenFlower;
	@ObjectHolder("red" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block redFlower;
	@ObjectHolder("black" + LibBlockNames.MYSTICAL_FLOWER_SUFFIX) public static Block blackFlower;

	@ObjectHolder("apothecary_default") public static Block defaultAltar;
	@ObjectHolder("apothecary_forest") public static Block forestAltar;
	@ObjectHolder("apothecary_plains") public static Block plainsAltar;
	@ObjectHolder("apothecary_mountain") public static Block mountainAltar;
	@ObjectHolder("apothecary_fungal") public static Block fungalAltar;
	@ObjectHolder("apothecary_swamp") public static Block swampAltar;
	@ObjectHolder("apothecary_desert") public static Block desertAltar;
	@ObjectHolder("apothecary_taiga") public static Block taigaAltar;
	@ObjectHolder("apothecary_mesa") public static Block mesaAltar;
	@ObjectHolder("apothecary_mossy") public static Block mossyAltar;

	@ObjectHolder(LibBlockNames.LIVING_ROCK) public static Block livingrock;
	@ObjectHolder(LibBlockNames.LIVING_ROCK_BRICK) public static Block livingrockBrick;
	@ObjectHolder(LibBlockNames.LIVING_ROCK_BRICK_CHISELED) public static Block livingrockBrickChiseled;
	@ObjectHolder(LibBlockNames.LIVING_ROCK_BRICK_CRACKED) public static Block livingrockBrickCracked;
	@ObjectHolder(LibBlockNames.LIVING_ROCK_BRICK_MOSSY) public static Block livingrockBrickMossy;

	@ObjectHolder(LibBlockNames.LIVING_WOOD) public static Block livingwood;
	@ObjectHolder(LibBlockNames.LIVING_WOOD_PLANKS) public static Block livingwoodPlanks;
	@ObjectHolder(LibBlockNames.LIVING_WOOD_PLANKS_MOSSY) public static Block livingwoodPlanksMossy;
	@ObjectHolder(LibBlockNames.LIVING_WOOD_FRAMED) public static Block livingwoodFramed;
	@ObjectHolder(LibBlockNames.LIVING_WOOD_PATTERN_FRAMED) public static Block livingwoodPatternFramed;
	@ObjectHolder(LibBlockNames.LIVING_WOOD_GLIMMERING) public static Block livingwoodGlimmering;

	public static final Block specialFlower = new BlockSpecialFlower();
	@ObjectHolder(LibBlockNames.SPREADER) public static Block manaSpreader;
	@ObjectHolder(LibBlockNames.SPREADER_REDSTONE) public static Block redstoneSpreader;
	@ObjectHolder(LibBlockNames.SPREADER_ELVEN) public static Block elvenSpreader;
	@ObjectHolder(LibBlockNames.SPREADER_GAIA) public static Block gaiaSpreader;

	@ObjectHolder(LibBlockNames.POOL) public static Block manaPool;
	@ObjectHolder(LibBlockNames.POOL_CREATIVE) public static Block creativePool;
	@ObjectHolder(LibBlockNames.POOL_DILUTED) public static Block dilutedPool;
	@ObjectHolder(LibBlockNames.POOL_FABULOUS) public static Block fabulousPool;

	@ObjectHolder(LibBlockNames.RUNE_ALTAR) public static Block runeAltar;
	@ObjectHolder(LibBlockNames.PYLON) public static Block manaPylon;
	@ObjectHolder(LibBlockNames.PYLON_NATURA) public static Block naturaPylon;
	@ObjectHolder(LibBlockNames.PYLON_GAIA) public static Block gaiaPylon;

	@ObjectHolder(LibBlockNames.PISTON_RELAY) public static Block pistonRelay;
	@ObjectHolder(LibBlockNames.DISTRIBUTOR) public static Block distributor;
	@ObjectHolder(LibBlockNames.MANA_VOID) public static Block manaVoid;
	@ObjectHolder(LibBlockNames.MANA_DETECTOR) public static Block manaDetector;
	@ObjectHolder(LibBlockNames.ENCHANTER) public static Block enchanter;
	@ObjectHolder(LibBlockNames.TURNTABLE) public static Block turntable;
	@ObjectHolder(LibBlockNames.TINY_PLANET) public static Block tinyPlanet;
	@ObjectHolder(LibBlockNames.ALCHEMY_CATALYST) public static Block alchemyCatalyst;
	@ObjectHolder(LibBlockNames.OPEN_CRATE) public static Block openCrate;
	@ObjectHolder(LibBlockNames.CRAFT_CRATE) public static Block craftCrate;
	@ObjectHolder(LibBlockNames.FOREST_EYE) public static Block forestEye;
	@ObjectHolder(LibBlockNames.MANASTEEL_BLOCK) public static Block manasteelBlock;
	@ObjectHolder(LibBlockNames.TERRASTEEL_BLOCK) public static Block terrasteelBlock;
	@ObjectHolder(LibBlockNames.ELEMENTIUM_BLOCK) public static Block elementiumBlock;
	@ObjectHolder(LibBlockNames.MANA_DIAMOND_BLOCK) public static Block manaDiamondBlock;
	@ObjectHolder(LibBlockNames.DRAGONSTONE_BLOCK) public static Block dragonstoneBlock;
	@ObjectHolder(LibBlockNames.DRUM_WILD) public static Block wildDrum;
	@ObjectHolder(LibBlockNames.DRUM_GATHERING) public static Block gatheringDrum;
	@ObjectHolder(LibBlockNames.DRUM_CANOPY) public static Block canopyDrum;
	@ObjectHolder("white" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block whiteShinyFlower;
	@ObjectHolder("orange" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block orangeShinyFlower;
	@ObjectHolder("magenta" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block magentaShinyFlower;
	@ObjectHolder("light_blue" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block lightBlueShinyFlower;
	@ObjectHolder("yellow" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block yellowShinyFlower;
	@ObjectHolder("lime" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block limeShinyFlower;
	@ObjectHolder("pink" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block pinkShinyFlower;
	@ObjectHolder("gray" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block grayShinyFlower;
	@ObjectHolder("light_gray" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block lightGrayShinyFlower;
	@ObjectHolder("cyan" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block cyanShinyFlower;
	@ObjectHolder("purple" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block purpleShinyFlower;
	@ObjectHolder("blue" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block blueShinyFlower;
	@ObjectHolder("brown" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block brownShinyFlower;
	@ObjectHolder("green" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block greenShinyFlower;
	@ObjectHolder("red" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block redShinyFlower;
	@ObjectHolder("black" + LibBlockNames.SHINY_FLOWER_SUFFIX) public static Block blackShinyFlower;
	@ObjectHolder(LibBlockNames.PLATFORM_ABSTRUSE) public static Block abstrusePlatform;
	@ObjectHolder(LibBlockNames.PLATFORM_SPECTRAL) public static Block spectralPlatform;
	@ObjectHolder(LibBlockNames.PLATFORM_INFRANGIBLE) public static Block infrangiblePlatform;
	public static final Block alfPortal = new BlockAlfPortal();
	public static final Block dreamwood = new BlockDreamwood();
	public static final Block conjurationCatalyst = new BlockConjurationCatalyst();
	public static final Block bifrost = new BlockBifrost();
	public static final Block solidVines = new BlockSolidVines();
	public static final Block buriedPetals = new BlockBuriedPetals();
	public static final Block floatingFlower = new BlockFloatingFlower();
	public static final Block tinyPotato = new BlockTinyPotato();
	public static final Block spawnerClaw = new BlockSpawnerClaw();
	public static final Block azulejo0 = new BlockAzulejo(0);
	public static final Block azulejo1 = new BlockAzulejo(1);
	public static final Block azulejo2 = new BlockAzulejo(2);
	public static final Block azulejo3 = new BlockAzulejo(3);
	public static final Block azulejo4 = new BlockAzulejo(4);
	public static final Block azulejo5 = new BlockAzulejo(5);
	public static final Block azulejo6 = new BlockAzulejo(6);
	public static final Block azulejo7 = new BlockAzulejo(7);
	public static final Block azulejo8 = new BlockAzulejo(8);
	public static final Block azulejo9 = new BlockAzulejo(9);
	public static final Block azulejo10 = new BlockAzulejo(10);
	public static final Block azulejo11 = new BlockAzulejo(11);
	public static final Block azulejo12 = new BlockAzulejo(12);
	public static final Block azulejo13 = new BlockAzulejo(13);
	public static final Block azulejo14 = new BlockAzulejo(14);
	public static final Block azulejo15 = new BlockAzulejo(15);
	public static final Block enderEye = new BlockEnderEye();
	public static final Block starfield = new BlockStarfield();
	public static final Block rfGenerator = new BlockRFGenerator();
	public static final Block elfGlass = new BlockElfGlass();
	public static final Block brewery = new BlockBrewery();
	public static final Block manaGlass = new BlockManaGlass();
	public static final Block terraPlate = new BlockTerraPlate();
	public static final Block redStringContainer = new BlockRedStringContainer(Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_CONTAINER);
	public static final Block redStringDispenser = new BlockRedStringDispenser(Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_DISPENSER);
	public static final Block redStringFertilizer = new BlockRedStringFertilizer(Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_FERTILIZER);
	public static final Block redStringComparator = new BlockRedStringComparator(Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_COMPARATOR);
	public static final Block redStringRelay = new BlockRedStringRelay();
	public static final Block floatingSpecialFlower = new BlockFloatingSpecialFlower();
	public static final Block manaFlame = new BlockManaFlame();
	public static final Block prism = new BlockPrism();
	public static final Block enchantedSoil = new BlockEnchantedSoil();
	public static final Block petalBlockWhite = new BlockPetalBlock(EnumDyeColor.WHITE);
	public static final Block petalBlockOrange = new BlockPetalBlock(EnumDyeColor.ORANGE);
	public static final Block petalBlockMagenta = new BlockPetalBlock(EnumDyeColor.MAGENTA);
	public static final Block petalBlockLightBlue = new BlockPetalBlock(EnumDyeColor.LIGHT_BLUE);
	public static final Block petalBlockYellow = new BlockPetalBlock(EnumDyeColor.YELLOW);
	public static final Block petalBlockLime = new BlockPetalBlock(EnumDyeColor.LIME);
	public static final Block petalBlockPink = new BlockPetalBlock(EnumDyeColor.PINK);
	public static final Block petalBlockGray = new BlockPetalBlock(EnumDyeColor.GRAY);
	public static final Block petalBlockSilver = new BlockPetalBlock(EnumDyeColor.LIGHT_GRAY);
	public static final Block petalBlockCyan = new BlockPetalBlock(EnumDyeColor.CYAN);
	public static final Block petalBlockPurple = new BlockPetalBlock(EnumDyeColor.PURPLE);
	public static final Block petalBlockBlue = new BlockPetalBlock(EnumDyeColor.BLUE);
	public static final Block petalBlockBrown = new BlockPetalBlock(EnumDyeColor.BROWN);
	public static final Block petalBlockGreen = new BlockPetalBlock(EnumDyeColor.GREEN);
	public static final Block petalBlockRed = new BlockPetalBlock(EnumDyeColor.RED);
	public static final Block petalBlockBlack = new BlockPetalBlock(EnumDyeColor.BLACK);
	public static final Block corporeaIndex = new BlockCorporeaIndex(Block.Builder.create(Material.IRON).hardnessAndResistance(5.5F).sound(SoundType.METAL)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_INDEX);
	public static final Block corporeaFunnel = new BlockCorporeaFunnel();
	public static final Block mushroom = new BlockModMushroom();
	public static final Block pump = new BlockPump();
	public static final Block doubleFlower1 = new BlockModDoubleFlower1();
	public static final Block doubleFlower2 = new BlockModDoubleFlower2();
	public static final Block fakeAir = new BlockFakeAir();
	public static final Block blazeBlock = new BlockBlaze();
	public static final Block corporeaInterceptor = new BlockCorporeaInterceptor(Block.Builder.create(Material.IRON).hardnessAndResistance(5.5F).sound(SoundType.METAL)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_INTERCEPTOR);
	public static final Block corporeaCrystalCube = new BlockCorporeaCrystalCube(Block.Builder.create(Material.IRON).hardnessAndResistance(5.5F).sound(SoundType.METAL)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_CRYSTAL_CUBE);
	public static final Block incensePlate = new BlockIncensePlate();
	public static final Block hourglass = new BlockHourglass();
	public static final Block ghostRail = new BlockGhostRail();
	public static final Block sparkChanger = new BlockSparkChanger();
	public static final Block root = new BlockRoot();
	public static final Block felPumpkin = new BlockFelPumpkin();
	public static final Block cocoon = new BlockCocoon();
	public static final Block lightRelay = new BlockLightRelay();
	public static final Block lightLauncher = new BlockLightLauncher();
	public static final Block manaBomb = new BlockManaBomb();
	public static final Block cacophonium = new BlockCacophonium();
	public static final Block bellows = new BlockBellows();
	public static final Block bifrostPerm = new BlockBifrostPerm();
	public static final Block cellBlock = new BlockCell();
	public static final Block redStringInterceptor = new BlockRedStringInterceptor();
	public static final Block gaiaHead = new BlockGaiaHead();
	public static final Block corporeaRetainer = new BlockCorporeaRetainer(Block.Builder.create(Material.IRON).hardnessAndResistance(5.5F).sound(SoundType.METAL)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_RETAINER);
	public static final Block teruTeruBozu = new BlockTeruTeruBozu();
	public static final Block shimmerrock = new BlockShimmerrock();
	public static final Block shimmerwoodPlanks = new BlockShimmerwoodPlanks();
	public static final Block avatar = new BlockAvatar();
	public static final Block dryGrass = new BlockAltGrass(BlockAltGrass.Variant.DRY);
	public static final Block goldenGrass = new BlockAltGrass(BlockAltGrass.Variant.GOLDEN);
	public static final Block vividGrass = new BlockAltGrass(BlockAltGrass.Variant.VIVID);
	public static final Block scorchedGrass = new BlockAltGrass(BlockAltGrass.Variant.SCORCHED);
	public static final Block infusedGrass = new BlockAltGrass(BlockAltGrass.Variant.INFUSED);
	public static final Block mutatedGrass = new BlockAltGrass(BlockAltGrass.Variant.MUTATED);
	public static final Block animatedTorch = new BlockAnimatedTorch();

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> evt) {
		IForgeRegistry<Block> r = evt.getRegistry();
		ILexiconable decorative = (w, po, pl, st) -> LexiconData.decorativeBlocks;

		Block.Builder builder = Block.Builder.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT);
		for(EnumDyeColor color : EnumDyeColor.values()) {
			r.register(new BlockModFlower(color, builder).setRegistryName(LibMisc.MOD_ID, color.getName() + LibBlockNames.MYSTICAL_FLOWER_SUFFIX));
		}

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(3.5F).sound(SoundType.STONE);
		for(BlockAltar.Variant v : BlockAltar.Variant.values()) {
			r.register(new BlockAltar(v, builder)
					.setRegistryName(LibMisc.MOD_ID, LibBlockNames.APOTHECARY_PREFIX + v.name().toLowerCase(Locale.ROOT)));
		}

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
		r.register(new BlockModLexiconable(builder, (w, po, pl, st) -> LexiconData.pureDaisy).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_ROCK));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_ROCK_BRICK));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_ROCK_BRICK_MOSSY));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_ROCK_BRICK_CRACKED));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_ROCK_BRICK_CHISELED));

		builder = Block.Builder.create(Material.WOOD).hardnessAndResistance(2).sound(SoundType.WOOD);
		// todo 1.13: livingwood should support leaves
		r.register(new BlockModLexiconable(builder, (w, po, pl, st) -> LexiconData.pureDaisy).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD_PLANKS));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD_PLANKS_MOSSY));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD_FRAMED));
		r.register(new BlockModLexiconable(builder, decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD_PATTERN_FRAMED);
		r.register(new BlockModLexiconable(builder.lightValue(12), decorative).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIVING_WOOD_GLIMMERING));

		r.register(specialFlower);

		builder = Block.Builder.create(Material.WOOD).hardnessAndResistance(2).sound(SoundType.WOOD);
		r.register(new BlockSpreader(BlockSpreader.Variant.MANA, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPREADER));
		r.register(new BlockSpreader(BlockSpreader.Variant.REDSTONE, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPREADER_REDSTONE));
		r.register(new BlockSpreader(BlockSpreader.Variant.ELVEN, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPREADER_ELVEN));
		r.register(new BlockSpreader(BlockSpreader.Variant.GAIA, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPREADER_GAIA));

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
		r.register(new BlockPool(BlockPool.Variant.DEFAULT, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.POOL));
		r.register(new BlockPool(BlockPool.Variant.CREATIVE, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.POOL_CREATIVE));
		r.register(new BlockPool(BlockPool.Variant.DILUTED, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.POOL_DILUTED));
		r.register(new BlockPool(BlockPool.Variant.FABULOUS, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.POOL_FABULOUS));

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
		r.register(new BlockRuneAltar(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RUNE_ALTAR));

		builder = Block.Builder.create(Material.IRON).hardnessAndResistance(5.5).sound(SoundType.METAL).lightValue(7);
		r.register(new BlockPylon(BlockPylon.Variant.MANA, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PYLON));
		r.register(new BlockPylon(BlockPylon.Variant.NATURA, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PYLON_NATURA));
		r.register(new BlockPylon(BlockPylon.Variant.GAIA, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PYLON_GAIA));

		builder = Block.Builder.create(Material.GOURD).hardnessAndResistance(2, 10).sound(SoundType.METAL);
		r.register(new BlockPistonRelay(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PISTON_RELAY));

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
		r.register(new BlockDistributor(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DISTRIBUTOR));

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 2000).sound(SoundType.STONE);
		r.register(new BlockManaVoid(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_VOID));

		builder = Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
		r.register(new BlockDistributor(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_DETECTOR));

		r.register(new BlockEnchanter(Block.Builder.create(Material.ROCK).hardnessAndResistance(3, 5).lightValue(15).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ENCHANTER));
		r.register(new BlockTurntable(Block.Builder.create(Material.WOOD).hardnessAndResistance(2).sound(SoundType.WOOD)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TURNTABLE)));
		r.register(new BlockTinyPlanet(Block.Builder.create(Material.ROCK).hardnessAndResistance(20, 100).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TINY_PLANET));
		r.register(new BlockAlchemyCatalyst(Block.Builder.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ALCHEMY_CATALYST));
		
		builder = Block.Builder.create(Material.WOOD).hardnessAndResistance(2).sound(SoundType.WOOD);
		r.register(new BlockOpenCrate(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.OPEN_CRATE));
		r.register(new BlockCraftyCrate(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CRAFT_CRATE));
		
		r.register(new BlockForestEye(Block.Builder.create(Material.IRON).hardnessAndResistance(5, 10).sound(SoundType.METAL)).setRegistryName(LibMisc.MOD_ID, LibBlockNames.FOREST_EYE));

		builder = Block.Builder.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL);
		r.register(new BlockStorage(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANASTEEL_BLOCK));
		r.register(new BlockStorage(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TERRASTEEL_BLOCK));
		r.register(new BlockStorage(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ELEMENTIUM_BLOCK));
		r.register(new BlockStorage(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_DIAMOND_BLOCK));
		r.register(new BlockStorage(builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DRAGONSTONE_BLOCK));

		builder = Block.Builder.create(Material.WOOD).hardnessAndResistance(2).sound(SoundType.WOOD);
		r.register(new BlockForestDrum(BlockForestDrum.Variant.WILD, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DRUM_WILD));
		r.register(new BlockForestDrum(BlockForestDrum.Variant.CANOPY, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DRUM_CANOPY));
		r.register(new BlockForestDrum(BlockForestDrum.Variant.GATHERING, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DRUM_GATHERING));
		
		builder = Block.Builder.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT).lightValue(15);
		for (EnumDyeColor color : EnumDyeColor.values()) {
			r.register(new BlockShinyFlower(color, builder).setRegistryName(LibMisc.MOD_ID, color.getName() + LibBlockNames.SHINY_FLOWER_SUFFIX));
		}
		
		builder = Block.Builder.create(Material.WOOD).hardnessAndResistance(2, 5).sound(SoundType.WOOD);
		r.register(new BlockPlatform(BlockPlatform.Variant.ABSTRUSE, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PLATFORM_ABSTRUSE));
		r.register(new BlockPlatform(BlockPlatform.Variant.SPECTRAL, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PLATFORM_SPECTRAL));
		r.register(new BlockPlatform(BlockPlatform.Variant.INFRANGIBLE, builder).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PLATFORM_INFRANGIBLE));
		r.register(alfPortal);
		r.register(dreamwood);
		r.register(conjurationCatalyst);
		r.register(bifrost);
		r.register(solidVines);
		r.register(buriedPetals);
		r.register(floatingFlower);
		r.register(tinyPotato);
		r.register(spawnerClaw);
		r.register(azulejo0);
		r.register(azulejo1);
		r.register(azulejo2);
		r.register(azulejo3);
		r.register(azulejo4);
		r.register(azulejo5);
		r.register(azulejo6);
		r.register(azulejo7);
		r.register(azulejo8);
		r.register(azulejo9);
		r.register(azulejo10);
		r.register(azulejo11);
		r.register(azulejo12);
		r.register(azulejo13);
		r.register(azulejo14);
		r.register(azulejo15);
		r.register(enderEye);
		r.register(starfield);
		r.register(rfGenerator);
		r.register(elfGlass);
		r.register(brewery);
		r.register(manaGlass);
		r.register(terraPlate);
		r.register(redStringContainer);
		r.register(redStringDispenser);
		r.register(redStringFertilizer);
		r.register(redStringComparator);
		r.register(redStringRelay);
		r.register(floatingSpecialFlower);
		r.register(manaFlame);
		r.register(prism);
		r.register(enchantedSoil);
		r.register(petalBlockWhite);
		r.register(petalBlockOrange);
		r.register(petalBlockMagenta);
		r.register(petalBlockLightBlue);
		r.register(petalBlockYellow);
		r.register(petalBlockLime);
		r.register(petalBlockPink);
		r.register(petalBlockGray);
		r.register(petalBlockSilver);
		r.register(petalBlockCyan);
		r.register(petalBlockPurple);
		r.register(petalBlockBlue);
		r.register(petalBlockBrown);
		r.register(petalBlockGreen);
		r.register(petalBlockRed);
		r.register(petalBlockBlack);
		r.register(corporeaIndex);
		r.register(corporeaFunnel);
		r.register(mushroom);
		r.register(pump);
		r.register(doubleFlower1);
		r.register(doubleFlower2);
		r.register(fakeAir);
		r.register(blazeBlock);
		r.register(corporeaInterceptor);
		r.register(corporeaCrystalCube);
		r.register(incensePlate);
		r.register(hourglass);
		r.register(ghostRail);
		r.register(sparkChanger);
		r.register(root);
		r.register(felPumpkin);
		r.register(cocoon);
		r.register(lightRelay);
		r.register(lightLauncher);
		r.register(manaBomb);
		r.register(cacophonium);
		r.register(bellows);
		r.register(bifrostPerm);
		r.register(cellBlock);
		r.register(redStringInterceptor);
		r.register(gaiaHead);
		r.register(corporeaRetainer);
		r.register(teruTeruBozu);
		r.register(shimmerrock);
		r.register(shimmerwoodPlanks);
		r.register(avatar);
		r.register(dryGrass);
		r.register(goldenGrass);
		r.register(vividGrass);
		r.register(scorchedGrass);
		r.register(infusedGrass);
		r.register(mutatedGrass);
		r.register(animatedTorch);

		RecipeManaInfusion.alchemyState = alchemyCatalyst.getDefaultState();
		RecipeManaInfusion.conjurationState = conjurationCatalyst.getDefaultState();
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
		IForgeRegistry<Item> r = evt.getRegistry();
		r.register(new ItemBlockMod(whiteFlower).setRegistryName(whiteFlower.getRegistryName()));
		r.register(new ItemBlockMod(orangeFlower).setRegistryName(orangeFlower.getRegistryName()));
		r.register(new ItemBlockMod(magentaFlower).setRegistryName(magentaFlower.getRegistryName()));
		r.register(new ItemBlockMod(lightBlueFlower).setRegistryName(lightBlueFlower.getRegistryName()));
		r.register(new ItemBlockMod(yellowFlower).setRegistryName(yellowFlower.getRegistryName()));
		r.register(new ItemBlockMod(limeFlower).setRegistryName(limeFlower.getRegistryName()));
		r.register(new ItemBlockMod(pinkFlower).setRegistryName(pinkFlower.getRegistryName()));
		r.register(new ItemBlockMod(grayFlower).setRegistryName(grayFlower.getRegistryName()));
		r.register(new ItemBlockMod(lightGrayFlower).setRegistryName(lightGrayFlower.getRegistryName()));
		r.register(new ItemBlockMod(cyanFlower).setRegistryName(cyanFlower.getRegistryName()));
		r.register(new ItemBlockMod(purpleFlower).setRegistryName(purpleFlower.getRegistryName()));
		r.register(new ItemBlockMod(blueFlower).setRegistryName(blueFlower.getRegistryName()));
		r.register(new ItemBlockMod(brownFlower).setRegistryName(brownFlower.getRegistryName()));
		r.register(new ItemBlockMod(greenFlower).setRegistryName(greenFlower.getRegistryName()));
		r.register(new ItemBlockMod(redFlower).setRegistryName(redFlower.getRegistryName()));
		r.register(new ItemBlockMod(blackFlower).setRegistryName(blackFlower.getRegistryName()));
		r.register(new ItemBlockMod(defaultAltar).setRegistryName(defaultAltar.getRegistryName()));
		r.register(new ItemBlockMod(forestAltar).setRegistryName(forestAltar.getRegistryName()));
		r.register(new ItemBlockMod(plainsAltar).setRegistryName(plainsAltar.getRegistryName()));
		r.register(new ItemBlockMod(mountainAltar).setRegistryName(mountainAltar.getRegistryName()));
		r.register(new ItemBlockMod(fungalAltar).setRegistryName(fungalAltar.getRegistryName()));
		r.register(new ItemBlockMod(swampAltar).setRegistryName(swampAltar.getRegistryName()));
		r.register(new ItemBlockMod(desertAltar).setRegistryName(desertAltar.getRegistryName()));
		r.register(new ItemBlockMod(taigaAltar).setRegistryName(taigaAltar.getRegistryName()));
		r.register(new ItemBlockMod(mesaAltar).setRegistryName(mesaAltar.getRegistryName()));
		r.register(new ItemBlockMod(mossyAltar).setRegistryName(mossyAltar.getRegistryName()));
		r.register(new ItemBlockMod(livingrock).setRegistryName(livingrock.getRegistryName()));
		r.register(new ItemBlockMod(livingrockBrick).setRegistryName(livingrockBrick.getRegistryName()));
		r.register(new ItemBlockMod(livingrockBrickChiseled).setRegistryName(livingrockBrickChiseled.getRegistryName()));
		r.register(new ItemBlockMod(livingrockBrickCracked).setRegistryName(livingrockBrickCracked.getRegistryName()));
		r.register(new ItemBlockMod(livingrockBrickMossy).setRegistryName(livingrockBrickMossy.getRegistryName()));
		r.register(new ItemBlockMod(livingwood).setRegistryName(livingwood.getRegistryName()));
		r.register(new ItemBlockMod(livingwoodPlanks).setRegistryName(livingwoodPlanks.getRegistryName()));
		r.register(new ItemBlockMod(livingwoodPlanksMossy).setRegistryName(livingwoodPlanksMossy.getRegistryName()));
		r.register(new ItemBlockMod(livingwoodFramed).setRegistryName(livingwoodFramed.getRegistryName()));
		r.register(new ItemBlockMod(livingwoodPatternFramed).setRegistryName(livingwoodPatternFramed.getRegistryName()));
		r.register(new ItemBlockMod(livingwoodGlimmering).setRegistryName(livingwoodGlimmering.getRegistryName()));
		r.register(new ItemBlockSpecialFlower(specialFlower).setRegistryName(specialFlower.getRegistryName()));
		r.register(new ItemBlockMod(manaSpreader).setRegistryName(manaSpreader.getRegistryName()));
		r.register(new ItemBlockMod(redstoneSpreader).setRegistryName(redstoneSpreader.getRegistryName()));
		r.register(new ItemBlockMod(elvenSpreader).setRegistryName(elvenSpreader.getRegistryName()));
		r.register(new ItemBlockMod(gaiaSpreader).setRegistryName(gaiaSpreader.getRegistryName()));
		r.register(new ItemBlockPool(manaPool).setRegistryName(manaPool.getRegistryName()));
		r.register(new ItemBlockPool(creativePool).setRegistryName(creativePool.getRegistryName()));
		r.register(new ItemBlockPool(dilutedPool).setRegistryName(dilutedPool.getRegistryName()));
		r.register(new ItemBlockPool(fabulousPool).setRegistryName(fabulousPool.getRegistryName()));
		r.register(new ItemBlockMod(runeAltar).setRegistryName(runeAltar.getRegistryName()));
		r.register(new ItemBlockMod(manaPylon).setRegistryName(manaPylon.getRegistryName()));
		r.register(new ItemBlockMod(naturaPylon).setRegistryName(naturaPylon.getRegistryName()));
		r.register(new ItemBlockMod(gaiaPylon).setRegistryName(gaiaPylon.getRegistryName()));
		r.register(new ItemBlockMod(pistonRelay).setRegistryName(pistonRelay.getRegistryName()));
		r.register(new ItemBlockMod(distributor).setRegistryName(distributor.getRegistryName()));
		r.register(new ItemBlockMod(manaVoid).setRegistryName(manaVoid.getRegistryName()));
		r.register(new ItemBlockMod(manaDetector).setRegistryName(manaDetector.getRegistryName()));
		r.register(new ItemBlockMod(enchanter).setRegistryName(enchanter.getRegistryName()));
		r.register(new ItemBlockMod(turntable).setRegistryName(turntable.getRegistryName()));
		r.register(new ItemBlockMod(tinyPlanet).setRegistryName(tinyPlanet.getRegistryName()));
		r.register(new ItemBlockMod(alchemyCatalyst).setRegistryName(alchemyCatalyst.getRegistryName()));
		r.register(new ItemBlockMod(openCrate).setRegistryName(openCrate.getRegistryName()));
		r.register(new ItemBlockMod(craftCrate).setRegistryName(craftCrate.getRegistryName()));
		r.register(new ItemBlockMod(forestEye).setRegistryName(forestEye.getRegistryName()));
		r.register(new ItemBlockMod(manasteelBlock).setRegistryName(manasteelBlock.getRegistryName()));
		r.register(new ItemBlockMod(terrasteelBlock).setRegistryName(terrasteelBlock.getRegistryName()));
		r.register(new ItemBlockElven(elementiumBlock).setRegistryName(elementiumBlock.getRegistryName()));
		r.register(new ItemBlockMod(manaDiamondBlock).setRegistryName(manaDiamondBlock.getRegistryName()));
		r.register(new ItemBlockMod(dragonstoneBlock).setRegistryName(dragonstoneBlock.getRegistryName()));
		r.register(new ItemBlockMod(wildDrum).setRegistryName(wildDrum.getRegistryName()));
		r.register(new ItemBlockMod(gatheringDrum).setRegistryName(gatheringDrum.getRegistryName()));
		r.register(new ItemBlockMod(canopyDrum).setRegistryName(canopyDrum.getRegistryName()));
		r.register(new ItemBlockMod(whiteShinyFlower).setRegistryName(whiteShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(orangeShinyFlower).setRegistryName(orangeShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(magentaShinyFlower).setRegistryName(magentaShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(lightBlueShinyFlower).setRegistryName(lightBlueShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(yellowShinyFlower).setRegistryName(yellowShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(limeShinyFlower).setRegistryName(limeShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(pinkShinyFlower).setRegistryName(pinkShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(grayShinyFlower).setRegistryName(grayShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(lightGrayShinyFlower).setRegistryName(lightGrayShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(cyanShinyFlower).setRegistryName(cyanShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(purpleShinyFlower).setRegistryName(purpleShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(blueShinyFlower).setRegistryName(blueShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(brownShinyFlower).setRegistryName(brownShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(greenShinyFlower).setRegistryName(greenShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(redShinyFlower).setRegistryName(redShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(blackShinyFlower).setRegistryName(blackShinyFlower.getRegistryName()));
		r.register(new ItemBlockMod(abstrusePlatform).setRegistryName(abstrusePlatform.getRegistryName()));
		r.register(new ItemBlockMod(spectralPlatform).setRegistryName(spectralPlatform.getRegistryName()));
		r.register(new ItemBlockMod(infrangiblePlatform).setRegistryName(infrangiblePlatform.getRegistryName()));
		r.register(new ItemBlockMod(alfPortal).setRegistryName(alfPortal.getRegistryName()));
		r.register(new ItemBlockDreamwood(dreamwood).setRegistryName(dreamwood.getRegistryName()));
		r.register(new ItemBlockMod(conjurationCatalyst).setRegistryName(conjurationCatalyst.getRegistryName()));
		r.register(new ItemBlockMod(bifrost).setRegistryName(bifrost.getRegistryName()));
		r.register(new ItemBlockWithMetadataAndName(floatingFlower).setRegistryName(floatingFlower.getRegistryName()));
		r.register(new ItemBlockTinyPotato(tinyPotato).setRegistryName(tinyPotato.getRegistryName()));
		r.register(new ItemBlockMod(spawnerClaw).setRegistryName(spawnerClaw.getRegistryName()));
		r.register(new ItemBlockMod(azulejo0).setRegistryName(azulejo0.getRegistryName()));
		r.register(new ItemBlockMod(azulejo1).setRegistryName(azulejo1.getRegistryName()));
		r.register(new ItemBlockMod(azulejo2).setRegistryName(azulejo2.getRegistryName()));
		r.register(new ItemBlockMod(azulejo3).setRegistryName(azulejo3.getRegistryName()));
		r.register(new ItemBlockMod(azulejo4).setRegistryName(azulejo4.getRegistryName()));
		r.register(new ItemBlockMod(azulejo5).setRegistryName(azulejo5.getRegistryName()));
		r.register(new ItemBlockMod(azulejo6).setRegistryName(azulejo6.getRegistryName()));
		r.register(new ItemBlockMod(azulejo7).setRegistryName(azulejo7.getRegistryName()));
		r.register(new ItemBlockMod(azulejo8).setRegistryName(azulejo8.getRegistryName()));
		r.register(new ItemBlockMod(azulejo9).setRegistryName(azulejo9.getRegistryName()));
		r.register(new ItemBlockMod(azulejo10).setRegistryName(azulejo10.getRegistryName()));
		r.register(new ItemBlockMod(azulejo11).setRegistryName(azulejo11.getRegistryName()));
		r.register(new ItemBlockMod(azulejo12).setRegistryName(azulejo12.getRegistryName()));
		r.register(new ItemBlockMod(azulejo13).setRegistryName(azulejo13.getRegistryName()));
		r.register(new ItemBlockMod(azulejo14).setRegistryName(azulejo14.getRegistryName()));
		r.register(new ItemBlockMod(azulejo15).setRegistryName(azulejo15.getRegistryName()));
		r.register(new ItemBlockMod(enderEye).setRegistryName(enderEye.getRegistryName()));
		r.register(new ItemBlockMod(starfield).setRegistryName(starfield.getRegistryName()));
		r.register(new ItemBlockMod(rfGenerator).setRegistryName(rfGenerator.getRegistryName()));
		r.register(new ItemBlockElven(elfGlass).setRegistryName(elfGlass.getRegistryName()));
		r.register(new ItemBlockMod(brewery).setRegistryName(brewery.getRegistryName()));
		r.register(new ItemBlockMod(manaGlass).setRegistryName(manaGlass.getRegistryName()));
		r.register(new ItemBlockMod(terraPlate).setRegistryName(terraPlate.getRegistryName()));
		r.register(new ItemBlockMod(redStringContainer).setRegistryName(redStringContainer.getRegistryName()));
		r.register(new ItemBlockMod(redStringDispenser).setRegistryName(redStringDispenser.getRegistryName()));
		r.register(new ItemBlockMod(redStringFertilizer).setRegistryName(redStringFertilizer.getRegistryName()));
		r.register(new ItemBlockMod(redStringComparator).setRegistryName(redStringComparator.getRegistryName()));
		r.register(new ItemBlockMod(redStringRelay).setRegistryName(redStringRelay.getRegistryName()));
		r.register(new ItemBlockFloatingSpecialFlower(floatingSpecialFlower).setRegistryName(floatingSpecialFlower.getRegistryName()));
		r.register(new ItemBlockMod(prism).setRegistryName(prism.getRegistryName()));
		r.register(new ItemBlockMod(enchantedSoil).setRegistryName(enchantedSoil.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockWhite).setRegistryName(petalBlockWhite.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockOrange).setRegistryName(petalBlockOrange.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockMagenta).setRegistryName(petalBlockMagenta.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockLightBlue).setRegistryName(petalBlockLightBlue.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockYellow).setRegistryName(petalBlockYellow.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockLime).setRegistryName(petalBlockLime.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockPink).setRegistryName(petalBlockPink.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockGray).setRegistryName(petalBlockGray.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockSilver).setRegistryName(petalBlockSilver.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockCyan).setRegistryName(petalBlockCyan.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockPurple).setRegistryName(petalBlockPurple.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockBlue).setRegistryName(petalBlockBlue.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockBrown).setRegistryName(petalBlockBrown.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockGreen).setRegistryName(petalBlockGreen.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockRed).setRegistryName(petalBlockRed.getRegistryName()));
		r.register(new ItemBlockMod(petalBlockBlack).setRegistryName(petalBlockBlack.getRegistryName()));
		r.register(new ItemBlockMod(corporeaIndex).setRegistryName(corporeaIndex.getRegistryName()));
		r.register(new ItemBlockMod(corporeaFunnel).setRegistryName(corporeaFunnel.getRegistryName()));
		r.register(new ItemBlockWithMetadataAndName(mushroom).setRegistryName(mushroom.getRegistryName()));
		r.register(new ItemBlockMod(pump).setRegistryName(pump.getRegistryName()));
		r.register(new ItemBlockWithMetadataAndName(doubleFlower1).setRegistryName(doubleFlower1.getRegistryName()));
		r.register(new ItemBlockWithMetadataAndName(doubleFlower2).setRegistryName(doubleFlower2.getRegistryName()));
		r.register(new ItemBlockBlaze(blazeBlock).setRegistryName(blazeBlock.getRegistryName()));
		r.register(new ItemBlockMod(corporeaInterceptor).setRegistryName(corporeaInterceptor.getRegistryName()));
		r.register(new ItemBlockMod(corporeaCrystalCube).setRegistryName(corporeaCrystalCube.getRegistryName()));
		r.register(new ItemBlockMod(incensePlate).setRegistryName(incensePlate.getRegistryName()));
		r.register(new ItemBlockMod(hourglass).setRegistryName(hourglass.getRegistryName()));
		r.register(new ItemBlockMod(ghostRail).setRegistryName(ghostRail.getRegistryName()));
		r.register(new ItemBlockMod(sparkChanger).setRegistryName(sparkChanger.getRegistryName()));
		r.register(new ItemBlockMod(root).setRegistryName(root.getRegistryName()));
		r.register(new ItemBlockMod(felPumpkin).setRegistryName(felPumpkin.getRegistryName()));
		r.register(new ItemBlockMod(cocoon).setRegistryName(cocoon.getRegistryName()));
		r.register(new ItemBlockWithMetadataAndName(lightRelay).setRegistryName(lightRelay.getRegistryName()));
		r.register(new ItemBlockMod(lightLauncher).setRegistryName(lightLauncher.getRegistryName()));
		r.register(new ItemBlockMod(manaBomb).setRegistryName(manaBomb.getRegistryName()));
		r.register(new ItemBlockMod(cacophonium).setRegistryName(cacophonium.getRegistryName()));
		r.register(new ItemBlockMod(bellows).setRegistryName(bellows.getRegistryName()));
		r.register(new ItemBlockMod(bifrostPerm).setRegistryName(bifrostPerm.getRegistryName()));
		r.register(new ItemBlockMod(cellBlock).setRegistryName(cellBlock.getRegistryName()));
		r.register(new ItemBlockMod(redStringInterceptor).setRegistryName(redStringInterceptor.getRegistryName()));
		r.register(new ItemBlockMod(corporeaRetainer).setRegistryName(corporeaRetainer.getRegistryName()));
		r.register(new ItemBlockMod(teruTeruBozu).setRegistryName(teruTeruBozu.getRegistryName()));
		r.register(new ItemBlockMod(shimmerrock).setRegistryName(shimmerrock.getRegistryName()));
		r.register(new ItemBlockMod(shimmerwoodPlanks).setRegistryName(shimmerwoodPlanks.getRegistryName()));
		r.register(new ItemBlockMod(avatar).setRegistryName(avatar.getRegistryName()));
		r.register(new ItemBlockMod(dryGrass).setRegistryName(dryGrass.getRegistryName()));
		r.register(new ItemBlockMod(goldenGrass).setRegistryName(goldenGrass.getRegistryName()));
		r.register(new ItemBlockMod(vividGrass).setRegistryName(vividGrass.getRegistryName()));
		r.register(new ItemBlockMod(scorchedGrass).setRegistryName(scorchedGrass.getRegistryName()));
		r.register(new ItemBlockMod(infusedGrass).setRegistryName(infusedGrass.getRegistryName()));
		r.register(new ItemBlockMod(mutatedGrass).setRegistryName(mutatedGrass.getRegistryName()));
		r.register(new ItemBlockMod(animatedTorch).setRegistryName(animatedTorch.getRegistryName()));
		initOreDict();
	}

	public static void addDispenserBehaviours() {
		BlockDispenser.registerDispenseBehavior(ModItems.twigWand, new BehaviourWand());
		BlockDispenser.registerDispenseBehavior(ModItems.poolMinecart, new BehaviourPoolMinecart());
		BlockDispenser.registerDispenseBehavior(ModBlocks.felPumpkin, new BehaviourFelPumpkin());

		SeedBehaviours.init();
	}
	
	private static void initOreDict() {
		for(int i = 0; i < 16; i++) {
			OreDictionary.registerOre(LibOreDict.FLOWER[i], new ItemStack(flower, 1, i));
			OreDictionary.registerOre(LibOreDict.PETAL[i], new ItemStack(mushroom, 1, i));
		}

		OreDictionary.registerOre(LibOreDict.LIVING_ROCK, livingrock);
		OreDictionary.registerOre(LibOreDict.LIVING_WOOD, livingwood);
		OreDictionary.registerOre(LibOreDict.DREAM_WOOD, dreamwood);

		for(int i = 0; i < 8; i++) {
			OreDictionary.registerOre(LibOreDict.DOUBLE_FLOWER[i], new ItemStack(doubleFlower1, 1, i));
			OreDictionary.registerOre(LibOreDict.DOUBLE_FLOWER[i + 8], new ItemStack(doubleFlower2, 1, i));
		}

		OreDictionary.registerOre(LibOreDict.BLAZE_BLOCK, blazeBlock);

		// Vanilla OreDict entries
		OreDictionary.registerOre("hardenedClay", new ItemStack(Blocks.HARDENED_CLAY, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("snowLayer", Blocks.SNOW_LAYER);
		OreDictionary.registerOre("mycelium", Blocks.MYCELIUM);
		OreDictionary.registerOre("podzol", new ItemStack(Blocks.DIRT, 1, 2));
		OreDictionary.registerOre("soulSand", Blocks.SOUL_SAND);
		OreDictionary.registerOre("ice", Blocks.ICE);
		OreDictionary.registerOre("slabCobblestone", new ItemStack(Blocks.STONE_SLAB, 1, 3));
	}

	@SubscribeEvent
	public static void initTileEntities(RegistryEvent.Register<TileEntityType<?>> evt) {
		TileEntityType.Builder.create(TileAltar::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ALTAR);
		TileEntityType.Builder.create(TileSpecialFlower::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPECIAL_FLOWER);
		TileEntityType.Builder.create(TileSpreader::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPREADER);
		TileEntityType.Builder.create(TilePool::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.POOL);
		TileEntityType.Builder.create(TileRuneAltar::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RUNE_ALTAR);
		TileEntityType.Builder.create(TilePylon::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PYLON);
		TileEntityType.Builder.create(TileDistributor::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.DISTRIBUTOR);
		TileEntityType.Builder.create(TileManaVoid::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_VOID);
		TileEntityType.Builder.create(TileManaDetector::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_DETECTOR);
		TileEntityType.Builder.create(TileEnchanter::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ENCHANTER);
		TileEntityType.Builder.create(TileTurntable::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TURNTABLE);
		TileEntityType.Builder.create(TileTinyPlanet::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TINY_PLANET);
		TileEntityType.Builder.create(TileOpenCrate::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.OPEN_CRATE);
		TileEntityType.Builder.create(TileCraftCrate::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CRAFT_CRATE);
		TileEntityType.Builder.create(TileForestEye::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.FOREST_EYE);
		TileEntityType.Builder.create(TilePlatform::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PLATFORM);
		TileEntityType.Builder.create(TileAlfPortal::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ALF_PORTAL);
		TileEntityType.Builder.create(TileBifrost::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.BIFROST);
		TileEntityType.Builder.create(TileFloatingFlower::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MINI_ISLAND);
		TileEntityType.Builder.create(TileTinyPotato::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TINY_POTATO);
		TileEntityType.Builder.create(TileSpawnerClaw::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPAWNER_CLAW);
		TileEntityType.Builder.create(TileEnderEye::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ENDER_EYE_BLOCK);
		TileEntityType.Builder.create(TileStarfield::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.STARFIELD);
		TileEntityType.Builder.create(TileRFGenerator::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RF_GENERATOR);
		TileEntityType.Builder.create(TileBrewery::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.BREWERY);
		TileEntityType.Builder.create(TileTerraPlate::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TERRA_PLATE);
		TileEntityType.Builder.create(TileRedStringContainer::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_CONTAINER);
		TileEntityType.Builder.create(TileRedStringDispenser::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_DISPENSER);
		TileEntityType.Builder.create(TileRedStringFertilizer::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_FERTILIZER);
		TileEntityType.Builder.create(TileRedStringComparator::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_COMPARATOR);
		TileEntityType.Builder.create(TileRedStringRelay::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_RELAY);
		TileEntityType.Builder.create(TileFloatingSpecialFlower::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.FLOATING_SPECIAL_FLOWER);
		TileEntityType.Builder.create(TileManaFlame::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.MANA_FLAME);
		TileEntityType.Builder.create(TilePrism::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PRISM);
		TileEntityType.Builder.create(TileCorporeaIndex::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_INDEX);
		TileEntityType.Builder.create(TileCorporeaFunnel::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_FUNNEL);
		TileEntityType.Builder.create(TilePump::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.PUMP);
		TileEntityType.Builder.create(TileFakeAir::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.FAKE_AIR);
		TileEntityType.Builder.create(TileCorporeaInterceptor::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_INTERCEPTOR);
		TileEntityType.Builder.create(TileCorporeaCrystalCube::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_CRYSTAL_CUBE);
		TileEntityType.Builder.create(TileIncensePlate::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.INCENSE_PLATE);
		TileEntityType.Builder.create(TileHourglass::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.HOURGLASS);
		TileEntityType.Builder.create(TileSparkChanger::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.SPARK_CHANGER);
		TileEntityType.Builder.create(TileCocoon::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.COCOON);
		TileEntityType.Builder.create(TileLightRelay::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.LIGHT_RELAY);
		TileEntityType.Builder.create(TileCacophonium::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CACOPHONIUM);
		TileEntityType.Builder.create(TileBellows::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.BELLOWS);
		TileEntityType.Builder.create(TileCell::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CELL_BLOCK);
		TileEntityType.Builder.create(TileRedStringInterceptor::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.RED_STRING_INTERCEPTOR);
		TileEntityType.Builder.create(TileGaiaHead::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.GAIA_HEAD);
		TileEntityType.Builder.create(TileCorporeaRetainer::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.CORPOREA_RETAINER);
		TileEntityType.Builder.create(TileTeruTeruBozu::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.TERU_TERU_BOZU);
		TileEntityType.Builder.create(TileAvatar::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.AVATAR);
		TileEntityType.Builder.create(TileAnimatedTorch::new).build(null).setRegistryName(LibMisc.MOD_ID, LibBlockNames.ANIMATED_TORCH);

		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_PUREDAISY, SubTilePureDaisy.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_MANASTAR, SubTileManastar.class);

		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_HYDROANGEAS, SubTileHydroangeas.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_ENDOFLAME, SubTileEndoflame.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_THERMALILY, SubTileThermalily.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_ARCANE_ROSE, SubTileArcaneRose.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_MUNCHDEW, SubTileMunchdew.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_ENTROPINNYUM, SubTileEntropinnyum.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_KEKIMURUS, SubTileKekimurus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_GOURMARYLLIS, SubTileGourmaryllis.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_NARSLIMMUS, SubTileNarslimmus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_SPECTROLUS, SubTileSpectrolus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_DANDELIFEON, SubTileDandelifeon.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_RAFFLOWSIA, SubTileRafflowsia.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_SHULK_ME_NOT, SubTileShulkMeNot.class);

		registerSubTileWithMini(LibBlockNames.SUBTILE_BELLETHORN, SubTileBellethorn.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_DREADTHORN, SubTileDreadthorn.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_HEISEI_DREAM, SubTileHeiseiDream.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_TIGERSEYE, SubTileTigerseye.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_JADED_AMARANTHUS, SubTileJadedAmaranthus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_ORECHID, SubTileOrechid.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_ORECHID_IGNEM, SubTileOrechidIgnem.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_FALLEN_KANADE, SubTileFallenKanade.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_EXOFLAME, SubTileExoflame.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_AGRICARNATION, SubTileAgricarnation.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_HOPPERHOCK, SubTileHopperhock.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_TANGLEBERRIE, SubTileTangleberrie.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_JIYUULIA, SubTileJiyuulia.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_RANNUNCARPUS, SubTileRannuncarpus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_HYACIDUS, SubTileHyacidus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_POLLIDISIAC, SubTilePollidisiac.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_CLAYCONIA, SubTileClayconia.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_LOONIUM, SubTileLoonuim.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_DAFFOMILL, SubTileDaffomill.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_VINCULOTUS, SubTileVinculotus.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_SPECTRANTHEMUM, SubTileSpectranthemum.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_MEDUMONE, SubTileMedumone.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_MARIMORPHOSIS, SubTileMarimorphosis.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_BUBBELL, SubTileBubbell.class);
		registerSubTileWithMini(LibBlockNames.SUBTILE_SOLEGNOLIA, SubTileSolegnolia.class);
		BotaniaAPI.registerSubTile(LibBlockNames.SUBTILE_BERGAMUTE, SubTileBergamute.class);
	}

	private static void registerSubTileWithMini(ResourceLocation key, Class<? extends SubTileEntity> clazz) {
		BotaniaAPI.registerSubTile(key, clazz);

		for(Class innerClazz : clazz.getDeclaredClasses())
			if(innerClazz.getSimpleName().equals("Mini"))
				BotaniaAPI.registerMiniSubTile(new ResourceLocation(key.getNamespace(), key.getPath() + "Chibi"), innerClazz, key);
	}

}
