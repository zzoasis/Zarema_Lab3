
package zaremazh_lab3;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class Band {
    // Вложенный класс Участник
    class Member {

        private String name;
        private String instrument;
        private boolean canplay;

        public Member(String name, String instrument, boolean canplay) {
            this.name = name;
            this.instrument = instrument;
            this.canplay =  canplay;
        }

        public String getName() {
            return name;
        }

        public String getInstrument() {
            return instrument;
        }

        public  boolean getCanplay() {
            return canplay;
        }

        public void setCanplay(boolean cannot) {
        boolean canplay;
        if (canplay = false ) {
            this.canplay = cannot;
        }
    }

        @Override
        public String toString() {
            if (this.canplay == true) {
                return this.name + " can play "+ this.instrument + "\n";
        } else {
            return this.name +" can't play " + this.instrument +"\n";
            }
        }

    }

    private String bandName; // скрытое поле
    private TreeMap<String, Member> members; // скрытое поле

    // Секция инициализации класса
    {
        members = new TreeMap<String, Member>();
    }

    public Band(String bandName) {
        this.bandName = bandName;
    }
    
    public void addMember(String name, String instrument, boolean play) {
        members.put(name, new Member(name, instrument, play));
    }
    
    public void setCan(String name,String instrument,boolean play) {
        Member c = members.get(name);
        c.instrument = instrument;
        c.canplay = play;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(bandName + " members:\n");
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            s.append(entry.getValue());
        }
        return s.toString();
    }
}
