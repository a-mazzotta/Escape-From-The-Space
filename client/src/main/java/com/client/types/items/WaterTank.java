/*
 * Copyright 2022 
 * Autori: Verna Vito e Alessandro Mazzotta
 */
package com.client.types.items;

import com.client.gameutil.DB;
import com.client.types.Item;
import java.sql.SQLException;

/**
 * Classe che rappresenta la bottiglia di acqua, uno degli Item di questo gioco.
 *
 * @author Verna Vito - 746463
 * @author Mazzotta Alessandro - 766414
 *
 * @see Item
 */
public class WaterTank extends Item {

    /**
     * Costruttore della classe WaterTank.
     *
     * @param name il nome dell'oggetto
     * @param db il database dal quale leggere le varie informazioni del
     * bottiglia di acqua
     *
     * @throws SQLException per eventuali problemi con l'SQL e/o con il DB
     */
    public WaterTank(String name, DB db) throws SQLException {
        super(name, db);
    }
}
