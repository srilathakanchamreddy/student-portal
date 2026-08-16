public class SettingsService {

    public void displaySettings() {
        System.out.println("===== Student Settings =====");
        System.out.println("Notifications: Enabled");
        System.out.println("Theme: Default");
    }
public void updateNotifications(boolean enabled) {
    System.out.println("Notifications: "
            + (enabled ? "Enabled" : "Disabled"));
}
public void updateTheme(String theme) {
    System.out.println("Theme changed to: " + theme);
}

}