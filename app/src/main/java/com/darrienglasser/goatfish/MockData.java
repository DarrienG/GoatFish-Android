package com.darrienglasser.goatfish;

import java.util.ArrayList;

/**
 * Created by maryannoconnell on 4/23/16.
 */
public class MockData {




    // Flag : United States of America
    // Inclusion criteria: First 10 entries
    // Source: Western & Central Pacific Fisheries Commission
    Vessel mV1, mV2, mV3, mV4, mV5, mV6, mV7, mV8, mV9, mV10, mV111;

    // Flag : United States of America
    // Search name: "Eagle"
    // Inclusion criteria: COMMERCIAL FISHING VESSEL
    // Source:  http://www.st.nmfs.noaa.gov/st1/CoastGuard/VesselByName.html
    Vessel mV11, mV12, mV13, mV14, mV15, mV16, mV17, mV18, mV19, mV20, mV21, mV22, mV23, mV24, mV25, mV26, mV27;

    // Flag : Indonesia
    // Inclusion criteria: First 10 entries
    // Source: Western & Central Pacific Fisheries Commission
    Vessel mV28, mV29, mV30, mV31, mV32, mV33, mV34, mV35, mV36, mV37;

    public ArrayList<Vessel> getMockVesselList() {

        ArrayList<Vessel> vessels = new ArrayList<>();

         /* Source: Western & Central Pacific Fisheries Commission
         * https://www.wcpfc.int/record-fishing-vessel-database
         */

        // ADELITA, 1994
        // Image:
        // https://www.wcpfc.int/system/files/styles/vessel_thumb/private/vessels/WDA6355_Adelita_06.Jun.2013.jpg?itok=-tAC0SsE
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

        mV1.setVesselType("TUNA LONGLINER");
        mV1.setOwner("ADELITA FISHING LLC");

        // ALANA, 2013
        // Image:
        // https://www.wcpfc.int/system/files/styles/vessel_thumb/private/vessels/WDH2943_Alana_24.Jul.2014.jpg?itok=LmCC84oS
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

        mV2.setVesselType("TUNA LONGLINER");
        mV2.setOwner("KD FISHERY LLC");

        // ALISON F, 1997
        // Image:
        // https://www.wcpfc.int/system/files/styles/vessel_thumb/private/vessels/WDG4225_Alison%20F_05.Aug.2012.JPG?itok=8gXA09h2
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

        mV3.setVesselType("POLE AND LINE");
        mV3.setOwner("CHARCA FISH VII LLC");

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

        mV4.setVesselType("TUNA PURSE SEINER");
        mV4.setOwner("AMERICAN EAGLE FISHING LLC");

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

        mV5.setVesselType("TUNA PURSE SEINER");
        mV5.setOwner("AMERICAN ENTERPRISE FISHING LLC");

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

        mV6.setVesselType("TUNA PURSE SEINER");
        mV6.setOwner("AMERICAN LEGACY FISHING LLC");

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

        mV7.setVesselType("TUNA PURSE SEINER");
        mV7.setOwner("CRISTINA FISHING CO., LLC");

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

        mV8.setVesselType("TUNA LONGLINER");
        mV8.setOwner("AO SHIBI INC");

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

        mV9.setVesselType("TUNA LONGLINER");
        mV9.setOwner(" \n" +
                "KD FISHERY LLC");

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

        mV10.setVesselType("TUNA LONGLINER");
        mV10.setOwner("APSARA LLC");

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

        mV11.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV12.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV13.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV14.setVesselType("COMMERCIAL FISHING VESSEL");

        // EAGLE, 1950, COMMERCIAL FISHING VESSEL
        mV15 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1911",
                null,
                "39",
                "FEET",
                "20",
                "GRT");

        mV15.setVesselType("COMMERCIAL FISHING VESSEL");

        // EAGLE, 1956, COMMERCIAL FISHING VESSEL
        mV16 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1956",
                null,
                null,
                null,
                null,
                null);

        mV16.setVesselType("COMMERCIAL FISHING VESSEL");

        // EAGLE, 1961, COMMERCIAL FISHING VESSEL
        mV17 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1961",
                null,
                "29.5",
                "FEET",
                "12",
                "GRT");

        mV17.setVesselType("COMMERCIAL FISHING VESSEL");

        // EAGLE, 1963, COMMERCIAL FISHING VESSEL
        mV18 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1963",
                null,
                "45.3",
                "FEET",
                "27",
                "GRT");

        mV18.setVesselType("COMMERCIAL FISHING VESSEL");

        // EAGLE, 1974, COMMERCIAL FISHING VESSEL
        mV19 = new Vessel(
                "UNITED STATES OF AMERICA",
                "EAGLE",
                null,
                "1974",
                null,
                "26.3",
                "FEET",
                "9",
                "GRT");

        mV19.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV20.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV21.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV22.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV23.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV24.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV25.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV26.setVesselType("COMMERCIAL FISHING VESSEL");

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

        mV27.setVesselType("COMMERCIAL FISHING VESSEL");

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

        /* Source: Western & Central Pacific Fisheries Commission
        *  https://www.wcpfc.int/record-fishing-vessel-database
        */
        // Flag : Indonesia
        // Inclusion criteria: First 10 entries

        /*     public Vessel(
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

        // ABADI JAYA - 1, Vessel Type: Tuna purse seiner, Owner Name: PIYU TALENTA , PT
        mV28 = new Vessel(
                "INDONESIA",
                "ABADI JAYA - 1",
                null,
                null,
                null,
                null,
                null,
                "19.00",
                null);

        mV28.setVesselType("TUNA PURSE SEINER");
        mV28.setOwner("PIYU TALENTA , PT");

        // ABANG JAYA 01, Vessel Type: Tuna longliner, Owner Name: I WAYAN SUDIYANA
        mV29 = new Vessel(
                "INDONESIA",
                "ABANG JAYA 01",
                null,
                null,
                null,
                null,
                null,
                "34.00",
                null);

        mV29.setVesselType("TUNA LONGLINER");
        mV29.setOwner("I WAYAN SUDIYANA");

        // ABLE, Vessel Type: Tuna purse seiner, Owner Name: ARU SAMUDERA LESTARI, PT
        mV30 = new Vessel(
                "INDONESIA",
                "ABLE",
                null,
                null,
                null,
                null,
                null,
                "235.00",
                null);

        mV30.setVesselType("TUNA PURSE SEINER");
        mV30.setOwner("ARU SAMUDERA LESTARI, PT");

        // ADS TWO, Vessel Type: Pole and line, Owner Name: PELAYARAN BETA PUTRA DAERAH, PT
        mV31 = new Vessel(
                "INDONESIA",
                "ADS TWO",
                null,
                null,
                null,
                null,
                null,
                "30.00",
                null);

        mV31.setVesselType("POLE AND LINE");
        mV31.setOwner("PELAYARAN BETA PUTRA DAERAH, PT");

        // AKUA PASIFIK - IV, Vessel Type: Tuna longliner
        mV32 = new Vessel(
                "INDONESIA",
                "AKUA PASIFIK - IV",
                null,
                null,
                null,
                null,
                null,
                "35.00",
                null);

        mV32.setVesselType("TUNA LONGLINER");

        // ANDREW, Vessel Type: Tuna purse seiner, Owner Name: PIYU TALENTA , PT
        mV33 = new Vessel(
                "INDONESIA",
                "Andrew",
                null,
                null,
                null,
                null,
                null,
                "48.00",
                null);

        mV33.setVesselType("TUNA PURSE SEINER");
        mV33.setOwner("PIYU TALENTA , PT");

        // ANEKA - 228, Vessel Type: TUNA LONGLINER, Owner Name: BINA NUSA MANDIRI PERTIWI, PT.
        mV34 = new Vessel(
                "INDONESIA",
                "ANEKA - 228",
                null,
                null,
                null,
                null,
                null,
                "84.00",
                null);

        mV34.setVesselType("TUNA LONGLINER");
        mV34.setOwner("BINA NUSA MANDIRI PERTIWI, PT");

        // ANEKA 202, Vessel Type: Tuna purse seiner, Owner Name: BINA NUSA MANDIRI PERTIWI, PT.
        mV35 = new Vessel(
                "INDONESIA",
                "ANEKA 202",
                null,
                null,
                null,
                null,
                null,
                "84.00",
                null);

        mV35.setVesselType("TUNA PURSE SEINER");
        mV35.setOwner("BINA NUSA MANDIRI PERTIWI, PT");


        // ANEKA 207,Vessel Type: TUNA LONGLINER, Owner Name: BINA NUSA MANDIRI PERTIWI, PT.
        mV36 = new Vessel(
                "INDONESIA",
                "ANEKA 207",
                null,
                null,
                null,
                null,
                null,
                "61.00",
                null);

        mV36.setVesselType("TUNA LONGLINER");
        mV36.setOwner("BINA NUSA MANDIRI PERTIWI, PT");

        // ANEKA 209, Vessel Type: TUNA LONGLINER, Owner Name: BINA NUSA MANDIRI PERTIWI, PT.
        mV37 = new Vessel(
                "INDONESIA",
                "ANEKA 209",
                null,
                null,
                null,
                null,
                null,
                "49.00",
                null);

        mV37.setVesselType("TUNA LONGLINER");
        mV37.setOwner("BINA NUSA MANDIRI PERTIWI, PT");



        return vessels;

    }

}