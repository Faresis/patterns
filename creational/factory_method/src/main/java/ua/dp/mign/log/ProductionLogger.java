package ua.dp.mign.log;

class ProductionLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.printf("Production logger message: %s\n", message);
    }
}
