/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awtexamplmain;
import java.awt.*;
/**
 *
 * @author HP
 */
public class AwtExample extends Frame{

    public AwtExample() {
       
        setSize(500,500);
        setVisible(true);
        setLayout(null);
       
        Label names=new Label("Name:");
        names.setBounds(100, 100,50,10);
        add(names);
        
        TextField n=new TextField();
        n.setBounds(230, 100,150,15);
        add(n);
        
        Label Address=new Label("Address:");
        Address.setBounds(100, 140,50,10);
        add(Address);
        
        TextField ad=new TextField();
        ad.setBounds(230, 140,150,15);
        add(ad);
        
        Label Phno=new Label("Phone Number:");
        Phno.setBounds(100, 180,90,10);
        add(Phno);
       
        TextField pn=new TextField();
        pn.setBounds(230, 180,150,15);
        add(pn);
        
        Label Email=new Label("Email Id:");
        Email.setBounds(100, 220,50,10);
        add(Email);
        
        TextField em=new TextField();
        em.setBounds(230, 220,150,15);
        add(em);
        
        Label Gender=new Label("Gender:");
        Gender.setBounds(100, 260,50,10);
        add(Gender);
        
        CheckboxGroup cb=new CheckboxGroup();
        Checkbox cm=new Checkbox("Male",cb,false);
        cm.setBounds(230, 260, 50, 15);
        add(cm);
        Checkbox cf=new Checkbox("FeMale",cb,false);
        cf.setBounds(300, 260, 50, 15);
        add(cf);
        
        Label Qualification=new Label("Qualification:");
        Qualification.setBounds(100, 300,80,10);
        add(Qualification);
        
        Choice c=new Choice();
        c.add("SELECT");
        c.add("BSC");
        c.add("MSC");
        c.add("BCA");
        c.add("MCA");
        c.add("BE");
        c.add("ME");
        c.add("PhD");
        c.add("BA");
        c.add("MA");
        c.add("BED");
        c.add("MED");
        c.add("MPhil");
        c.add("Others");
        c.setBounds(230, 300,150,15);
        add(c);
             
        Label College=new Label("College Name:");
        College.setBounds(100, 340,80,10);
        add(College);
        
        TextField cn=new TextField();
        cn.setBounds(230, 340,150,15);
        add(cn);
        
        Label Passout=new Label("Pass Out Year:");
        Passout.setBounds(100, 380,90,10);
        add(Passout);
        
        Choice ch=new Choice();
        ch.add("SELECT");
        ch.add("2008");
        ch.add("2009");
        ch.add("2010");
        ch.add("2011");
        ch.add("2012");
        ch.add("2013");
        ch.add("2014");
        ch.add("2015");
        ch.add("2016");
        ch.add("2017");
        ch.add("2018");
        ch.add("2019");
        ch.add("2020");
        ch.add("2021");
        ch.add("2022");
        ch.setBounds(230,380,150,5);
        add(ch);
        
        Label hobies=new Label("Hobies");
        hobies.setBounds(100,408 , 100, 30);
        add(hobies);
        
        Checkbox cbh=new Checkbox("Singing");
        cbh.setBounds(230, 410, 80, 20);
        add(cbh);
        
        Checkbox cbh1=new Checkbox("Drawing");
        cbh1.setBounds(310, 410, 80, 20);
        add(cbh1);
        
        Button R=new Button("Register");
        R.setBounds(250, 460,50,20);
        add(R);
       
   
   
    
}
}