README.txt

Copyright (c) 2004, 2005 Hewlett-Packard Development Company, L.P.
All Rights Reserved.

This archive contains the following files:

    README.txt              - This file.
    IANA-MIME.xsd           - An XML-Schema file which defines the syntax of the registered MIME types.
    PWG-Media.xsd           - An XML-Schema file which defines the syntax of the media types and the self-describing media sizes in IEEE-ISTO 5101.1-2001.
    PrintEnhanced-State.xsd - An XML-Schema file which defines the syntax of the state variables in UPnP PrintEnhanced:1.
    PrintEnhanced.xsd       - An XML-Schema file which defines the syntax of the actions in UPnP PrintEnhanced:1.
    test0??.xml             - Sample SOAP messages for being validated with XMLSpy 2004 or Microsoft XML (MSXML) 4.0.
                              They are all valid SOAP messages by default.
    PrintEnhanced.xsd       - An XMLSpy 2004 project file.
    test0??.js              - JScript files for validating the above SOAP messages with MSXML 4.0 (1).

(1) http://www.microsoft.com/xml/

NOTE: Since the all these files are assumed to be placed in one directory, some files cause errors if you move (or delete) one of these files to another directory.

If you have installed Altova XMLSpy 2004 (or 2005) Professional (or Enterprise) Edition (2), you can start validating the attached SOAP messages immediately.
Because the project file "PrintEnhanced.xsd" has been already configured for validating the all SOAP messages in this archive.
Please follow the following steps to validate them;

    1. Launch XMLSpy 2004 (or 2005) Professional (or Enterprise) Edition,
    2. Open the project file "PrintEnhanced.xsd",
    3. Edit "test0??.xml" files (included in the project) with XMLSpy.
    4. Validate them with the schemata (included in the project), and
    5. Check if the schemata works as you expected.

(2) http://www.altova.com/

Even if you don't have either XMLSpy Professional or Enterprise Editions, you can use MSXML 4.0 (3) to validate them.
Before validating the SOAP messages with it, you have to follow the following steps and install MSXML 4.0;

    1. Open the following web page with Internet Explorer:
        http://www.microsoft.com/downloads/details.aspx?FamilyID=3144b72b-b4f2-46da-b4b6-c5d7485f2b42&DisplayLang=en
    2. Download the installer for MSXML 4.0 SP2 (or later), and
    3. Install it as written in the instructions at the web page,

(3) Because MSXML 3.0, which is installed into Windows 2000 and XP by default, does not have any interfaces for validating XML files with XML schemata.

Once you have installed MSXML 4.0, you can use the following steps to validate an XML file;

    1. Edit a "text0??.xml" file with your favorite editor.
    2. Double-click the "test0??.js" file according to the edited XML file, and validate it with the schemata,
       If the input xml file is valid, a dialog just shows "... is valid."
       Otherwise, a complicated error message shows onto the dialog.
    3. Check if they works as you expected.

Feel free to claim me if you have any questions, complaints, etc.

Enjoy validating!

Hironori Bouno
HP Labs, Hewlett-Packard Japan, Ltd.
E-mail: hironori.bouno@hp.com
