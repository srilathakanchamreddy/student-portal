public class StudentPortal {

    public static void main(String[] args) {
        StudentRecord student =
                new StudentRecord(101, "Vinay", "M.Tech CSE");

        LoginService loginService = new LoginService();

        boolean authenticated =
                loginService.authenticate("student", "portal123");

        System.out.println("Welcome to Student Portal");

        System.out.println(
                loginService.getLoginMessage(authenticated)
        );

        student.displayDetails();
        student.displayStatus();

        ProfileService profileService = new ProfileService();
        profileService.displayProfile(student);

        DashboardService dashboardService = new DashboardService();

        dashboardService.displayDashboard(student);
        dashboardService.displayLoginStatus(authenticated);
        dashboardService.displayEnrollmentSummary(student);

        SettingsService settingsService = new SettingsService();

        settingsService.displaySettings();
        settingsService.updateNotifications(true);
        settingsService.updateTheme("Default");
    }
}