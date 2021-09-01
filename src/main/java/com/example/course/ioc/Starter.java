package com.example.course.ioc;

@Component

class Starter {

    @Autowired
    private static StudentApplication studentApplication;

    @Autowired
    @Qualifier(name = "StudentRegisterServiceImplement1 ")
    private static StudentRegisterService studentRegisterServiceImpl1;

    @Qualifier(name = "StudentRegisterServiceImplement2")
    @Autowired
    private static StudentRegisterService studentRegisterServiceImpl2;

    public static void main(String [] args) throws Exception {
        Container.start();
        System.out.println(studentApplication);
        System.out.println(studentRegisterServiceImpl1);
        System.out.println(studentRegisterServiceImpl2);
    }
}

//        result:
//        StudentApplication{
//        studentRegisterService1 = null
//        studentRegisterService2 + null}
//
//        null
//        null
