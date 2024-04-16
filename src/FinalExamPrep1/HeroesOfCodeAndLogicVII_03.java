package FinalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroes = Integer.parseInt(scanner.nextLine());

        List<Hero> heroesList = new ArrayList<>();

        for (int i = 1; i <= heroes; i++) {
            String[] heroInput = scanner.nextLine().split(" ");
            Hero hero = new Hero(heroInput[0],Integer.parseInt(heroInput[1]),Integer.parseInt(heroInput[2]));

            heroesList.add(hero);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandLine = command.split(" - ");

            if (commandLine[0].equals("CastSpell")) {
                String heroName = commandLine[1];
                int manaNeeded = Integer.parseInt(commandLine[2]);
                String spellName = commandLine[3];

                heroesList.forEach( hero -> {
                    if (hero.getName().equals(heroName)) {
                        if (hero.getMana() >= manaNeeded) {
                            hero.setMana(hero.getMana() - manaNeeded);
                            System.out.println(heroName + " has successfully cast " + spellName +
                                    " and now has " + hero.getMana() + " MP!");
                        } else {
                            System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                        }
                    }
                });

            } else if (commandLine[0].equals("TakeDamage")) {
                String heroName = commandLine[1];
                int damage = Integer.parseInt(commandLine[2]);
                String attacker = commandLine[3];


                for (Hero hero : heroesList) {
                    if (hero.getName().equals(heroName)) {
                        hero.setHp(hero.getHp() - damage);

                        if (hero.getHp() > 0) {
                            System.out.println(heroName + " was hit for " + damage +
                                    " HP by " + attacker + " and now has " + hero.getHp() + " HP left!");
                        }else {
                            heroesList.remove(hero);

                            System.out.println(heroName + " has been killed by " + attacker + "!");
                        }
                        break;
                    }
                }
            } else if (commandLine[0].equals("Recharge")) {
                String heroName = commandLine[1];
                int manaToRecharge = Integer.parseInt(commandLine[2]);

                heroesList.forEach( hero -> {
                            if (hero.getName().equals(heroName)) {
                                int oldMana = hero.getMana();
                                hero.setMana(hero.getMana() + manaToRecharge);
                                if (hero.getMana() > 200) {
                                    System.out.println(heroName + " recharged for " + (200 - oldMana) + " MP!");
                                    hero.setMana(200);
                                } else {
                                    System.out.println(heroName + " recharged for " + manaToRecharge + " MP!");
                                }
                            }
                });

            } else if (commandLine[0].equals("Heal")) {
                String heroName = commandLine[1];
                int healthToRecharge = Integer.parseInt(commandLine[2]);

                heroesList.forEach( hero -> {
                    if (hero.getName().equals(heroName)) {
                        int oldHp = hero.getHp();
                        hero.setHp(hero.getHp() + healthToRecharge);
                        if (hero.getHp() > 100) {
                            System.out.println(heroName + " healed for " + (100 - oldHp) + " HP!");
                            hero.setHp(100);
                        } else {
                            System.out.println(heroName + " healed for " + healthToRecharge + " HP!");
                        }
                    }
                });
            }

            command = scanner.nextLine();
        }

        heroesList.forEach( hero -> {
            if (hero.getHp() > 0) {
                System.out.println(hero.getName());
                System.out.println("  HP: " + hero.getHp());
                System.out.println("  MP: " + hero.getMana());
            }
        });

    }

    public static class Hero {
        String name;
        int hp;
        int mana;

        Hero(String name,int hp, int mana) {
            this.name = name;
            this.hp = hp;
            this.mana = mana;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }
    }
}
