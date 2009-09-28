

public class Singleton {


    private static Singleton uniqueInstance = null;
    private int singletonData;

    private Singleton() {
    }

    public static Singleton getSingleTon(){
        if(Singleton.uniqueInstance == null){
            Singleton.uniqueInstance = new Singleton();
        }
        return Singleton.uniqueInstance;
    }

    /**
     * @return the singletonData
     */
    public int getSingletonData() {
        return singletonData;
    }

    /**
     * @param singletonData the singletonData to set
     */
    public void setSingletonData(int singletonData) {
        this.singletonData = singletonData;
    }





}

