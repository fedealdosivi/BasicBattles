package Model;
import Interface.*;

public abstract class Character implements IAttack, IDefence{

    private long id;
    private static long nextID = 0;
    private String name;
    private int cantL;
    private IAttack A;
    private IDefence D;

    Character()
    {
        setId(nextID++);
        setA(new Fists());
        setD(new Run());
    }

    public abstract boolean battle(Character enemy);

    @Override
    public abstract int attacking();

    @Override
    public abstract int defending();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantLifes() {
        return cantL;
    }

    public void setCantLifes(int lifes) {
        this.cantL = lifes;
    }

    public IAttack getA() {
        return A;
    }

    public void setA(IAttack a) {
        A = a;
    }

    public IDefence getD() {
        return D;
    }

    public void setD(IDefence d) {
        D = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (id != character.id) return false;
        if (cantL != character.cantL) return false;
        if (name != null ? !name.equals(character.name) : character.name != null) return false;
        if (A != null ? !A.equals(character.A) : character.A != null) return false;
        return D != null ? D.equals(character.D) : character.D == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + cantL;
        result = 31 * result + (A != null ? A.hashCode() : 0);
        result = 31 * result + (D != null ? D.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lifes=" + cantL +
                ", A=" + A +
                ", D=" + D +
                '}';
    }

    public String printCharacter()
    {
        return (this.getName() + this.cantL);
    }
}
