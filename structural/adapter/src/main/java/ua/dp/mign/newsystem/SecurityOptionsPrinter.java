package ua.dp.mign.newsystem;

/*
 * This class represents a user of a new system interface
 * SecurityOptionsProvider.
 */
public class SecurityOptionsPrinter {
    public void print(SecurityOptionsProvider provider) {
        System.out.printf("You have%s read access."
                        + "\nYou have%s write access.\n",
                          provider.hasReadAccess() ? "" : " NO",
                          provider.hasWriteAccess() ? "" : " NO");
    }
}
