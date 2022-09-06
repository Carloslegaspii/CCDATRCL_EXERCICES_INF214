public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon celestialSword = new Weapon("Celestial Sword", 100, 7, "Common", "a sword that symbolize strength and purity. used to destroy dragons and beast.");

        celestialSword.displayName();
        celestialSword.displayDamage();
        celestialSword.displayWeight();
        celestialSword.displayRarity();
        celestialSword.displayWeaponDescription();

        Weapon kitanasBlade = new Weapon("kitana's Blade", 190, 2, "Uncommon", "a Japanese sword from kitana's great ancestral. characterized by a curved, single-edged blade with a circular  guard and long grip to accommodate two hands. kill enemies in split seconds.");

        kitanasBlade.displayName();
        kitanasBlade.displayDamage();
        kitanasBlade.displayWeight();
        kitanasBlade.displayRarity();
        kitanasBlade.displayWeaponDescription();

        Weapon cursedBow = new Weapon("Cursed Bow", 250, 5, "Rare", "A Cursed Bow is a rare bow crafted from Cursed Flames. It shoots cursed arrows which inflict the Cursed Flames debuff on enemies..");

        cursedBow.displayName();
        cursedBow.displayDamage();
        cursedBow.displayWeight();
        cursedBow.displayRarity();
        cursedBow.displayWeaponDescription();


    }
}
