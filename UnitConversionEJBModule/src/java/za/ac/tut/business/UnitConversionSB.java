/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author khuts
 */
@Stateless
public class UnitConversionSB implements UnitConversionSBLocal {

    @RolesAllowed("manager")
    @Override
    public Float toInches(Float meters) {
        return meters * 38.39F;
    }

    @RolesAllowed({"manager", "employee"})
    @Override
    public Float toMills(Float meters) {
        return meters * 1000;
    }

    @PermitAll
    @Override
    public Float toContis(Float meters) {
        return meters * 100;
    }

}
