package Diary.Model;

public class Note
{
    private int id;
    private String title;
    private String content;
    private String tags;
    private String creation_time;

    public Note()
    {

    }

    public Note(String title, String content)
    {
        this.content = content;
        this.title = title;
    }

    public Note(String title, String content, String tags)
    {
        this.content = content;
        this.title = title;
        this.tags = tags;
    }

    public String getTitle()
    {
        return title;
    }

    public String getContent()
    {
        return content;
    }

    public String getTags()
    {
        return tags;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setTags(String tags)
    {
        this.tags = tags;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getCreation_time()
    {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

}