class FileDownload extends Thread {
    String fileName;
    public FileDownload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " " + "downloading..." + (i * 20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        System.out.println(fileName + "doneeeee");
    }
}
class file {
    public static void main(String[] args) {
        FileDownload obj = new FileDownload("A ");
        FileDownload obj1 = new FileDownload("B ");

        obj.start();
        obj1.start();
    }
}