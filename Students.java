public class Students {
    String name;
    String studNo;
    int classes;
    Courses smat;
    Courses sfizik;
    Courses skimya;
    Courses mat;
    Courses fizik;
    Courses kimya;
    double avarage;
    boolean isPass;

    Students(String name, int classes, String studNo, Courses mat,Courses fizik,Courses kimya,Courses sfizik,Courses skimya,Courses smat){
        this.name=name;
        this.classes=classes;
        this.studNo=studNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.smat=smat;
        this.sfizik=sfizik;
        this.skimya=skimya;
        this.isPass=false;

    }
    void ExamNotes(int mat,int fizik,int kimya,int smat,int skimya,int sfizik){
        if(mat>=0 && mat<=100){
            this.mat.note=mat;
            this.smat.note=smat;
        }
        if(fizik>=0 &&fizik<=100){
            this.fizik.note=fizik;
            this.sfizik.note=sfizik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note=kimya;
            this.skimya.note=skimya;
        }
    }
    void isPass(){
        if(this.mat.note==0 ||this.fizik.note==0||this.kimya.note==0){
            System.out.println("notlar tam olarak girilmemiş.");
        }
        else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama: "+this.avarage);
        }
        if(this.isPass){
            System.out.println("Sınıfı geçti!");
        }
        else{
            System.out.println("Sınıfta kaldı.");
        }
    }
    public void calcAvarage(){
        this.avarage=(((this.fizik.note*0.8)+(this.sfizik.note*0.2))+(((this.kimya.note*0.8)+(this.skimya.note*0.2))+((this.mat.note*0.8)+(this.smat.note*0.2))))/3;

    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage>55;
    }
    void printNote(){
        System.out.println("========================");
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Matematik notu: "+this.mat.note+" Matematik sözlü notu: "+this.smat.note);
        System.out.println("Kimya notu: "+this.kimya.note+" Kimya sözlü notu: "+this.skimya.note);
        System.out.println("Fizik notu: "+this.fizik.note+" Fizik sözlü notu: "+this.sfizik.note);
    }
}
