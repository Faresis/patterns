package ua.dp.mign.newsystem;

/*
 * This class represents interface that is
 * widely used through the system.
 * It exposes new approach in accessing
 * security options.
 */
public interface SecurityOptionsProvider {
    boolean hasReadAccess();
    boolean hasWriteAccess();
}
