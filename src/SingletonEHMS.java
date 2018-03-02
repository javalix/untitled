package 饿汉模式;

/**
 * 单例的三种模式
 *  1：饱汉模式
 *  2：饿汉模式
 *  3：使用内部类模式
 */
public class SingletonEHMS {

    private static SingletonEHMS singletonEHMS;

    private SingletonEHMS(){};


    public static SingletonEHMS getIntanse(){

        if(singletonEHMS == null){
            synchronized (SingletonEHMS.class){
                singletonEHMS = new SingletonEHMS();
                return singletonEHMS;
            }
        }else{
            return singletonEHMS;
        }
    }

    public static  void main(String args[]){
        System.out.println("ddd"+SingletonEHMS.getIntanse());
        System.out.print("aaa"+SingletonEHMS.getIntanse());
    }
}
