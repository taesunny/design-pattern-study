package builder;

public class ContainerConfig {
    private final String name;
    private final String image;
    private final int port;
    private final boolean autoRestart;

    public static class Builder {
        private final String name;
        private final String image;
        private int port;
        private boolean autoRestart;

        public Builder(String name, String image) {
            this.name = name;
            this.image = image;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder autoRestart(boolean autoRestart) {
            this.autoRestart = autoRestart;
            return this;
        }

        public ContainerConfig build() {
            return new ContainerConfig(this);
        }
    }

    public ContainerConfig(Builder builder) {
        this.name = builder.name;
        this.image = builder.image;
        this.port = builder.port;
        this.autoRestart = builder.autoRestart;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isAutoRestart() {
        return this.autoRestart;
    }
}