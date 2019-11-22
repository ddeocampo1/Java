//Author: Dennis DeOcampo
//email: dennis@ourITSource.com
//Name: HTMLTableGenerator
//Creation Date: 11/18/2019 
//Last Revision: 11/21/2019
//Summary: This form generates the PHP Code to query a MySQL database table and generates the PHP Code to display the results in a table, based on the information provided on the form.

package htmltablegenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.*;

/**
 *
 * @author dvdeo
 */
public class HTMLTableGeneratorMainController implements Initializable {
    
     
    @FXML private TextField txt1;
    @FXML private TextField txt2;
    @FXML private TextField txt3;
    @FXML private TextField txt4;
    @FXML private TextField txt5;
    @FXML private TextField txt6;
    @FXML private TextField txt7;
    @FXML private TextField txt8;
    @FXML private TextField txt9;
    @FXML private TextField txt10;
    @FXML private TextField txt11;
    @FXML private TextField txt12;
    @FXML private TextField txt13;
    @FXML private TextField txt14;
    @FXML private TextField txt15;
    @FXML private TextField txt16;
    @FXML private TextField txt17;
    @FXML private TextField txt18;
    @FXML private TextField txt19;
    @FXML private TextField txt20;
    @FXML private TextArea txtArea1;
    @FXML private TextField txtDbTable;
           
    @FXML private TextField txtCSSTable;
    @FXML private TextField txtCSSColumn;
    @FXML private TextField txtCSSRow;
    @FXML private TextField txtTableWidth;
    @FXML private TextField txtCellSpacing;
    @FXML private TextField txtCellPadding;
    @FXML private TextField txtTableBorder;
    @FXML private TextField txtCSSTitle;
    
    @FXML private TextField txtCol1;
    @FXML private TextField txtCol2;
    @FXML private TextField txtCol3;
    @FXML private TextField txtCol4;
    @FXML private TextField txtCol5;
    @FXML private TextField txtCol6;
    @FXML private TextField txtCol7;
    @FXML private TextField txtCol8;
    @FXML private TextField txtCol9;
    @FXML private TextField txtCol10;
    @FXML private TextField txtCol11;
    @FXML private TextField txtCol12;
    @FXML private TextField txtCol13;
    @FXML private TextField txtCol14;
    @FXML private TextField txtCol15;
    @FXML private TextField txtCol16;
    @FXML private TextField txtCol17;
    @FXML private TextField txtCol18;    
    @FXML private TextField txtCol19;
    @FXML private TextField txtCol20;

    
 
    @FXML
       
       String strAll="";
       String strToDisplay="";
       String fileUNC = "temp.txt";
       File file = new File(fileUNC);

                
      
    @FXML
    private void handleCreateCode(ActionEvent event) throws IOException {
          
        if (file.delete()) { System.out.print(file + " was deleted."); } 
 
       //Code to create SQL String to be used in extracting data from DB Table  

      createStrSQL(fileUNC,"\n\n// COPY AND PASTE THE FOLLOWING SQL STRING TO ADD IN PHP SECTION OF YOUR WEBPAGE \n\n");
      createStrSQL(fileUNC,"// SQL Query String...\n"); 
      createStrSQL(fileUNC,"$strSQL=\"SELECT ");
      
      if (!txt1.getText().isEmpty()) { createStrSQL(fileUNC, txt1.getText()); }
      if (!txt2.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt2.getText()); }
      if (!txt3.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt3.getText()); }
      if (!txt4.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt4.getText()); }
      if (!txt5.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt5.getText()); }
      if (!txt6.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt6.getText()); }
      if (!txt7.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt7.getText()); }
      if (!txt8.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt8.getText()); }
      if (!txt9.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt9.getText()); }
      if (!txt10.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt10.getText()); }
      if (!txt11.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt11.getText()); }
      if (!txt12.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt12.getText()); }
      if (!txt13.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt13.getText()); }
      if (!txt14.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt14.getText()); }
      if (!txt15.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt15.getText()); }
      if (!txt16.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt16.getText()); }
      if (!txt17.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt17.getText()); }
      if (!txt18.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt18.getText()); }
      if (!txt19.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt19.getText()); }
      if (!txt20.getText().isEmpty()) { createStrSQL(fileUNC,", " + txt20.getText()); }
      createStrSQL(fileUNC," FROM " + txtDbTable.getText() + "; \";\n\n");
      
         
      //Code to create HTML Table to display the data
      if (!txtCSSTable.getText().isEmpty()) { txtCSSTable.setText("font-family:Arial; font-size:12px;"); };
      if (!txtCSSColumn.getText().isEmpty()) { txtCSSTable.setText("font-family:Arial; font-size:12px;"); };
      if (!txtCSSRow.getText().isEmpty()) { txtCSSTable.setText("font-family:Arial; font-size:12px;"); };
         
      //Configure Table Columns 
      strAll="\n// COPY AND PASTE THE FOLLOWING PHP CODE TO TO ADD A TABLE TITLE BAR \n\nprint \"<TABLE STYLE='" + txtCSSTable.getText() + "' " + "WIDTH='" + txtTableWidth.getText() + "' CELLPADDING='"+ txtCellPadding.getText() + "' CELLSPACING='" + txtCellSpacing.getText() + "' BORDER='" + txtTableBorder.getText() +  "'>\";"; addInfo(fileUNC,strAll);
      //set columns for TITLE ROW 
      strAll="\nprint \"<TR> \";"; addInfo(fileUNC,strAll);
                  
      if (!txtCol1.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol1.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol2.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol2.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol3.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol3.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol4.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol4.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol5.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol5.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol6.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol6.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol7.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol7.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol8.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol8.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol9.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol9.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol10.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol10.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol11.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol11.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol12.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol12.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol13.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol13.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol14.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol14.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol15.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol15.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol16.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol16.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol17.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol17.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol18.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol18.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol19.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol19.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txtCol20.getText().isEmpty()) { strAll = "\nprint \"<TD STYLE='" + txtCSSTitle.getText() + "'> " + txtCol20.getText() + " </TD>\";"; addInfo(fileUNC,strAll); }
      strAll="\nprint \"</TR> \";"; addInfo(fileUNC,strAll);
         
                
      createStrSQL(fileUNC,"\n\n// COPY AND PASTE THE FOLLOWING PHP CODE TO EXTRACT DATA FROM SQL TABLE AND DISPLAY AS A TABLE ROW \n\n");
     
       //PHP Code to query table and extract DB Data
      strAll="$result = mysql_query($strSQL);\n"
              + "$rowresult = mysql_numrows($result);\n"
              + "for ($i=0; $i<$rowresult; $i++)\n"
              + "{\n"
              + "     $column++;\n";
      createStrSQL(fileUNC,strAll);
      if (!txt1.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias1 = mysql_result($result,$i,\"" + txt1.getText() + "\");\n"); }
      if (!txt2.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias2 = mysql_result($result,$i,\"" + txt2.getText() + "\");\n"); }
      if (!txt3.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias3 = mysql_result($result,$i,\"" + txt3.getText() + "\");\n"); }
      if (!txt4.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias4 = mysql_result($result,$i,\"" + txt4.getText() + "\");\n"); }
      if (!txt5.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias5 = mysql_result($result,$i,\"" + txt5.getText() + "\");\n"); }
      if (!txt6.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias6 = mysql_result($result,$i,\"" + txt6.getText() + "\");\n"); }
      if (!txt7.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias7 = mysql_result($result,$i,\"" + txt7.getText() + "\");\n"); }
      if (!txt8.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias8 = mysql_result($result,$i,\"" + txt8.getText() + "\");\n"); }
      if (!txt9.getText().isEmpty()) { createStrSQL(fileUNC,"     $dbAlias9 = mysql_result($result,$i,\"" + txt9.getText() + "\");\n"); }
      if (!txt10.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias10 = mysql_result($result,$i,\"" + txt10.getText() + "\");\n"); }
      if (!txt11.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias11 = mysql_result($result,$i,\"" + txt11.getText() + "\");\n"); }
      if (!txt12.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias12 = mysql_result($result,$i,\"" + txt12.getText() + "\");\n"); }
      if (!txt13.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias13 = mysql_result($result,$i,\"" + txt13.getText() + "\");\n"); }
      if (!txt14.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias14 = mysql_result($result,$i,\"" + txt14.getText() + "\");\n"); }
      if (!txt15.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias15 = mysql_result($result,$i,\"" + txt15.getText() + "\");\n"); }
      if (!txt16.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias16 = mysql_result($result,$i,\"" + txt16.getText() + "\");\n"); }
      if (!txt17.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias17 = mysql_result($result,$i,\"" + txt17.getText() + "\");\n"); }
      if (!txt18.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias18 = mysql_result($result,$i,\"" + txt18.getText() + "\");\n"); }
      if (!txt19.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias19 = mysql_result($result,$i,\"" + txt19.getText() + "\");\n"); }
      if (!txt20.getText().isEmpty()) { createStrSQL(fileUNC,"    $dbAlias20 = mysql_result($result,$i,\"" + txt20.getText() + "\");\n"); }
      
      // Get DB Records
      strAll="     print \"<TR STYLE='" + txtCSSRow.getText() + "'>\";"; addInfo(fileUNC,strAll);
      if (!txt1.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias1 </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt2.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias2 </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt3.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias3 </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt4.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias4 </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt5.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias5 </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt6.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias6  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt7.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias7  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt8.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias8  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt9.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias9  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt10.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias10  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt11.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias11  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt12.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias12  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt13.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias13  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt14.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias14  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt15.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias15  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt16.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias16  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt17.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias17  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt18.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias18  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt19.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias19  </TD>\";"; addInfo(fileUNC,strAll); }
      if (!txt20.getText().isEmpty()) { strAll = "\n     print \"<TD STYLE='" + txtCSSColumn.getText() + "'> $dbAlias20  </TD>\";"; addInfo(fileUNC,strAll); }
        strAll="\n     print \"</TR>\";"; addInfo(fileUNC,strAll);
      //
            
      createStrSQL(fileUNC,"\n}\n");
      createStrSQL(fileUNC,"\n\n// COPY AND PASTE THE FOLLOWING PHP CODE TO CLOSE TABLE \n\n");

      strAll="\nprint \"</TABLE>\";\n\n"; addInfo(fileUNC,strAll);
              
        try {
            readInfo();
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
    
    
   
    private static String addInfo(String addToFile, String infoAddToAdd) throws IOException
    {
     //create BufferedWriter object
        BufferedWriter bWriter = new BufferedWriter (new FileWriter(addToFile, true));
        try {
            //bWriter.newLine();
            bWriter.write(infoAddToAdd);
            bWriter.close(); 
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
        
        return ("SuccessFul");
    }

    public String readInfo() throws Exception {
       try {
           //location of physical file to read
         
            //create file object
            File file = new File(fileUNC);
        
            //create BufferedReader object
            BufferedReader reader = new BufferedReader(new FileReader(file));
        
            //string to information read on each line of file
            String line;
            //read each line of file
            while ((line = reader.readLine()) != null)
            {
             strToDisplay = strToDisplay + line + "\n";
            }
            txtArea1.setText(strToDisplay);
       }
            catch (Exception e) {
            //if JSON error detected, display errors
            e.printStackTrace();
            }
       strAll="";
       return "Finish reading File";
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private static String createStrSQL(String addToFile, String infoToAdd) throws IOException
    {
        
       //create BufferedWriter object
        BufferedWriter bWriter = new BufferedWriter (new FileWriter(addToFile, true));
        
        try {
        //bWriter.newLine();
        bWriter.write(infoToAdd);
        bWriter.close(); 
        }
        catch (Exception e)
        {
        System.out.print(e);
        }
        
        return ("SuccessFul");
    }
    
    
    
}
