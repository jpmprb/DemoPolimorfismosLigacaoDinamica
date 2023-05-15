package pt.ipbeja.po2.poli;

/**
 * @author João Paulo Barros
 * @version 2020/05/12
 */
class QuoteNormal extends Quote {

    public QuoteNormal(String text, String author) {
        super(text, author);
    }

    @Override
    public String quotedText() {
        return "\"" + this.text() + "\"";
    }
}
