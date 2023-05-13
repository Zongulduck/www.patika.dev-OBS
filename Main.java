public class Main {
    public static void main(String[] args) {
        Courses mat=new Courses("Matematik","MAT101","MAT");
        Courses fizik=new Courses("Fizik","FZK101","FZK");
        Courses kimya=new Courses("Kimya","KİM101","KİM");
        Courses sfizik=new Courses("FİZİKsözlü","fSOZ101","FSOZ");
        Courses skimya=new Courses("KİMYAsözlü","KSOZ101","KSOZ");
        Courses smat=new Courses("MATsözlü","MSOZ101","MSOZ");

        Teacher t1=new Teacher("Ahmet","0555555","MAT");
        Teacher t2=new Teacher("Selçuk","0444444","FZK");
        Teacher t3=new Teacher("Batıhan","0333333","KİM");
        mat.addTeacher(t1);
        smat.addTeacher(t1);
        kimya.addTeacher(t3);
        skimya.addTeacher(t3);
        fizik.addTeacher(t2);
        sfizik.addTeacher(t2);
        Students s1=new Students("TUTKUakaBACIM",4,"111",mat,fizik,kimya,smat,sfizik,skimya);
        s1.ExamNotes(100,90,80,90,82,50);
        s1.isPass();
        Students s2=new Students(":MOURADHAN",5,"222",mat,fizik,kimya,smat,sfizik,skimya);
        s2.ExamNotes(60,80,100,90,80,60);
        s2.isPass();
        Students s3=new Students("Ceronimo",6,"333",mat,fizik,kimya,smat,sfizik,skimya);
        s3.ExamNotes(80,90,100,15,66,45);
        s3.isPass();

    }
}