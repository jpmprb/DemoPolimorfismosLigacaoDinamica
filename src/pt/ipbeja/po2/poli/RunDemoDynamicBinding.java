package pt.ipbeja.po2.poli;

import java.util.List;

/**
 * @author João Paulo Barros
 * @version 2020/05/12
 */
class RunDemoDynamicBinding {

    public static void main(String[] args) {
        ClassWithSeveralTexts texts = new ClassWithSeveralTexts();
        texts.addText(new QuoteSingle("Why do we never have time to do it right, but always have time to " +
                "do it over?",
                "anonymous"));
        texts.addText(new QuoteNormal("To iterate is human, to recurse divine.",
                "L. Peter Deutsch"));
        texts.addText(new QuoteFancy("The question of whether computers can think is like the question " +
                "of whether submarines can swim.",
                "Edsger W. Dijkstra"));

        List<String> quotedTexts = texts.getQuotedTexts();
        for (String s : quotedTexts) {
            System.out.println(s);
        }
    }
}
