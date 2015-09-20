package ua.dp.mign.log;

class DefaultLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.printf("Default logger message: %s\n", message);
    }
}
