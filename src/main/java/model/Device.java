package model;

public class Device {
    private Boolean active;
    private String iden;
    private Double created;
    private Double modified;
    private String type;
    private String kind;
    private String nickname;
    private String manufacturer;
    private String model;
    private Integer app_version;
    private Boolean pushable;
    private String icon;
    private String push_token;

    public Device() {
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public Double getCreated() {
        return created;
    }

    public void setCreated(Double created) {
        this.created = created;
    }

    public Double getModified() {
        return modified;
    }

    public void setModified(Double modified) {
        this.modified = modified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getApp_version() {
        return app_version;
    }

    public void setApp_version(Integer app_version) {
        this.app_version = app_version;
    }

    public Boolean getPushable() {
        return pushable;
    }

    public void setPushable(Boolean pushable) {
        this.pushable = pushable;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPush_token() {
        return push_token;
    }

    public void setPush_token(String push_token) {
        this.push_token = push_token;
    }
}
