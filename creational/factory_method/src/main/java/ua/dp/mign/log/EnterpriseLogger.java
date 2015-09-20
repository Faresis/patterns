package ua.dp.mign.log;

class EnterpriseLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.printf("Enterprise logger message: %s\n", message);
    }
}
