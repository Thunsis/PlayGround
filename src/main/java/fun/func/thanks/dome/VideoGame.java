package fun.func.thanks.dome;

public class VideoGame extends Item {

    private int numOfPlayers;

    public VideoGame(String title, int numOfPlayers, int playTime, Boolean gotIt, String comment) {

        super(title, playTime, gotIt, comment);
        this.numOfPlayers = numOfPlayers;

    }

    @Override
    public void print() {
        System.out.println("VideoGame: " + super.getTitle() + ", Game players: " + numOfPlayers);
    }

    public static void main(String[] args) {

    }

}
