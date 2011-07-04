package main;

import java.util.List;

/**
 * @author raido
 */
public class RedditData {

   private String kind;
   private Data data;
   
   public String getKind() {
      return kind;
   }
   public void setKind(String kind) {
      this.kind = kind;
   }
   public Data getData() {
      return data;
   }
   public void setData(Data data) {
      this.data = data;
   }


   public static class Data {

      private String modhash;
      private List<Child> children;
      private String after;
      private String before;
      
      public String getModhash() {
         return modhash;
      }
      public void setModhash(String modhash) {
         this.modhash = modhash;
      }
      public List<Child> getChildren() {
         return children;
      }
      public void setChildren(List<Child> children) {
         this.children = children;
      }
      public String getAfter() {
         return after;
      }
      public void setAfter(String after) {
         this.after = after;
      }
      public String getBefore() {
         return before;
      }
      public void setBefore(String before) {
         this.before = before;
      }
   }


   public static class Child {

      private String kind;
      private ChildData data;
      
      public String getKind() {
         return kind;
      }
      public void setKind(String kind) {
         this.kind = kind;
      }
      public ChildData getData() {
         return data;
      }
      public void setData(ChildData data) {
         this.data = data;
      }
   }


   public static class ChildData {

      private String domain;
      private MediaEmbed media_embed;
      private String levenshtein;
      private String subreddit;
      private String selftext_html;
      private String selftext;
      private String likes;
      private boolean saved;
      private String id;
      private boolean clicked;
      private String author;
      private Media media;
      private int score;
      private boolean over_18;
      private boolean hidden;
      private String thumbnail;
      private String subreddit_id;
      private int downs;
      private boolean is_serif;
      private String permalink;
      private String name;
      private double created;
      private String url;
      private String title;
      private double created_utc;
      private int num_comments;
      private int ups;
      
      public String getDomain() {
         return domain;
      }
      public void setDomain(String domain) {
         this.domain = domain;
      }
      public MediaEmbed getMedia_embed() {
         return media_embed;
      }
      public void setMedia_embed(MediaEmbed media_embed) {
         this.media_embed = media_embed;
      }
      public String getLevenshtein() {
         return levenshtein;
      }
      public void setLevenshtein(String levenshtein) {
         this.levenshtein = levenshtein;
      }
      public String getSubreddit() {
         return subreddit;
      }
      public void setSubreddit(String subreddit) {
         this.subreddit = subreddit;
      }
      public String getSelftext_html() {
         return selftext_html;
      }
      public void setSelftext_html(String selftext_html) {
         this.selftext_html = selftext_html;
      }
      public String getSelftext() {
         return selftext;
      }
      public void setSelftext(String selftext) {
         this.selftext = selftext;
      }
      public String getLikes() {
         return likes;
      }
      public void setLikes(String likes) {
         this.likes = likes;
      }
      public boolean isSaved() {
         return saved;
      }
      public void setSaved(boolean saved) {
         this.saved = saved;
      }
      public String getId() {
         return id;
      }
      public void setId(String id) {
         this.id = id;
      }
      public boolean isClicked() {
         return clicked;
      }
      public void setClicked(boolean clicked) {
         this.clicked = clicked;
      }
      public String getAuthor() {
         return author;
      }
      public void setAuthor(String author) {
         this.author = author;
      }
      public Media getMedia() {
         return media;
      }
      public void setMedia(Media media) {
         this.media = media;
      }
      public int getScore() {
         return score;
      }
      public void setScore(int score) {
         this.score = score;
      }
      public boolean isOver_18() {
         return over_18;
      }
      public void setOver_18(boolean over_18) {
         this.over_18 = over_18;
      }
      public boolean isHidden() {
         return hidden;
      }
      public void setHidden(boolean hidden) {
         this.hidden = hidden;
      }
      public String getThumbnail() {
         return thumbnail;
      }
      public void setThumbnail(String thumbnail) {
         this.thumbnail = thumbnail;
      }
      public String getSubreddit_id() {
         return subreddit_id;
      }
      public void setSubreddit_id(String subreddit_id) {
         this.subreddit_id = subreddit_id;
      }
      public int getDowns() {
         return downs;
      }
      public void setDowns(int downs) {
         this.downs = downs;
      }
      public boolean isIs_serif() {
         return is_serif;
      }
      public void setIs_serif(boolean is_serif) {
         this.is_serif = is_serif;
      }
      public String getPermalink() {
         return permalink;
      }
      public void setPermalink(String permalink) {
         this.permalink = permalink;
      }
      public String getName() {
         return name;
      }
      public void setName(String name) {
         this.name = name;
      }
      public double getCreated() {
         return created;
      }
      public void setCreated(double created) {
         this.created = created;
      }
      public String getUrl() {
         return url;
      }
      public void setUrl(String url) {
         this.url = url;
      }
      public String getTitle() {
         return title;
      }
      public void setTitle(String title) {
         this.title = title;
      }
      public double getCreated_utc() {
         return created_utc;
      }
      public void setCreated_utc(double created_utc) {
         this.created_utc = created_utc;
      }
      public int getNum_comments() {
         return num_comments;
      }
      public void setNum_comments(int num_comments) {
         this.num_comments = num_comments;
      }
      public int getUps() {
         return ups;
      }
      public void setUps(int ups) {
         this.ups = ups;
      }
   }


   public static class MediaEmbed {
      // TODO
   }


   public static class Media {
      
      private String type;
      private OEmbed oembed;
      
      public String getType() {
         return type;
      }
      public void setType(String type) {
         this.type = type;
      }
      public OEmbed getOembed() {
         return oembed;
      }
      public void setOembed(OEmbed oembed) {
         this.oembed = oembed;
      }
   }


   public static class OEmbed {
      
      private String provider_url;
      private String description;
      private String title;
      private String url;
      private String author_name;
      private int height;
      private int width;
      private String html;
      private int thumbnail_width;
      private String version;
      private String provider_name;
      private String thumbnail_url;
      private String type;
      private int thumbnail_height;
      private String author_url;
      
      public String getProviderUrl() {
         return provider_url;
      }
      public void setProviderUrl(String provider_url) {
         this.provider_url = provider_url;
      }
      public String getDescription() {
         return description;
      }
      public void setDescription(String description) {
         this.description = description;
      }
      public String getTitle() {
         return title;
      }
      public void setTitle(String title) {
         this.title = title;
      }
      public String getUrl() {
         return url;
      }
      public void setUrl(String url) {
         this.url = url;
      }
      public String getAuthor_name() {
         return author_name;
      }
      public void setAuthor_name(String author_name) {
         this.author_name = author_name;
      }
      public int getHeight() {
         return height;
      }
      public void setHeight(int height) {
         this.height = height;
      }
      public int getWidth() {
         return width;
      }
      public void setWidth(int width) {
         this.width = width;
      }
      public String getHtml() {
         return html;
      }
      public void setHtml(String html) {
         this.html = html;
      }
      public int getThumbnail_width() {
         return thumbnail_width;
      }
      public void setThumbnail_width(int thumbnail_width) {
         this.thumbnail_width = thumbnail_width;
      }
      public String getVersion() {
         return version;
      }
      public void setVersion(String version) {
         this.version = version;
      }
      public String getProvider_name() {
         return provider_name;
      }
      public void setProvider_name(String provider_name) {
         this.provider_name = provider_name;
      }
      public String getThumbnail_url() {
         return thumbnail_url;
      }
      public void setThumbnail_url(String thumbnail_url) {
         this.thumbnail_url = thumbnail_url;
      }
      public String getType() {
         return type;
      }
      public void setType(String type) {
         this.type = type;
      }
      public int getThumbnail_height() {
         return thumbnail_height;
      }
      public void setThumbnail_height(int thumbnail_height) {
         this.thumbnail_height = thumbnail_height;
      }
      public String getAuthor_url() {
         return author_url;
      }
      public void setAuthor_url(String author_url) {
         this.author_url = author_url;
      }
   }
}