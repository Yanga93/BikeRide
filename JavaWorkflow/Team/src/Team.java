import java.lang.reflect.Member;

public class Team {
    Member member;

    public Team(Member member) {  // Who is in this Team?
        this.member = member; // one member is in this Team!
    }

    // Here's our main method
    public static void main(String[]args){
        Member myMember = new Member("Yanga", "light", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

    //Now, let's define our Member class:
class Member {
     private String name;
     private String type;
     private int level; // note the dat type here
     private int rank; // note the data type here as well



    // This is the constructor for the member class
    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    //Let's define our getter functions here

        public String getName() { // Whats is your name
            return this.name;       // my name is ...
        }

        public String getType() { //what is your type
            return this.type;     //my type is ...
        }

        public int getLevel() { // What is your level
            return this.level;  // my level is ...
        }

        public int getRank() { //what is your rank
            return this.rank;  //my level is...
        }
    }