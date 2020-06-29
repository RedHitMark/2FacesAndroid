package com.android.a2faces.compile_unit;

public class ImportNode extends AbstractNode {
    public static final String IMPORT_KEY_WORD = "import ";

    String packagePath;
    String packageName;

    /**
     *
     * @param parent
     * @param statement
     */
    public ImportNode(AbstractNode parent, String statement) {
        super(parent);

        int indexImportKeyword = statement.indexOf(IMPORT_KEY_WORD) + IMPORT_KEY_WORD.length();
        int lastDotIndex = statement.lastIndexOf(".");

        this.packagePath = statement.substring(indexImportKeyword, lastDotIndex);
        this.packageName = statement.substring(lastDotIndex+1);
    }


    @Override
    public String toString() {
        return IMPORT_KEY_WORD + this.packagePath + "." + this.packageName + ";";
    }
}
