package may.ex_16052024.Multilevelinheritance.apiAutomation;

public class Test extends BaseTest{

    void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        //System.out.println(VERSION);
    }

    void openJSON(){
        System.out.println("Test");
    }

     void openExcelFile() {
    }
}
