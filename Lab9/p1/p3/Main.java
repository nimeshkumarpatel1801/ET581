package p3;

public class Main {
    public static void main(String[] args) {
      // Printtable p = new Printable();
      PDFFile pdf = new PDFFile();
      TxtFile txt = new TxtFile();
      PDFFile pdf1 = new PDFFile();
      pdf.print();
      txt.print();
      MP3 mp3 = new MP3();
      //mp3.print();

      Printable[] files = new Printable[3];
        files[0] = pdf;
        files[1] = txt;
       // files[2] = mp3;
        files[2] = pdf1;
        for(Printable f : files){
            f.print();
        }
    }
}
