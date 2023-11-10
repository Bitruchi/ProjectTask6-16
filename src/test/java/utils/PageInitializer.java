package utils;

import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;
    public static AdminDashBoardPage dashboardPageAdmin;
    public static PIMemployeeListPage pimemployeeListPage;
    public static JobPage jobPage;
    public static QualificationPage qualificationPage;
    public static MembershipPage membershipPage;

    public static AddEmployeePage addEmployeePage;

    public static EmployeeDashboardPage employeeDashboardPage;

    public static MyInfoPage myInfoPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dashboardPageAdmin = new AdminDashBoardPage();
        pimemployeeListPage=new PIMemployeeListPage();
        jobPage = new JobPage();
        qualificationPage = new QualificationPage();
        membershipPage= new MembershipPage();
        addEmployeePage = new AddEmployeePage();
        employeeDashboardPage = new EmployeeDashboardPage();
        myInfoPage = new MyInfoPage();


    }



}
