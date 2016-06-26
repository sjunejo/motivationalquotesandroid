package in.sadrudd.motivationalquotes.models;

import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("quote")
    private String quote;

    @SerializedName("author")
    private String author;

    @SerializedName("category")
    private String category;

    @SerializedName("cat")
    private String cat;

    /**
     *
     * @return
     * The quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     *
     * @param quote
     * The quote
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     *
     * @return
     * The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The cat
     */
    public String getCat() {
        return cat;
    }

    /**
     *
     * @param cat
     * The cat
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return this.quote + " ~ " + this.author;
    }
}