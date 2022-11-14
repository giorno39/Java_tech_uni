public class Building {
    private int height;
    private double surface;
    private String adress;

    public Building(int height, double surface, String adress) throws NegativeSurface, NegativeHeightExceptions {
        this.height = setHeight(height);
        this.surface = setSurface(surface);
        this.adress = adress;
    }


    public int getHeight() {
        return height;
    }

    public int setHeight(int height) throws NegativeHeightExceptions {
        if(height < 0){
            throw new NegativeHeightExceptions();
        }
        return this.height = height;
    }

    public double getSurface() {
        return surface;
    }

    public double setSurface(double surface) throws NegativeSurface {
        if(surface < 0){
            throw new NegativeSurface();
        }
        return this.surface = surface;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


}
