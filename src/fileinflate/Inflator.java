package fileinflate;

import java.io.File;

/**
 * File inflator
 */
class Inflator {
    
    
    /**
     * Template file
     */
    private final File templateFile;
    
    /**
     * File containing data with which the template should be inflated
     */
    private final File dataFile;
    
    /**
     * List of placeholders that are supposed to be replaced with information from data file
     */
    private final String[] placeholders;
    
    /**
     * Contains string obtained after inflating the template
     */
    private String inflated;
    
    
    public Inflator(final File templateFile, final File dataFile, String[] placeholders){
        this.templateFile = templateFile;
        this.dataFile = dataFile;
        this.placeholders = placeholders;
    }
    
    
    public String inflate(){
    
    }
    

    
}
