package ao.dicionariodetermosinformaticos.romavicdosanjoskc.models;

public class DictionaryWordModel {

    private String title;
    private String meaning;
    private String image;

    public DictionaryWordModel() {
    }

    public DictionaryWordModel(String title, String meaning, String image) {
        this.title = title;
        this.meaning = meaning;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}