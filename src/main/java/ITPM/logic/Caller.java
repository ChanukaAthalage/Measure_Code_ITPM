package ITPM.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ITPM.logic.model.Coupling;
import ITPM.logic.model.CustomFile;

/**
 *
 * @author ASUS
 */
public class Caller {
    
//    public static void main(String args[]) {
//        Coupling couplingObj = analyzeCode("import java.util.Scanner;\n" + " class Years{\n" + "   public int getYear(){\n" + "\tint year;\n" + "\tString enteredYear;\n" + "\tScanner sc = new Scanner(System.in);\n" + "\tSystem.out.println(\"Enter the year as a number :\");\n" + "\tenteredYear = sc.next();\n" + "\tyear = Integer.parseInt(enteredYear);\n" + "\treturn year;\n" + "   }\n" + " }\n" + "//------------------------------------------------------------------------------------------------------------------------------------\n" + " class Months extends Years{\n" + "   public int getMonth(){\n" + "\tint month;\n" + "\tString enteredMonthNumber;\n" + "\tScanner sc = new Scanner(System.in);\n" + "\tSystem.out.println(\"Enter the month number :\");\n" + "\tenteredMonthNumber = sc.next();\n" + "\tmonth = Integer.parseInt(enteredMonthNumber);\n" + "\treturn month;\n" + "   }\n" + " }\n" + "//------------------------------------------------------------------------------------------------------------------------------------\n" + "class DaysPerMonth extends Months{\n" + " static int numDays = 0;\n" + " public static void main(String[] args) {\n" + "   int year;\n" + "   Months m = new Months();\n" + "   int month = m.getMonth();\n" + "\n" + "   if((month < 1) || (month > 12)){\n" + "     System.out.println(\"Kindly enter a number between 0 to 13.\");\n" + "   }\n" + "   else {\n" + "    switch (month) {\n" + "      case 1:\n" + "      case 3:\n" + "      case 5:\n" + "      case 7:\n" + "      case 8:\n" + "      case 10:\n" + "      case 12:\n" + "        numDays = 31;\n" + "        System.out.println(\"Month \" + month + \" consists of \" + numDays + \" days.\");\n" + "        break;\n" + "      case 4:\n" + "      case 6:\n" + "      case 9:\n" + "      case 11:\n" + "       numDays = 30;\n" + "       System.out.println(\"Month \" + month + \" consists of \" + numDays + \" days.\");\n" + "       break;\n" + "      case 2:\n" + "       year = m.getYear();\n" + "       if(year < 1) {\n" + "        System.out.println(\"Kindly enter a valid year.\");\n" + "       }\n" + "       else{\n" + "        if(((year % 4 == 0) &&  !(year % 100 == 0)) || (year % 400 == 0)){\n" + "         numDays = 29;\n" + "\t\t if(year > 2020){\n" + "\t\t  System.out.println(\"In year \" + year + \" month \" + month + \" will consist of \" + numDays + \" days.\");\n" + "         }\n" + "         else{\n" + "          System.out.println(\"In year \" + year + \" month \" + month + \" has consisted of \" + numDays + \" days.\");\n" + "         }\n" + "        }//if at line 61\n" + "        else{\n" + "         numDays = 28;\n" + "         if (year > 2020){\n" + "          System.out.println(\"In year \" + year + \" month \" + month + \" will consist of \" + numDays + \" days.\");\n" + "         }\n" + "         else{\n" + "          System.out.println(\"In year \" + year + \" month \" + month + \" has consisted of \" + numDays + \" days.\");\n" + "         }\n" + "         break;\n" + "        }//else at line 70\n" + "       }//else at line 60\n" + "    }//switch at line 37\n" + "   }//else at line 36\n" + "  }//method\n" + " }//class\n" + "\n");
//       
//        System.out.println(couplingObj.getMethodList().size());
//        System.out.println(couplingObj.getMethodSetFull().size());
//        System.out.println(couplingObj.getCalledMethodList().size());
//        System.out.println(couplingObj.getGlobalVariableSet().size());
//        System.out.println(couplingObj.getGlobalVariableListInRec().size());
//        System.out.println(couplingObj.getRegularMethods().size());
//        System.out.println(couplingObj.getRecursiveMethods().size());
//        System.out.println(couplingObj.getRegularInRegularMethods().size());
//        System.out.println(couplingObj.getRecursiveInRegularMethods().size());
//        System.out.println(couplingObj.getRecursiveInRecursiveMethods().size());
//        System.out.println(couplingObj.getRegularInRecursiveMethods().size());
//    }

    public static Coupling analyzeCode(String content) {
        
        CustomFile file = new CustomFile("");
        file.setFilePath("");
//        FileRead fileRead = new FileRead(file.getFileName());
        
        FileReadService fileReadService = new FileReadServiceImp();
           
//        fileReadService.openFile(fileRead, file);
//        fileReadService.readFile(fileRead, file);
        fileReadService.readContent(content, file);
        
        CouplingService couplingService = new CouplingServiceImp();
        couplingService.process1(file);
//        fileReadService.closeFile(fileRead);
        return file.getCoupling();
        
//        System.out.println(file.getCoupling().getMethodList().size());
//        System.out.println(file.getCoupling().getMethodSetFull().size());
//        System.out.println(file.getCoupling().getCalledMethodList().size());
//        System.out.println(file.getCoupling().getGlobalVariableSet().size());
//        System.out.println(file.getCoupling().getGlobalVariableListInRec().size());
//        System.out.println(file.getCoupling().getRegularMethods().size());
//        System.out.println(file.getCoupling().getRecursiveMethods().size());
//        System.out.println(file.getCoupling().getRegularInRegularMethods().size());
//        System.out.println(file.getCoupling().getRecursiveInRegularMethods().size());
//        System.out.println(file.getCoupling().getRecursiveInRecursiveMethods().size());
//        System.out.println(file.getCoupling().getRegularInRecursiveMethods().size());
        
        
        
        
//        ArrayList filelist = new ArrayList<CustomFile>();
//        filelist.add(file);
//        couplingService.process2(filelist);



//            ArrayList<CustomFile> fileList = new ArrayList<CustomFile>();
//            fileList.add(new CustomFile("method.java"));
//            fileList.add(new CustomFile("test.cpp"));
//            
//            CouplingService couplingService = new CouplingServiceImp();
//            
//            for (CustomFile file : fileList) {
//                file.setFilePath("");
//                
//                FileRead fileRead = new FileRead(file.getFileName());
//                FileReadService fileReadService = new FileReadServiceImp();
//
//                fileReadService.openFile(fileRead, file);
//                fileReadService.readFile(fileRead, file);
//
//                couplingService.process1(file);
//                fileReadService.closeFile(fileRead);
//            }
//            
//            if (fileList.size() > 1) {
//                couplingService.process2(fileList);
//            }
    }
}
