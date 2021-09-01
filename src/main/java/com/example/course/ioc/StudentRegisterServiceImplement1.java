package com.example.course.ioc;

@Component
class StudentRegisterServiceImplement1 implements StudentRegisterService{
    @Override
    public String toString(){
        return "this is student register service implementation1 instance:" + super.toString() + "\n";
    }
}
