package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler{
    private Character delimiter;

    private StringBuilder stringBuilder;

    public StringAssembler(Character delimiter) {
        this.delimiter = delimiter;
        stringBuilder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        stringBuilder.append(str).append(delimiter);
        return this;
    }

    public String assemble() {
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("" + delimiter));
        return stringBuilder.toString();
    }
}
