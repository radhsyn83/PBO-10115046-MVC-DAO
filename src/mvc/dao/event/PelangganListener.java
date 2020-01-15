/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao.event;

import mvc.dao.entity.Pelanggan;
import mvc.dao.model.PelangganModel;

/**
 *	
 * @author radhsyn83
 * 
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
    
}
