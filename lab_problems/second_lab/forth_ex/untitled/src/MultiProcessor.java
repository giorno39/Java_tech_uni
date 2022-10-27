public class MultiProcessor {
    private int numberOfProcessors;
    private int numberOfCores;
    private double RefreshRate;

    public MultiProcessor(){
        this.numberOfProcessors = 0;
        this.numberOfCores = 0;
        this.RefreshRate = 0.0;
    }

    public MultiProcessor(int procs, int cores, double rate){
        this.numberOfProcessors = procs;
        this.numberOfCores = cores;
        this.RefreshRate = rate;
    }

    public int getNumberOfProcessors() {
        return numberOfProcessors;
    }

    public void setNumberOfProcessors(int numberOfProcessors) {
        this.numberOfProcessors = numberOfProcessors;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getRefreshRate() {
        return RefreshRate;
    }

    public void setRefreshRate(double refreshRate) {
        RefreshRate = refreshRate;
    }

    public double refreshRateToNormal(){
        double result;
        int currCores = this.numberOfCores;
        int currCpus = this.numberOfProcessors;
        if(this.numberOfProcessors < 1){
            currCpus = 1;
        }
        if(this.numberOfCores < 1){
            currCores = 1;
        }

        result = (0.7*currCores)*(0.8*currCpus)*this.RefreshRate;
        return result;
    }

    public double fromNormalToMultiTime(int t, double normal_clock){
        return t*normal_clock/this.RefreshRate;
    }

    public String toString(){
        return "This multiprocessor has"+this.numberOfProcessors+" processors "+this.numberOfCores+" cores "+
                ".\nHis refresh rate is"+ this.RefreshRate+"GHz";
    }
}
