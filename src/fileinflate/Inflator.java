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
     * Two-dimensional array of strings that should be used for replacements.
     * Size of the outer array determines the number of times the block to be
     * repeated inside the template.
     * 
     * The inner array contains strings by which the {@link #placeholders} must be replaced.
     */
    private final String[][] data;

    /**
     * List of placeholders that are supposed to be replaced with information
     * from {@link #data}
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

    public Inflator(final String template, final String[][] data, String[] placeholders, String start, String end) {
        this.template = template;
        this.data = data;
        this.placeholders = placeholders;
        this.startRepPlaceholder = start;
        this.endRepPlaceholder = end;
    }

    public String inflate() {
       return null;
    }
    
    public String extractRepetitive(){
        int startPos = template.indexOf(startRepPlaceholder);
        if (startPos < 0){
            System.out.println("Start placeholder \"" + startRepPlaceholder + "\" is not found");
            return null;
        }
        int endPos = template.indexOf(endRepPlaceholder, startPos + 1);
        if (endPos < 0){
            System.out.println("End placeholder \"" + endRepPlaceholder + "\" is not found");
            return null;
        }
        return template.substring(startPos, endPos + endRepPlaceholder.length());
    }

}
