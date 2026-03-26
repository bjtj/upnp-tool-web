(ns app.upnpresources)

(def resources
  [{:name "Basic Device_1"
    :device-type "urn:schemas-upnp-org:device:Basic:1.0"
    :resource-dir "upnpresources/standardizeddcps/Basic Device_1"
    :spec-filename "UPnP-basic-Basic-v1-Device-20021212.pdf"
    :test-xml-filename "BasicDeviceV1.xml"
    :spec-files [{:filename "UPnP-basic-Basic-v1-Device-20021212.pdf"
                  :type :device}]
    :test-xml-files [{:filename "BasicDeviceV1.xml"
                      :type :device}]}
   {:name "Cloud_1"
    :resource-dir "upnpresources/standardizeddcps/Cloud_1"
    :spec-files [{:filename "UPnP-cloud-CloudProxy-v1-Device-20151231.pdf"
                  :type :device}
                 {:filename "UPnP-cloud-CloudProxy-v1-Service-20160415.pdf"
                  :type :service}
                 {:filename "UPnP-cloud-CloudTransport-v1-Service-20151231.pdf"
                  :type :service}]
    :test-xml-files [{:filename "UPnP-cloud-TestFiles-20151231/CloudProxy1.xml"}
                     {:filename "UPnP-cloud-TestFiles-20151231/CloudProxyDevice1.xml"}
                     {:filename "UPnP-cloud-TestFiles-20151231/CloudTransport1.xml"}]}
   {:name "ContentSync_1"
    :resource-dir "upnpresources/standardizeddcps/ContentSync_1"
    :spec-files [{:filename "UPnP-cs-ContentSync-v1-Service-20090714.pdf"}]
    :test-xml-files [{:filename "device/MediaServer2.xml"}
                     {:filename "device/devicedescsyntax.xml"}
                     {:filename "device/upnpdeviceschema.xml"}
                     {:filename "testcasedescription.xml"}
                     {:filename "service/ContentDirectory2.xml"}
                     {:filename "service/ContentSync1.xml"}
                     {:filename "service/test cases/syntax/ContentSync1.SyntaxTests.xml"}
                     {:filename "service/test cases/syntax/ContentDirectory2.SyntaxTests.xml"}
                     {:filename "service/upnpeventingschema.xml"}
                     {:filename "service/upnpserviceschema.xml"}]}
   {:name "DataStore_1"
    :resource-dir "upnpresources/standardizeddcps/DataStore_1"
    :spec-files [{:filename "UPnP-ds-DataStore-v1-Service-20130701.pdf"}]
    :test-xml-files []}
   {:name "Device Security_1 and Security Console_1"
    :resource-dir "upnpresources/standardizeddcps/Device Security_1 and Security Console_1"
    :spec-files [{:filename "UPnP-sec-DeviceSecurity-v1-Service-20031117.pdf"}
                 {:filename "UPnP-sec-SecurityConsole-v1-Service-20031117.pdf"}
                 {:filename "UPnP-sec-UPnPSecurityCeremonies-v1-20031003.pdf"}]
    :test-xml-files [{:filename "xml data files/device/SecureDevice1.xml"}
                     {:filename "xml data files/device/SecurityConsole1.xml"}
                     {:filename "xml data files/service/test cases/syntax/SecurityConsole1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/DeviceSecurity1.SyntaxTests.xml"}
                     {:filename "xml data files/service/SecurityConsole1.xml"}
                     {:filename "xml data files/service/DeviceSecurity1.xml"}]}
   {:name "DeviceManagement_2"
    :resource-dir "upnpresources/standardizeddcps/DeviceManagement_2"
    :spec-files [{:filename "UPnP-dm-ConfigurationManagement-v2-Service-20130304.pdf"}
                 {:filename "UPnP-dm-BasicManagement-v2-Service-20120216.pdf"}
                 {:filename "UPnP-dm-ManageableDevice-v2-Device-20120216.pdf"}
                 {:filename "UPnP-dm-SoftwareManagement-v2-Service-20120216.pdf"}]
    :test-xml-files [{:filename "xml data files/device/devicedescsyntax.xml"}
                     {:filename "xml data files/device/upnpdeviceschema.xml"}
                     {:filename "xml data files/device/ManageableDevice2.xml"}
                     {:filename "xml data files/device/devicedescriptiontemplate.xml"}
                     {:filename "xml data files/testcasedescription.xml"}
                     {:filename "xml data files/service/BasicManagement2.xml"}
                     {:filename "xml data files/service/DeviceProtection1.xml"}
                     {:filename "xml data files/service/servicedescriptiontemplate.xml"}
                     {:filename "xml data files/service/test cases/semantics/DeviceProtection1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/BasicManagement2.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/SoftwareManagement2.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/ConfigurationManagement2.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/pwrdim1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/syntax test case template.xml"}
                     {:filename "xml data files/service/test cases/syntax/SoftwareManagement2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/DeviceProtection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/ConfigurationManagement2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/BasicManagement2.SyntaxTests.xml"}
                     {:filename "xml data files/service/upnpeventingschema.xml"}
                     {:filename "xml data files/service/SoftwareManagement2.xml"}
                     {:filename "xml data files/service/upnpserviceschema.xml"}
                     {:filename "xml data files/service/ConfigurationManagement2.xml"}]}
   {:name "DeviceProtection_1"
    :resource-dir "upnpresources/standardizeddcps/DeviceProtection_1"
    :spec-files [{:filename "UPnP-gw-DeviceProtection-v1-Service-20110224.pdf"}]
    :test-xml-files [{:filename "xml data files/device/WANDevice1.xml"}
                     {:filename "xml data files/device/WANConnectionDevice1.xml"}
                     {:filename "xml data files/device/InternetGatewayDevice1.xml"}
                     {:filename "xml data files/device/InternetGatewayDevice2.xml"}
                     {:filename "xml data files/device/LANDevice1.xml"}
                     {:filename "xml data files/device/WANConnectionDevice2.xml"}
                     {:filename "xml data files/device/WANDevice2.xml"}
                     {:filename "xml data files/service/LANHostConfigManagement1.xml"}
                     {:filename "xml data files/service/WANIPConnection1.xml"}
                     {:filename "xml data files/service/Layer3Forwarding1.xml"}
                     {:filename "xml data files/service/WANPPPConnection1.xml"}
                     {:filename "xml data files/service/DeviceProtection1.xml"}
                     {:filename "xml data files/service/WANDSLLinkConfig1.xml"}
                     {:filename "xml data files/service/test cases/semantics/WANEthernetLinkConfig1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/WANIPConnection2.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/WANIPConnection1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/LanHostConfigManagement1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/semantics/WANCommonInterfaceConfig1.SemanticTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANCommonInterfaceConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/DeviceProtection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPConnection2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANCableLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANPOTSLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPv6FirewallControl1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANEthernetLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANPPPConnection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/Layer3Forwarding1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPConnection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANDSLLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/LanHostConfigManagement1.SyntaxTests.xml"}
                     {:filename "xml data files/service/WANCableLinkConfig1.xml"}
                     {:filename "xml data files/service/WANEthernetLinkConfig1.xml"}
                     {:filename "xml data files/service/WANPOTSLinkConfig1.xml"}
                     {:filename "xml data files/service/WANCommonInterfaceConfig1.xml"}
                     {:filename "xml data files/service/WANIPv6FirewallControl1.xml"}
                     {:filename "xml data files/service/WANIPConnection2.xml"}]}
   {:name "Digital Security Camera_1"
    :resource-dir "upnpresources/standardizeddcps/Digital Security Camera_1"
    :spec-files [{:filename "UPnP-ha-Settings-v1-Service-20050324.pdf"}
                 {:filename "UPnP-ha-StillImage-v1-Service-20050324.pdf"}
                 {:filename "UPnP-ha-DigitalSecurityCamera-v1-Device-20050324.pdf"}
                 {:filename "UPnP-ha-MotionImage-v1-Service-20050324.pdf"}]
    :test-xml-files [{:filename "device/DigitalSecurityCamera1.xml"}
                     {:filename "service/DigitalSecurityCameraStillImage1.xml"}
                     {:filename "service/test cases/syntax/DigitalSecurityCameraStillImage1.syntaxTests.xml"}
                     {:filename "service/test cases/syntax/DigitalSecurityCameraMotionImage1.syntaxTests.xml"}
                     {:filename "service/test cases/syntax/DigitalSecurityCameraSettings1.syntaxTests.xml"}
                     {:filename "service/DigitalSecurityCameraSettings1.xml"}
                     {:filename "service/DigitalSecurityCameraMotionImage1.xml"}]}
   {:name "EnergyManagement_1"
    :resource-dir "upnpresources/standardizeddcps/EnergyManagement_1"
    :spec-files [{:filename "UPnP-lp-EnergyManagement-v1-Service-20130830.pdf"}]
    :test-xml-files []}
   {:name "FriendlyInfoUpdate_1"
    :resource-dir "upnpresources/standardizeddcps/FriendlyInfoUpdate_1"
    :spec-files [{:filename "UPnP-fd-FriendlyInfoUpdate-v1-Service-20140905.pdf"}]
    :test-xml-files [{:filename "UPnP-fd-TestFiles-20140905/FriendlyInfoUpdate1.xml"}]}
   {:name "HVAC_1"
    :resource-dir "upnpresources/standardizeddcps/HVAC_1"
    :spec-files [{:filename "UPnP-ha-ControlValve-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-HVAC_SetpointSchedule-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-FanSpeed-v1-Service-20070921.pdf"}
                 {:filename "UPnP-ha-HVAC_FanOperatingMode-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-HVAC_System-v1-Device-20030513.pdf"}
                 {:filename "UPnP-ha-TemperatureSensor-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-HVAC_ZoneThermostat-v1-Device-20030513.pdf"}
                 {:filename "UPnP-ha-HouseStatus-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-TemperatureSetpoint-v1-Service-20030513.pdf"}
                 {:filename "UPnP-ha-HVAC_UserOperatingMode-v1-Service-20030513.pdf"}]
    :test-xml-files [{:filename "Test Suite/device/HVAC_System1.xml"}
                     {:filename "Test Suite/device/HVAC_ZoneThermostat1.xml"}
                     {:filename "Test Suite/service/HouseStatus1.xml"}
                     {:filename "Test Suite/service/TemperatureSetpoint1.xml"}
                     {:filename "Test Suite/service/FanSpeed1.xml"}
                     {:filename "Test Suite/service/HVAC_FanOperatingMode1.xml"}
                     {:filename "Test Suite/service/TemperatureSensor1.xml"}
                     {:filename "Test Suite/service/HVAC_SetpointSchedule1.xml"}
                     {:filename "Test Suite/service/ControlValve1.xml"}
                     {:filename "Test Suite/service/test cases/syntax/TemperatureSetpoint1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/HVAC_SetpointSchedule1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/HVAC_FanOperatingMode1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/FanSpeed1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/HVAC_UserOperatingMode1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/ControlValve1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/HouseStatus1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/TemperatureSensor1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/HVAC_UserOperatingMode1.xml"}]}
   {:name "Internet Gateway_2"
    :resource-dir "upnpresources/standardizeddcps/Internet Gateway_2"
    :spec-files [{:filename "UPnP-gw-WANConnectionDevice-v2-Device-20100910.pdf"}
                 {:filename "UPnP-gw-InternetGatewayDevice-v2-Device-20101210.pdf"}
                 {:filename "UPnP-gw-WANDevice-v2-Device-20100910.pdf"}
                 {:filename "UPnP-gw-WANIPConnection-v2-Service-20100910.pdf"}
                 {:filename "UPnP-gw-WANIPv6FirewallControl-v1-Service-20101210.pdf"}]
    :test-xml-files [{:filename "xml data files/device/WANDevice1.xml"}
                     {:filename "xml data files/device/WANConnectionDevice1.xml"}
                     {:filename "xml data files/device/InternetGatewayDevice1.xml"}
                     {:filename "xml data files/device/InternetGatewayDevice2.xml"}
                     {:filename "xml data files/device/LANDevice1.xml"}
                     {:filename "xml data files/device/WANConnectionDevice2.xml"}
                     {:filename "xml data files/device/WANDevice2.xml"}
                     {:filename "xml data files/service/LANHostConfigManagement1.xml"}
                     {:filename "xml data files/service/WANIPConnection1.xml"}
                     {:filename "xml data files/service/Layer3Forwarding1.xml"}
                     {:filename "xml data files/service/WANPPPConnection1.xml"}
                     {:filename "xml data files/service/WANDSLLinkConfig1.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANCommonInterfaceConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPConnection2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANCableLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANPOTSLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPv6FirewallControl1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANEthernetLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANPPPConnection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/Layer3Forwarding1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANIPConnection1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/WANDSLLinkConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/LanHostConfigManagement1.SyntaxTests.xml"}
                     {:filename "xml data files/service/WANCableLinkConfig1.xml"}
                     {:filename "xml data files/service/WANEthernetLinkConfig1.xml"}
                     {:filename "xml data files/service/WANPOTSLinkConfig1.xml"}
                     {:filename "xml data files/service/WANCommonInterfaceConfig1.xml"}
                     {:filename "xml data files/service/WANIPv6FirewallControl1.xml"}
                     {:filename "xml data files/service/WANIPConnection2.xml"}]}
   {:name "IoT Management And Control_1"
    :resource-dir "upnpresources/standardizeddcps/IoT Management And Control_1"
    :spec-files [{:filename "UPnP-iotmc-IoTManagementAndControl-v1-Device-20130701.pdf"}
                 {:filename "UPnP-iotmc-IoTManagementAndControl-Architecture-Overview-v1-20130701.pdf"}
                 {:filename "UPnP-iotmc-IoTManagementAndControl-TransportGeneric-v1-Service-20130701.pdf"}
                 {:filename "UPnP-ds-DataStore-v1-Service-20130701.pdf"}
                 {:filename "UPnP-iotmc-IoTManagementAndControl-DataModel-v1-Service-20151030.pdf"}]
    :test-xml-files []}
   {:name "Lighting Controls_1"
    :resource-dir "upnpresources/standardizeddcps/Lighting Controls_1"
    :spec-files [{:filename "UPnP-ha-Dimming-v1-Service-20031123.pdf"}
                 {:filename "UPnP-ha-SwitchPower-v1-Service-20110501.pdf"}
                 {:filename "UPnP-ha-DimmableLight-v1-Device-20031123.pdf"}
                 {:filename "UPnP-ha-BinaryLight-v1-Device-20031123.pdf"}]
    :test-xml-files [{:filename "Test Suite/device/DimmableLight1.xml"}
                     {:filename "Test Suite/device/BinaryLight1.xml"}
                     {:filename "Test Suite/service/test cases/syntax/SwitchPower1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/test cases/syntax/Dimming1.SyntaxTests.xml"}
                     {:filename "Test Suite/service/Dimming1.xml"}
                     {:filename "Test Suite/service/SwitchPower1.xml"}]}
   {:name "Low Power_1"
    :resource-dir "upnpresources/standardizeddcps/Low Power_1"
    :spec-files [{:filename "UPnP-lp-LowPowerProxy-v1-Service-20070828.pdf"}
                 {:filename "UPnP-lp-Architecture-v1-20070828.pdf"}
                 {:filename "UPnP-lp-EnergyManagement-v1-Service-20130830.pdf"}
                 {:filename "UPnP-lp-LowPower-v1-service-20070828.pdf"}]
    :test-xml-files [{:filename "xml data files/service/LowPowerProxy1.xml"}
                     {:filename "xml data files/service/test cases/syntax/LowPowerProxy1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/LowPowerDevice1.SyntaxTests.xml"}
                     {:filename "xml data files/service/LowPowerDevice1.xml"}]}
   {:name "MediaServer_4 and  MediaRenderer_3"
    :resource-dir "upnpresources/standardizeddcps/MediaServer_4 and  MediaRenderer_3"
    :spec-files [{:filename "UPnP-av-RenderingControl-v3-Service-20130331.pdf"}
                 {:filename "UPnP-av-ContentDirectory-v4-Service-20150630.pdf"}
                 {:filename "UPnP-av-MediaServer-v4-Device-20130331.pdf"}
                 {:filename "UPnP-av-AVArchitecture-v2-20130331.pdf"}
                 {:filename "UPnP-av-ScheduledRecording-v2-Service-20130331.pdf"}
                 {:filename "UPnP-av-AVTransport-v3-Service-20130331.pdf"}
                 {:filename "UPnP-av-AVDataStructureTemplate-v1-20130331.pdf"}
                 {:filename "UPnP-av-ConnectionManager-v3-Service-20130331.pdf"}
                 {:filename "UPnP-av-MediaRenderer-v3-Device-20130331.pdf"}]
    :test-xml-files [{:filename "UPnP-av-TestFiles-20150630/xml data files/device/MediaServer4.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/device/MediaRenderer3.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/AVTransport3.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/ScheduledRecording2.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/test cases/syntax/ContentDirectory4.SyntaxTests.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/test cases/syntax/AVTransport3.SyntaxTests.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/test cases/syntax/RenderingControl3.SyntaxTests.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/test cases/syntax/ScheduledRecording2.SyntaxTests.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/test cases/syntax/ConnectionManager3.SyntaxTests.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/RenderingControl3.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/ConnectionManager3.xml"}
                     {:filename "UPnP-av-TestFiles-20150630/xml data files/service/ContentDirectory4.xml"}]}
   {:name "MultiScreen_1"
    :resource-dir "upnpresources/standardizeddcps/MultiScreen_1"
    :spec-files [{:filename "UPnP-ms-MultiScreenArchitecture-v1-20140930.pdf"}
                 {:filename "UPnP-ms-ApplicationManagement-v1-Service-20140930.pdf"}
                 {:filename "UPnP-ms-ScreenDevice-v1-Device-20140930.pdf"}]
    :test-xml-files [{:filename "Device/ScreenDevice2.xml"}
                     {:filename "Device/ScreenDevice1.xml"}
                     {:filename "Service/ApplicationManagement2.xml"}
                     {:filename "Service/ApplicationManagement1.xml"}]}
   {:name "MultiScreen_2"
    :resource-dir "upnpresources/standardizeddcps/MultiScreen_2"
    :spec-files [{:filename "UPnP-ms-ScreenDevice-v2-Device-20140930.pdf"}
                 {:filename "UPnP-ms-ApplicationManagement-v2-Service-20140930.pdf"}
                 {:filename "UPnP-ms-MultiScreenArchitecture-v1-20140930.pdf"}]
    :test-xml-files [{:filename "Device/ScreenDevice2.xml"}
                     {:filename "Device/ScreenDevice1.xml"}
                     {:filename "Service/ApplicationManagement2.xml"}
                     {:filename "Service/ApplicationManagement1.xml"}]}
   {:name "Printer Device and Print Basic Service_1"
    :resource-dir "upnpresources/standardizeddcps/Printer Device and Print Basic Service_1"
    :spec-files [{:filename "UPnP-pntr-PrintBasic-v1-Service-20020808.pdf"}
                 {:filename "UPnP-pntr-Printer-v1-Device-20081015.pdf"}]
    :test-xml-files [{:filename "xml data files/device/printer1.xml"}
                     {:filename "xml data files/service/printenhanced1.xml"}
                     {:filename "xml data files/service/printbasic1.xml"}
                     {:filename "xml data files/service/test cases/syntax/PrintEnhanced1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/PrintBasic1.SyntaxTests.xml"}]}
   {:name "Printer Enhanced_1"
    :resource-dir "upnpresources/standardizeddcps/Printer Enhanced_1"
    :spec-files [{:filename "UPnP-pntr-XHTML-PrintPhotoTemplates-v1-20050504.pdf"}
                 {:filename "UPnP-pntr-XHTML-PrintCSSPrintProfileGuidelines-v1-20050504.pdf"}
                 {:filename "UPnP-pntr-PrinterAnnexA-v1-20081015.pdf"}
                 {:filename "UPnP-pntr-PrintEnhanced-v1-Service-20061028.pdf"}]
    :test-xml-files [{:filename "test003.xml"}
                     {:filename "test015.xml"}
                     {:filename "test013.xml"}
                     {:filename "test007.xml"}
                     {:filename "test009.xml"}
                     {:filename "test010.xml"}
                     {:filename "test012.xml"}
                     {:filename "test005.xml"}
                     {:filename "test014.xml"}
                     {:filename "test000.xml"}
                     {:filename "test004.xml"}
                     {:filename "test017.xml"}
                     {:filename "test018.xml"}
                     {:filename "xml data files/device/printer1.xml"}
                     {:filename "xml data files/service/printenhanced1.xml"}
                     {:filename "xml data files/service/printbasic1.xml"}
                     {:filename "xml data files/service/test cases/syntax/PrintEnhanced1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/PrintBasic1.SyntaxTests.xml"}
                     {:filename "test006.xml"}
                     {:filename "test001.xml"}
                     {:filename "test016.xml"}
                     {:filename "test002.xml"}
                     {:filename "test011.xml"}
                     {:filename "test008.xml"}
                     {:filename "test019.xml"}]}
   {:name "Quality of Service_1"
    :resource-dir "upnpresources/standardizeddcps/Quality of Service_1"
    :spec-files [{:filename "UPnP-qos-QosManager-v1-2ndErrata-20080804.pdf"}
                 {:filename "UPnP-QoS-QosPolicyHolder-v1-Errata-20060714.pdf"}
                 {:filename "UPnP-qos-QosDevice-v1-Device-20050310.pdf"}
                 {:filename "UPnP-QoS-QosDevice-v1-Errata-20060714.pdf"}
                 {:filename "UPnP-qos-QosPolicyHolder-v1-Service-20050310.pdf"}
                 {:filename "UPnP-qos-QosManager-v1-Service-20050310.pdf"}
                 {:filename "UPnP-qos-UPnPQoSArchitecture-v1-20050310.pdf"}
                 {:filename "UPnP-QoS-QosManager-v1-Errata-20060714.pdf"}]
    :test-xml-files [{:filename "QosPolicyHolder1.SyntaxTests.xml"}
                     {:filename "QosManager1.SyntaxTests.xml"}
                     {:filename "QosPolicyHolder1.xml"}
                     {:filename "QosManager1.xml"}
                     {:filename "QosDevice1.xml"}
                     {:filename "QosDevice1.SyntaxTests.xml"}]}
   {:name "Quality of Service_2"
    :resource-dir "upnpresources/standardizeddcps/Quality of Service_2"
    :spec-files [{:filename "UPnP-qos-Architecture-v2-20061016.pdf"}
                 {:filename "UPnP-qos-QosManager-v2-Errata-20080731.pdf"}
                 {:filename "UPnP-qos-QosDevice-v2-Service-20061016.pdf"}
                 {:filename "UPnP-qos-QosPolicyHolder-v2-Service-20061016.pdf"}
                 {:filename "UPnP-qos-QosManager-v2-Service-20080731.pdf"}]
    :test-xml-files [{:filename "xml files for testing/QosManager2.SyntaxTests.xml"}
                     {:filename "xml files for testing/QosPolicyHolder2.xml"}
                     {:filename "xml files for testing/QosDevice2.xml"}
                     {:filename "xml files for testing/QosPolicyHolder2.SyntaxTests.xml"}
                     {:filename "xml files for testing/QosManager2.xml"}
                     {:filename "xml files for testing/QosDevice2.SyntaxTests.xml"}]}
   {:name "Quality of Service_3"
    :resource-dir "upnpresources/standardizeddcps/Quality of Service_3"
    :spec-files [{:filename "UPnP-qos-QosDevice-v3-Addendum-20081130.pdf"}
                 {:filename "UPnP-qos-QosDevice-v3-Service-20081130.pdf"}
                 {:filename "UPnP-qos-Architecture-v3-20081130.pdf"}
                 {:filename "UPnP-qos-QosManager-v3-Service-20081130.pdf"}
                 {:filename "UPnP-qos-QosPolicyHolder-v3-Service-20081130.pdf"}]
    :test-xml-files [{:filename "xml data files/service/test cases/syntax/QosDevice3.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/QosPolicyHolder3.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/QosManager3.SyntaxTests.xml"}
                     {:filename "xml data files/service/QosDevice3.xml"}
                     {:filename "xml data files/service/QosManager3.xml"}
                     {:filename "xml data files/service/QosPolicyHolder3.xml"}]}
   {:name "Remote UI Client_1 and Remote UI Server_1"
    :resource-dir "upnpresources/standardizeddcps/Remote UI Client_1 and Remote UI Server_1"
    :spec-files [{:filename "UPnP-rui-RemoteUIClientDevice-v1-Device-20140416.pdf"}
                 {:filename "UPnP-rui-RemoteUIClient-v1-Service-20140416.pdf"}
                 {:filename "UPnP-rui-RemoteUIServer-v1-Service-20140416.pdf"}
                 {:filename "UPnP-rui-RemoteUIServerDevice-v1-Device-20140416.pdf"}]
    :test-xml-files [{:filename "RemoteUIClient1.SyntaxTests.xml"}
                     {:filename "RemoteUIServer1.xml"}
                     {:filename "RemoteUIClientDevice1.xml"}
                     {:filename "RemoteUIClient1.xml"}
                     {:filename "RemoteUIServerDevice1.xml"}
                     {:filename "RemoteUIServer1.SyntaxTests.xml"}]}
   {:name "RemoteAccess_2"
    :resource-dir "upnpresources/standardizeddcps/RemoteAccess_2"
    :spec-files [{:filename "UPnP-ra-RAServer-v2-Device-20110430.pdf"}
                 {:filename "UPnP-ra-RAArchitecture-v2-20110430.pdf"}
                 {:filename "UPnP-ra-RADiscoveryAgent-v2-Device-20110430.pdf"}
                 {:filename "UPnP-ra-RADASync-v2-Service-20110430.pdf"}
                 {:filename "UPnP-ra-RADAConfig-v2-Service-20110430.pdf"}]
    :test-xml-files [{:filename "xml data files/device/RADiscoveryAgent2.xml"}
                     {:filename "xml data files/device/RAServer1.xml"}
                     {:filename "xml data files/device/RAClient1.xml"}
                     {:filename "xml data files/device/RADiscoveryAgent1.xml"}
                     {:filename "xml data files/device/RAServer2.xml"}
                     {:filename "xml data files/service/InboundConnectionConfig1.xml"}
                     {:filename "xml data files/service/RADASync1.xml"}
                     {:filename "xml data files/service/RADASync2.xml"}
                     {:filename "xml data files/service/test cases/syntax/RADAConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/RATAConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/InboundConnectionConfig1.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/RADASync2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/RADAConfig2.SyntaxTests.xml"}
                     {:filename "xml data files/service/test cases/syntax/RADASync1.SyntaxTests.xml"}
                     {:filename "xml data files/service/RADAConfig2.xml"}
                     {:filename "xml data files/service/RADAConfig1.xml"}
                     {:filename "xml data files/service/RATAConfig1.xml"}]}
   {:name "Scanner1_ External_Activity1_Feeder1_Scan1_Scanner1"
    :resource-dir "upnpresources/standardizeddcps/Scanner1_ External_Activity1_Feeder1_Scan1_Scanner1"
    :spec-files [{:filename "UPnP-scnr-ExternalActivity-v1-Service-20020911.pdf"}
                 {:filename "UPnP-scnr-Feeder-v1-Service-20020911.pdf"}
                 {:filename "UPnP-scnr-Scanner-v1-Device-20020911.pdf"}
                 {:filename "UPnP-scnr-Scan-v1-Service-20020911.pdf"}]
    :test-xml-files [{:filename "XMLtestfiles/scanner xml test files/DEVICE/Scanner1.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/Scan1.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/Feeder1.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/test cases/SYNTAX/Scan1.SyntaxTests.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/test cases/SYNTAX/Feeder1.SyntaxTests.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/test cases/SYNTAX/ExternalActivity1.SyntaxTests.xml"}
                     {:filename "XMLtestfiles/scanner xml test files/SERVICE/ExternalActivity1.xml"}]}
   {:name "SolarProtectionBlind_1"
    :resource-dir "upnpresources/standardizeddcps/SolarProtectionBlind_1"
    :spec-files [{:filename "UPnP-ha-SolarProtectionBlind-v1-Device-20080909.pdf"}
                 {:filename "UPnP-ha-TwoWayMotionMotor-v1-Service-20080727.pdf"}]
    :test-xml-files [{:filename "device/SolarProtectionBlind1.xml"}
                     {:filename "service/testcases/semantics/TwoWayMotionMotor1.SemanticTests.xml"}
                     {:filename "service/testcases/syntax/TwoWayMotionMotor1.SyntaxTests.xml"}
                     {:filename "service/TwoWayMotionMotor1.xml"}]}
   {:name "Telephony_2"
    :resource-dir "upnpresources/standardizeddcps/Telephony_2"
    :spec-files [{:filename "UPnP-phone-Calendar-v1-Service-20121210.pdf"}
                 {:filename "UPnP-phone-Messaging-v2-Service-20121210.pdf"}
                 {:filename "UPnP-phone-TelephonyArchitecture-v2-20121210.pdf"}
                 {:filename "UPnP-phone-TelephonyClient-v2-Device-20121210.pdf"}
                 {:filename "UPnP-phone-AddressBook-v1-Service-20121210.pdf"}
                 {:filename "UPnP-phone-CallManagement-v2-Service-20121210.pdf"}
                 {:filename "UPnP-phone-MediaManagement-v2-Service-20121210.pdf"}
                 {:filename "UPnP-phone-PhoneManagement-v2-Service-20121210.pdf"}
                 {:filename "UPnP-phone-Presence-v1-Service-20121210.pdf"}
                 {:filename "UPnP-phone-TelephonyServer-v2-Device-20121210.pdf"}]
    :test-xml-files [{:filename "xml data files/device/TelephonyServer2.xml"}
                     {:filename "xml data files/device/TelephonyClient2.xml"}
                     {:filename "xml data files/service/Calendar1.xml"}
                     {:filename "xml data files/service/AddressBook1.xml"}
                     {:filename "xml data files/service/Presence1.xml"}
                     {:filename "xml data files/service/Messaging2.xml"}
                     {:filename "xml data files/service/CallManagement2.xml"}
                     {:filename "xml data files/service/MediaManagement2.xml"}]}
   {:name "WLAN Access Point Device_1"
    :resource-dir "upnpresources/standardizeddcps/WLAN Access Point Device_1"
    :spec-files [{:filename "UPnP-gw-WLANConfiguration-v1-Service-20031017.pdf"}
                 {:filename "UPnP-gw-LinkAuthentication-v1-Service-20031017.pdf"}
                 {:filename "UPnP-gw-WLANAccessPointDevice-v1-Device-20031017.pdf"}
                 {:filename "UPnP-gw-RadiusClient-v1-Service-20031017.pdf"}]
    :test-xml-files [{:filename "device/WLANAccessPointDevice1.xml"}
                     {:filename "service/LinkAuthentication1.xml"}
                     {:filename "service/RadiusClient1.xml"}
                     {:filename "service/test cases/syntax/LinkAuthentication1.SyntaxTests.xml"}
                     {:filename "service/test cases/syntax/WLANConfiguration1.SyntaxTests.xml"}
                     {:filename "service/test cases/syntax/WLANConfiguration1.SyntaxTests_orig.xml"}
                     {:filename "service/test cases/syntax/RadiusClient1.SyntaxTests.xml"}
                     {:filename "service/WLANConfiguration1.xml"}]}])



