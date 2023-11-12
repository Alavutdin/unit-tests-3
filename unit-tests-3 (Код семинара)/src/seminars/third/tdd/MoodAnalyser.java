package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("Good")){
            return "Good";
        } else if (message.contains("bad")){
            return "Bad";
        }
        return "so so";
    }

}