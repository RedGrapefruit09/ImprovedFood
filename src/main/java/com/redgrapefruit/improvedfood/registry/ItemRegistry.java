package com.redgrapefruit.improvedfood.registry;

import com.redgrapefruit.improvedfood.ImprovedFood;
import com.redgrapefruit.improvedfood.item.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Registers mod items into Minecraft.
 */
public class ItemRegistry {
    // Crops
    public static final FoodItem TOMATO = new FoodItem(ConfigRegistry.TOMATO);
    public static final FoodItem CUCUMBER = new FoodItem(ConfigRegistry.CUCUMBER);

    // Seeds
    public static final AliasedBlockItem TOMATO_SEEDS = new AliasedBlockItem(BlockRegistry.TOMATO_CROP, createSeedSettings());
    public static final AliasedBlockItem CUCUMBER_SEEDS = new AliasedBlockItem(BlockRegistry.CUCUMBER_CROP, createSeedSettings());

    // Rotten variants
    public static final RottenFoodItem ROTTEN_PORKCHOP = new RottenFoodItem(ConfigRegistry.PORKCHOP, FoodComponents.PORKCHOP);
    public static final RottenFoodItem ROTTEN_COOKED_PORKCHOP = new RottenFoodItem(ConfigRegistry.COOKED_PORKCHOP, FoodComponents.COOKED_PORKCHOP);
    public static final RottenFoodItem ROTTEN_BEEF = new RottenFoodItem(ConfigRegistry.BEEF, FoodComponents.BEEF);
    public static final RottenFoodItem ROTTEN_COOKED_BEEF = new RottenFoodItem(ConfigRegistry.COOKED_BEEF, FoodComponents.COOKED_BEEF);
    public static final RottenFoodItem ROTTEN_CHICKEN = new RottenFoodItem(ConfigRegistry.CHICKEN, FoodComponents.CHICKEN);
    public static final RottenFoodItem ROTTEN_COOKED_CHICKEN = new RottenFoodItem(ConfigRegistry.COOKED_CHICKEN, FoodComponents.COOKED_CHICKEN);
    public static final RottenFoodItem ROTTEN_MUTTON = new RottenFoodItem(ConfigRegistry.MUTTON, FoodComponents.MUTTON);
    public static final RottenFoodItem ROTTEN_COOKED_MUTTON = new RottenFoodItem(ConfigRegistry.COOKED_MUTTON, FoodComponents.COOKED_MUTTON);
    public static final RottenFoodItem ROTTEN_RABBIT = new RottenFoodItem(ConfigRegistry.RABBIT, FoodComponents.RABBIT);
    public static final RottenFoodItem ROTTEN_COOKED_RABBIT = new RottenFoodItem(ConfigRegistry.COOKED_RABBIT, FoodComponents.COOKED_RABBIT);

    // Overdue variants
    public static final OverdueFoodItem OVERDUE_TOMATO = new OverdueFoodItem(ConfigRegistry.TOMATO);
    public static final OverdueFoodItem OVERDUE_CUCUMBER = new OverdueFoodItem(ConfigRegistry.CUCUMBER);

    public static final OverdueFoodItem OVERDUE_SALMON = new OverdueFoodItem(ConfigRegistry.SALMON, FoodComponents.SALMON);
    public static final OverdueFoodItem OVERDUE_COOKED_SALMON = new OverdueFoodItem(ConfigRegistry.COOKED_SALMON, FoodComponents.COOKED_SALMON);
    public static final OverdueFoodItem OVERDUE_COD = new OverdueFoodItem(ConfigRegistry.COD, FoodComponents.COD);
    public static final OverdueFoodItem OVERDUE_COOKED_COD = new OverdueFoodItem(ConfigRegistry.COOKED_COD, FoodComponents.COOKED_COD);
    public static final OverdueFoodItem OVERDUE_APPLE = new OverdueFoodItem(ConfigRegistry.APPLE, FoodComponents.APPLE);
    public static final OverdueFoodItem OVERDUE_GOLDEN_APPLE = new OverdueFoodItem(ConfigRegistry.GOLDEN_APPLE, FoodComponents.GOLDEN_APPLE);
    public static final OverdueFoodItem OVERDUE_CARROT = new OverdueFoodItem(ConfigRegistry.CARROT, FoodComponents.CARROT);
    public static final OverdueFoodItem OVERDUE_GOLDEN_CARROT = new OverdueFoodItem(ConfigRegistry.GOLDEN_CARROT, FoodComponents.GOLDEN_CARROT);
    public static final OverdueFoodItem OVERDUE_POTATO = new OverdueFoodItem(ConfigRegistry.POTATO, FoodComponents.POTATO);
    public static final OverdueFoodItem OVERDUE_BAKED_POTATO = new OverdueFoodItem(ConfigRegistry.BAKED_POTATO, FoodComponents.BAKED_POTATO);
    public static final OverdueFoodItem OVERDUE_BEETROOT = new OverdueFoodItem(ConfigRegistry.BEETROOT, FoodComponents.BEETROOT);
    public static final OverdueFoodItem OVERDUE_BEETROOT_SOUP = new OverdueFoodItem(ConfigRegistry.BEETROOT_SOUP, FoodComponents.BEETROOT_SOUP);
    public static final OverdueFoodItem OVERDUE_BREAD = new OverdueFoodItem(ConfigRegistry.BREAD, FoodComponents.BREAD);
    public static final OverdueFoodItem OVERDUE_CHORUS_FRUIT = new OverdueFoodItem(ConfigRegistry.CHORUS_FRUIT, FoodComponents.CHORUS_FRUIT);
    public static final OverdueFoodItem OVERDUE_COOKIE = new OverdueFoodItem(ConfigRegistry.COOKIE, FoodComponents.COOKIE);
    public static final OverdueFoodItem OVERDUE_HONEY_BOTTLE = new OverdueFoodItem(ConfigRegistry.HONEY_BOTTLE, FoodComponents.HONEY_BOTTLE);
    public static final OverdueFoodItem OVERDUE_MELON_SLICE = new OverdueFoodItem(ConfigRegistry.MELON_SLICE, FoodComponents.MELON_SLICE);
    public static final OverdueFoodItem OVERDUE_MUSHROOM_STEW = new OverdueFoodItem(ConfigRegistry.MUSHROOM_STEW, FoodComponents.MUSHROOM_STEW);
    public static final OverdueFoodItem OVERDUE_PUMPKIN_PIE = new OverdueFoodItem(ConfigRegistry.PUMPKIN_PIE, FoodComponents.PUMPKIN_PIE);
    public static final OverdueFoodItem OVERDUE_RABBIT_STEW = new OverdueFoodItem(ConfigRegistry.RABBIT_STEW, FoodComponents.RABBIT_STEW);
    public static final OverdueFoodItem OVERDUE_SPIDER_EYE = new OverdueFoodItem(ConfigRegistry.SPIDER_EYE, FoodComponents.SPIDER_EYE);
    public static final OverdueFoodItem OVERDUE_SUSPICIOUS_STEW = new OverdueFoodItem(ConfigRegistry.SUSPICIOUS_STEW, FoodComponents.SUSPICIOUS_STEW);
    public static final OverdueFoodItem OVERDUE_SWEET_BERRIES = new OverdueFoodItem(ConfigRegistry.SWEET_BERRIES, FoodComponents.SWEET_BERRIES);
    public static final OverdueFoodItem OVERDUE_TROPICAL_FISH = new OverdueFoodItem(ConfigRegistry.TROPICAL_FISH, FoodComponents.TROPICAL_FISH);
    public static final OverdueFoodItem OVERDUE_CAKE = new OverdueFoodItem(ConfigRegistry.CAKE);

    // Salted variants
    public static final SaltedFoodItem SALTED_TOMATO = new SaltedFoodItem(ConfigRegistry.TOMATO);
    public static final SaltedFoodItem SALTED_CUCUMBER = new SaltedFoodItem(ConfigRegistry.CUCUMBER);

    public static final SaltedFoodItem SALTED_PORKCHOP = new SaltedFoodItem(ConfigRegistry.PORKCHOP, FoodComponents.PORKCHOP);
    public static final SaltedFoodItem SALTED_COOKED_PORKCHOP = new SaltedFoodItem(ConfigRegistry.COOKED_PORKCHOP, FoodComponents.COOKED_PORKCHOP);
    public static final SaltedFoodItem SALTED_BEEF = new SaltedFoodItem(ConfigRegistry.BEEF, FoodComponents.BEEF);
    public static final SaltedFoodItem SALTED_COOKED_BEEF = new SaltedFoodItem(ConfigRegistry.COOKED_BEEF, FoodComponents.COOKED_BEEF);
    public static final SaltedFoodItem SALTED_CHICKEN = new SaltedFoodItem(ConfigRegistry.CHICKEN, FoodComponents.CHICKEN);
    public static final SaltedFoodItem SALTED_COOKED_CHICKEN = new SaltedFoodItem(ConfigRegistry.COOKED_CHICKEN, FoodComponents.COOKED_CHICKEN);
    public static final SaltedFoodItem SALTED_MUTTON = new SaltedFoodItem(ConfigRegistry.MUTTON, FoodComponents.MUTTON);
    public static final SaltedFoodItem SALTED_COOKED_MUTTON = new SaltedFoodItem(ConfigRegistry.COOKED_MUTTON, FoodComponents.COOKED_MUTTON);
    public static final SaltedFoodItem SALTED_RABBIT = new SaltedFoodItem(ConfigRegistry.RABBIT, FoodComponents.RABBIT);
    public static final SaltedFoodItem SALTED_COOKED_RABBIT = new SaltedFoodItem(ConfigRegistry.COOKED_RABBIT, FoodComponents.COOKED_RABBIT);
    public static final SaltedFoodItem SALTED_SALMON = new SaltedFoodItem(ConfigRegistry.SALMON, FoodComponents.SALMON);
    public static final SaltedFoodItem SALTED_COOKED_SALMON = new SaltedFoodItem(ConfigRegistry.COOKED_SALMON, FoodComponents.COOKED_SALMON);
    public static final SaltedFoodItem SALTED_COD = new SaltedFoodItem(ConfigRegistry.COD, FoodComponents.COD);
    public static final SaltedFoodItem SALTED_COOKED_COD = new SaltedFoodItem(ConfigRegistry.COOKED_COD, FoodComponents.COOKED_COD);
    public static final SaltedFoodItem SALTED_POTATO = new SaltedFoodItem(ConfigRegistry.POTATO, FoodComponents.POTATO);
    public static final SaltedFoodItem SALTED_BAKED_POTATO = new SaltedFoodItem(ConfigRegistry.BAKED_POTATO, FoodComponents.BAKED_POTATO);
    public static final SaltedFoodItem SALTED_BEETROOT = new SaltedFoodItem(ConfigRegistry.BEETROOT, FoodComponents.BEETROOT);
    public static final SaltedFoodItem SALTED_BEETROOT_SOUP = new SaltedFoodItem(ConfigRegistry.BEETROOT_SOUP, FoodComponents.BEETROOT_SOUP);
    public static final SaltedFoodItem SALTED_BREAD = new SaltedFoodItem(ConfigRegistry.BREAD, FoodComponents.BREAD);
    public static final SaltedFoodItem SALTED_MELON_SLICE = new SaltedFoodItem(ConfigRegistry.MELON_SLICE, FoodComponents.MELON_SLICE);
    public static final SaltedFoodItem SALTED_MUSHROOM_STEW = new SaltedFoodItem(ConfigRegistry.MUSHROOM_STEW, FoodComponents.MUSHROOM_STEW);
    public static final SaltedFoodItem SALTED_PUMPKIN_PIE = new SaltedFoodItem(ConfigRegistry.PUMPKIN_PIE, FoodComponents.PUMPKIN_PIE);
    public static final SaltedFoodItem SALTED_RABBIT_STEW = new SaltedFoodItem(ConfigRegistry.RABBIT_STEW, FoodComponents.RABBIT_STEW);
    public static final SaltedFoodItem SALTED_SUSPICIOUS_STEW = new SaltedFoodItem(ConfigRegistry.SUSPICIOUS_STEW, FoodComponents.SUSPICIOUS_STEW);
    public static final SaltedFoodItem SALTED_TROPICAL_FISH = new SaltedFoodItem(ConfigRegistry.TROPICAL_FISH, FoodComponents.TROPICAL_FISH);

    // Miscellaneous
    public static final SaltItem SALT = new SaltItem();

    /**
     * Runs the registry code
     */
    public static void run() {
        register("tomato", TOMATO);
        register("cucumber", CUCUMBER);

        register("tomato_seeds", TOMATO_SEEDS);
        register("cucumber_seeds", CUCUMBER_SEEDS);

        register("rotten_porkchop", ROTTEN_PORKCHOP);
        register("rotten_cooked_porkchop", ROTTEN_COOKED_PORKCHOP);
        register("rotten_beef", ROTTEN_BEEF);
        register("rotten_cooked_beef", ROTTEN_COOKED_BEEF);
        register("rotten_chicken", ROTTEN_CHICKEN);
        register("rotten_cooked_chicken", ROTTEN_COOKED_CHICKEN);
        register("rotten_mutton", ROTTEN_MUTTON);
        register("rotten_cooked_mutton", ROTTEN_COOKED_MUTTON);
        register("rotten_rabbit", ROTTEN_RABBIT);
        register("rotten_cooked_rabbit", ROTTEN_COOKED_RABBIT);

        register("overdue_tomato", OVERDUE_TOMATO);
        register("overdue_cucumber", OVERDUE_CUCUMBER);
        register("overdue_salmon", OVERDUE_SALMON);
        register("overdue_cooked_salmon", OVERDUE_COOKED_SALMON);
        register("overdue_cod", OVERDUE_COD);
        register("overdue_cooked_cod", OVERDUE_COOKED_COD);
        register("overdue_apple", OVERDUE_APPLE);
        register("overdue_golden_apple", OVERDUE_GOLDEN_APPLE);
        register("overdue_carrot", OVERDUE_CARROT);
        register("overdue_golden_carrot", OVERDUE_GOLDEN_CARROT);
        register("overdue_potato", OVERDUE_POTATO);
        register("overdue_baked_potato", OVERDUE_BAKED_POTATO);
        register("overdue_beetroot", OVERDUE_BEETROOT);
        register("overdue_beetroot_soup", OVERDUE_BEETROOT_SOUP);
        register("overdue_bread", OVERDUE_BREAD);
        register("overdue_chorus_fruit", OVERDUE_CHORUS_FRUIT);
        register("overdue_cookie", OVERDUE_COOKIE);
        register("overdue_honey_bottle", OVERDUE_HONEY_BOTTLE);
        register("overdue_melon_slice", OVERDUE_MELON_SLICE);
        register("overdue_mushroom_stew", OVERDUE_MUSHROOM_STEW);
        register("overdue_pumpkin_pie", OVERDUE_PUMPKIN_PIE);
        register("overdue_rabbit_stew", OVERDUE_RABBIT_STEW);
        register("overdue_spider_eye", OVERDUE_SPIDER_EYE);
        register("overdue_suspicious_stew", OVERDUE_SUSPICIOUS_STEW);
        register("overdue_sweet_berries", OVERDUE_SWEET_BERRIES);
        register("overdue_tropical_fish", OVERDUE_TROPICAL_FISH);
        register("overdue_cake", OVERDUE_CAKE);

        register("salted_tomato", SALTED_TOMATO);
        register("salted_cucumber", SALTED_CUCUMBER);
        register("salted_porkchop", SALTED_PORKCHOP);
        register("salted_cooked_porkchop", SALTED_COOKED_PORKCHOP);
        register("salted_beef", SALTED_BEEF);
        register("salted_cooked_beef", SALTED_COOKED_BEEF);
        register("salted_chicken", SALTED_CHICKEN);
        register("salted_cooked_chicken", SALTED_COOKED_CHICKEN);
        register("salted_mutton", SALTED_MUTTON);
        register("salted_cooked_mutton", SALTED_COOKED_MUTTON);
        register("salted_rabbit", SALTED_RABBIT);
        register("salted_cooked_rabbit", SALTED_COOKED_RABBIT);
        register("salted_salmon", SALTED_SALMON);
        register("salted_cooked_salmon", SALTED_COOKED_SALMON);
        register("salted_cod", SALTED_COD);
        register("salted_cooked_cod", SALTED_COOKED_COD);
        register("salted_potato", SALTED_POTATO);
        register("salted_baked_potato", SALTED_BAKED_POTATO);
        register("salted_beetroot", SALTED_BEETROOT);
        register("salted_beetroot_soup", SALTED_BEETROOT_SOUP);
        register("salted_bread", SALTED_BREAD);
        register("salted_melon_slice", SALTED_MELON_SLICE);
        register("salted_mushroom_stew", SALTED_MUSHROOM_STEW);
        register("salted_pumpkin_pie", SALTED_PUMPKIN_PIE);
        register("salted_rabbit_stew", SALTED_RABBIT_STEW);
        register("salted_suspicious_stew", SALTED_SUSPICIOUS_STEW);
        register("salted_tropical_fish", SALTED_TROPICAL_FISH);

        register("salt", SALT);
    }

    /**
     * Registers an item to Minecraft.
     *
     * @param id   Resource identifier
     * @param item Item
     */
    private static void register(String id, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ImprovedFood.MOD_ID, id), item);
    }

    /**
     * Returns a new seed {@link Item.Settings}
     *
     * @return Constructed {@link Item.Settings}
     */
    private static Item.Settings createSeedSettings() {
        return new Item.Settings().group(ItemGroupRegistry.SEEDS);
    }
}
