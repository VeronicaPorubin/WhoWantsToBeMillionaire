package enums;

public enum HelpSequence {
    F ("50/50"),
    U ("Help from the audience"),
    P ("Call a friend");

    private String text;
    private HelpSequence(String text){
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
