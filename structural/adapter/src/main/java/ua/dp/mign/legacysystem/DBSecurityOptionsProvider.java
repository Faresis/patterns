package ua.dp.mign.legacysystem;

/*
 * Legacy interface stub implementation.
 * e.g. Adaptee.
 */
public class DBSecurityOptionsProvider implements SecurityOptionsReader {
    @Override
    public String hasAccess(String option) {
        switch(option) {
            case "dbRead":
                return "Y";
            case "dbWrite":
                return "N";
            default:
                throw new IllegalArgumentException("Unknown option.");
        }
    }

}
