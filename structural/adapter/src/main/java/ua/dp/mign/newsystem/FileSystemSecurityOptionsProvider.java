package ua.dp.mign.newsystem;

/*
 * Stub implementation of the new approach interface.
 */
public class FileSystemSecurityOptionsProvider implements SecurityOptionsProvider {
    @Override
    public boolean hasReadAccess() {
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        return true;
    }
}
