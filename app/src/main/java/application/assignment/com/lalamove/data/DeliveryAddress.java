package application.assignment.com.lalamove.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeliveryAddress {
    @SerializedName("id")
    private Integer id;
    @SerializedName("description")
    private Integer description;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("url")
    private String url;
    @SerializedName("location")
    private List<Location> location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }
}
