public class volatileDemo extends  Thread{

    private  boolean flag = true;
    @Override
    public void run() {
        while(flag==true)
        {

            System.out.println("----------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean getFlag(){
        return  flag;
    }

    public void setFlag(){
        flag=false;
    }
    public static void main(String[] args) {
        volatileDemo s =  new volatileDemo();
        try {
            s.start();
            Thread.sleep(5000);
            s.setFlag();
            System.out.println("flag:"+s.getFlag());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
