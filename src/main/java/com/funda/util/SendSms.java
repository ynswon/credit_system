package com.funda.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class SendSms {	
    
	public static void main(String[] args) throws Exception {
		apiSendSms("01037577516", "14.32.55.87", "���� ����");
	}

    public static void apiSendSms(String to, String ipAdrress, String sms_contents) throws Exception{
        
		String url;
		String from = "025520360";
		String ref = "VER2";

        URLConnection urlConnection = null;
        URL urls = null;

		String encodedref            = URLEncoder.encode(ref, "UTF-8");
		String encodedsms_contents   = URLEncoder.encode(sms_contents, "UTF-8");
		String encodedsms_title      = URLEncoder.encode("[FUNDA]펀다˸[심사결과안내]", "UTF-8");
		
		if(sms_contents.length() <= 40)
		{
			url = "http://rest.ibizplus.co.kr:6001/sms/xml.php?"
				+ "id=funda"
				+ "&pwd=DMS55AYF44110HETSW07"
				+ "&from="+from+""
				+ "&to_country=82"
				+ "&to="+to+""
				+ "&message="+encodedsms_contents+""
				+ "&ref="+encodedref+""
				+ "&report_req=1";
		}
		else
		{
			url = "http://rest.ibizplus.co.kr:6001/sms/xml.php?"
				+ "id=funda"
				+ "&pwd=DMS55AYF44110HETSW07"
				+ "&from="+from+""
				+ "&to_country=82"
				+ "&to="+to+""
				+ "&title="+encodedsms_title+""
				+ "&message="+encodedsms_contents+""
				+ "&ref="+encodedref+""
				+ "&report_req=1";
		}

	//	XMLParsing(from, to, ref, ipAdrress, sms_contents, url);

        BufferedReader in = null;

        try {
            URL obj = new URL(url); // 호출할 url

            System.out.println(url);
            HttpURLConnection con = (HttpURLConnection)obj.openConnection();

            con.setRequestMethod("GET");

            in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

            String line;
            while((line = in.readLine()) != null) { // response를 차례대로 출력
                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null) try { in.close(); } catch(Exception e) { e.printStackTrace(); }
        }
    }


    
    public static void XMLParsing(String from, String to, String ref, String ipAdrress, String sms_contents, String url) throws Exception
    {
        
        URL parseurl = new URL(url);
        URLConnection connection = parseurl.openConnection();

        Document doc = XMLParser((InputStream) connection.getInputStream());
        NodeList msgidNodes = doc.getElementsByTagName("msgid");
        NodeList err_code = doc.getElementsByTagName("err_code");
        NodeList msg_type = doc.getElementsByTagName("msg_type");

        for(int i=0; i<msgidNodes.getLength();i++)
        {
        	putReportData(msgidNodes.item(i).getTextContent(), from, to, err_code.item(i).getTextContent(), ref, msg_type.item(i).getTextContent(), ipAdrress, sms_contents);
        }
        
    }
    
    
    private static Document XMLParser(InputStream inputStream) throws Exception
    {
        
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
        try
        {
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

            doc = objDocumentBuilder.parse(inputStream);
        }
        catch(Exception ex)
        {
            throw ex;
        }       
        
        return doc;
    }
    
    
    public final static boolean putReportData(String msg_id, String from, String to, String err_code, String ref, String msg_type, String ipAdrress, String contents) throws SQLException
	{
    	Connection con = Model3Conn.getConnection();

    	String sql = "insert into model3.sms "
    				+ "(msg, res_from, res_to, res_errcode, res_msgtype, res_ref, res_date, res_ip, contents) "
    				+ "values (?,?,?,?,?,?,now(),?,?) "
    				+ "ON DUPLICATE KEY UPDATE  "
    				+ "res_from=?, res_to=?, res_errcode=?, res_msgtype=?, res_ref=?, res_date=now(), res_ip=?, contents=?";
		PreparedStatement pstmt = con.prepareStatement(sql); 

		pstmt.setString(1, msg_id);
		pstmt.setString(2, from);
		pstmt.setString(3, to);
		pstmt.setString(4, err_code);
		pstmt.setString(5, msg_type);
		pstmt.setString(6, ref);
		pstmt.setString(7, ipAdrress); 
		pstmt.setString(8, contents); 

		pstmt.setString(9, from);
		pstmt.setString(10, to);
		pstmt.setString(11, err_code);
		pstmt.setString(12, msg_type);
		pstmt.setString(13, ref);
		pstmt.setString(14, ipAdrress); 
		pstmt.setString(15, contents); 
		
		try
		{
			pstmt.executeUpdate();
		}
		catch (RuntimeException eeee)
		{
		}
    	
		return false;
	}
    
}
