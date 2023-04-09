/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.services;

import admin.model.SignUpModel;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author princecalvinsagatwa
 */
public interface FirstTimeInterface {
    public void saveStudent(SignUpModel student) throws RemoteException;
    public void updateStudent(SignUpModel student) throws RemoteException;
    public List<SignUpModel> retrieveAgency() throws RemoteException;
}
