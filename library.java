/*                                            
 * To change this license header, choose License Headers in Project Properties.                                           
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Vishwam
 */
public class library extends javax.swing.JFrame {

    Statement st123=null;
    Connection con=null;
    String userId;
    public library() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Vishup08");
            if(con == null) {
                System.out.println("Fail");
            }
            System.out.println("Connection established");
            st123=con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        MainPage.setVisible(true);
        CreatePage.setVisible(false);
        SelectionPage.setVisible(false);
        ReturnPage.setVisible(false);
        SelectionPage.setVisible(false);
        MenuPage.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        MainPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CreateB = new javax.swing.JButton();
        LoginB = new javax.swing.JButton();
        CreatePage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddressI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PwdI = new javax.swing.JPasswordField();
        CreateDoneButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        SelectionPage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BookB = new javax.swing.JButton();
        ReturnPage = new javax.swing.JPanel();
        BookReturnName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BookReturnID = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JButton();
        MenuPage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        IssueB = new javax.swing.JButton();
        ReturnB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to Vishwam's Library!!!");

        CreateB.setText("Create Account");
        CreateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBActionPerformed(evt);
            }
        });

        LoginB.setText("Login");
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPageLayout = new javax.swing.GroupLayout(MainPage);
        MainPage.setLayout(MainPageLayout);
        MainPageLayout.setHorizontalGroup(
            MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPageLayout.createSequentialGroup()
                .addGroup(MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPageLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(MainPageLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(LoginB))))
                    .addGroup(MainPageLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(CreateB)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        MainPageLayout.setVerticalGroup(
            MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPageLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(CreateB)
                .addGap(39, 39, 39)
                .addComponent(LoginB)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Creation");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Name:");

        NameI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Address:");

        AddressI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddressI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressIActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Password:");

        PwdI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        CreateDoneButton.setText("Done");
        CreateDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDoneButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("ID Type:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("ID No.:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreatePageLayout = new javax.swing.GroupLayout(CreatePage);
        CreatePage.setLayout(CreatePageLayout);
        CreatePageLayout.setHorizontalGroup(
            CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePageLayout.createSequentialGroup()
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreatePageLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2))
                    .addGroup(CreatePageLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(CreateDoneButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePageLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CreatePageLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(NameI))
                    .addGroup(CreatePageLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(AddressI))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PwdI, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreatePageLayout.createSequentialGroup()
                        .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))))
                .addGap(74, 74, 74))
        );
        CreatePageLayout.setVerticalGroup(
            CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddressI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PwdI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(CreateDoneButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "ID", "Available", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        BookB.setText("Book");
        BookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SelectionPageLayout = new javax.swing.GroupLayout(SelectionPage);
        SelectionPage.setLayout(SelectionPageLayout);
        SelectionPageLayout.setHorizontalGroup(
            SelectionPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPageLayout.createSequentialGroup()
                .addGroup(SelectionPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectionPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SelectionPageLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(BookB)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        SelectionPageLayout.setVerticalGroup(
            SelectionPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookB)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        BookReturnName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookReturnName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookReturnName.setText("jLabel6");
        BookReturnName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Book Return");

        BookReturnID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookReturnID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookReturnID.setText("jLabel6");
        BookReturnID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReturnPageLayout = new javax.swing.GroupLayout(ReturnPage);
        ReturnPage.setLayout(ReturnPageLayout);
        ReturnPageLayout.setHorizontalGroup(
            ReturnPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnPageLayout.createSequentialGroup()
                .addGroup(ReturnPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReturnPageLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel7))
                    .addGroup(ReturnPageLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(BookReturnID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReturnPageLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(ReturnButton))
                    .addGroup(ReturnPageLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BookReturnName, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ReturnPageLayout.setVerticalGroup(
            ReturnPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnPageLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addComponent(BookReturnName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BookReturnID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ReturnButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setText("Vishwam's Library");

        IssueB.setText("Issue");
        IssueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBActionPerformed(evt);
            }
        });

        ReturnB.setText("Return");
        ReturnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPageLayout = new javax.swing.GroupLayout(MenuPage);
        MenuPage.setLayout(MenuPageLayout);
        MenuPageLayout.setHorizontalGroup(
            MenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPageLayout.createSequentialGroup()
                .addGroup(MenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPageLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6))
                    .addGroup(MenuPageLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(IssueB))
                    .addGroup(MenuPageLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(ReturnB)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        MenuPageLayout.setVerticalGroup(
            MenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addComponent(IssueB)
                .addGap(45, 45, 45)
                .addComponent(ReturnB)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(MainPage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CreatePage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SelectionPage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ReturnPage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MenuPage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CreatePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SelectionPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ReturnPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CreatePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SelectionPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ReturnPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>                        

    private void CreateBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CreatePage.setVisible(true);
        MainPage.setVisible(false);
    }                                       

    private void CreateDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try{
            Statement st=con.createStatement();
            st.executeUpdate("insert into customer_acc1(sName,Pwd,Address) values('"+NameI.getText()+"','"+PwdI.getText()+"','"+AddressI.getText()+"');");
            ResultSet rs=st.executeQuery("select max(sid) from customer_acc1");
            String idst=null;
            while(rs.next())
                idst=Integer.toString(rs.getInt(1));
            JOptionPane.showMessageDialog(rootPane, "Your id is: "+idst);
        }catch(Exception e){
            System.out.println(e);
        }
        CreatePage.setVisible(false);
        MainPage.setVisible(true);
    }                                                

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String id1,pwd1;
        id1=JOptionPane.showInputDialog("Enter Your Id:");
        pwd1=JOptionPane.showInputDialog("Enter your password: ");
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from customer_acc1 where sID="+id1+";");
            String pwd2="";
            while(rs.next())
            {
                pwd2=rs.getString("pwd");
            }
            if(pwd2.equals(pwd1))
            {
                userId=id1;
                MenuPage.setVisible(true);
                MainPage.setVisible(false);
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane, "Wrong id/pwd");   
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Wrong id/pwd");   
        }
    }                                      
    public void refreshTable(){
    int ind=0;
    try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from books1;");
        while(rs.next())
        {
            jTable1.setValueAt(rs.getString("sname"), ind, 0);
            jTable1.setValueAt(Integer.toString(rs.getInt("sid")), ind, 1);
            jTable1.setValueAt(rs.getString("genre"), ind, 3);
            if(rs.getBoolean("Availibility"))
                jTable1.setValueAt("Yes", ind, 2);
            else
                jTable1.setValueAt("No", ind, 2);
            ind++;
        }
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
    private void BookBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try{
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String bid=JOptionPane.showInputDialog("Enter the book id");
            
            ResultSet rs1=st.executeQuery("select * from customer_acc1 where sid="+userId+";");
           
            String name="",address="";
            boolean issued=false;
            if(rs1.next())
            {
                name=rs1.getString("sname");
                address=rs1.getString("Address");
                if(!(rs1.getString("Current_book1") == null))
                    issued=true;
            }
            if(issued){
                JOptionPane.showMessageDialog(rootPane, "You have already issued a book.");
                MenuPage.setVisible(true);
                SelectionPage.setVisible(false);
            }
            else
            {
                ResultSet rs=st1.executeQuery("select * from books1 where sid="+bid+";");
                while(rs.next())
                {
                    if(rs.getBoolean("availibility"))
                    {
                        JOptionPane.showMessageDialog(rootPane, "The book is successfully booked.");
                        st.executeUpdate("update books1 set sHolder='"+name+"' where sid="+bid+";");
                        st.executeUpdate("update customer_acc1 set current_book1="+bid+" where sid='"+userId+"';");
                        st.executeUpdate("update books1 set Availibility=false where sid="+bid+";");
                        st.executeUpdate("update books1 set sHolder_id="+userId+" where sid="+bid+";");
                        st.executeUpdate("insert into orders (cust_name,book_id,cust_id,cust_add) values('"+name+"',"+bid+","+userId+",'"+address+"');");
                        refreshTable();
                        JOptionPane.showMessageDialog(rootPane, "Book ordered successfully!");
                        MenuPage.setVisible(true);
                        SelectionPage.setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "This book is already taken.");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }                                     

    private void IssueBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        MenuPage.setVisible(false);
        SelectionPage.setVisible(true);
        refreshTable();
    }                                      

    private void ReturnBActionPerformed(java.awt.event.ActionEvent evt) {                                        
    try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from customer_acc1 where sid="+userId+";");
        rs.next();
        String curr_book = rs.getString("current_book1");
        if(curr_book == null){
            JOptionPane.showMessageDialog(rootPane, "You have not issued any book!");
        }
        else{
            refreshReturnPage();
            ReturnPage.setVisible(true);
            MenuPage.setVisible(false);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }                                       
    public void refreshReturnPage(){
    try
    {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from books1 where sHolder_id='"+userId+"';");
        while(rs.next())
        {
            BookReturnName.setText("Book Name: "+rs.getString("sName"));
            BookReturnID.setText("Book Id: "+rs.getString("sid"));
            
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        
    }
}
    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try{
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String name="",bname="";
            ResultSet rs1=st1.executeQuery("select sname from customer_acc1 where sID="+userId);
            while(rs1.next())
            {
                name=rs1.getString("sname");
            }
            ResultSet rs=st.executeQuery("select * from books1 where sHolder='"+name+"';");
            while(rs.next())
                bname=rs.getString("sName");
            Statement st2=con.createStatement();
            st2.executeUpdate("UPDATE books1 SET sHolder=NULL WHERE sName='"+bname+"';");
            st2.executeUpdate("UPDATE books1 SET Availibility=true WHERE sName='"+bname+"';");
            st2.executeUpdate("UPDATE books1 SET sHolder_id=null"+" WHERE sName='"+bname+"';");
            st2.executeUpdate("UPDATE customer_acc1 SET Current_book1=NULL WHERE sID='"+userId+"';");
            JOptionPane.showMessageDialog(rootPane,"The book is successfully returned");
            MenuPage.setVisible(true);
            ReturnPage.setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane,"Sorry there was an error please try again");
            
        }
            
    }                                            

    private void AddressIActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AddressI;
    private javax.swing.JButton BookB;
    private javax.swing.JLabel BookReturnID;
    private javax.swing.JLabel BookReturnName;
    private javax.swing.JButton CreateB;
    private javax.swing.JButton CreateDoneButton;
    private javax.swing.JPanel CreatePage;
    private javax.swing.JButton IssueB;
    private javax.swing.JButton LoginB;
    private javax.swing.JPanel MainPage;
    private javax.swing.JPanel MenuPage;
    private javax.swing.JTextField NameI;
    private javax.swing.JPasswordField PwdI;
    private javax.swing.JButton ReturnB;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JPanel ReturnPage;
    private javax.swing.JPanel SelectionPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
