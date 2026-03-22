//
// A JScript for validating a file with the UPnP schemata.
//
// Copyright (c) 2004, 2005 Hewlett-Packard Development Company, L.P.
// All Rights Reserved.
//
var sOutput = validateFile("test011.xml");

//
//
//
WScript.Echo(sOutput);

//
//
//
function validateFile(strFile) {
	var xs = new ActiveXObject("MSXML2.XMLSchemaCache.4.0");
	xs.add("urn:schemas-upnp-org:service:PrintEnhanced:1", "PrintEnhanced.xsd");

	var xd = new ActiveXObject("MSXML2.DOMDocument.4.0");
	xd.schemas = xs;
	xd.async = false;
	xd.validateOnParse = true;
	xd.resolveExternals = true;
	xd.load(strFile);

	if (xd.parseError.errorCode != 0) {
		return ("An error occured in validating \"" + strFile + "\"\n\n" + strFile + "(" + xd.parseError.line + "): " + xd.parseError.srcText + "\n\n" + "error: " + xd.parseError.reason);
	} else {
		 return("\"" + strFile + "\" is valid.\n");
	}
}
