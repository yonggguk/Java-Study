package yongggguk.study.DI;


public class UnderstandDI {
    public static void main(String args[]){

    }
    public static void memberUse1(){
        // 강한 결합 : 직접 생성
        Student m1 = new Student();
    }

    public static void memberUse2(Student m){
        //약한 결합 : 생성된 것을 주입 받음 - 의존 주입(DI)
        Student m2 = m;
    }
}

// Member를 사용한다 --> Member의 기능에 의존한다 라는 의미
class Student{
    String name;
    String nickname;

}
