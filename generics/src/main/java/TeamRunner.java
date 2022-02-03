public class TeamRunner {

    public static void main(String[] args) {

        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer kelly=new BaseballPlayer("Kelly");
        SoccerPlayer hakan=new SoccerPlayer("Hakan");


        //Team gs=new Team("Galatasaray");
        Team<FootballPlayer> gs=new Team<FootballPlayer>("Galatasay");

        gs.addPlayer(joe);
//        gs.addPlayer(kelly);
//        gs.addPlayer(hakan);


        System.out.println(gs.numOfPlayer());




    }
}
