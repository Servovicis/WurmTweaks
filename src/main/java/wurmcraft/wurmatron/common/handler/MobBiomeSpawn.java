package wurmcraft.wurmatron.common.handler;

import am2.bosses.EntityWaterGuardian;
import am2.entities.EntityDarkMage;
import am2.entities.EntityDryad;
import am2.entities.EntityLightMage;
import am2.entities.EntityManaCreeper;
import cofh.thermalfoundation.entity.monster.EntityBlitz;
import cofh.thermalfoundation.entity.monster.EntityBlizz;
import com.bioxx.tfc.Entities.Mobs.EntityBlazeTFC;
import com.bioxx.tfc.Entities.Mobs.EntityGhastTFC;
import com.bioxx.tfc.Entities.Mobs.EntitySilverfishTFC;
import com.bioxx.tfc.WorldGen.TFCBiome;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.world.biome.BiomeGenBase;
import thaumcraft.common.entities.monster.*;
import thaumcraft.common.entities.monster.boss.EntityEldritchGolem;

import java.util.ArrayList;

public class MobBiomeSpawn {

		private static ArrayList<BiomeGenBase> tfcBiomeLand = new ArrayList<BiomeGenBase>();
		private static ArrayList<BiomeGenBase> tfcWater = new ArrayList<BiomeGenBase>();

		public static void init () {
				tfcBiomeLand.add(TFCBiome.BEACH);
				tfcBiomeLand.add(TFCBiome.GRAVEL_BEACH);
				tfcBiomeLand.add(TFCBiome.HELL);
				tfcBiomeLand.add(TFCBiome.HIGH_HILLS);
				tfcBiomeLand.add(TFCBiome.HIGH_HILLS_EDGE);
				tfcBiomeLand.add(TFCBiome.HIGH_PLAINS);
				tfcBiomeLand.add(TFCBiome.BEACH);
				tfcBiomeLand.add(TFCBiome.MOUNTAINS);
				tfcBiomeLand.add(TFCBiome.MOUNTAINS_EDGE);
				tfcBiomeLand.add(TFCBiome.PLAINS);
				tfcBiomeLand.add(TFCBiome.roofedForest);
				tfcBiomeLand.add(TFCBiome.ROLLING_HILLS);
				tfcBiomeLand.add(TFCBiome.swampland);
				tfcBiomeLand.add(TFCBiome.savanna);
				tfcBiomeLand.add(TFCBiome.savannaPlateau);
				tfcBiomeLand.add(TFCBiome.mesa);
				tfcBiomeLand.add(TFCBiome.mesaPlateau);
				tfcBiomeLand.add(TFCBiome.mesaPlateau_F);
				tfcBiomeLand.add(TFCBiome.birchForest);
				tfcBiomeLand.add(TFCBiome.birchForestHills);
				tfcBiomeLand.add(TFCBiome.taiga);
				tfcBiomeLand.add(TFCBiome.taigaHills);
				tfcBiomeLand.add(TFCBiome.coldTaiga);
				tfcBiomeLand.add(TFCBiome.coldTaigaHills);
				tfcBiomeLand.add(TFCBiome.megaTaiga);
				tfcBiomeLand.add(TFCBiome.megaTaigaHills);
				tfcBiomeLand.add(TFCBiome.iceMountains);
				tfcBiomeLand.add(TFCBiome.icePlains);
				tfcWater.add(TFCBiome.swampland);
				tfcWater.add(TFCBiome.river);
				tfcWater.add(TFCBiome.frozenOcean);
				tfcWater.add(TFCBiome.ocean);
				tfcWater.add(TFCBiome.deepOcean);
				for (BiomeGenBase biome : tfcBiomeLand) {
						addBiome(EntityManaCreeper.class, 40, 1, 3, EnumCreatureType.monster, biome);
						addBiome(EntityDryad.class, 50, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntityInhabitedZombie.class, 50, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntityWisp.class, 50, 1, 2, EnumCreatureType.ambient, biome);
						addBiome(EntitySilverfishTFC.class, 30, 2, 5, EnumCreatureType.monster, biome);
						addBiome(EntityDarkMage.class, 60, 1, 2, EnumCreatureType.ambient, biome);
						addBiome(EntityLightMage.class, 60, 1, 2, EnumCreatureType.ambient, biome);
						addBiome(EntityBlazeTFC.class, 100, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntityGhastTFC.class, 120, 1, 2, EnumCreatureType.monster, biome);
						addBiome(EntityGiantZombie.class, 200, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchGuardian.class, 60, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchGolem.class, 400, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchCrab.class, 70, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityBlitz.class, 50, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityBlizz.class, 50, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityCultistKnight.class, 1000, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityMindSpider.class, 50, 3, 10, EnumCreatureType.monster, biome);
				}
				for (BiomeGenBase biome : tfcWater) {
						addBiome(EntityWaterGuardian.class, 100, 1, 2, EnumCreatureType.waterCreature, biome);
				}
		}

		public static void addBiome (String entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}

		public static void addBiome (Class<? extends EntityLiving> entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}
}
