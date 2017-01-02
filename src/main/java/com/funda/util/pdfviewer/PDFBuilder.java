package com.funda.util.pdfviewer;

/**
 * Created by wonjun-pc on 2016-07-03.
 */

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funda.mybatis.model.*;
import com.funda.mybatis.service.ApplicationDAOService;
import com.funda.mybatis.service.ApplicationDataDAOService;
import com.funda.mybatis.service.ApplicationDataSeriesDAOService;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This view class generates a PDF document 'on the fly' based on the data
 * contained in the model.
 * @author www.codejava.net
 *
 */
public class PDFBuilder extends AbstractITextPdfView {

    @Autowired
    ApplicationDataSeriesDAOService applicationDataSeriesDAOService;

    @Autowired
    ApplicationDAOService applicationDAOService;

    @Autowired
    ApplicationDataDAOService applicationDataDAOService;


    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document doc,
                                    PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // get data model which is passed by the Spring container


        String fontFace = "HYGoThic-Medium";
        String fontName = "UniKS-UCS2-H";
        BaseFont bf = BaseFont.createFont(fontFace, fontName, BaseFont.NOT_EMBEDDED);
        Font font = new Font( bf, 10);
        //BaseFont bf = BaseFont.createFont("HTGoThic-Medium", "UniKS-H", BaseFont.NOT_EMBEDDED);

        Font fontBig = new Font( bf, 20);
        fontBig.setColor(BaseColor.WHITE);
        //celltitle.setBackgroundColor(GrayColor.GRAYBLACK);
        //celltitle.setHorizontalAlignment(Element.ALIGN_CENTER);
        doc.add(new Paragraph("KCB 신용 보고서 (단위: 천원) ",fontBig));

        // define font for table header row
        //Font font = FontFactory.getFont(FontFactory.HELVETICA);
        //font.setColor(BaseColor.WHITE);

        // define table header cell
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.GRAY);
        cell.setPadding(10);

        PdfPCell eachCell = new PdfPCell();


        List<application>        List                 = (List<application>)  model.get("appList");
        List<application_data>        dataList        = (List<application_data>)  model.get("dataList");
        List<application_data_series> seriesList      = (List<application_data_series>)  model.get("seriesList");
        List<application_data_series> seriesListCount = (List<application_data_series>)  model.get("seriesListCount");

        int index=0, loop=0;
        doc.add(new Paragraph((List.get(0).getApplicant_name()==null ? "" :List.get(0).getApplicant_name()) + "( 대체키 : " +   List.get(0).getReplacekey() + " )" + " 생년월일 : " + List.get(0).getApplicantBirthdate(),font));

        for(application_data_series data : seriesListCount)
        {

            PdfPTable table = new PdfPTable(data.getCount());
        //    System.out.println(data.getCount() + " test " + data.getSegCount());
            table.setWidthPercentage(100.0f);
//            table.setWidths(new float[] {3.0f, 2.0f, 2.0f, 2.0f, 1.0f});
            table.setSpacingBefore(10);

            Font fonttitle = new Font( bf, 13 );
            fonttitle.setColor(BaseColor.BLACK);
            PdfPCell celltitle ;
            if(data.getSegIdx().equals("025") || data.getSegIdx().equals("028"))
                celltitle = new PdfPCell(new Phrase(seriesList.get(index).getSeriesName().substring(5), fonttitle));
            else
                celltitle = new PdfPCell(new Phrase(data.getSegName(), fonttitle));

            celltitle.setBackgroundColor(BaseColor.WHITE);
            celltitle.setHorizontalAlignment(Element.ALIGN_CENTER);
            celltitle.setColspan(data.getCount());
            table.addCell(celltitle);

            table.setSpacingBefore(10);

            if(data.getSegIdx().equals("103"))
            {
                for(loop=index ; loop<index+data.getCount()* data.getSegCount(); loop+=2)
                {
                        cell.setPhrase(new Phrase(seriesList.get(loop).getSeriesName(), font));
                        cell.setBackgroundColor(BaseColor.WHITE);
                        table.addCell(cell);
                        table.addCell(new PdfPCell(new Phrase(seriesList.get(loop+1).getValue(), font)));

                }
            }
            else
            {
                for(loop=index ; loop<index+data.getCount()* data.getSegCount(); loop++)
                {
                    if(seriesList.get(loop).getSeriesIdx().equals("1")) {

                        if(data.getSegIdx().equals("025") || data.getSegIdx().equals("028"))
                            cell.setPhrase(new Phrase(seriesList.get(loop).getSeriesName().substring(0,5), font));
                        else
                            cell.setPhrase(new Phrase(seriesList.get(loop).getSeriesName(), font));

                        cell.setBackgroundColor(BaseColor.WHITE);
                        table.addCell(cell);
                        //table.addCell(seriesList.get(loop).getValue());

                        //table.addCell(series.getValue());
                    }/*
                else
                {
                    table.addCell(seriesList.get(loop).getValue());
                }*/
                }

                for(loop=index ; loop<index+data.getCount()* data.getSegCount(); loop++)
                {
                    //    System.out.println(new Phrase(seriesList.get(loop).getValue(), font));
                    eachCell.setPhrase(new Phrase(seriesList.get(loop).getValue(), font));

                    table.addCell(new PdfPCell(new Phrase(seriesList.get(loop).getValue(), font)));
                }
            }

            index += data.getCount() * data.getSegCount();
            doc.add(table);

        }



    }

}