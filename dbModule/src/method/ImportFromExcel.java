package method;

import beans.Plan;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**

 * Created by taylor on 11/9/15.
 */
public class ImportFromExcel {


    public List<Plan> excelToList(String filePath){
        List<Plan> list=new ArrayList<Plan>();
        int i=2;
        try {
            XSSFWorkbook xssfWorkbook =new XSSFWorkbook(filePath);
            XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(0);
            Iterator<Row> rowIterator=xssfSheet.rowIterator();
            rowIterator.next();
            while (rowIterator.hasNext()){
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();

                System.out.println("rows:"+i++);
                Plan plan=new Plan();
                plan.setOrgid(cellIterator.next().getStringCellValue());
                plan.setPln(cellIterator.next().getNumericCellValue());
                list.add(plan);
            }
        } catch (Exception e) {
            System.out.println("ERROR on row "+i);
            e.printStackTrace();
        }

        return list;
    }


    public String excelToSqlData(String filePath){
       String out="";
        StringBuffer stringBuffer=new StringBuffer();
        List<Plan> list=excelToList(filePath);

        for(int i=0;i<list.size();i++){
            Plan plan=list.get(i);
            if(i!=0){
                stringBuffer.append(",");
            }
            stringBuffer.append("('"+plan.getOrgid()+"',"+plan.getPln()+")");

        }
        out=stringBuffer.toString();
        return out;
    }

}
