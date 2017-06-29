package Data;

import Model.*;
import Model.Character;
import java.util.ArrayList;

public class ListCharacters {
    private ArrayList<Character> list = new ArrayList<Character>();

    public void addCharacter(Character objCharacter) {
        list.add(objCharacter);
    }

    public void deleteCharacter(long id) {
        for (Character C : list) {
            if (id == C.getId()) {
                list.remove(id);
            }
        }
    }

    public String printCharacters() {
        String rta = "";
        for (Character C : list()
                ) {
            rta += C.toString();
        }
        return rta;
    }

    public int cantCharacters() {
        int cant = 0;
        for (Character C : list
                ) {
            cant++;
        }
        return cant;
    }

    public Character getCharacterById(long id) {
        Character C=null;
        for(int x=0;x<list.size();x++)
        {
            if (list.get(x).getId()==id){
                C= list.get(x);
            }
        }
        return C;
    }

    public ArrayList<Character> list() {
        return list;
    }

    public void setList(ArrayList<Character> list) {
        this.list = list;
    }

    public boolean singleBattle(long id1,long id2)
    {
        int x=0;
        int index1=0;
        int index2=0;

        while(x!=-1 && index1<list.size())
        {
            if (list.get(index1).getId()==id1){
                x=-1;
            }
            else
            {
                index1++;
            }
        }

        int y=0;

        while(y!=-1 && index2<list.size())
        {
            if (list.get(index2).getId()==id2){
                y=-1;
            }
            else
            {
                index2++;
            }
        }


        boolean rta=list.get(index1).battle(list.get(index2));
        return  rta;
    }
}
