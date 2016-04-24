package com.darrienglasser.goatfish;

import java.util.ArrayList;

/**
 * Created by maryannoconnell on 4/23/16.
 */
public class MockData {

    /* Source: Western & Central Pacific Fisheries Commission
     * https://www.wcpfc.int/record-fishing-vessel-database
     */


    // Flag : United States of America
    Vessel mV1, mV2, mV3, mV4, mV5, mV6, mV7, mV8, mV9, mV10;


     /*
    public Vessel(
    String flag,
    String name,
    String imo,
    String year,
    String uvi,
    String length,
    String lengthUnits,
    String tonnage,
    String tonnageType)
    */

    public ArrayList<Vessel> getMockVesselList() {

        ArrayList<Vessel> vessels = new ArrayList<>();

        // ADELITA, 1994
        mV1 = new Vessel(
                "UNITED STATES OF AMERICA",
                "ADELITA",
                "8976982",
                "1994",
                null,
                "89.50",
                "FEET",
                "148.00",
                "GRT");

        // ALANA, 2013
        mV2 = new Vessel(
                "UNITED STATES OF AMERICA",
                "ALANA",
                "9759563",
                "2013",
                null,
                "77.00",
                "FEET",
                "102.00",
                "GRT");

        // ALISON F, 1997
        mV3 = new Vessel(
                "UNITED STATES OF AMERICA",
                "ALISON F",
                "8940933",
                "1997",
                null,
                "77.00",
                "FEET",
                "144.00",
                "GRT");

        // AMERICAN EAGLE, 2003
        mV4 = new Vessel(
                "UNITED STATES OF AMERICA",
                "AMERICAN EAGLE",
                "8974398",
                "2003",
                null,
                "258.40",
                "FEET",
                "2310.00",
                "GRT");

        // AMERICAN ENTERPRISE, 2003
        mV5 = new Vessel(
                "UNITED STATES OF AMERICA",
                "AMERICAN ENTERPRISE",
                "9294628",
                "2003",
                null,
                "258.40",
                "FEET",
                "2310.00",
                "GRT");

        // AMERICAN VICTORY, 2008
        mV6 = new Vessel(
                "UNITED STATES OF AMERICA",
                "AMERICAN VICTORY",
                "9556674",
                "2008",
                null,
                "226.80",
                "FEET",
                "1691.00",
                "GRT");

        // ANDREA, 1979
        mV7 = new Vessel(
                "UNITED STATES OF AMERICA",
                "ANDREA",
                "7365227",
                "1979",
                null,
                "234.00",
                "FEET",
                "2232.00",
                "GRT");

        // AMERICAN VICTORY, 2008
        mV7 = new Vessel(
                "UNITED STATES OF AMERICA",
                "AMERICAN VICTORY",
                "9556674",
                "2008",
                null,
                "226.80",
                "FEET",
                "1691.00",
                "GRT");

        // ANTHONY G, 1974
        mV8 = new Vessel(
                "UNITED STATES OF AMERICA",
                "ANTHONY G",
                null,
                "1974",
                null,
                "62.10",
                "FEET",
                "84.00",
                "GRT");


        //AOLANI , 2013
        mV9 = new Vessel(
                "UNITED STATES OF AMERICA",
                "AOLANI ",
                "9759575",
                "2013",
                null,
                "77.00",
                "FEET",
                "102.00",
                "GRT");

        // APSARA, 1994
        mV10 = new Vessel(
                "UNITED STATES OF AMERICA",
                "APSARA",
                "8938588",
                "1994",
                null,
                "83.30",
                "FEET",
                "183.00",
                "GRT");

        vessels.add(mV1);
        vessels.add(mV2);
        vessels.add(mV3);
        vessels.add(mV4);
        vessels.add(mV5);
        vessels.add(mV6);
        vessels.add(mV7);
        vessels.add(mV8);
        vessels.add(mV9);
        vessels.add(mV10);

        return vessels;

    }

}