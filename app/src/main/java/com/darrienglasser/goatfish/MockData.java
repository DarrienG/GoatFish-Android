package com.darrienglasser.goatfish;

import java.util.ArrayList;

/**
 * Created by maryannoconnell on 4/23/16.
 */
public class MockData {




    // Flag : United States of America
    Vessel mV1, mV2, mV3, mV4, mV5, mV6, mV7, mV8, mV9, mV10;

    Vessel mV11, mV12, mV13, mV14, mV15, mV16, mV17, mV18, mV19, mV20, mV21, mV22, mV23, mV24, mV25, mV26, mV27;


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

         /* Source: Western & Central Pacific Fisheries Commission
        * https://www.wcpfc.int/record-fishing-vessel-database
         */

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

        /* Source: NOAA Fisheries
        * http://www.st.nmfs.noaa.gov/st1/CoastGuard/VesselByName.html
        */

        // FLAG: UNITED STATES OF AMERICA
        // SEARCH NAME: EAGLE

        // EAGLE, 1991, COMMERCIAL FISHING VESSEL
        mV11 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1911",
                null,
                "33.8",
                "FEET",
                "7",
                "GRT");

        // EAGLE, 1917, COMMERCIAL FISHING VESSEL
        mV12 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1917",
                null,
                "56.6",
                "FEET",
                "36",
                "GRT");

        // EAGLE, 1948, COMMERCIAL FISHING VESSEL
        mV13 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1948",
                null,
                "47",
                "FEET",
                "30",
                "GRT");

        // EAGLE, 1956, COMMERCIAL FISHING VESSEL
        mV14 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1956",
                null,
                "31.8",
                "FEET",
                "10",
                "GRT");

        // EAGLE, 1950, COMMERCIAL FISHING VESSEL
        mV15 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE ",
                null,
                "1911",
                null,
                "39",
                "FEET",
                "20",
                "GRT");

        // EAGLE, 1956, COMMERCIAL FISHING VESSEL
        mV16 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE ",
                null,
                "1956",
                null,
                null,
                null,
                null,
                null);

        // EAGLE, 1961, COMMERCIAL FISHING VESSEL
        mV17 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE ",
                null,
                "1961",
                null,
                "29.5",
                "FEET",
                "12",
                "GRT");

        // EAGLE, 1963, COMMERCIAL FISHING VESSEL
        mV18 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE ",
                null,
                "1963",
                null,
                "45.3",
                "FEET",
                "27",
                "GRT");

        // EAGLE, 1974, COMMERCIAL FISHING VESSEL
        mV19 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE ",
                null,
                "1974",
                null,
                "26.3",
                "FEET",
                "9",
                "GRT");

        // EAGLE, 1975, COMMERCIAL FISHING VESSEL
        mV20 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                "7534763",
                "1975",
                null,
                "82.1",
                "FEET",
                "176",
                "GRT");

        // EAGLE, 1978, COMMERCIAL FISHING VESSEL, OWNER: JOSHUA VILLANI

        mV21 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1978",
                null,
                "29.1",
                "FEET",
                "13",
                "GRT");

        // EAGLE, 1960, COMMERCIAL FISHING VESSEL
        mV22 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1960",
                null,
                "38.6",
                "FEET",
                "21",
                "GRT");

        // EAGLE, 1979, COMMERCIAL FISHING VESSEL
        mV23 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1979",
                null,
                "19",
                "FEET",
                "13",
                "GRT");


        // EAGLE, 1980, COMMERCIAL FISHING VESSEL, OWNER: KENNETH D KRITCHEN
        mV24 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1980",
                null,
                "30.4",
                "FEET",
                "14",
                "GRT");


        // EAGLE, 1983, COMMERCIAL FISHING VESSEL, OWNER: JANE STUBBS
        mV25 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1983",
                null,
                "44.6",
                "FEET",
                "21",
                "GRT");

        // EAGLE, 1997, COMMERCIAL FISHING VESSEL, OWNER: MURPHY J HOPKINS JR
        mV26 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1997",
                null,
                "60",
                "FEET",
                "56",
                "GRT");

        // EAGLE, 2015, COMMERCIAL FISHING VESSEL, OWNER: COVE FISHING CORP
        mV27 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "2015",
                null,
                "85.7",
                "FEET",
                "182",
                "GRT");

        vessels.add(mV11);
        vessels.add(mV12);
        vessels.add(mV13);
        vessels.add(mV14);
        vessels.add(mV15);
        vessels.add(mV16);
        vessels.add(mV17);
        vessels.add(mV18);
        vessels.add(mV19);
        vessels.add(mV20);
        vessels.add(mV21);
        vessels.add(mV22);
        vessels.add(mV23);
        vessels.add(mV24);
        vessels.add(mV25);
        vessels.add(mV26);
        vessels.add(mV27);


        return vessels;

    }

}