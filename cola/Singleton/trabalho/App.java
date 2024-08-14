public class App {
    public static void main(String[] args) {
        
        UserPreferences prefs = UserPreferences.getInstance();

        
        prefs.setLanguage("Português");
        prefs.setTheme("Dark");
        prefs.setVersion("2.0");
        prefs.setUsername("User123");

       
        MainScreen mainScreen = new MainScreen();
        mainScreen.display();

        SettingsScreen settingsScreen = new SettingsScreen();
        settingsScreen.display();

        UserProfileScreen userProfileScreen = new UserProfileScreen();
        userProfileScreen.display();
    }
}
