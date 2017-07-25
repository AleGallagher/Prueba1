package enums;

/**
 * Created by Ale on 28/06/2016.
 */
public enum UserStatusEnum {
    NEW("New"),
    ACTIVE("Active");

    private String status;

    private UserStatusEnum(String status) {
        this.status = status;
    }
    public String getValue() {
        return status;
    }
}
