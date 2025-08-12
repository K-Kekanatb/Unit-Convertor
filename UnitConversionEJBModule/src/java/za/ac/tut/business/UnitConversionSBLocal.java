/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Local;

/**
 *
 * @author khuts
 */
@Local
public interface UnitConversionSBLocal {
    public Float toInches(Float meters);
    public Float toMills(Float meters);
    public Float toContis(Float meters);
}
