package exam01;

public enum Transportation {
    BUS("버스") {
        @Override
        public int getTotal(int person) {
            return person * 1500;
        }
    },
    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return person * 4500;
        }
    },
    SUBWAY("지하철") {
        @Override
        public int getTotal(int person) {
            return person * 1450;
        }
    };

    private final String title;


    Transportation(String title) { // private
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person);
}
