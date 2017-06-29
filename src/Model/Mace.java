package Model;


import Interface.IAttack;

public class Mace implements IAttack {
    @Override
    public int attacking() {
        return 10;
    }
}
