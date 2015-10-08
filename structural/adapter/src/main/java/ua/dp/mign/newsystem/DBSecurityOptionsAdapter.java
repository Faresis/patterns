package ua.dp.mign.newsystem;

import ua.dp.mign.legacysystem.SecurityOptionsReader;

public class DBSecurityOptionsAdapter implements SecurityOptionsProvider {

    private final SecurityOptionsReader adaptee;

    public DBSecurityOptionsAdapter(SecurityOptionsReader adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean hasReadAccess() {
        return "Y".equals(adaptee.hasAccess("dbRead"));

    }

    @Override
    public boolean hasWriteAccess() {
        return "Y".equals(adaptee.hasAccess("dbWrite"));
    }
}
