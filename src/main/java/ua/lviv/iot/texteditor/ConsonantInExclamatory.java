package ua.lviv.iot.texteditor;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ConsonantInExclamatory {
    private static final String PATTERN_REGEXP = "[^aeiouAIEUO\\W]";
    private static final String EXCLAMATORY = "[^!?]+!";

    public int countConsonant(String txt) {
        int count = 0;
        Pattern p = Pattern.compile(PATTERN_REGEXP);
        Matcher m = p.matcher(txt);
        while (m.find()){
            count++;
        }
        System.out.println("count of consonants:"+count);
        return count;

    }
    public String findExclamatory(String txt) {
        txt = "." + txt;
        txt = txt.replaceAll("\\.", "?");
        Pattern pattern = Pattern.compile(EXCLAMATORY);
        Matcher matcher = pattern.matcher(txt);
        List<String> questionSentence = new ArrayList<>();
        while (matcher.find())
        {
            questionSentence.add(matcher.group());
        }
        return questionSentence.toString();

    }
}
