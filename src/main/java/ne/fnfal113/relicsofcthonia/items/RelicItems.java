package ne.fnfal113.relicsofcthonia.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import ne.fnfal113.relicsofcthonia.RelicsOfCthonia;
import org.bukkit.NamespacedKey;

public class RelicItems {

    public static final NestedItemGroup RELIC_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "main_group"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "caf59b8aa0f83546ef0d178ccf87e7ed88cf7858caae79b3633cbd75b650525f")),
                    "&6克托尼亞的遺物"));

    public static final SubItemGroup COMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "47ec41e0df8e170d97f9b9af1d65edad4979c78c89b01b180f389ee08a61af82")),
                    "&a常見遺物"));

    public static final SubItemGroup UNCOMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ba6dac8035d361ba7f2c2a614b4ebaafc1e5e3101f85beef683536f337e5090")),
                    "&7不常見遺物"));

    public static final SubItemGroup RARE_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "38c0f04bcabab2e0f0eee0dbdfc6ec4b4c65ecc1c1e3237c3d1d98b863b2f73")),
                    "&9稀有遺物"));

    public static final SubItemGroup EPIC_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2ee4a5cd4ee6e989a63dc41c4b40d83f0d58598e7ecdf2c94dfeec0ada02ec93")),
                    "&d史詩遺物"));

    public static final SubItemGroup LEGENDARY_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2d0bdf39b54f49692fb379b4eb04d1eb4a00e78ed3911ad3b63a7e5bf3176837")),
                    "&6傳奇遺物"));

    public static final SlimefunItemStack COMMON_RELIC_CTHONIAN_PEARL = new SlimefunItemStack(
            "COMMON_RELIC_CTHONIAN_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "377d4a206d7757f479f332ec1a2bbbee57cef97568dd88df81f4864aee7d3d98")),
            "&a克托尼亞珍珠",
            "",
            "&b常被克托尼亞用於",
            "&b運輸方面, 由於大量",
            "&b生產的珍珠被廣泛",
            "&b分散在廢墟之中",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_RING_OF_SUFFERING = new SlimefunItemStack(
            "COMMON_RELIC_RING_OF_SUFFERING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2462ba9115b808a6b7ff16851ff3b4c9e85add489deb7c15110f8cc6bb6d95aa")),
            "&a苦難之戒",
            "",
            "&b這枚戒指是給予",
            "&b克托尼亞的罪人, 作為對",
            "&b城邦或城市所犯下的",
            "&b罪刑懲罰.",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_FISHING_SACK = new SlimefunItemStack(
            "COMMON_RELIC_FISHING_SACK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "be8cd3f57d9fe1ac3cd54fb85f3c96a95479b14f99d2e5a0119f5a52c21ec327")),
            "&a釣魚袋",
            "",
            "&b克托尼亞的漁民用於",
            "&b儲存捕獲的魚並作為",
            "&b背包或披風配戴以方便使用",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_PETTY_MARBLE_BLOCK = new SlimefunItemStack(
            "COMMON_RELIC_PETTY_MARBLE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "785a206697d35709ce271f3853933d8a4b4ef105629d2d74e4ad93ce70b1fc0c")),
            "&a小型大理石塊",
            "",
            "&b來自克托尼亞採石場",
            "&b的普通大理石塊, 雖小,",
            "&b但仍然有一點價值",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_HEALING_POTION = new SlimefunItemStack(
            "COMMON_RELIC_HEALING_POTION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6b4a5c29d901721851d8868b9075f49c476a894098c7ef2665813c552bbc9add")),
            "&a治療藥水",
            "",
            "&b克托尼亞人所保存",
            "&b與使用的治療藥水,",
            "&b可能不再那麼有效,",
            "&b但還是很方便",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_LEATHER_HELMET = new SlimefunItemStack(
            "COMMON_RELIC_LEATHER_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a804b82567acbae7c0fafe6538fd0ad6a826bd2f1ffa9f2ffa0cb78c0c2d28d2")),
            "&a皮革頭盔",
            "",
            "&b常被克托尼亞軍隊",
            "&b特別是低級別的",
            "&b士兵使用. 使用起來",
            "&b很輕便, 而且也很靈活",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_MUSHROOM = new SlimefunItemStack(
            "COMMON_RELIC_MUSHROOM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "c9d9df8213a1ad4660589c8318608d791bac3a77e373a3fb55d36e95e7234c04")),
            "&a蘑菇",
            "",
            "&b通常儲存在地下,",
            "&b用蓋子蓋住以保存,",
            "&b是一種生存食品,",
            "&b常見於克托尼亞B區的郊區,",
            "&b食用時可提供",
            "&b大量的能量",
            "",
            "&d稀有度: &a常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_PINK_SALT = new SlimefunItemStack(
            "UNCOMMON_RELIC_PINK_SALT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6d9d3005c9368ced2992eaf386acfdc958ae24845a72fd5b335a780cb3e12a31")),
            "&7粉紅鹽",
            "",
            "&b一種用於釀造藥水的",
            "&b成分, 在克托尼亞的",
            "&b雷斯地區發現",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_SKULL_HAT = new SlimefunItemStack(
            "UNCOMMON_RELIC_SKULL_HAT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "567c420bdba7ca36c968d4d1368564af7956379637aa431db68198d6254bbedb")),
            "&7骷髏帽",
            "",
            "&b在慶祝死者時佩戴.",
            "&b這並不常見",
            "&b因為只是個節慶性物品",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_CTHONIAN_TOKEN = new SlimefunItemStack(
            "UNCOMMON_RELIC_CTHONIAN_TOKEN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1326cafa585acf7c04f19a3d9359ba778557ae4cd790021afc648988653bb99b")),
            "&7克托尼亞的貨幣",
            "",
            "&b一種用於支付商品",
            "&b和服務的貨幣. 雖然確切的",
            "&b幣值是未知的",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_AGED_WINE = new SlimefunItemStack(
            "UNCOMMON_RELIC_AGED_WINE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "bd2b65b79b4904514a0fc7232ea89a9e8c6ac60ee3dba1b5975b7755127338a4")),
            "&7陳年酒",
            "",
            "&b200多年的陳釀",
            "&b葡萄酒, 是荒涼的",
            "&b克托尼亞遺留物.",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_TANZANITE_BLOCK = new SlimefunItemStack(
            "UNCOMMON_RELIC_TANZANITE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e32b72ad6ea8149dda6690f76db523f5bb11579af32242397265641b60090246")),
            "&7坦桑石塊",
            "",
            "&b克托尼亞在它們",
            "&b未完全挖掘完的",
            "&b採石場開採的不常見礦物",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_BLUE_GLOWSTONE = new SlimefunItemStack(
            "UNCOMMON_RELIC_BLUE_GLOWSTONE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "904bef1ff44f5c979639c574b55187ce236c3cf173295ad45b50407fef4e92")),
            "&7藍色螢光石",
            "",
            "&b在一些克托尼亞建築中",
            "&b不常見的照明方塊",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_GRAY_BERRY = new SlimefunItemStack(
            "UNCOMMON_RELIC_GRAY_BERRY",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6e7653873d0a3a29d4c6a32552ee7db0c2342a1b700171c4cd337c9e9aff68f2")),
            "&7灰色莓果",
            "",
            "&b我想知道為甚麼",
            "&b這些莓果被染成灰色",
            "&b但這些莓果在地下保存的很好",
            "",
            "&d稀有度: &7不常見",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_MARRIAGE_RING = new SlimefunItemStack(
            "RARE_RELIC_MARRIAGE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "12ed9a330d08be07d17cfa6a296e7f1b5f82bf9f4144596f1d23d72d9721b7f8")),
            "&9結婚戒指",
            "",
            "&b所屬克托尼亞的",
            "&b研究員所在尋找的",
            "&b特殊戒指",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_BLAZE_ASHES = new SlimefunItemStack(
            "RARE_RELIC_BLAZE_ASHES",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "93068a116f66d4cf13b5febe23719186421bce6a8ab51e321b3a182b5d0f0169")),
            "&9烈焰灰燼",
            "",
            "&b克托尼亞荒廢時",
            "&b所留下的灰燼,",
            "&b它擁有克托尼亞研究員",
            "&b也不知道的元素",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CROSSED_SWORDS = new SlimefunItemStack(
            "RARE_RELIC_CROSSED_SWORDS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6a5361b52daf4f1c5c5480a39faaa10897595fa5763f757bdda3956588fec678")),
            "&9交叉的劍",
            "",
            "&b在克托尼亞玫瑰戰爭",
            "&b期間從士兵上掉落.",
            "&b由於無法在戰鬥中使用,",
            "&b但也算是一種稀有的遺物",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CERULEAN_GEM = new SlimefunItemStack(
            "RARE_RELIC_CERULEAN_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e4e71671db5f69d2c46a0d72766b249c1236d726782c00a0e22668df5772d4b9")),
            "&9蔚藍寶石",
            "",
            "&b一種只有在克托尼亞巴爾",
            "&b沿海地區所發現的稀有寶石.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_TERRACOTTA_POT = new SlimefunItemStack(
            "RARE_RELIC_TERRACOTTA_POT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79e73f08459f2053f6acabeedbd6c0ef2c508830222ab1c0066ca9d9ffb7935e")),
            "&9陶罐",
            "",
            "&b描繪著克托尼亞",
            "&b人們豐富日常生活",
            "&b的稀有陶器畫",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_GOLDEN_JAR = new SlimefunItemStack(
            "RARE_RELIC_GOLDEN_JAR",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7b32617ae031163baf549b6e113f6c401470faac4bdbe9beb75c19d9aad83f8e")),
            "&9金罐",
            "",
            "&b克托尼亞早期",
            "&b由高級貴族所保存",
            "&b的閃亮金色罐",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_HORN_OF_TAURUS = new SlimefunItemStack(
            "RARE_RELIC_HORN_OF_TAURUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79b8d0cf93532c1b6c70223cdd0440ef6def2ad436b51e2850ca8e5c64e84470")),
            "&9金牛座的號角",
            "",
            "&b由於其歷史價值",
            "&b而被文物商追捧",
            "&b的稀有物品之一",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_LUMINOUS_PEARL = new SlimefunItemStack(
            "EPIC_RELIC_LUMINOUS_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2dbd4e5d3d9c05a036fb62e6e70faf9e6f98d294f9d006781c144c9f15b87715")),
            "&d夜光珍珠",
            "",
            "&b只有在克托尼亞的黑色海洋",
            "&b下才能找到的閃亮珍珠",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_VALIANT_TALISMAN = new SlimefunItemStack(
            "EPIC_RELIC_VALIANT_TALISMAN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "50857d0860dc9e21461126a444262b8d70d5ed9a8aed51144a0be03bb5a41899")),
            "&d英勇護身符",
            "",
            "&b僅授予給克托尼亞高級士兵,",
            "&b象徵著克托尼亞消耗戰",
            "&b所描繪的英勇",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FLAWLESS_AQUA_GEM = new SlimefunItemStack(
            "EPIC_RELIC_FLAWLESS_AQUA_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a11067bae82704b15490af20a8a60626321fe677195b9e5bd57e6aa79059503d")),
            "&d無瑕的水寶石",
            "",
            "&b寶石收藏家對這種寶石",
            "&b充滿期待. 它只能在",
            "&b克托尼亞巨大的白色海洋下開採",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_BOTTLE_O_POWER = new SlimefunItemStack(
            "EPIC_RELIC_BOTTLE_O_POWER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "348a7ea198ec4efd8b56bcda8aa4230039e04d1338ee98fa85897bd4f342d632")),
            "&d力量 o 瓶子",
            "",
            "&b裝滿魔法的瓶子",
            "&b皆在通過增加他們",
            "&b的整體力量和邏輯思維",
            "&b讓克托尼亞士兵在戰鬥中獲得優勢",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FERVOR_HELMET = new SlimefunItemStack(
            "EPIC_RELIC_FERVOR_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d47cf6e12d12a5eb161759ba95689a9237ec111473e92a140ecab0158dfd258")),
            "&d狂熱者頭盔",
            "",
            "&b狂熱者頭盔, 穿戴者它",
            "&b一直戰鬥直至死亡",
            "&b這樣的複製品存在著",
            "&b商人尋找著狂熱者祝福",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_THUNDER_IN_A_BOTTLE = new SlimefunItemStack(
            "EPIC_RELIC_THUNDER_IN_A_BOTTLE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ab3616f523bf5a00bf2b3e9fb8314c47390b90a5ca68c5db3684acd567430cd3")),
            "&d瓶中的雷電",
            "",
            "&b用這裝滿雷電的瓶子",
            "&b可以招換閃電來讓戰士",
            "&b行走過的路上造成混亂",
            "",
            "&d稀有度: &d史詩",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON = new SlimefunItemStack(
            "LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "b069c4498b7e4e90276fee28786bf5e9b3ff8b39d667d36a6923d880a627ab77")),
            "&6神秘的全息儀",
            "",
            "&b在克托尼亞的矮人地牢中",
            "&b發現由於其歷史價值",
            "&b和內含的知識而受到",
            "&b研究員的高度關注",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_EYE_OF_SAURON = new SlimefunItemStack(
            "LEGENDARY_RELIC_EYE_OF_SAURON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "86648a14748a3b00ef6391f669ca19b8a91ec2f31f43a99cdff9f7b511869f62")),
            "&6索倫之眼",
            "",
            "&b傳說中的索倫之眼",
            "&b可以通過急殺索倫",
            "&b之塔的高階艾努",
            "&b守衛獲得",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SKULL_OF_PROMETHEUS = new SlimefunItemStack(
            "LEGENDARY_RELIC_SKULL_OF_PROMETHEUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "662196e42def995819298fbd2a9bbfc2f45564fd448faf9ac9bed7bb87754574")),
            "&6普羅米修斯的頭骨",
            "",
            "&b傳說中的普羅米修斯頭骨",
            "&b是在克托尼亞黑暗之谷",
            "&b中殺死它的怪物所掉",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MAGMA_GAUNTLET = new SlimefunItemStack(
            "LEGENDARY_RELIC_MAGMA_GAUNTLET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "168a2bfe6e56ddea103de8cec000efa83ebb9a959c68d82402543c01d4137d26")),
            "&6岩漿護手",
            "",
            "&b只有強者才能從赫利卡",
            "&b深處獲得這件物品",
            "&b這是一件來自遠古克托尼亞",
            "&b黃金時代所形成的護手",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_GLAZING_PEARL = new SlimefunItemStack(
            "LEGENDARY_RELIC_GLAZING_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "46e0a3cc6657d4205818ffef5cc7b7e36c381d4269b69010c7297a6fa68d83d7")),
            "&6釉面珍珠",
            "",
            "&b哦, 釉面珍珠",
            "&b我尋求智慧和知識來重溫過去,",
            "&b因為當克托尼亞仍然存在時",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SAPPHIRE_RING = new SlimefunItemStack(
            "LEGENDARY_RELIC_SAPPHIRE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "dd8df6feff41a987f53a1e03c298017771767b263808203386b7737a9c86613f")),
            "&6藍寶石戒指",
            "",
            "&b只有克托尼亞的王",
            "&b才能擁有這枚象徵克托尼亞",
            "&b繁榮昌盛的藍寶石戒指",
            "",
            "&d稀有度: &6傳奇",
            "&d完整度: " + "&d%",
            "",
            "&e掉落機率: " + "&e%",
            "&e掉落在:",
            "",
            "&a豬布林交易機率:",
            "&a‣ 取決於遺物狀況而定",
            "&a豬布林可能給予的物品:",
            "",
            "&e右鍵點擊豬布林",
            "&e來交易這個遺物",
            "",
            "&e放置在副手並右鍵點擊",
            "&e此遺物來檢查或使用",
            "",
            "&6Φ 克托尼亞的遺物 Φ"
    );

    public static final SlimefunItemStack RELIC_DROP_TYPE = new SlimefunItemStack(
            "RELIC_DROP_TYPE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7406e45318e9a4a6bfe132f202fe3ceac15d11eaedbef1eb06a376db433090a8")),
            "&6掉落類",
            "",
            "&e根據物品的敘述,",
            "&e通過挖掘材料或",
            "&e殺死怪物來獲得此物品"
    );

}
