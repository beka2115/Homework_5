public class Main {
    public static void main(String[] args) {
        Boss specifications = new Boss();
        specifications.setHealth(1000);
        specifications.setDamage(50);
        specifications.setDefense("Magic");
        System.out.println("Boss specificatoins: " + "Health - "
                + specifications.getHealth()
                + "  Damage - " + specifications.getDamage()
                + "  Defense - " + specifications.getDefense());

        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println("Heroes specification: " + " Ability - "
                    + createHeroes()[i].getAbility() + ", Damage - "
                    + createHeroes()[i].getDamage() + ", Health - "
                    + createHeroes()[i].getHealth());


        }


    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(250, 15, "Magic");
        heroes[1] = new Hero(300, 20, "Achilles");
        heroes[2] = new Hero(320, 25, "Heracles");
        return heroes;

    }
}