package Model;

public class Warrior extends Character {

    @Override
    public boolean battle(Character enemy) {


        boolean rta=false;

        if (this.getCantLifes() >= 1 && enemy.getCantLifes() >= 1) {

            int ataque1=this.attacking() + this.getA().attacking();
            int defensa2=enemy.defending() + enemy.getD().defending();

            if (ataque1 > defensa2) {
                this.setCantLifes(this.getCantLifes()+1);
                enemy.setCantLifes(enemy.getCantLifes()-1);
                rta= true;

            } else if (ataque1 <= defensa2) {

                int ataque2=enemy.attacking() + enemy.getA().attacking();
                int defensa1=this.defending() + this.getD().defending();

                if (ataque2 > defensa1) {
                    this.setCantLifes(this.getCantLifes()-1); ;
                    enemy.setCantLifes(this.getCantLifes()+1);
                    rta= true;
                }
            }

        } else {
        }
        return  rta;
    }

        @Override
        public int attacking () {
            return 10;
        }

        @Override
        public int defending () {
            return 4;
        }
    }

