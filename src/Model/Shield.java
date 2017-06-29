package Model;


import Interface.IDefence;

public class Shield implements IDefence{
    @Override
    public int defending() {
        return 16;
    }
}
