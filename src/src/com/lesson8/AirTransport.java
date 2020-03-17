package src.com.lesson8;

abstract class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayStrip;

    public int getWingspan() {
        return wingspan;
    }

    public long getMinRunwayStrip() {
        return minRunwayStrip;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinRunwayStrip(int minRunwayStrip) {
        this.minRunwayStrip = minRunwayStrip;
    }
    @Override
    public String description() {
        return  super.description() +
                " Размах крыльев " + wingspan+
                " Мин. длинна ВПП " + minRunwayStrip;
    }


}
