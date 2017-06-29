package Model;

import Interface.IAttack;

public class Sword implements IAttack{
    @Override
    public int attacking() {
        return 15;
    }
}
