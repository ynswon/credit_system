package com.funda.util;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.format.annotation.DateTimeFormat;

public class loanUpload
{
	 public static void main(String[] args){
		 
		 try {
			 //button12_Click();
             loanUpload test = new loanUpload();


                test.readExcelSales2("");
              //test.readExcelSales("");
//             test.readExcel("");

		} catch (SQLException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ParseException e) {
             e.printStackTrace();
         }
     }

    private static String url = "jdbc:mysql://14.63.216.102:3306/model1?useUnicode=true&useUnicode=true&characterEncoding=UTF-8";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "model1_test";
    private static String password = "1!9b2f@87$aa*c";
    private static Connection con;
    private static final Logger logger = LoggerFactory.getLogger(loanUpload.class);


    public static Connection getConnection() {
        try {
            logger.info("Connection-..................");
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("디비연결에 실패!");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return (Connection)con;
    }



    public void readExcelSales2(String excel) throws IOException, SQLException, ParseException {

        Connection con = getConnection();

        File file = new File("C:\\Users\\wonjun-pc\\Downloads\\신용평점사유코드_최종.xlsx");
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new IOException(excel);
        }
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));


                XSSFExcelExtractor extractor = new XSSFExcelExtractor(wb);
                extractor.setFormulasNotResults(true);
                extractor.setIncludeSheetNames(false);
                //은행,보험	협동조합/새마을금고 	증권	카드	캐피탈	저축은행	대부업

                //  System.out.println( extractor.getText() );
        /*{"인덱스","상점명"	,
                "은행,보험",	"협동조합/새마을금고",
                "증권","카드","캐피탈","저축은행","대부업체"      };*/
                String[] labes =   {"1a",	"1b"	,"1c"	,"1d",	"1e","1f"
       ,"1g","1h",	"1i"	,"2a",	"2b"	,"2c"	,"2d"
        ,"2e"	,"2f",	"2g"	,"2h",	"2i",	"2j"	,"2k",	"2l",	"2m",	"3a",	"3b",	"3c"};

        //String ref = tempFileName.replace(".xlsx", "").replace("_credit","");
                // int ref_idx = Integer.parseInt(ref);
                // Getting cell contents
                for( int i=0; i<wb.getNumberOfSheets(); i++) {
                    if(i==0)
                        for( Row row : wb.getSheetAt(i) ) {

                            if (row.getRowNum() >=7 ) {

                                String[] rows = new String[50];
                                Date[] rows_date = new Date[50];
                                DecimalFormat df = new DecimalFormat();

                                for (Cell cell : row) {
                                    // Cell Reference
                                    CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                                    System.out.print(cellRef.formatAsString());
                                    System.out.print(" - " + cell.getColumnIndex());

                                    switch (cell.getCellType()) {
                                        case Cell.CELL_TYPE_STRING:
                                            rows[cell.getColumnIndex()] = cell.getRichStringCellValue().getString();
                                            System.out.println(cell.getRichStringCellValue().getString());
                                            break;

                                        case Cell.CELL_TYPE_NUMERIC:
                                            if (DateUtil.isCellDateFormatted(cell)) {

                                                rows[cell.getColumnIndex()] = String.valueOf(cell.getDateCellValue());
                                                rows_date[cell.getColumnIndex()] =cell.getDateCellValue();

                                            } else {

                                                double ddata = cell.getNumericCellValue();
                                                rows[cell.getColumnIndex()] = df.format(ddata).replaceAll("\\,","");
                                                //rows[cell.getColumnIndex()] = String.valueOf( ddata);
                                                System.out.println(df.format(ddata));
                                            }
                                            break;

                                        default:
                                            System.out.println();
                                    }

                                }


                                for (int k = 2; k < labes.length; k++) {
                                    try {
                                        if (rows[k] != null) {
                                            System.out.println(rows[0]);
                                            String sql2 = "insert into model1.application_data (ref_idx, type_prefix, type, type_idx, value, date) values(?, ?, ?, ?, ?, ?) ";
                                            PreparedStatement pstmt2 = con.prepareStatement(sql2);

                                            pstmt2.setString(1, rows[0]);
                                            pstmt2.setString(2, "USER_INPUT");
                                            pstmt2.setString(3, labes[k]);
                                            pstmt2.setString(4, "1");
                                            pstmt2.setString(5, rows[k]);
                                            pstmt2.setDate(6,new java.sql.Date(new Date().getTime()));
                                            pstmt2.executeUpdate();
                                        }

                                    } catch (RuntimeException eeee) {
                                        eeee.printStackTrace();
                                    }
                                }
                            }
                        }
        }

    }

    public void readExcelSales (String excel) throws IOException, SQLException, ParseException {

        Connection con = getConnection();

        String path="C:\\Users\\wonjun-pc\\Downloads\\신용보고서_credit2";
        File dirFile=new File(path);
        File []fileList=dirFile.listFiles();
        for(File tempFile : fileList) {
            if(tempFile.isFile()) {
                String tempPath=tempFile.getParent();
                String tempFileName=tempFile.getName();
                System.out.println("Path="+tempPath);
                System.out.println("FileName="+tempFileName);

                XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(tempFile));
                XSSFExcelExtractor extractor = new XSSFExcelExtractor(wb);
                extractor.setFormulasNotResults(true);
                extractor.setIncludeSheetNames(false);
                //  System.out.println( extractor.getText() );
                String[] labes ={"월","credit rate"	,"credit score",
                        "부채총액", "신용_은행,보험",	"신용_협동조합/새마을금고",
                        "신용_증권","신용_장기카드론","신용_캐피탈","신용_저축은행","신용_대부업체"
                        ,"현금서비스",	"담보_은행,보험", "담보_협동조합/새마을금고",
                        "담보_증권","담보_장기카드론","담보_캐피탈","담보_저축은행","담보_대부업체"};

                String ref = tempFileName.replace(".xlsx", "").replace("_credit","");
                // int ref_idx = Integer.parseInt(ref);
                // Getting cell contents
                for( int i=0; i<wb.getNumberOfSheets(); i++) {
                    if(i==0)
                        for( Row row : wb.getSheetAt(i) ) {

                            if (row.getRowNum() >=1 ) {

                                String[] rows = new String[50];
                                Date[] rows_date = new Date[50];
                                DecimalFormat df = new DecimalFormat();

                                for (Cell cell : row) {
                                    // Cell Reference
                                    CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                                    System.out.print(cellRef.formatAsString());
                                    System.out.print(" - " + cell.getColumnIndex());

                                    switch (cell.getCellType()) {
                                        case Cell.CELL_TYPE_STRING:
                                            rows[cell.getColumnIndex()] = cell.getRichStringCellValue().getString();
                                            System.out.println(cell.getRichStringCellValue().getString());
                                            break;

                                        case Cell.CELL_TYPE_NUMERIC:
                                            if (DateUtil.isCellDateFormatted(cell)) {

                                                rows[cell.getColumnIndex()] = String.valueOf(cell.getDateCellValue());
                                                rows_date[cell.getColumnIndex()] =cell.getDateCellValue();

                                            } else {

                                                double ddata = cell.getNumericCellValue();
                                                rows[cell.getColumnIndex()] = df.format(ddata).replaceAll("\\,","");
                                                //rows[cell.getColumnIndex()] = String.valueOf( ddata);
                                                System.out.println(df.format(ddata));
                                            }
                                            break;

                                        default:
                                            System.out.println();
                                    }

                                }


                                for (int k = 0; k < labes.length; k++) {
                                    try {
                                        if (rows[k] != null) {
                                            String sql2 = "insert into model1.application_data_series (ref_idx, seg_idx, series_idx, value, date, seg_name, series_name) values(?, ?, ?, ?, ?, ?,?) ";

                                            PreparedStatement pstmt2 = con.prepareStatement(sql2);
                                            pstmt2.setString(1, ref);
                                            pstmt2.setString(2, labes[k]);
                                            pstmt2.setString(3, String.valueOf(row.getRowNum()));
                                            pstmt2.setString(4, rows[k]);
                                            pstmt2.setDate(5,   new java.sql.Date(new Date().getTime()));
                                            pstmt2.setString(6, labes[k]);
                                            pstmt2.setString(7, rows[0]);

                                            pstmt2.executeUpdate();
                                        }

                                    } catch (RuntimeException eeee) {
                                        eeee.printStackTrace();
                                    }
                                }
                            }
                        }
                }
            }
        }

    }

    public void readExcel (String excel) throws IOException, SQLException, ParseException {

        Connection con = getConnection();

        File file = new File("C:\\funda_loan_data.xlsx");
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new IOException(excel);
        }
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));

        XSSFExcelExtractor extractor = new XSSFExcelExtractor(wb);
        extractor.setFormulasNotResults(true);
        extractor.setIncludeSheetNames(false);
      //  System.out.println( extractor.getText() );
        String[] labes ={"NO","승인여부","신청일자","매장주소","상점명","연락처(핸드폰번호)","자금용도","사업자등록번호","대출승인일자","대출승인오류","CB등급(N)"
                     ,"CB등급(K)","이름","나이","YMD_V", "성별","대출가능한도","대출금액","기간","연 이자율","대출구분","상환금액"
                ,"상환방식","연체시작일자","연체해제일자","부도발생일자" ,"영업매출","수익률","업력","운영시간","임대료","평수"
                ,"좌석 수","인건비","정직원","파트타임직원","총 직원 수","재료비(%)","법인번호","업종분류","업종세분류"};

        // Getting cell contents
        for( int i=0; i<wb.getNumberOfSheets(); i++) {
            if(i==1)
            for( Row row : wb.getSheetAt(i) ) {

                if (row.getRowNum() >1 ) {
                    String[] rows = new String[50];
                    Date[] rows_date = new Date[50];
                    DecimalFormat df = new DecimalFormat();

                    for (Cell cell : row) {
                        // Cell Reference
                        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                        System.out.print(cellRef.formatAsString());
                        System.out.print(" - " + cell.getColumnIndex());

                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_STRING:
                                rows[cell.getColumnIndex()] = cell.getRichStringCellValue().getString();
                                System.out.println(cell.getRichStringCellValue().getString());
                                break;

                            case Cell.CELL_TYPE_NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {

                                    if(cell.getColumnIndex() == 13 ) {

                                        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        String begin   = transFormat.format(cell.getDateCellValue());
                                        String end     = transFormat.format(new Date());

                                        Date beginDate = transFormat.parse(begin);
                                        Date endDate   = transFormat.parse(end);

                                        long diff = endDate.getTime() - beginDate.getTime();
                                        long diffDays = diff / (24 * 60 * 60 * 1000)/365;

                                        rows[cell.getColumnIndex()] = String.valueOf(diffDays);
                                    }
                                    else
                                    {
                                        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        String to = transFormat.format(cell.getDateCellValue());
                                        rows[cell.getColumnIndex()] = to;
                                    }

                                    //rows[cell.getColumnIndex()] = String.valueOf(cell.getDateCellValue());
                                    rows_date[cell.getColumnIndex()] =cell.getDateCellValue();

                                } else {

                                    double ddata = cell.getNumericCellValue();
                                    rows[cell.getColumnIndex()] = df.format(ddata).replaceAll("\\,","");
                                    //rows[cell.getColumnIndex()] = String.valueOf( ddata);
                                    System.out.println(df.format(ddata));
                                }
                                break;

                            default:
                                System.out.println();
                        }

                    }

                if(rows_date[2]==null) {
                    try {
                        String sql2 = "insert into model1.application (idx, store_name, amount, phone, store_idx, datetime, debtcode, user_note) values(?, ?, ?, ?, ?, ?, ?, ?) ";
                        PreparedStatement pstmt2 = con.prepareStatement(sql2);

                        // System.out.println("디비 APP " + rows[0]  + " : " + rows[4]   + " : " + rows[17] + " : " + rows[5] + " : " + rows_date[2] + " : " + rows[1]);

                        pstmt2.setString(1, rows[0]);
                        pstmt2.setString(2, rows[4]);
                        pstmt2.setString(3, (rows[17] == null ? "0" : rows[17]));
                        pstmt2.setString(4, rows[5] == null ? "0000000000" : rows[5]);
                        pstmt2.setString(5, rows[0]);
                        pstmt2.setDate(6, new java.sql.Date((rows_date[2] == null ? new Date().getTime() : rows_date[2].getTime())));
                        pstmt2.setString(7, "심사대기");
                        pstmt2.setString(8, rows[1]);
                        pstmt2.executeUpdate();

                    } catch (RuntimeException eeee) {
                        eeee.printStackTrace();
                    }
                }
                    for (int k = 3; k <= 40; k++) {
                        //3,6,7,8,9,10,11,12,13,15,16,17,18,19,20~40

                        try {
                            if (rows[k] != null) {
                                String sql2 = "insert into model1.application_data (ref_idx, type_prefix, type, type_idx, value, date) values(?, ?, ?, ?, ?, ?) ";
                                PreparedStatement pstmt2 = con.prepareStatement(sql2);

                             //   System.out.println("DB APP_DATA : " + rows[k]);

/*                                SimpleDateFormat transFormat =  new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");

                                Date parsed = transFormat.parse(rows[2]);
                                java.sql.Date sql = new java.sql.Date(parsed.getTime());
*/
                                pstmt2.setString(1, rows[0]);
                                pstmt2.setString(2, "USER_INPUT");
                                pstmt2.setString(3, labes[k]);
                                pstmt2.setString(4, "1");
                                pstmt2.setString(5, rows[k]);
                                pstmt2.setDate(6,new java.sql.Date(rows_date[2].getTime()));
                                pstmt2.executeUpdate();
                            }

                        } catch (RuntimeException eeee) {
                            eeee.printStackTrace();
                        }
                    }
                }
            }
        }

    }



}