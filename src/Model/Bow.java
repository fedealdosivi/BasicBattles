package Model;


import Interface.IAttack;

public class Bow implements IAttack{

    @Override
    public int attacking() {
        return 14;
    }
}
