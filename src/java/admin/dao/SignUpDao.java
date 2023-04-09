/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.dao;

import admin.model.SignUpModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class SignUpDao {
    public boolean createStudent(SignUpModel student) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }

    public boolean updateStudent(SignUpModel student) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }
    
    public List<SignUpModel> retrieveAgency(){
        List<SignUpModel> student = new ArrayList<>();
        Session ss=null;
        try{
            ss=FactoryManager.getSessionFactory().openSession();
            student = ss.createQuery("FROM SignUpModel").list();
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            if(ss!=null){
                ss.close();
            }
        }        
        return student;
    }
}
