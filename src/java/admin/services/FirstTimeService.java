/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.services;

import java.rmi.server.UnicastRemoteObject;
import admin.dao.SignUpDao;
import admin.model.SignUpModel;
import java.rmi.RemoteException;
import java.util.List;

public class FirstTimeService extends UnicastRemoteObject implements FirstTimeInterface{
    public FirstTimeService() throws RemoteException{
        super();
    }
    @Override
    public void saveStudent(SignUpModel student) throws RemoteException {
        SignUpDao studentDao=new SignUpDao();
        studentDao.createStudent(student);
    }
    
     @Override
    public void updateStudent(SignUpModel student) throws RemoteException {
        SignUpDao studentDao=new SignUpDao();
        studentDao.updateStudent(student);
    }
     @Override
    public List<SignUpModel> retrieveAgency() throws RemoteException {
        SignUpDao studentDao=new SignUpDao();
        List result = studentDao.retrieveAgency();
        return result;
    }
}
