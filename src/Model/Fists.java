package Model;


import Interface.IAttack;

public class Fists implements IAttack{
    @Override
    public int attacking() {
        return 5;
    }
}
