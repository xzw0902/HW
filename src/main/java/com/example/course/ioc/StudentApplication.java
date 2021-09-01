package com.example.course.ioc;

@Component
class StudentApplication {
    @Autowired
    @Qualifier(name = "StudentRegisterServiceImplement1")
    StudentRegisterService studentRegisterServiceImpl1;

    @Autowired
    @Qualifier(name = "StudentRegisterServiceImplement2")
    StudentRegisterService studentRegisterServiceImpl2;

    @Override
    public String toString(){
        return "StudentApplication{\n" +
                "studentRegisterService1 = " + studentRegisterServiceImpl1 +
                "\n" +
                "studentRegisterService2 + " + studentRegisterServiceImpl2 +
                "}\n";
    }
}