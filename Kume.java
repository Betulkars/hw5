package Odev2;// BEETÜL KARS - 21520786 - SORU2


public class Kume {
  public  boolean[] varlikDizisi;
    public Kume(){
         varlikDizisi  = new boolean[11];
    }
    public Kume( int arr[]){
        varlikDizisi  = new boolean[11];
        for (int i = 0; i < arr.length; i++) {
                varlikDizisi[arr[i]] = true;
            }
    }
    public void elemanCikar(int number){
        if(number>10)
            System.out.println(+number+"kümede olamaz.");
        else if(varlikDizisi[number]==false )
            System.out.println(+number+"zaten kümede değil.");
        else if(varlikDizisi[number]==true ) {
            varlikDizisi[number] = false;
            System.out.println(+number + "kümeden çıkarıldı.");
        }
    }
    public void elemanEkle(int number){
        if(number>10)
            System.out.println(+number + "kümede olamaz.");
        else if(varlikDizisi[number]==true )
            System.out.println(+number + "zaten kümede var.");
        else if (varlikDizisi[number]==false ) {
            varlikDizisi[number] = true;
            System.out.println(+number + "kümeye eklendi.");
        }

    }
    public boolean elemanMi(int number){
        if(varlikDizisi[number]==true)
            return true;
        else
            return false;
    }
    public boolean bosMu(){
        for(int i=0;i<varlikDizisi.length;i++) {
            if (varlikDizisi[i] == true)
                return false;

        }return  true;
    }
     public  Kume tumleyen(){
        Kume tumleyenkume = new Kume();
        for(int i=0; i<varlikDizisi.length;i++){
            if(varlikDizisi[i]==false)
                tumleyenkume.varlikDizisi[i]=true;
        }
        return tumleyenkume;
    }
    public Kume kesisim(Kume digerkume) {
        Kume kesisimkumesi = new Kume();
        for (int i = 0; i < varlikDizisi.length; i++) {
            if (varlikDizisi[i] == true && digerkume.varlikDizisi[i] == true)
                kesisimkumesi.varlikDizisi[i] = true;
        }
        return kesisimkumesi;
    }
    public Kume birlesim(Kume digerkume){
        Kume birlesimkumesi = new Kume();
        for(int i=0; i<varlikDizisi.length;i++){
            if(varlikDizisi[i]==true || digerkume.varlikDizisi[i]==true)
                birlesimkumesi.varlikDizisi[i]=true;
        }
        return birlesimkumesi;

    }


    public void yazdir(){
        System.out.print("{");
        for(int i=0;i<varlikDizisi.length; i++){
            if(varlikDizisi[i]==true)
                System.out.print(i);
            if(i != varlikDizisi.length && varlikDizisi[i]==true)
                System.out.print(",");
        }
        System.out.print("}");

    }




}