package day4.objects.inner;

public class Team {

    public String teamName = "TeamA";
    public int rank = 1;

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", rank=" + rank +
                '}';
    }
}
