package com.example.course.ioc;

@Component
class StudentRegisterServiceImplement2 implements StudentRegisterService{
    @Override
    public String toString(){
        return "this is student register service implementation2 instance:" + super.toString() + "\n";
    }
}