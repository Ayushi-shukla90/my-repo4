

class myThread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println("bye");
    }
}


class multithreading {
   public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        System.out.println("hiii");
    }
}