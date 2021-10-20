//import java.io.BufferedOutputStream;
//import java.io.FileOutputStream;
//
//class BufferedOutputStreamDemo{
//    public static void main(String[] args) throws Exception {
//        FileOutputStream fout = new FileOutputStream("textOutput.txt");
//        BufferedOutputStream bout = new BufferedOutputStream(fout);
//
//        for(int i=65;i<75;i++){
//            bout.write(i);
//            System.out.println();
//        }
//
////        byte b[] = {75,76,77,78,79,80};
////        bout.write(b);
//
//        bout.flush();
//        bout.close();
//        fout.close();
//    }
//}

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class BufferedOutputStreamDemo{
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("textOutput.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        for(int i=65;i<90;i++){
            bout.write(i);
        }

        bout.flush();
        bout.close();
        fout.close();

    }

}
