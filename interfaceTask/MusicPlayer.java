package interfaceTask;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Choose player type: mp3, cd, streaming");
        String type = scanner.nextLine();

        Playable player = PlayerFactory.getPlayer(type);

        if (player == null) {
            System.out.println("Invalid player type selected.");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\nChoose action: play, pause, stop, exit");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                case "exit":
                    running = false;
                    System.out.println("Exiting playback control.");
                    break;
                default:
                    System.out.println("Unknown action.");
            }
        }

        scanner.close();
	}

}
interface Playable {
    void play();
    void pause();
    void stop();
}

class PlayerFactory {
    public static Playable getPlayer(String type) {
        switch (type.toLowerCase()) {
            case "mp3": return new MP3Player();
            case "cd": return new CDPlayer();
            case "streaming": return new StreamingPlayer();
            default: return null;
        }
    }
}


class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player is playing music...");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player has stopped playback.");
    }
}

class CDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("CD Player is playing the disc...");
    }

    @Override
    public void pause() {
        System.out.println("CD Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("CD Player has stopped playback.");
    }
}

class StreamingPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Streaming Player is buffering and playing...");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player has stopped streaming.");
    }
}
