package fileinflate;

import java.io.File;

/**
 * File inflator
 */
class Inflator {

    /**
     * Template string
     */
    private final String template;

    /**
     * String containing data with which the template should be inflated
     */
    private final String data;

    /**
     * List of placeholders that are supposed to be replaced with information
     * from data file
     */
    private final String[] placeholders;

    /**
     * placeholder that markes the beginnig of the repetitive part
     */
    private final String startRepPlaceholder;

    /**
     * placeholder that markes the end of the repetitive part
     */
    private final String endRepPlaceholder;

    /**
     * Contains string obtained after inflating the template
     */
    private String inflated;

    public Inflator(final String template, final String dataFile, String[] placeholders, String start, String end) {
        this.template = template;
        this.data = dataFile;
        this.placeholders = placeholders;
        this.startRepPlaceholder = start;
        this.endRepPlaceholder = end;
    }

    public String inflate() {
        String templateString = read
    }

}
